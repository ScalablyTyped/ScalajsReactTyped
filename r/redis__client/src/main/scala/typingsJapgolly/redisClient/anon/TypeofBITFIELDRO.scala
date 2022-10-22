package typingsJapgolly.redisClient.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redisClient.distLibCommandsBitfieldROMod.BitFieldRoOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBITFIELDRO extends StObject {
  
  val FIRST_KEY_INDEX: /* 1 */ Double
  
  val IS_READ_ONLY: /* true */ Boolean
  
  def transformArguments(key: String, operations: BitFieldRoOperations): js.Array[String]
  
  def transformReply(): js.Array[Double | Null]
}
object TypeofBITFIELDRO {
  
  inline def apply(
    FIRST_KEY_INDEX: /* 1 */ Double,
    IS_READ_ONLY: /* true */ Boolean,
    transformArguments: (String, BitFieldRoOperations) => js.Array[String],
    transformReply: CallbackTo[js.Array[Double | Null]]
  ): TypeofBITFIELDRO = {
    val __obj = js.Dynamic.literal(FIRST_KEY_INDEX = FIRST_KEY_INDEX.asInstanceOf[js.Any], IS_READ_ONLY = IS_READ_ONLY.asInstanceOf[js.Any], transformArguments = js.Any.fromFunction2(transformArguments), transformReply = transformReply.toJsFn)
    __obj.asInstanceOf[TypeofBITFIELDRO]
  }
  
  extension [Self <: TypeofBITFIELDRO](x: Self) {
    
    inline def setFIRST_KEY_INDEX(value: /* 1 */ Double): Self = StObject.set(x, "FIRST_KEY_INDEX", value.asInstanceOf[js.Any])
    
    inline def setIS_READ_ONLY(value: /* true */ Boolean): Self = StObject.set(x, "IS_READ_ONLY", value.asInstanceOf[js.Any])
    
    inline def setTransformArguments(value: (String, BitFieldRoOperations) => js.Array[String]): Self = StObject.set(x, "transformArguments", js.Any.fromFunction2(value))
    
    inline def setTransformReply(value: CallbackTo[js.Array[Double | Null]]): Self = StObject.set(x, "transformReply", value.toJsFn)
  }
}
