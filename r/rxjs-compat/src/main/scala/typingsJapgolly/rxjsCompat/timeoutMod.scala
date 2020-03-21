package typingsJapgolly.rxjsCompat

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operators/timeout", JSImport.Namespace)
@js.native
object timeoutMod extends js.Object {
  def timeout[T](due: Double): js.Any = js.native
  def timeout[T](
    due: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def timeout[T](due: Date): js.Any = js.native
  def timeout[T](
    due: Date,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
}

