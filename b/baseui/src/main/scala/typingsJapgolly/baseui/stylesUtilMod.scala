package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.ellipsis
import typingsJapgolly.baseui.baseuiStrings.hidden
import typingsJapgolly.baseui.baseuiStrings.normal
import typingsJapgolly.baseui.baseuiStrings.nowrap
import typingsJapgolly.baseui.themesTypesMod.Border
import typingsJapgolly.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesUtilMod {
  
  @JSImport("baseui/styles/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ellipsisText {
    
    @JSImport("baseui/styles/util", "ellipsisText.overflow")
    @js.native
    val overflow: hidden = js.native
    
    @JSImport("baseui/styles/util", "ellipsisText.textOverflow")
    @js.native
    val textOverflow: ellipsis = js.native
    
    @JSImport("baseui/styles/util", "ellipsisText.whiteSpace")
    @js.native
    val whiteSpace: nowrap = js.native
    
    @JSImport("baseui/styles/util", "ellipsisText.wordWrap")
    @js.native
    val wordWrap: normal = js.native
  }
  
  inline def expandBorderStyles(borderStyles: Border): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("expandBorderStyles")(borderStyles.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  
  inline def hexToRgb(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")().asInstanceOf[String]
  inline def hexToRgb(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexToRgb(hex: String, alpha: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexToRgb(hex: Unit, alpha: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
}
