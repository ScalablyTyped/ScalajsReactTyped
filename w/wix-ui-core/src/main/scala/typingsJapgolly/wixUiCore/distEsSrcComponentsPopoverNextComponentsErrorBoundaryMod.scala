package typingsJapgolly.wixUiCore

import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixUiCore.anon.HasError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPopoverNextComponentsErrorBoundaryMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/popover-next/components/ErrorBoundary", JSImport.Default)
  @js.native
  open class default protected () extends ErrorBoundary {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-ui-core/dist/es/src/components/popover-next/components/ErrorBoundary", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDerivedStateFromError(error: Any): HasError = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[HasError]
  }
  
  @js.native
  trait ErrorBoundary extends Component[Any, HasError, Any]
}
