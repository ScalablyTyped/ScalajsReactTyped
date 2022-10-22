package typingsJapgolly.vueRuntimeDom.mod

import typingsJapgolly.vueReactivity.mod.EffectScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/runtime-dom", "ReactiveEffect")
@js.native
open class ReactiveEffect[T] protected ()
  extends typingsJapgolly.vueRuntimeCore.mod.ReactiveEffect[T] {
  def this(fn: js.Function0[T]) = this()
  def this(fn: js.Function0[T], scheduler: EffectScheduler) = this()
  def this(fn: js.Function0[T], scheduler: Null, scope: typingsJapgolly.vueReactivity.mod.EffectScope_) = this()
  def this(fn: js.Function0[T], scheduler: Unit, scope: typingsJapgolly.vueReactivity.mod.EffectScope_) = this()
  def this(
    fn: js.Function0[T],
    scheduler: EffectScheduler,
    scope: typingsJapgolly.vueReactivity.mod.EffectScope_
  ) = this()
}
