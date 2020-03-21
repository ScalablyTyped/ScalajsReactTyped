package typingsJapgolly.beforeAfterHook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AfterHook[O, R] = js.Function2[/* result */ R, /* options */ O, scala.Unit]
  type AnyHook[O, R, E] = typingsJapgolly.beforeAfterHook.mod.BeforeHook[O] | (typingsJapgolly.beforeAfterHook.mod.ErrorHook[O, E]) | (typingsJapgolly.beforeAfterHook.mod.AfterHook[O, R]) | (typingsJapgolly.beforeAfterHook.mod.WrapHook[O, R])
  type BeforeHook[O] = js.Function1[/* options */ O, scala.Unit]
  type Collection = org.scalablytyped.runtime.Instantiable0[typingsJapgolly.beforeAfterHook.mod.HookCollection]
  type ErrorHook[O, E] = js.Function2[/* error */ E, /* options */ O, scala.Unit]
  type HookMethod[O, R] = js.Function1[/* options */ O, R | js.Promise[R]]
  type Singular = org.scalablytyped.runtime.Instantiable0[
    typingsJapgolly.beforeAfterHook.mod.HookSingular[js.Object, js.Object, js.Object]
  ]
  type WrapHook[O, R] = js.Function2[
    /* hookMethod */ typingsJapgolly.beforeAfterHook.mod.HookMethod[O, R], 
    /* options */ O, 
    R | js.Promise[R]
  ]
}
