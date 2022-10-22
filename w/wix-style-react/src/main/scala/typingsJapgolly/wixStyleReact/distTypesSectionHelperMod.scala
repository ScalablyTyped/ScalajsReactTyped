package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSectionHelperMod {
  
  @JSImport("wix-style-react/dist/types/SectionHelper", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[SectionHelperProps, js.Object, Any]
  
  type SectionHelper = PureComponent[SectionHelperProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.success
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.preview
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.experimentalDark
  */
  trait SectionHelperAppearance extends StObject
  object SectionHelperAppearance {
    
    inline def danger: typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger = "danger".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger]
    
    inline def experimentalDark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.experimentalDark = "experimentalDark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.experimentalDark]
    
    inline def premium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def preview: typingsJapgolly.wixStyleReact.wixStyleReactStrings.preview = "preview".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.preview]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typingsJapgolly.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.success]
    
    inline def warning: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning]
  }
  
  trait SectionHelperProps extends StObject {
    
    var actionText: js.UndefOr[String] = js.undefined
    
    var appearance: js.UndefOr[SectionHelperAppearance] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    var onAction: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object SectionHelperProps {
    
    inline def apply(): SectionHelperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SectionHelperProps]
    }
    
    extension [Self <: SectionHelperProps](x: Self) {
      
      inline def setActionText(value: String): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      inline def setActionTextUndefined: Self = StObject.set(x, "actionText", js.undefined)
      
      inline def setAppearance(value: SectionHelperAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setOnAction(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onAction", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
      
      inline def setOnClose(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
