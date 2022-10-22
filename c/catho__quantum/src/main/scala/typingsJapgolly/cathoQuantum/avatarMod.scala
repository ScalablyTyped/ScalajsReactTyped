package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod {
  
  @JSImport("@catho/quantum/Avatar", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AvatarProps, js.Object, Any]
  
  type Avatar = japgolly.scalajs.react.facade.React.Component[AvatarProps & js.Object, js.Object]
  
  trait AvatarProps extends StObject {
    
    var hasNotification: js.UndefOr[Boolean] = js.undefined
    
    var hasToggle: js.UndefOr[Boolean] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var picture: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object AvatarProps {
    
    inline def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    extension [Self <: AvatarProps](x: Self) {
      
      inline def setHasNotification(value: Boolean): Self = StObject.set(x, "hasNotification", value.asInstanceOf[js.Any])
      
      inline def setHasNotificationUndefined: Self = StObject.set(x, "hasNotification", js.undefined)
      
      inline def setHasToggle(value: Boolean): Self = StObject.set(x, "hasToggle", value.asInstanceOf[js.Any])
      
      inline def setHasToggleUndefined: Self = StObject.set(x, "hasToggle", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
