package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsCaptchaCaptchaDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/captcha/Captcha.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def captchaDriverFactory(base: UniDriver[Any]): CaptchaDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("captchaDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CaptchaDriver]
  
  trait CaptchaDriver
    extends StObject
       with BaseUniDriver {
    
    def getCaptchaType(): js.Promise[String]
    
    def getLang(): js.Promise[String]
    
    def getSize(): js.Promise[String]
    
    def getTheme(): js.Promise[String]
    
    def isRequired(): js.Promise[Boolean]
  }
  object CaptchaDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getCaptchaType: CallbackTo[js.Promise[String]],
      getLang: CallbackTo[js.Promise[String]],
      getSize: CallbackTo[js.Promise[String]],
      getTheme: CallbackTo[js.Promise[String]],
      isRequired: CallbackTo[js.Promise[Boolean]]
    ): CaptchaDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getCaptchaType = getCaptchaType.toJsFn, getLang = getLang.toJsFn, getSize = getSize.toJsFn, getTheme = getTheme.toJsFn, isRequired = isRequired.toJsFn)
      __obj.asInstanceOf[CaptchaDriver]
    }
    
    extension [Self <: CaptchaDriver](x: Self) {
      
      inline def setGetCaptchaType(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCaptchaType", value.toJsFn)
      
      inline def setGetLang(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLang", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetTheme(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTheme", value.toJsFn)
      
      inline def setIsRequired(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isRequired", value.toJsFn)
    }
  }
}
