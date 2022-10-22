package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.redisClientStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCLUSTERSETCONFIG extends StObject {
  
  def transformArguments(configEpoch: Double): js.Array[String]
  
  def transformReply(): OK
}
object TypeofCLUSTERSETCONFIG {
  
  inline def apply(transformArguments: Double => js.Array[String], transformReply: CallbackTo[OK]): TypeofCLUSTERSETCONFIG = {
    val __obj = js.Dynamic.literal(transformArguments = js.Any.fromFunction1(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofCLUSTERSETCONFIG]
  }
  
  extension [Self <: TypeofCLUSTERSETCONFIG](x: Self) {
    
    inline def setTransformArguments(value: Double => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction1(value))
    
    inline def setTransformReply(value: CallbackTo[OK]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
