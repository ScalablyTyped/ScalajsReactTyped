package typingsJapgolly.neteaseCaptcha

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.bind
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.embed
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.float
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.http
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.https
import typingsJapgolly.neteaseCaptcha.neteaseCaptchaStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NeteaseCaptcha {
  
  trait Config extends StObject {
    
    /**
      * Only available on 'popup' mode. Selector string or HTMLElement for the captcha popup
      */
    var appendTo: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * Verification code id
      */
    var captchaId: String
    
    /**
      * Selector string or HTMLElement to render widget into
      */
    var element: String | HTMLElement
    
    /**
      * Defaults to false. Used to enable the Instance.close method
      */
    var enableClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defaults to 'zh-CN'
      */
    var lang: js.UndefOr[Lang] = js.undefined
    
    /**
      * Defaults to 'float' on desktop, and 'popup' on mobile. 'bind' is for invisible captcha
      */
    var mode: js.UndefOr[float | embed | popup | bind] = js.undefined
    
    /**
      * Callback invoked when the captcha popup is closed
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onReady: js.UndefOr[js.Function1[/* instance */ Instance, Unit]] = js.undefined
    
    var onVerify: js.UndefOr[js.Function2[/* error */ Any, /* data */ Data, Unit]] = js.undefined
    
    /**
      * Defaults to page protocol
      */
    var protocol: js.UndefOr[http | https] = js.undefined
    
    /**
      * Defaults to 'auto'
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Config {
    
    inline def apply(captchaId: String, element: String | HTMLElement): Config = {
      val __obj = js.Dynamic.literal(captchaId = captchaId.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAppendTo(value: String | HTMLElement): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setCaptchaId(value: String): Self = StObject.set(x, "captchaId", value.asInstanceOf[js.Any])
      
      inline def setElement(value: String | HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setEnableClose(value: Boolean): Self = StObject.set(x, "enableClose", value.asInstanceOf[js.Any])
      
      inline def setEnableCloseUndefined: Self = StObject.set(x, "enableClose", js.undefined)
      
      inline def setLang(value: Lang): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setMode(value: float | embed | popup | bind): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnReady(value: /* instance */ Instance => Callback): Self = StObject.set(x, "onReady", js.Any.fromFunction1((t0: /* instance */ Instance) => value(t0).runNow()))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnVerify(value: (/* error */ Any, /* data */ Data) => Callback): Self = StObject.set(x, "onVerify", js.Any.fromFunction2((t0: /* error */ Any, t1: /* data */ Data) => (value(t0, t1)).runNow()))
      
      inline def setOnVerifyUndefined: Self = StObject.set(x, "onVerify", js.undefined)
      
      inline def setProtocol(value: http | https): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var validate: String
  }
  object Data {
    
    inline def apply(validate: String): Data = {
      val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setValidate(value: String): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
  }
  
  type InitFunction = js.Function3[
    /* config */ Config, 
    /* onLoad */ js.UndefOr[onLoad], 
    /* onError */ js.UndefOr[onError], 
    Unit
  ]
  
  trait Instance extends StObject {
    
    /**
      * Available when enableClose is true - closes the captcha bulletin
      */
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Destroy the current instance
      */
    def destroy(): Unit
    
    /**
      * Available when the mode is set to 'popup' - opens the popup to accept verification
      */
    var popUp: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Refresh the instance to get new verification information
      */
    def refresh(): Unit
    
    /**
      * Available when the mode is set to 'bind' - verify token manually
      */
    var verify: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Instance {
    
    inline def apply(destroy: Callback, refresh: Callback): Instance = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, refresh = refresh.toJsFn)
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setPopUp(value: Callback): Self = StObject.set(x, "popUp", value.toJsFn)
      
      inline def setPopUpUndefined: Self = StObject.set(x, "popUp", js.undefined)
      
      inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
      
      inline def setVerify(value: Callback): Self = StObject.set(x, "verify", value.toJsFn)
      
      inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  type onError = js.Function1[/* error */ Any, Unit]
  
  type onLoad = js.Function1[/* instance */ Instance, Unit]
}
