package typingsJapgolly.pino.mod.pino

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransportPipelineOptions[TransportOptions]
  extends StObject
     with TransportBaseOptions[TransportOptions] {
  
  var pipeline: js.Array[TransportSingleOptions[TransportOptions]]
}
object TransportPipelineOptions {
  
  inline def apply[TransportOptions](pipeline: js.Array[TransportSingleOptions[TransportOptions]]): TransportPipelineOptions[TransportOptions] = {
    val __obj = js.Dynamic.literal(pipeline = pipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportPipelineOptions[TransportOptions]]
  }
  
  extension [Self <: TransportPipelineOptions[?], TransportOptions](x: Self & TransportPipelineOptions[TransportOptions]) {
    
    inline def setPipeline(value: js.Array[TransportSingleOptions[TransportOptions]]): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineVarargs(value: TransportSingleOptions[TransportOptions]*): Self = StObject.set(x, "pipeline", js.Array(value*))
  }
}
