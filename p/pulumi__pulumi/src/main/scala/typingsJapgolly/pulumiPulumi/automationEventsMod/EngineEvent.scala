package typingsJapgolly.pulumiPulumi.automationEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineEvent extends StObject {
  
  var cancelEvent: js.UndefOr[CancelEvent] = js.undefined
  
  var diagnosticEvent: js.UndefOr[DiagnosticEvent] = js.undefined
  
  var policyEvent: js.UndefOr[PolicyEvent] = js.undefined
  
  var preludeEvent: js.UndefOr[PreludeEvent] = js.undefined
  
  var resOpFailedEvent: js.UndefOr[ResOpFailedEvent] = js.undefined
  
  var resOutputsEvent: js.UndefOr[ResOutputsEvent] = js.undefined
  
  var resourcePreEvent: js.UndefOr[ResourcePreEvent] = js.undefined
  
  var sequence: Double
  
  var stdoutEvent: js.UndefOr[StdoutEngineEvent] = js.undefined
  
  var summaryEvent: js.UndefOr[SummaryEvent] = js.undefined
  
  var timestamp: Double
}
object EngineEvent {
  
  inline def apply(sequence: Double, timestamp: Double): EngineEvent = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineEvent]
  }
  
  extension [Self <: EngineEvent](x: Self) {
    
    inline def setCancelEvent(value: CancelEvent): Self = StObject.set(x, "cancelEvent", value.asInstanceOf[js.Any])
    
    inline def setCancelEventUndefined: Self = StObject.set(x, "cancelEvent", js.undefined)
    
    inline def setDiagnosticEvent(value: DiagnosticEvent): Self = StObject.set(x, "diagnosticEvent", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticEventUndefined: Self = StObject.set(x, "diagnosticEvent", js.undefined)
    
    inline def setPolicyEvent(value: PolicyEvent): Self = StObject.set(x, "policyEvent", value.asInstanceOf[js.Any])
    
    inline def setPolicyEventUndefined: Self = StObject.set(x, "policyEvent", js.undefined)
    
    inline def setPreludeEvent(value: PreludeEvent): Self = StObject.set(x, "preludeEvent", value.asInstanceOf[js.Any])
    
    inline def setPreludeEventUndefined: Self = StObject.set(x, "preludeEvent", js.undefined)
    
    inline def setResOpFailedEvent(value: ResOpFailedEvent): Self = StObject.set(x, "resOpFailedEvent", value.asInstanceOf[js.Any])
    
    inline def setResOpFailedEventUndefined: Self = StObject.set(x, "resOpFailedEvent", js.undefined)
    
    inline def setResOutputsEvent(value: ResOutputsEvent): Self = StObject.set(x, "resOutputsEvent", value.asInstanceOf[js.Any])
    
    inline def setResOutputsEventUndefined: Self = StObject.set(x, "resOutputsEvent", js.undefined)
    
    inline def setResourcePreEvent(value: ResourcePreEvent): Self = StObject.set(x, "resourcePreEvent", value.asInstanceOf[js.Any])
    
    inline def setResourcePreEventUndefined: Self = StObject.set(x, "resourcePreEvent", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setStdoutEvent(value: StdoutEngineEvent): Self = StObject.set(x, "stdoutEvent", value.asInstanceOf[js.Any])
    
    inline def setStdoutEventUndefined: Self = StObject.set(x, "stdoutEvent", js.undefined)
    
    inline def setSummaryEvent(value: SummaryEvent): Self = StObject.set(x, "summaryEvent", value.asInstanceOf[js.Any])
    
    inline def setSummaryEventUndefined: Self = StObject.set(x, "summaryEvent", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
