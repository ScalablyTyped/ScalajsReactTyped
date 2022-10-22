package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSocialButtonMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/SocialButton", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<SocialButtonProps> */ Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.facebook
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.instagram
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.twitter
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.pinterest
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.youtube
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.linkedin
  */
  trait SocialButtonIcons extends StObject
  object SocialButtonIcons {
    
    inline def facebook: typingsJapgolly.wixStyleReact.wixStyleReactStrings.facebook = "facebook".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.facebook]
    
    inline def instagram: typingsJapgolly.wixStyleReact.wixStyleReactStrings.instagram = "instagram".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.instagram]
    
    inline def linkedin: typingsJapgolly.wixStyleReact.wixStyleReactStrings.linkedin = "linkedin".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.linkedin]
    
    inline def pinterest: typingsJapgolly.wixStyleReact.wixStyleReactStrings.pinterest = "pinterest".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.pinterest]
    
    inline def twitter: typingsJapgolly.wixStyleReact.wixStyleReactStrings.twitter = "twitter".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.twitter]
    
    inline def youtube: typingsJapgolly.wixStyleReact.wixStyleReactStrings.youtube = "youtube".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.youtube]
  }
  
  trait SocialButtonProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[SocialButtonIcons] = js.undefined
    
    var onClick: js.UndefOr[EventHandler[ReactMouseEventFrom[HTMLElement]]] = js.undefined
    
    var text: js.UndefOr[Node] = js.undefined
  }
  object SocialButtonProps {
    
    inline def apply(): SocialButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonProps]
    }
    
    extension [Self <: SocialButtonProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: SocialButtonIcons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setText(value: VdomNode): Self = StObject.set(x, "text", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<SocialButtonProps> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSocialButtonMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<SocialButtonProps> */ Any = default
}
