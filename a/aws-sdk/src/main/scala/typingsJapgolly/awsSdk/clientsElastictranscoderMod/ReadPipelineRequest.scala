package typingsJapgolly.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadPipelineRequest extends StObject {
  
  /**
    * The identifier of the pipeline to read.
    */
  var Id: typingsJapgolly.awsSdk.clientsElastictranscoderMod.Id
}
object ReadPipelineRequest {
  
  inline def apply(Id: Id): ReadPipelineRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadPipelineRequest]
  }
  
  extension [Self <: ReadPipelineRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
