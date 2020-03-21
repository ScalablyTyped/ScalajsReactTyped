package typingsJapgolly.scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tracingMod {
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - typingsJapgolly.scheduler.schedulerBooleans.`true`
    - typingsJapgolly.scheduler.schedulerBooleans.`false`
  */
  type EnableSchedulerTracing = js.UndefOr[typingsJapgolly.scheduler.tracingMod._EnableSchedulerTracing]
  type IfSchedulerTracing[WhenTrue, WhenFalse] = typingsJapgolly.scheduler.tracingMod.TypeByBuildFlag[typingsJapgolly.scheduler.tracingMod.EnableSchedulerTracing, WhenTrue, WhenFalse]
  type TypeByBuildFlag[Flag /* <: js.UndefOr[scala.Boolean] */, WhenTrue, WhenFalse] = WhenFalse | WhenTrue
  type WrappedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = T with typingsJapgolly.scheduler.AnonCancel
}
