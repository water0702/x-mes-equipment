package com.x.mes.equipment.ui.screen.equipment;

import io.jmix.ui.screen.*;
import com.x.mes.equipment.domain.model.equipment.Equipment;

@UiController("EQUIP_Equipment.browse")
@UiDescriptor("equipment-browse.xml")
@LookupComponent("equipmentsTable")
public class EquipmentBrowse extends StandardLookup<Equipment> {
}