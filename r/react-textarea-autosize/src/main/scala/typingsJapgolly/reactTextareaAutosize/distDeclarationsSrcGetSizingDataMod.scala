package typingsJapgolly.reactTextareaAutosize

import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.borderBottomWidth
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.borderLeftWidth
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.borderRightWidth
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.borderTopWidth
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.boxSizing
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.fontFamily
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.fontSize
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.fontStyle
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.fontWeight
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.letterSpacing
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.lineHeight
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingBottom
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingLeft
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingRight
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingTop
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.tabSize
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.textIndent
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.textRendering
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.textTransform
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.width
import typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.wordBreak
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcGetSizingDataMod {
  
  @JSImport("react-textarea-autosize/dist/declarations/src/getSizingData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: HTMLElement): SizingData | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[SizingData | Null]
  
  trait SizingData extends StObject {
    
    var borderSize: Double
    
    var paddingSize: Double
    
    var sizingStyle: CSSStyleDeclaration
  }
  object SizingData {
    
    inline def apply(borderSize: Double, paddingSize: Double, sizingStyle: CSSStyleDeclaration): SizingData = {
      val __obj = js.Dynamic.literal(borderSize = borderSize.asInstanceOf[js.Any], paddingSize = paddingSize.asInstanceOf[js.Any], sizingStyle = sizingStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizingData]
    }
    
    extension [Self <: SizingData](x: Self) {
      
      inline def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
      
      inline def setPaddingSize(value: Double): Self = StObject.set(x, "paddingSize", value.asInstanceOf[js.Any])
      
      inline def setSizingStyle(value: CSSStyleDeclaration): Self = StObject.set(x, "sizingStyle", value.asInstanceOf[js.Any])
    }
  }
  
  type SizingProps = Extract[
    borderBottomWidth | borderLeftWidth | borderRightWidth | borderTopWidth | boxSizing | fontFamily | fontSize | fontStyle | fontWeight | letterSpacing | lineHeight | paddingBottom | paddingLeft | paddingRight | paddingTop | tabSize | textIndent | textRendering | textTransform | width | wordBreak, 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 458, starting with typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.accentColor, typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.alignContent, typingsJapgolly.reactTextareaAutosize.reactTextareaAutosizeStrings.alignItems */ Any
  ]
  
  type SizingStyle = Pick[CSSStyleDeclaration, SizingProps]
}
