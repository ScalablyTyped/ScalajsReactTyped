package typingsJapgolly.grpcGrpcJs.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deserialize[ResponseType] extends StObject {
  
  def deserialize(chunk: Buffer): ResponseType
}
object Deserialize {
  
  inline def apply[ResponseType](deserialize: Buffer => ResponseType): Deserialize[ResponseType] = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize))
    __obj.asInstanceOf[Deserialize[ResponseType]]
  }
  
  extension [Self <: Deserialize[?], ResponseType](x: Self & Deserialize[ResponseType]) {
    
    inline def setDeserialize(value: Buffer => ResponseType): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
  }
}
