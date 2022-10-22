package typingsJapgolly.reactNavigationStack

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.reactNavigationStack.anon.ActiveOpacity
import typingsJapgolly.reactNavigationStack.anon.PressOpacity
import typingsJapgolly.reactNavigationStack.anon.TypeofBaseButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsBorderlessButtonMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/BorderlessButton", JSImport.Default)
  @js.native
  open class default () extends BorderlessButton
  /* static members */
  object default {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/BorderlessButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/BorderlessButton", "default.defaultProps")
    @js.native
    def defaultProps: ActiveOpacity = js.native
    inline def defaultProps_=(x: ActiveOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BorderlessButton
    extends Component[Props, js.Object, Any] {
    
    /* private */ var handleActiveStateChange: Any = js.native
    
    /* private */ var opacity: Any = js.native
  }
  
  type Props = ComponentProps[TypeofBaseButton] & PressOpacity
}
