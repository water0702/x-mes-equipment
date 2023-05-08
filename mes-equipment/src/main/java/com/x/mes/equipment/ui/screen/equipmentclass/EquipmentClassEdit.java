package com.x.mes.equipment.ui.screen.equipmentclass;

import io.jmix.ui.screen.*;
import com.x.mes.equipment.domain.model.equipmentclass.EquipmentClass;

@UiController("EQUIP_EquipmentClass.edit")
@UiDescriptor("equipment-class-edit.xml")
@EditedEntityContainer("equipmentClassDc")
public class EquipmentClassEdit extends StandardEditor<EquipmentClass> {
}