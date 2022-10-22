package typingsJapgolly.wixUiCore

import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixUiCore.anon.Expired
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsCaptchaTestAssetsCaptchaTestComponentMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/captcha/test-assets/CaptchaTestComponent", "CaptchaTestComponent")
  @js.native
  open class CaptchaTestComponent protected ()
    extends Component[js.Object, js.Object, Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: Any) = this()
    
    /* private */ var captchaRef: Any = js.native
    
    def getVerifiedToken(): Any = js.native
    
    def isCaptchaVerified(): Any = js.native
    
    def resetCaptcha(): Unit = js.native
    
    @JSName("state")
    var state_CaptchaTestComponent: Expired = js.native
  }
}
