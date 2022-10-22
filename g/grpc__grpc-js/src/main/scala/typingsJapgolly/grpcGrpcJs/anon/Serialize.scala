package typingsJapgolly.grpcGrpcJs.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Serialize[RequestType] extends StObject {
  
  def serialize(value: RequestType): Buffer
}
object Serialize {
  
  inline def apply[RequestType](serialize: RequestType => Buffer): Serialize[RequestType] = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[Serialize[RequestType]]
  }
  
  extension [Self <: Serialize[?], RequestType](x: Self & Serialize[RequestType]) {
    
    inline def setSerialize(value: RequestType => Buffer): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
  }
}
