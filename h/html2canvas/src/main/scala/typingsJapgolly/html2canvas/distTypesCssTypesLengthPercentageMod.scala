package typingsJapgolly.html2canvas

import typingsJapgolly.html2canvas.distTypesCssPropertyDescriptorsBackgroundSizeMod.BackgroundSizeInfo
import typingsJapgolly.html2canvas.distTypesCssSyntaxParserMod.CSSValue
import typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.NumberValueToken
import typingsJapgolly.html2canvas.html2canvasInts.`16`
import typingsJapgolly.html2canvas.html2canvasInts.`17`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssTypesLengthPercentageMod {
  
  @JSImport("html2canvas/dist/types/css/types/length-percentage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/css/types/length-percentage", "FIFTY_PERCENT")
  @js.native
  val FIFTY_PERCENT: NumberValueToken = js.native
  
  @JSImport("html2canvas/dist/types/css/types/length-percentage", "HUNDRED_PERCENT")
  @js.native
  val HUNDRED_PERCENT: NumberValueToken = js.native
  
  @JSImport("html2canvas/dist/types/css/types/length-percentage", "ZERO_LENGTH")
  @js.native
  val ZERO_LENGTH: NumberValueToken = js.native
  
  inline def getAbsoluteValue(token: LengthPercentage, parent: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAbsoluteValue")(token.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getAbsoluteValueForTuple(tuple: LengthPercentageTuple, width: Double, height: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAbsoluteValueForTuple")(tuple.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def isLengthPercentage(token: CSSValue): /* is html2canvas.html2canvas/dist/types/css/types/length-percentage.LengthPercentage */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLengthPercentage")(token.asInstanceOf[js.Any]).asInstanceOf[/* is html2canvas.html2canvas/dist/types/css/types/length-percentage.LengthPercentage */ Boolean]
  
  inline def parseLengthPercentageTuple(tokens: js.Array[LengthPercentage]): LengthPercentageTuple = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLengthPercentageTuple")(tokens.asInstanceOf[js.Any]).asInstanceOf[LengthPercentageTuple]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.DimensionToken
    - typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.NumberValueToken
  */
  trait LengthPercentage
    extends StObject
       with BackgroundSizeInfo
  object LengthPercentage {
    
    inline def DimensionToken(flags: Double, number: Double, unit: String): typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.DimensionToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(15)
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.DimensionToken]
    }
    
    inline def NumberValueToken(flags: Double, number: Double, `type`: `16` | `17`): typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.NumberValueToken = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.NumberValueToken]
    }
  }
  
  type LengthPercentageTuple = js.Array[LengthPercentage] | (js.Tuple2[LengthPercentage, LengthPercentage])
}
