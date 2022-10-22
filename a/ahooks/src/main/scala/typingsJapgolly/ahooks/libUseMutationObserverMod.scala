package typingsJapgolly.ahooks

import org.scalajs.dom.Element
import org.scalajs.dom.MutationObserverInit
import typingsJapgolly.ahooks.libUtilsDomTargetMod.BasicTarget
import typingsJapgolly.std.MutationCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseMutationObserverMod {
  
  @JSImport("ahooks/lib/useMutationObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(callback: MutationCallback, target: BasicTarget[Element]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(callback: MutationCallback, target: BasicTarget[Element], options: MutationObserverInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
