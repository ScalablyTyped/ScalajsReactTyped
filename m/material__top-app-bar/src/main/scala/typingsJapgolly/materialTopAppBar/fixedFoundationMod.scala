package typingsJapgolly.materialTopAppBar

import typingsJapgolly.materialTopAppBar.anon.PartialMDCTopAppBarAdapte
import typingsJapgolly.materialTopAppBar.standardFoundationMod.MDCTopAppBarFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedFoundationMod {
  
  @JSImport("@material/top-app-bar/fixed/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCFixedTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
  }
  
  @JSImport("@material/top-app-bar/fixed/foundation", "MDCFixedTopAppBarFoundation")
  @js.native
  open class MDCFixedTopAppBarFoundation () extends MDCTopAppBarFoundation {
    def this(adapter: PartialMDCTopAppBarAdapte) = this()
    
    /**
      * State variable for the previous scroll iteration top app bar state
      */
    /* private */ var wasScrolled: Any = js.native
  }
}
