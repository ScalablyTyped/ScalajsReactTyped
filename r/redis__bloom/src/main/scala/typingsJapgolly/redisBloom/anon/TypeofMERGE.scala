package typingsJapgolly.redisBloom.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisBloom.distCommandsCountMinSketchMergeMod.Sketches
import typingsJapgolly.redisBloom.redisBloomStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMERGE extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  def transformArguments(dest: String, src: Sketches): js.Array[String]
  
  def transformReply(): OK
}
object TypeofMERGE {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    transformArguments: (String, Sketches) => js.Array[String],
    transformReply: CallbackTo[OK]
  ): TypeofMERGE = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofMERGE]
  }
  
  extension [Self <: TypeofMERGE](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (String, Sketches) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: CallbackTo[OK]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
