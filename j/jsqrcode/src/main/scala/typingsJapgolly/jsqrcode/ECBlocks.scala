package typingsJapgolly.jsqrcode

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECBlocks extends StObject {
  
  val ECCodewordsPerBlock: Double
  
  val NumBlocks: Double
  
  val TotalECCodewords: Double
  
  /* private */ var ecBlocks: js.Array[ECB] | (js.Tuple2[ECB, ECB])
  
  /* private */ var ecCodewordsPerBlock: Double
  
  def getECBlocks(): js.Array[ECB] | (js.Tuple2[ECB, ECB])
}
object ECBlocks {
  
  inline def apply(
    ECCodewordsPerBlock: Double,
    NumBlocks: Double,
    TotalECCodewords: Double,
    ecBlocks: js.Array[ECB] | (js.Tuple2[ECB, ECB]),
    ecCodewordsPerBlock: Double,
    getECBlocks: CallbackTo[js.Array[ECB] | (js.Tuple2[ECB, ECB])]
  ): ECBlocks = {
    val __obj = js.Dynamic.literal(ECCodewordsPerBlock = ECCodewordsPerBlock.asInstanceOf[js.Any], NumBlocks = NumBlocks.asInstanceOf[js.Any], TotalECCodewords = TotalECCodewords.asInstanceOf[js.Any], ecBlocks = ecBlocks.asInstanceOf[js.Any], ecCodewordsPerBlock = ecCodewordsPerBlock.asInstanceOf[js.Any], getECBlocks = getECBlocks.toJsFn)
    __obj.asInstanceOf[ECBlocks]
  }
  
  extension [Self <: ECBlocks](x: Self) {
    
    inline def setECCodewordsPerBlock(value: Double): Self = StObject.set(x, "ECCodewordsPerBlock", value.asInstanceOf[js.Any])
    
    inline def setEcBlocks(value: js.Array[ECB] | (js.Tuple2[ECB, ECB])): Self = StObject.set(x, "ecBlocks", value.asInstanceOf[js.Any])
    
    inline def setEcBlocksVarargs(value: ECB*): Self = StObject.set(x, "ecBlocks", js.Array(value*))
    
    inline def setGetECBlocks(value: CallbackTo[js.Array[ECB] | (js.Tuple2[ECB, ECB])]): Self = StObject.set(x, "getECBlocks", value.toJsFn)
    
    inline def setNumBlocks(value: Double): Self = StObject.set(x, "NumBlocks", value.asInstanceOf[js.Any])
    
    inline def setTotalECCodewords(value: Double): Self = StObject.set(x, "TotalECCodewords", value.asInstanceOf[js.Any])
  }
}
