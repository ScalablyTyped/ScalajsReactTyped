package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageBoxMarketerialLayoutMod {
  
  @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[MessageBoxMarketerialLayoutProps, js.Object, Any]
  
  type MessageBoxMarketerialLayout = PureComponent[MessageBoxMarketerialLayoutProps, js.Object, Any]
  
  trait MessageBoxMarketerialLayoutProps extends StObject {
    
    var content: Node
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var footerBottomChildren: js.UndefOr[Node] = js.undefined
    
    var imageComponent: js.UndefOr[Node] = js.undefined
    
    var imageUrl: js.UndefOr[String] = js.undefined
    
    var noBodyPadding: js.UndefOr[Boolean] = js.undefined
    
    var onClose: MouseEventHandler[HTMLButtonElement]
    
    var onPrimaryButtonClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onSecondaryButtonClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var primaryButtonDisabled: js.UndefOr[Boolean] = js.undefined
    
    var primaryButtonLabel: js.UndefOr[String] = js.undefined
    
    var primaryButtonNode: js.UndefOr[Node] = js.undefined
    
    var primaryButtonTheme: js.UndefOr[MessageBoxMarketerialLayoutThemePrimaryButtonTheme] = js.undefined
    
    var removeButtonsPadding: js.UndefOr[Boolean] = js.undefined
    
    var secondaryButtonLabel: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[MessageBoxMarketerialLayoutTheme] = js.undefined
    
    var title: Node
    
    var width: js.UndefOr[String] = js.undefined
  }
  object MessageBoxMarketerialLayoutProps {
    
    inline def apply(onClose: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): MessageBoxMarketerialLayoutProps = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => onClose(t0).runNow()), content = null, title = null)
      __obj.asInstanceOf[MessageBoxMarketerialLayoutProps]
    }
    
    extension [Self <: MessageBoxMarketerialLayoutProps](x: Self) {
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFooterBottomChildren(value: VdomNode): Self = StObject.set(x, "footerBottomChildren", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFooterBottomChildrenNull: Self = StObject.set(x, "footerBottomChildren", null)
      
      inline def setFooterBottomChildrenUndefined: Self = StObject.set(x, "footerBottomChildren", js.undefined)
      
      inline def setFooterBottomChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "footerBottomChildren", js.Array(value*))
      
      inline def setFooterBottomChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "footerBottomChildren", value.rawElement.asInstanceOf[js.Any])
      
      inline def setImageComponent(value: VdomNode): Self = StObject.set(x, "imageComponent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setImageComponentNull: Self = StObject.set(x, "imageComponent", null)
      
      inline def setImageComponentUndefined: Self = StObject.set(x, "imageComponent", js.undefined)
      
      inline def setImageComponentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "imageComponent", js.Array(value*))
      
      inline def setImageComponentVdomElement(value: VdomElement): Self = StObject.set(x, "imageComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setNoBodyPadding(value: Boolean): Self = StObject.set(x, "noBodyPadding", value.asInstanceOf[js.Any])
      
      inline def setNoBodyPaddingUndefined: Self = StObject.set(x, "noBodyPadding", js.undefined)
      
      inline def setOnClose(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnPrimaryButtonClick(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onPrimaryButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
      
      inline def setOnPrimaryButtonClickUndefined: Self = StObject.set(x, "onPrimaryButtonClick", js.undefined)
      
      inline def setOnSecondaryButtonClick(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onSecondaryButtonClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnSecondaryButtonClickUndefined: Self = StObject.set(x, "onSecondaryButtonClick", js.undefined)
      
      inline def setPrimaryButtonDisabled(value: Boolean): Self = StObject.set(x, "primaryButtonDisabled", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonDisabledUndefined: Self = StObject.set(x, "primaryButtonDisabled", js.undefined)
      
      inline def setPrimaryButtonLabel(value: String): Self = StObject.set(x, "primaryButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonLabelUndefined: Self = StObject.set(x, "primaryButtonLabel", js.undefined)
      
      inline def setPrimaryButtonNode(value: VdomNode): Self = StObject.set(x, "primaryButtonNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonNodeNull: Self = StObject.set(x, "primaryButtonNode", null)
      
      inline def setPrimaryButtonNodeUndefined: Self = StObject.set(x, "primaryButtonNode", js.undefined)
      
      inline def setPrimaryButtonNodeVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "primaryButtonNode", js.Array(value*))
      
      inline def setPrimaryButtonNodeVdomElement(value: VdomElement): Self = StObject.set(x, "primaryButtonNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonTheme(value: MessageBoxMarketerialLayoutThemePrimaryButtonTheme): Self = StObject.set(x, "primaryButtonTheme", value.asInstanceOf[js.Any])
      
      inline def setPrimaryButtonThemeUndefined: Self = StObject.set(x, "primaryButtonTheme", js.undefined)
      
      inline def setRemoveButtonsPadding(value: Boolean): Self = StObject.set(x, "removeButtonsPadding", value.asInstanceOf[js.Any])
      
      inline def setRemoveButtonsPaddingUndefined: Self = StObject.set(x, "removeButtonsPadding", js.undefined)
      
      inline def setSecondaryButtonLabel(value: String): Self = StObject.set(x, "secondaryButtonLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondaryButtonLabelUndefined: Self = StObject.set(x, "secondaryButtonLabel", js.undefined)
      
      inline def setTheme(value: MessageBoxMarketerialLayoutTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.purple
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.white
  */
  trait MessageBoxMarketerialLayoutTheme extends StObject
  object MessageBoxMarketerialLayoutTheme {
    
    inline def blue: typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue = "blue".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue]
    
    inline def purple: typingsJapgolly.wixStyleReact.wixStyleReactStrings.purple = "purple".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.purple]
    
    inline def white: typingsJapgolly.wixStyleReact.wixStyleReactStrings.white = "white".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.white]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.purple
  */
  trait MessageBoxMarketerialLayoutThemePrimaryButtonTheme extends StObject
  object MessageBoxMarketerialLayoutThemePrimaryButtonTheme {
    
    inline def blue: typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue = "blue".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.blue]
    
    inline def purple: typingsJapgolly.wixStyleReact.wixStyleReactStrings.purple = "purple".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.purple]
  }
}
