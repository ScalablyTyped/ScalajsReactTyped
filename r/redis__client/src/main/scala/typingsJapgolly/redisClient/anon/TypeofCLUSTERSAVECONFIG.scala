package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERSAVECONFIG extends StObject {
  
  def transformArguments(): js.Array[String]
  
  def transformReply(): OK
}
object TypeofCLUSTERSAVECONFIG {
  
  inline def apply(transformArguments: CallbackTo[js.Array[String]], transformReply: CallbackTo[OK]): TypeofCLUSTERSAVECONFIG = {
    val __obj = js.Dynamic.literal(transformArguments = transformArguments.toJsFn, transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofCLUSTERSAVECONFIG]
  }
  
  extension [Self <: TypeofCLUSTERSAVECONFIG](x: Self) {
    
    inline def setTransformArguments(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "transformArguments", value.toJsFn)
    
    inline def setTransformReply(value: CallbackTo[OK]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
