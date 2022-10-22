package typingsJapgolly.rcSwipeout

import typingsJapgolly.rcSwipeout.anon.AutoClose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIndexDotnativeMod {
  
  @JSImport("rc-swipeout/lib/index.native", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.rcSwipeout.libSwipeoutMod.default {
    def this(props: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rc-swipeout/lib/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-swipeout/lib/index.native", "default.defaultProps")
    @js.native
    def defaultProps: AutoClose = js.native
    inline def defaultProps_=(x: AutoClose): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
