package typingsJapgolly.fhir.r4Mod

import typingsJapgolly.fhir.fhirStrings.`manufacturer-name`
import typingsJapgolly.fhir.fhirStrings.`model-name`
import typingsJapgolly.fhir.fhirStrings.`patient-reported-name`
import typingsJapgolly.fhir.fhirStrings.`udi-label-name`
import typingsJapgolly.fhir.fhirStrings.`user-friendly-name`
import typingsJapgolly.fhir.fhirStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDeviceName
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The name that identifies the device.
    */
  var name: String
  
  /**
    * The type of deviceName.
    * UDILabelName | UserFriendlyName | PatientReportedName | ManufactureDeviceName | ModelName.
    */
  var `type`: `udi-label-name` | `user-friendly-name` | `patient-reported-name` | `manufacturer-name` | `model-name` | other
}
object DeviceDeviceName {
  
  inline def apply(
    name: String,
    `type`: `udi-label-name` | `user-friendly-name` | `patient-reported-name` | `manufacturer-name` | `model-name` | other
  ): DeviceDeviceName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDeviceName]
  }
  
  extension [Self <: DeviceDeviceName](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: `udi-label-name` | `user-friendly-name` | `patient-reported-name` | `manufacturer-name` | `model-name` | other
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
