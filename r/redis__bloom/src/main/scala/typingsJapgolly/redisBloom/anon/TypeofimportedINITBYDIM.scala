package typingsJapgolly.redisBloom.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisBloom.redisBloomStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedINITBYDIM extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(key: String, width: Double, depth: Double): js.Array[String]
  
  def transformReply(): OK
}
object TypeofimportedINITBYDIM {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (String, Double, Double) => js.Array[String],
    transformReply: CallbackTo[OK]
  ): TypeofimportedINITBYDIM = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction3(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofimportedINITBYDIM]
  }
  
  extension [Self <: TypeofimportedINITBYDIM](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (String, Double, Double) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction3(value))
    
    inline def setTransformReply(value: CallbackTo[OK]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
