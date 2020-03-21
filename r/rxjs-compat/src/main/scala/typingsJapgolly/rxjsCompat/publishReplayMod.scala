package typingsJapgolly.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operators/publishReplay", JSImport.Namespace)
@js.native
object publishReplayMod extends js.Object {
  def publishReplay[T](): js.Any = js.native
  def publishReplay[T](bufferSize: Double): js.Any = js.native
  def publishReplay[T](bufferSize: Double, windowTime: Double): js.Any = js.native
  def publishReplay[T](
    bufferSize: Double,
    windowTime: Double,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def publishReplay[T](
    bufferSize: Double,
    windowTime: Double,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  @JSName("publishReplay")
  def publishReplay_TR[T, R](): js.Any = js.native
  @JSName("publishReplay")
  def publishReplay_TR[T, R](bufferSize: Double): js.Any = js.native
  @JSName("publishReplay")
  def publishReplay_TR[T, R](bufferSize: Double, windowTime: Double): js.Any = js.native
  @JSName("publishReplay")
  def publishReplay_TR[T, R](
    bufferSize: Double,
    windowTime: Double,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
  ): js.Any = js.native
}

