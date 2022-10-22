package typingsJapgolly.reactRecaptcha

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.`inline`
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.audio
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.bottomleft
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.bottomright
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.compact
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.dark
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.explicit
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.image
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.invisible
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.light
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.normal
import typingsJapgolly.reactRecaptcha.reactRecaptchaStrings.onload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-recaptcha", JSImport.Namespace)
  @js.native
  open class ^ () extends Recaptcha
  @JSImport("react-recaptcha", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("react-recaptcha", "defaultProps")
  @js.native
  def defaultProps: RecaptchaProps = js.native
  inline def defaultProps_=(x: RecaptchaProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("react-recaptcha", "propTypes")
  @js.native
  def propTypes: Any = js.native
  inline def propTypes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Recaptcha
    extends Component[RecaptchaProps, js.Object, Any] {
    
    def execute(): Unit = js.native
    
    def reset(): Unit = js.native
  }
  
  trait RecaptchaProps extends StObject {
    
    var badge: js.UndefOr[bottomright | bottomleft | `inline`] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var elementID: js.UndefOr[String] = js.undefined
    
    var expiredCallback: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var expiredCallbackName: js.UndefOr[String] = js.undefined
    
    var hl: js.UndefOr[String] = js.undefined
    
    var onloadCallback: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onloadCallbackName: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[onload | explicit] = js.undefined
    
    var sitekey: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[normal | compact | invisible] = js.undefined
    
    var tabindex: js.UndefOr[Double | String] = js.undefined
    
    var theme: js.UndefOr[dark | light] = js.undefined
    
    var `type`: js.UndefOr[audio | image] = js.undefined
    
    var verifyCallback: js.UndefOr[js.Function1[/* response */ String, Any]] = js.undefined
    
    var verifyCallbackName: js.UndefOr[String] = js.undefined
  }
  object RecaptchaProps {
    
    inline def apply(): RecaptchaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecaptchaProps]
    }
    
    extension [Self <: RecaptchaProps](x: Self) {
      
      inline def setBadge(value: bottomright | bottomleft | `inline`): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setElementID(value: String): Self = StObject.set(x, "elementID", value.asInstanceOf[js.Any])
      
      inline def setElementIDUndefined: Self = StObject.set(x, "elementID", js.undefined)
      
      inline def setExpiredCallback(value: CallbackTo[Any]): Self = StObject.set(x, "expiredCallback", value.toJsFn)
      
      inline def setExpiredCallbackName(value: String): Self = StObject.set(x, "expiredCallbackName", value.asInstanceOf[js.Any])
      
      inline def setExpiredCallbackNameUndefined: Self = StObject.set(x, "expiredCallbackName", js.undefined)
      
      inline def setExpiredCallbackUndefined: Self = StObject.set(x, "expiredCallback", js.undefined)
      
      inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
      
      inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
      
      inline def setOnloadCallback(value: CallbackTo[Any]): Self = StObject.set(x, "onloadCallback", value.toJsFn)
      
      inline def setOnloadCallbackName(value: String): Self = StObject.set(x, "onloadCallbackName", value.asInstanceOf[js.Any])
      
      inline def setOnloadCallbackNameUndefined: Self = StObject.set(x, "onloadCallbackName", js.undefined)
      
      inline def setOnloadCallbackUndefined: Self = StObject.set(x, "onloadCallback", js.undefined)
      
      inline def setRender(value: onload | explicit): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      inline def setSitekeyUndefined: Self = StObject.set(x, "sitekey", js.undefined)
      
      inline def setSize(value: normal | compact | invisible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTabindex(value: Double | String): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      inline def setTheme(value: dark | light): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: audio | image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVerifyCallback(value: /* response */ String => Any): Self = StObject.set(x, "verifyCallback", js.Any.fromFunction1(value))
      
      inline def setVerifyCallbackName(value: String): Self = StObject.set(x, "verifyCallbackName", value.asInstanceOf[js.Any])
      
      inline def setVerifyCallbackNameUndefined: Self = StObject.set(x, "verifyCallbackName", js.undefined)
      
      inline def setVerifyCallbackUndefined: Self = StObject.set(x, "verifyCallback", js.undefined)
    }
  }
}
