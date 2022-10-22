package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksFootnoteMod {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Footnote", "Footnote")
  @js.native
  val Footnote: FunctionComponent[FootnoteProps] = js.native
  
  trait FootnoteProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var footnote: js.UndefOr[Node] = js.undefined
  }
  object FootnoteProps {
    
    inline def apply(): FootnoteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FootnoteProps]
    }
    
    extension [Self <: FootnoteProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFootnote(value: VdomNode): Self = StObject.set(x, "footnote", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFootnoteNull: Self = StObject.set(x, "footnote", null)
      
      inline def setFootnoteUndefined: Self = StObject.set(x, "footnote", js.undefined)
      
      inline def setFootnoteVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footnote", js.Array(value*))
      
      inline def setFootnoteVdomElement(value: VdomElement): Self = StObject.set(x, "footnote", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
