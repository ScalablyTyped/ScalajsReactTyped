package typingsJapgolly.slateReact

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MutationObserverInit
import typingsJapgolly.std.MutationCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseMutationObserverMod {
  
  @JSImport("slate-react/dist/hooks/use-mutation-observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMutationObserver(node: RefHandle[HTMLElement], callback: MutationCallback, options: MutationObserverInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutationObserver")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
