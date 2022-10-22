package typingsJapgolly.metro.anon

import typingsJapgolly.metro.libReportingMod.ReportableEvent
import typingsJapgolly.metro.metroStrings.worker_stdout_chunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunk
  extends StObject
     with ReportableEvent {
  
  var chunk: String
  
  var `type`: worker_stdout_chunk
}
object Chunk {
  
  inline def apply(chunk: String): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("worker_stdout_chunk")
    __obj.asInstanceOf[Chunk]
  }
  
  extension [Self <: Chunk](x: Self) {
    
    inline def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setType(value: worker_stdout_chunk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
