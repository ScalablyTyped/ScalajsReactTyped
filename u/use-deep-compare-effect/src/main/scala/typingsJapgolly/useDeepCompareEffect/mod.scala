package typingsJapgolly.useDeepCompareEffect

import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-deep-compare-effect", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object default extends js.Object {
    def apply(effect: EffectCallback): Unit = js.native
    def apply(effect: EffectCallback, deps: DependencyList): Unit = js.native
  }
  
  @js.native
  object useDeepCompareEffectNoCheck extends js.Object {
    def apply(effect: EffectCallback): Unit = js.native
    def apply(effect: EffectCallback, deps: DependencyList): Unit = js.native
  }
  
}

