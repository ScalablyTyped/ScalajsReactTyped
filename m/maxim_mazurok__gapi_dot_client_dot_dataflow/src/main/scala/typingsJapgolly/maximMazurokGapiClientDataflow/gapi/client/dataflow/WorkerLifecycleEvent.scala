package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerLifecycleEvent extends StObject {
  
  /** The start time of this container. All events will report this so that events can be grouped together across container/VM restarts. */
  var containerStartTime: js.UndefOr[String] = js.undefined
  
  /** The event being reported. */
  var event: js.UndefOr[String] = js.undefined
  
  /** Other stats that can accompany an event. E.g. { "downloaded_bytes" : "123456" } */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object WorkerLifecycleEvent {
  
  inline def apply(): WorkerLifecycleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerLifecycleEvent]
  }
  
  extension [Self <: WorkerLifecycleEvent](x: Self) {
    
    inline def setContainerStartTime(value: String): Self = StObject.set(x, "containerStartTime", value.asInstanceOf[js.Any])
    
    inline def setContainerStartTimeUndefined: Self = StObject.set(x, "containerStartTime", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
