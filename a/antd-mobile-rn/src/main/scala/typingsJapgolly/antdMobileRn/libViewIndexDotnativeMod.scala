package typingsJapgolly.antdMobileRn

import typingsJapgolly.reactNative.mod.View
import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewIndexDotnativeMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethods */ @JSImport("antd-mobile-rn/lib/view/index.native", JSImport.Default)
  @js.native
  open class default protected () extends View {
    def this(props: ViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ViewProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/view/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    @JSImport("antd-mobile-rn/lib/view/index.native", "default.forceTouchAvailable")
    @js.native
    def forceTouchAvailable: Boolean = js.native
    inline def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
  }
}
