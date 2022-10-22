package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wixStyleReact.anon.DataHookEllipsis
import typingsJapgolly.wixStyleReact.anon.OverrideOptionStyleValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemSectionMod {
  
  @JSImport("wix-style-react/dist/types/ListItemSection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/types/ListItemSection", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[ListItemSectionProps, js.Object, Any] {
    def this(props: ListItemSectionProps) = this()
    def this(props: ListItemSectionProps, context: Any) = this()
  }
  @JSImport("wix-style-react/dist/types/ListItemSection", JSImport.Default)
  @js.native
  val default: ComponentClassP[ListItemSectionProps & js.Object] = js.native
  
  inline def listItemSectionBuilder(data: DataHookEllipsis): OverrideOptionStyleValue = ^.asInstanceOf[js.Dynamic].applyDynamic("listItemSectionBuilder")(data.asInstanceOf[js.Any]).asInstanceOf[OverrideOptionStyleValue]
  
  trait ListItemSectionProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var suffix: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[ListItemSectionTypes] = js.undefined
  }
  object ListItemSectionProps {
    
    inline def apply(): ListItemSectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemSectionProps]
    }
    
    extension [Self <: ListItemSectionProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSuffix(value: VdomNode): Self = StObject.set(x, "suffix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "suffix", js.Array(value*))
      
      inline def setSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "suffix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: ListItemSectionTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.whitespace
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.divider
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.title
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.subheader
  */
  trait ListItemSectionTypes extends StObject
  object ListItemSectionTypes {
    
    inline def divider: typingsJapgolly.wixStyleReact.wixStyleReactStrings.divider = "divider".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.divider]
    
    inline def subheader: typingsJapgolly.wixStyleReact.wixStyleReactStrings.subheader = "subheader".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.subheader]
    
    inline def title: typingsJapgolly.wixStyleReact.wixStyleReactStrings.title = "title".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.title]
    
    inline def whitespace: typingsJapgolly.wixStyleReact.wixStyleReactStrings.whitespace = "whitespace".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.whitespace]
  }
}
