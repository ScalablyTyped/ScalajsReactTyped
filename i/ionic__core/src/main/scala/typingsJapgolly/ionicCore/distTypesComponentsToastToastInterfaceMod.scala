package typingsJapgolly.ionicCore

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsSanitizationMod.IonicSafeString
import typingsJapgolly.ionicCore.ionicCoreStrings.bottom
import typingsJapgolly.ionicCore.ionicCoreStrings.cancel
import typingsJapgolly.ionicCore.ionicCoreStrings.end
import typingsJapgolly.ionicCore.ionicCoreStrings.middle
import typingsJapgolly.ionicCore.ionicCoreStrings.start
import typingsJapgolly.ionicCore.ionicCoreStrings.top
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsToastToastInterfaceMod {
  
  type ToastAttributes = StringDictionary[Any]
  
  trait ToastButton extends StObject {
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var handler: js.UndefOr[js.Function0[Boolean | Unit | (js.Promise[Boolean | Unit])]] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[cancel | String] = js.undefined
    
    var side: js.UndefOr[start | end] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object ToastButton {
    
    inline def apply(): ToastButton = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastButton]
    }
    
    extension [Self <: ToastButton](x: Self) {
      
      inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value*))
      
      inline def setHandler(value: CallbackTo[Boolean | Unit | (js.Promise[Boolean | Unit])]): Self = StObject.set(x, "handler", value.toJsFn)
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setRole(value: cancel | String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSide(value: start | end): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ToastOptions extends StObject {
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var buttons: js.UndefOr[js.Array[ToastButton | String]] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var cssClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var enterAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var htmlAttributes: js.UndefOr[ToastAttributes] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var keyboardClose: js.UndefOr[Boolean] = js.undefined
    
    var leaveAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var message: js.UndefOr[String | IonicSafeString] = js.undefined
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var position: js.UndefOr[top | bottom | middle] = js.undefined
    
    var translucent: js.UndefOr[Boolean] = js.undefined
  }
  object ToastOptions {
    
    inline def apply(): ToastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOptions]
    }
    
    extension [Self <: ToastOptions](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setButtons(value: js.Array[ToastButton | String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: (ToastButton | String)*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCssClass(value: String | js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value*))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnterAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "enterAnimation", js.Any.fromFunction2(value))
      
      inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHtmlAttributes(value: ToastAttributes): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeyboardClose(value: Boolean): Self = StObject.set(x, "keyboardClose", value.asInstanceOf[js.Any])
      
      inline def setKeyboardCloseUndefined: Self = StObject.set(x, "keyboardClose", js.undefined)
      
      inline def setLeaveAnimation(value: (/* baseEl */ Any, /* opts */ js.UndefOr[Any]) => Animation): Self = StObject.set(x, "leaveAnimation", js.Any.fromFunction2(value))
      
      inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
      
      inline def setMessage(value: String | IonicSafeString): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPosition(value: top | bottom | middle): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
      
      inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    }
  }
}
