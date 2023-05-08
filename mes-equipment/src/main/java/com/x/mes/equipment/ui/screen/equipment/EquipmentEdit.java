package com.x.mes.equipment.ui.screen.equipment;

import io.jmix.ui.screen.*;
import com.x.mes.equipment.domain.model.equipment.Equipment;

@UiController("EQUIP_Equipment.edit")
@UiDescriptor("equipment-edit.xml")
@EditedEntityContainer("equipmentDc")
public class EquipmentEdit extends StandardEditor<Equipment> {
}