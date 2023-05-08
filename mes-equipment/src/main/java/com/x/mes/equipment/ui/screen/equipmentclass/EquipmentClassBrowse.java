package com.x.mes.equipment.ui.screen.equipmentclass;

import io.jmix.ui.screen.*;
import com.x.mes.equipment.domain.model.equipmentclass.EquipmentClass;

@UiController("EQUIP_EquipmentClass.browse")
@UiDescriptor("equipment-class-browse.xml")
@LookupComponent("equipmentClassesTable")
public class EquipmentClassBrowse extends StandardLookup<EquipmentClass> {
}