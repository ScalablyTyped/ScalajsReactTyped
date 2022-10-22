package typingsJapgolly.fhir.r3Mod

import typingsJapgolly.fhir.fhirStrings.`entered-in-error`
import typingsJapgolly.fhir.fhirStrings.`on-hold`
import typingsJapgolly.fhir.fhirStrings.active
import typingsJapgolly.fhir.fhirStrings.completed
import typingsJapgolly.fhir.fhirStrings.intended
import typingsJapgolly.fhir.fhirStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceUseStatement
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _recordedOn: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _timingDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the site on the subject's body where the device was used ( i.e. the target site).
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The details of the device used.
    */
  var device: Reference
  
  /**
    * An external identifier for this statement such as an IRI.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Reason or justification for the use of the device.
    */
  var indication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The time at which the statement was made/recorded.
    */
  var recordedOn: js.UndefOr[String] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DeviceUseStatement: typingsJapgolly.fhir.fhirStrings.DeviceUseStatement
  
  /**
    * Who reported the device was being used by the patient.
    */
  var source: js.UndefOr[Reference] = js.undefined
  
  /**
    * DeviceUseStatment is a statement at a point in time.  The status is only representative at the point when it was asserted.  The value set for contains codes that assert the status of the use  by the patient (for example, stopped or on hold) as well as codes that assert the status of the resource itself (for example, entered in error).
    * This element is labeled as a modifier because the status contains the codes that mark the statement as not currently valid.
    */
  var status: active | completed | `entered-in-error` | intended | stopped | `on-hold`
  
  /**
    * The patient who used the device.
    */
  var subject: Reference
  
  /**
    * How often the device was used.
    */
  var timingDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * How often the device was used.
    */
  var timingPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * How often the device was used.
    */
  var timingTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * The time period over which the device was used.
    */
  var whenUsed: js.UndefOr[Period] = js.undefined
}
object DeviceUseStatement {
  
  inline def apply(
    device: Reference,
    status: active | completed | `entered-in-error` | intended | stopped | `on-hold`,
    subject: Reference
  ): DeviceUseStatement = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], resourceType = "DeviceUseStatement", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUseStatement]
  }
  
  extension [Self <: DeviceUseStatement](x: Self) {
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setDevice(value: Reference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIndication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setIndicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "indication", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setRecordedOn(value: String): Self = StObject.set(x, "recordedOn", value.asInstanceOf[js.Any])
    
    inline def setRecordedOnUndefined: Self = StObject.set(x, "recordedOn", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.DeviceUseStatement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Reference): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStatus(value: active | completed | `entered-in-error` | intended | stopped | `on-hold`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTime(value: String): Self = StObject.set(x, "timingDateTime", value.asInstanceOf[js.Any])
    
    inline def setTimingDateTimeUndefined: Self = StObject.set(x, "timingDateTime", js.undefined)
    
    inline def setTimingPeriod(value: Period): Self = StObject.set(x, "timingPeriod", value.asInstanceOf[js.Any])
    
    inline def setTimingPeriodUndefined: Self = StObject.set(x, "timingPeriod", js.undefined)
    
    inline def setTimingTiming(value: Timing): Self = StObject.set(x, "timingTiming", value.asInstanceOf[js.Any])
    
    inline def setTimingTimingUndefined: Self = StObject.set(x, "timingTiming", js.undefined)
    
    inline def setWhenUsed(value: Period): Self = StObject.set(x, "whenUsed", value.asInstanceOf[js.Any])
    
    inline def setWhenUsedUndefined: Self = StObject.set(x, "whenUsed", js.undefined)
    
    inline def set_recordedOn(value: Element): Self = StObject.set(x, "_recordedOn", value.asInstanceOf[js.Any])
    
    inline def set_recordedOnUndefined: Self = StObject.set(x, "_recordedOn", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_timingDateTime(value: Element): Self = StObject.set(x, "_timingDateTime", value.asInstanceOf[js.Any])
    
    inline def set_timingDateTimeUndefined: Self = StObject.set(x, "_timingDateTime", js.undefined)
  }
}
