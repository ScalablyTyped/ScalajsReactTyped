package typingsJapgolly.rxjsCompat

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/delay", JSImport.Namespace)
@js.native
object operatorDelayMod extends js.Object {
  def delay[T](delay: Double): js.Any = js.native
  def delay[T](
    delay: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def delay[T](delay: Date): js.Any = js.native
  def delay[T](
    delay: Date,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
}

