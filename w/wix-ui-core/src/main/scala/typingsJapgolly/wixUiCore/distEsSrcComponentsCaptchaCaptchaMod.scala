package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixUiCore.anon.Rendered
import typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaTypesMod.CaptchaLang
import typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaTypesMod.CaptchaType
import typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaTypesMod.Size
import typingsJapgolly.wixUiCore.distEsSrcComponentsCaptchaTypesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsCaptchaCaptchaMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/captcha/Captcha", "Captcha")
  @js.native
  open class Captcha protected () extends PureComponent[CaptchaProps, CaptchaState, Any] {
    def this(props: CaptchaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CaptchaProps, context: Any) = this()
    
    /* private */ var captchaRef: Any = js.native
    
    /**
      * returns the verification token to the caller
      */
    def getVerificationToken(): Any = js.native
    
    /**
      * return true if the captcha challenge has been successfully taken
      */
    def isVerified(): Boolean = js.native
    
    /**
      * this method will pass the error to the registered error call back.
      */
    /* private */ val onError: Any = js.native
    
    /**
      * The user has taken the captcha challange however it has not been verified the page was not submitted in time
      * so we need to ask the user to retake the captcha challenge.
      */
    /* private */ val onExpired: Any = js.native
    
    /**
      * this will indicate the google component is loaded and ready to be displayed
      */
    /* private */ val onLoad: Any = js.native
    
    /**
      * triggered when the inner captcha is actually rendered
      */
    /* private */ val onRender: Any = js.native
    
    /**
      * the user has successfully taken the captcha and we have the verification id
      * @param verificationString
      */
    /* private */ val onVerified: Any = js.native
    
    /**
      * reload a new captcha from google
      */
    def resetCaptcha(): Unit = js.native
    
    @JSName("state")
    var state_Captcha: Rendered = js.native
  }
  /* static members */
  object Captcha {
    
    @JSImport("wix-ui-core/dist/es/src/components/captcha/Captcha", "Captcha")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/captcha/Captcha", "Captcha.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait CaptchaProps extends StObject {
    
    var captchaType: js.UndefOr[CaptchaType] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var lang: js.UndefOr[CaptchaLang] = js.undefined
    
    var loader: Any
    
    var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExpire: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onRender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onVerify: js.UndefOr[js.Function1[/* token */ String, Unit]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var sitekey: String
    
    var size: js.UndefOr[Size] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object CaptchaProps {
    
    inline def apply(loader: Any, sitekey: String): CaptchaProps = {
      val __obj = js.Dynamic.literal(loader = loader.asInstanceOf[js.Any], sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptchaProps]
    }
    
    extension [Self <: CaptchaProps](x: Self) {
      
      inline def setCaptchaType(value: CaptchaType): Self = StObject.set(x, "captchaType", value.asInstanceOf[js.Any])
      
      inline def setCaptchaTypeUndefined: Self = StObject.set(x, "captchaType", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setLang(value: CaptchaLang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setLoader(value: Any): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: Callback): Self = StObject.set(x, "onError", value.toJsFn)
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnExpire(value: Callback): Self = StObject.set(x, "onExpire", value.toJsFn)
      
      inline def setOnExpireUndefined: Self = StObject.set(x, "onExpire", js.undefined)
      
      inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnRender(value: Callback): Self = StObject.set(x, "onRender", value.toJsFn)
      
      inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
      
      inline def setOnReset(value: Callback): Self = StObject.set(x, "onReset", value.toJsFn)
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnVerify(value: /* token */ String => Callback): Self = StObject.set(x, "onVerify", js.Any.fromFunction1((t0: /* token */ String) => value(t0).runNow()))
      
      inline def setOnVerifyUndefined: Self = StObject.set(x, "onVerify", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait CaptchaState extends StObject {
    
    var rendered: Boolean
    
    var token: String
  }
  object CaptchaState {
    
    inline def apply(rendered: Boolean, token: String): CaptchaState = {
      val __obj = js.Dynamic.literal(rendered = rendered.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptchaState]
    }
    
    extension [Self <: CaptchaState](x: Self) {
      
      inline def setRendered(value: Boolean): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
