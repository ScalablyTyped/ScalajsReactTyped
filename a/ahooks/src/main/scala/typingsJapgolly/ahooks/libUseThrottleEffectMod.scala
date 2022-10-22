package typingsJapgolly.ahooks

import typingsJapgolly.ahooks.libUseThrottleThrottleOptionsMod.ThrottleOptions
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseThrottleEffectMod {
  
  @JSImport("ahooks/lib/useThrottleEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(effect: EffectCallback, deps: Unit, options: ThrottleOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(effect: EffectCallback, deps: DependencyList, options: ThrottleOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
