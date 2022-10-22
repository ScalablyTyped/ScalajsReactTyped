package typingsJapgolly.ahooks

import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsUseEffectWithTargetMod {
  
  @JSImport("ahooks/lib/utils/useEffectWithTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(effect: EffectCallback, deps: DependencyList, target: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
