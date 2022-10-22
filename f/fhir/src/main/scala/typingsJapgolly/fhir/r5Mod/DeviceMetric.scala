package typingsJapgolly.fhir.r5Mod

import typingsJapgolly.fhir.fhirStrings.`entered-in-error`
import typingsJapgolly.fhir.fhirStrings.black
import typingsJapgolly.fhir.fhirStrings.blue
import typingsJapgolly.fhir.fhirStrings.calculation
import typingsJapgolly.fhir.fhirStrings.cyan
import typingsJapgolly.fhir.fhirStrings.green
import typingsJapgolly.fhir.fhirStrings.magenta
import typingsJapgolly.fhir.fhirStrings.measurement
import typingsJapgolly.fhir.fhirStrings.off
import typingsJapgolly.fhir.fhirStrings.on
import typingsJapgolly.fhir.fhirStrings.red
import typingsJapgolly.fhir.fhirStrings.setting
import typingsJapgolly.fhir.fhirStrings.standby
import typingsJapgolly.fhir.fhirStrings.unspecified
import typingsJapgolly.fhir.fhirStrings.white
import typingsJapgolly.fhir.fhirStrings.yellow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceMetric
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _category: js.UndefOr[Element] = js.undefined
  
  var _color: js.UndefOr[Element] = js.undefined
  
  var _operationalStatus: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the calibrations that have been performed or that are required to be performed.
    */
  var calibration: js.UndefOr[js.Array[DeviceMetricCalibration]] = js.undefined
  
  /**
    * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
    */
  var category: measurement | setting | calculation | unspecified
  
  /**
    * Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
    */
  var color: js.UndefOr[black | red | green | yellow | blue | magenta | cyan | white] = js.undefined
  
  /**
    * For identifiers assigned to a device by the device or gateway software, the `system` element of the identifier should be set to the unique identifier of the device.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.
    */
  var measurementPeriod: js.UndefOr[Timing] = js.undefined
  
  /**
    * Indicates current operational state of the device. For example: On, Off, Standby, etc.
    */
  var operationalStatus: js.UndefOr[on | off | standby | `entered-in-error`] = js.undefined
  
  /**
    * Describes the link to the  Device that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a Device that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.
    */
  var parent: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DeviceMetric: typingsJapgolly.fhir.fhirStrings.DeviceMetric
  
  /**
    * Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacturer, serial number, etc.
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * DeviceMetric.type can be referred to either IEEE 11073-10101 or LOINC.
    */
  var `type`: CodeableConcept
  
  /**
    * DeviceMetric.unit can refer to either UCUM or preferable a RTMMS coding system.
    */
  var unit: js.UndefOr[CodeableConcept] = js.undefined
}
object DeviceMetric {
  
  inline def apply(category: measurement | setting | calculation | unspecified, `type`: CodeableConcept): DeviceMetric = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], resourceType = "DeviceMetric")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceMetric]
  }
  
  extension [Self <: DeviceMetric](x: Self) {
    
    inline def setCalibration(value: js.Array[DeviceMetricCalibration]): Self = StObject.set(x, "calibration", value.asInstanceOf[js.Any])
    
    inline def setCalibrationUndefined: Self = StObject.set(x, "calibration", js.undefined)
    
    inline def setCalibrationVarargs(value: DeviceMetricCalibration*): Self = StObject.set(x, "calibration", js.Array(value*))
    
    inline def setCategory(value: measurement | setting | calculation | unspecified): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setColor(value: black | red | green | yellow | blue | magenta | cyan | white): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMeasurementPeriod(value: Timing): Self = StObject.set(x, "measurementPeriod", value.asInstanceOf[js.Any])
    
    inline def setMeasurementPeriodUndefined: Self = StObject.set(x, "measurementPeriod", js.undefined)
    
    inline def setOperationalStatus(value: on | off | standby | `entered-in-error`): Self = StObject.set(x, "operationalStatus", value.asInstanceOf[js.Any])
    
    inline def setOperationalStatusUndefined: Self = StObject.set(x, "operationalStatus", js.undefined)
    
    inline def setParent(value: Reference): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.DeviceMetric): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: CodeableConcept): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def set_category(value: Element): Self = StObject.set(x, "_category", value.asInstanceOf[js.Any])
    
    inline def set_categoryUndefined: Self = StObject.set(x, "_category", js.undefined)
    
    inline def set_color(value: Element): Self = StObject.set(x, "_color", value.asInstanceOf[js.Any])
    
    inline def set_colorUndefined: Self = StObject.set(x, "_color", js.undefined)
    
    inline def set_operationalStatus(value: Element): Self = StObject.set(x, "_operationalStatus", value.asInstanceOf[js.Any])
    
    inline def set_operationalStatusUndefined: Self = StObject.set(x, "_operationalStatus", js.undefined)
  }
}
