package typingsJapgolly.html2canvas

import typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyListDescriptor
import typingsJapgolly.html2canvas.html2canvasInts.`0`
import typingsJapgolly.html2canvas.html2canvasInts.`16`
import typingsJapgolly.html2canvas.html2canvasInts.`17`
import typingsJapgolly.html2canvas.html2canvasInts.`19`
import typingsJapgolly.html2canvas.html2canvasInts.`20`
import typingsJapgolly.html2canvas.html2canvasInts.`22`
import typingsJapgolly.html2canvas.html2canvasInts.`6`
import typingsJapgolly.html2canvas.html2canvasInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssPropertyDescriptorsBackgroundSizeMod {
  
  @js.native
  sealed trait BACKGROUND_SIZE extends StObject
  @JSImport("html2canvas/dist/types/css/property-descriptors/background-size", "BACKGROUND_SIZE")
  @js.native
  object BACKGROUND_SIZE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BACKGROUND_SIZE & String] = js.native
    
    @js.native
    sealed trait AUTO
      extends StObject
         with BACKGROUND_SIZE
    /* "auto" */ val AUTO: typingsJapgolly.html2canvas.distTypesCssPropertyDescriptorsBackgroundSizeMod.BACKGROUND_SIZE.AUTO & String = js.native
    
    @js.native
    sealed trait CONTAIN
      extends StObject
         with BACKGROUND_SIZE
    /* "contain" */ val CONTAIN: typingsJapgolly.html2canvas.distTypesCssPropertyDescriptorsBackgroundSizeMod.BACKGROUND_SIZE.CONTAIN & String = js.native
    
    @js.native
    sealed trait COVER
      extends StObject
         with BACKGROUND_SIZE
    /* "cover" */ val COVER: typingsJapgolly.html2canvas.distTypesCssPropertyDescriptorsBackgroundSizeMod.BACKGROUND_SIZE.COVER & String = js.native
  }
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/background-size", "backgroundSize")
  @js.native
  val backgroundSize: IPropertyListDescriptor[BackgroundSize_] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.html2canvas.distTypesCssTypesLengthPercentageMod.LengthPercentage
    - typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.StringValueToken
  */
  trait BackgroundSizeInfo extends StObject
  object BackgroundSizeInfo {
    
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
    
    inline def StringValueToken(`type`: `0` | `6` | `19` | `20` | `22` | `7`, value: String): typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.StringValueToken = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.html2canvas.distTypesCssSyntaxTokenizerMod.StringValueToken]
    }
  }
  
  type BackgroundSize_ = js.Array[js.Array[BackgroundSizeInfo]]
}
