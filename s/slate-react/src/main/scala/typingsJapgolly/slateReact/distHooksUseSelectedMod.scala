package typingsJapgolly.slateReact

import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseSelectedMod {
  
  @JSImport("slate-react/dist/hooks/use-selected", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-react/dist/hooks/use-selected", "SelectedContext")
  @js.native
  val SelectedContext: Context[Boolean] = js.native
  
  inline def useSelected(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelected")().asInstanceOf[Boolean]
}
