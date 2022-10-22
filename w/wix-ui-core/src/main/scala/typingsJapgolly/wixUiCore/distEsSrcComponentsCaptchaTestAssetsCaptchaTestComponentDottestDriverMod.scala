package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsCaptchaTestAssetsCaptchaTestComponentDottestDriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/captcha/test-assets/CaptchaTestComponent.testDriver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CaptchaTestInstanceDriverFactory(base: UniDriver[Any]): CaptchaTestComponentDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("CaptchaTestInstanceDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[CaptchaTestComponentDriver]
  
  trait CaptchaTestComponentDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnCaptcha(): js.Promise[Any]
    
    def isCaptchaRendered(): js.Promise[Boolean]
    
    def isCaptchaResetted(): js.Promise[Boolean]
    
    def isCaptchaVerified(): js.Promise[Boolean]
    
    def resetCaptcha(): js.Promise[Any]
  }
  object CaptchaTestComponentDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickOnCaptcha: CallbackTo[js.Promise[Any]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      isCaptchaRendered: CallbackTo[js.Promise[Boolean]],
      isCaptchaResetted: CallbackTo[js.Promise[Boolean]],
      isCaptchaVerified: CallbackTo[js.Promise[Boolean]],
      resetCaptcha: CallbackTo[js.Promise[Any]]
    ): CaptchaTestComponentDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickOnCaptcha = clickOnCaptcha.toJsFn, element = element.toJsFn, exists = exists.toJsFn, isCaptchaRendered = isCaptchaRendered.toJsFn, isCaptchaResetted = isCaptchaResetted.toJsFn, isCaptchaVerified = isCaptchaVerified.toJsFn, resetCaptcha = resetCaptcha.toJsFn)
      __obj.asInstanceOf[CaptchaTestComponentDriver]
    }
    
    extension [Self <: CaptchaTestComponentDriver](x: Self) {
      
      inline def setClickOnCaptcha(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "clickOnCaptcha", value.toJsFn)
      
      inline def setIsCaptchaRendered(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCaptchaRendered", value.toJsFn)
      
      inline def setIsCaptchaResetted(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCaptchaResetted", value.toJsFn)
      
      inline def setIsCaptchaVerified(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCaptchaVerified", value.toJsFn)
      
      inline def setResetCaptcha(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "resetCaptcha", value.toJsFn)
    }
  }
}
