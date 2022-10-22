package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.checkbox
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.radio
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectableAccordionItemMod {
  
  @JSImport("wix-style-react/dist/types/SelectableAccordion/Item", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SelectableAccordionItemProps, js.Object, Any]
  
  type SelectableAccordionItem = japgolly.scalajs.react.facade.React.Component[SelectableAccordionItemProps & js.Object, js.Object]
  
  trait SelectableAccordionItemCommonProps extends StObject {
    
    var content: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object SelectableAccordionItemCommonProps {
    
    inline def apply(): SelectableAccordionItemCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectableAccordionItemCommonProps]
    }
    
    extension [Self <: SelectableAccordionItemCommonProps](x: Self) {
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setSubtitle(value: VdomNode): Self = StObject.set(x, "subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait SelectableAccordionItemProps
    extends StObject
       with SelectableAccordionItemCommonProps {
    
    var onChange: js.UndefOr[js.Function2[/* idx */ Double, /* open */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[radio | checkbox | toggle] = js.undefined
  }
  object SelectableAccordionItemProps {
    
    inline def apply(): SelectableAccordionItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectableAccordionItemProps]
    }
    
    extension [Self <: SelectableAccordionItemProps](x: Self) {
      
      inline def setOnChange(value: (/* idx */ Double, /* open */ Boolean) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* idx */ Double, t1: /* open */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setType(value: radio | checkbox | toggle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
