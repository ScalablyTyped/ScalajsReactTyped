package typingsJapgolly.grecaptcha

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReCaptchaV2 {
  
  trait Action extends StObject {
    
    /**
      * the name of the action. Actions may only contain alphanumeric characters and slashes, and must not be user-specific.
      */
    var action: String
  }
  object Action {
    
    inline def apply(action: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grecaptcha.grecaptchaStrings.bottomright
    - typingsJapgolly.grecaptcha.grecaptchaStrings.bottomleft
    - typingsJapgolly.grecaptcha.grecaptchaStrings.`inline`
  */
  trait Badge extends StObject
  object Badge {
    
    inline def bottomleft: typingsJapgolly.grecaptcha.grecaptchaStrings.bottomleft = "bottomleft".asInstanceOf[typingsJapgolly.grecaptcha.grecaptchaStrings.bottomleft]
    
    inline def bottomright: typingsJapgolly.grecaptcha.grecaptchaStrings.bottomright = "bottomright".asInstanceOf[typingsJapgolly.grecaptcha.grecaptchaStrings.bottomright]
    
    inline def `inline`: typingsJapgolly.grecaptcha.grecaptchaStrings.`inline` = "inline".asInstanceOf[typingsJapgolly.grecaptcha.grecaptchaStrings.`inline`]
  }
  
  trait Parameters extends StObject {
    
    /**
      * Optional. The badge location for g-recaptcha with size of "invisible".
      *
      * @default "bottomright"
      */
    var badge: js.UndefOr[Badge] = js.undefined
    
    /**
      * Optional. Your callback function that's executed when the user submits a successful CAPTCHA response.
      * The user's response, g-recaptcha-response, will be the input for your callback function.
      */
    var callback: js.UndefOr[js.Function1[/* response */ String, Unit]] = js.undefined
    
    /**
      * Optional. Your callback function that's executed when reCAPTCHA encounters an error (usually network connectivity) and cannot continue until connectivity is restored.
      * If you specify this function, you are responsible for informing the user that they should retry.
      */
    // Notice to the reader
    // I need to surround this object with quotes, this will however break intellisense in VS 2013.
    var `error-callback`: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Optional. Your callback function that's executed when the reCAPTCHA response expires and the user needs to solve a new CAPTCHA.
      */
    // Notice to the reader
    // I need to surround this object with quotes, this will however break intellisense in VS 2013.
    var `expired-callback`: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Optional. Invisible reCAPTCHA only. For plugin owners to not interfere with existing reCAPTCHA installations on a page.
      * If true, this reCAPTCHA instance will be part of a separate ID space.
      *
      * @default false
      */
    var isolated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Your sitekey.
      */
    var sitekey: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. The size of the widget.
      * Accepted values: "compact", "normal", "invisible".
      * @default "compact"
      */
    var size: js.UndefOr[Size] = js.undefined
    
    /**
      * Optional. The tabindex of the widget and challenge.
      * If other elements in your page use tabindex, it should be set to make user navigation easier.
      */
    var tabindex: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional. The color theme of the widget.
      * Accepted values: "light", "dark"
      * @default "light"
      */
    var theme: js.UndefOr[Theme] = js.undefined
    
    /**
      * Optional. The type of CAPTCHA to serve.
      * Accepted values: "audio", "image"
      * @default "image"
      */
    var `type`: js.UndefOr[Type] = js.undefined
  }
  object Parameters {
    
    inline def apply(): Parameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parameters]
    }
    
    extension [Self <: Parameters](x: Self) {
      
      inline def setBadge(value: Badge): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setCallback(value: /* response */ String => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* response */ String) => value(t0).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def `setError-callback`(value: Callback): Self = StObject.set(x, "error-callback", value.toJsFn)
      
      inline def `setError-callbackUndefined`: Self = StObject.set(x, "error-callback", js.undefined)
      
      inline def `setExpired-callback`(value: Callback): Self = StObject.set(x, "expired-callback", value.toJsFn)
      
      inline def `setExpired-callbackUndefined`: Self = StObject.set(x, "expired-callback", js.undefined)
      
      inline def setIsolated(value: Boolean): Self = StObject.set(x, "isolated", value.asInstanceOf[js.Any])
      
      inline def setIsolatedUndefined: Self = StObject.set(x, "isolated", js.undefined)
      
      inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      inline def setSitekeyUndefined: Self = StObject.set(x, "sitekey", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ReCaptcha extends StObject {
    
    /**
      * Programatically invoke the reCAPTCHA check. Used if the invisible reCAPTCHA is on a div instead of a button.
      * @param opt_widget_id Optional widget ID, defaults to the first widget created if unspecified.
      */
    def execute(): PromiseLike[Unit] = js.native
    def execute(opt_widget_id: Double): PromiseLike[Unit] = js.native
    /**
      * Programatically invoke the reCAPTCHA check. Used if the invisible reCAPTCHA is on a div instead of a button.
      * @param siteKey the key of your site
      * @param action the action
      *
      * @return a promise-like object containing the token
      */
    def execute(siteKey: String, action: Action): PromiseLike[String] = js.native
    
    /**
      * Gets the response for the reCAPTCHA widget.
      * @param opt_widget_id Optional widget ID, defaults to the first widget created if unspecified.
      * @return the response of the reCAPTCHA widget.
      */
    def getResponse(): String = js.native
    def getResponse(opt_widget_id: Double): String = js.native
    
    /**
      * will run the given function as soon as the reCAPTCHA library has loaded
      * @param callback the function to coll
      */
    def ready(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Renders the container as a reCAPTCHA widget and returns the ID of the newly created widget.
      * @param container The HTML element to render the reCAPTCHA widget. Specify either the ID of the container (string) or the DOM element itself.
      * @param parameters An object containing parameters as key=value pairs, for example, {"sitekey": "your_site_key", "theme": "light"}. See @see render parameters.
      * @param inherit Invisible reCAPTCHA only. Use existing data-* attributes on the element if the corresponding parameter is not specified.
      * The values in parameters will take precedence over the attributes.
      * @return the ID of the newly created widget.
      */
    def render(container: String): Double = js.native
    def render(container: String, parameters: Unit, inherit: Boolean): Double = js.native
    def render(container: String, parameters: Parameters): Double = js.native
    def render(container: String, parameters: Parameters, inherit: Boolean): Double = js.native
    def render(container: HTMLElement): Double = js.native
    def render(container: HTMLElement, parameters: Unit, inherit: Boolean): Double = js.native
    def render(container: HTMLElement, parameters: Parameters): Double = js.native
    def render(container: HTMLElement, parameters: Parameters, inherit: Boolean): Double = js.native
    
    /**
      * Resets the reCAPTCHA widget.
      * @param opt_widget_id Optional widget ID, defaults to the first widget created if unspecified.
      */
    def reset(): Unit = js.native
    def reset(opt_widget_id: Double): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grecaptcha.grecaptchaStrings.normal
    - typingsJapgolly.grecaptcha.grecaptchaStrings.compact
    - typingsJapgolly.grecaptcha.grecaptchaStrings.invisible
  */
  trait Size extends StObject
  object Size {
    
    inline def compact: typingsJapgolly.grecaptcha.grecaptchaStrings.compact = "compact".asInstanceOf[typingsJapgolly.grecaptcha.grecaptchaStrings.compact]
    
    inline def invisible: typingsJapgolly.grecaptcha.grecaptchaStrings.invisible = "invisible".asInstanceOf[typingsJapgolly.grecaptcha.grecaptchaStrings.invisible]
    
    inline def normal: typingsJapgolly.grecaptcha.grecaptchaStrings.normal = "normal".asInstanceOf[typingsJapgolly.grecaptcha.grecaptchaStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grecaptcha.grecaptchaStrings.light
    - typingsJapgolly.grecaptcha.grecaptchaStrings.dark
  */
  trait Theme extends StObject
  object Theme {
    
    inline def dark: typingsJapgolly.grecaptcha.grecaptchaStrings.dark = "dark".asInstanceOf[typingsJapgolly.grecaptcha.grecaptchaStrings.dark]
    
    inline def light: typingsJapgolly.grecaptcha.grecaptchaStrings.light = "light".asInstanceOf[typingsJapgolly.grecaptcha.grecaptchaStrings.light]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grecaptcha.grecaptchaStrings.image
    - typingsJapgolly.grecaptcha.grecaptchaStrings.audio
  */
  trait Type extends StObject
  object Type {
    
    inline def audio: typingsJapgolly.grecaptcha.grecaptchaStrings.audio = "audio".asInstanceOf[typingsJapgolly.grecaptcha.grecaptchaStrings.audio]
    
    inline def image: typingsJapgolly.grecaptcha.grecaptchaStrings.image = "image".asInstanceOf[typingsJapgolly.grecaptcha.grecaptchaStrings.image]
  }
}
