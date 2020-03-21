package typingsJapgolly.lifeomicAttempt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttemptOptions[T] extends js.Object {
  val beforeAttempt: BeforeAttempt[T] | Null
  val calculateDelay: CalculateDelay[T] | Null
  val delay: Double
  val factor: Double
  val handleError: HandleError[T] | Null
  val handleTimeout: HandleTimeout[T] | Null
  val initialDelay: Double
  val jitter: Boolean
  val maxAttempts: Double
  val maxDelay: Double
  val minDelay: Double
  val timeout: Double
}

object AttemptOptions {
  @scala.inline
  def apply[T](
    delay: Double,
    factor: Double,
    initialDelay: Double,
    jitter: Boolean,
    maxAttempts: Double,
    maxDelay: Double,
    minDelay: Double,
    timeout: Double,
    beforeAttempt: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => Callback = null,
    calculateDelay: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => CallbackTo[Double] = null,
    handleError: (/* err */ js.Any, /* context */ AttemptContext, /* options */ AttemptOptions[T]) => Callback = null,
    handleTimeout: (/* context */ AttemptContext, /* options */ AttemptOptions[T]) => CallbackTo[js.Promise[T]] = null
  ): AttemptOptions[T] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], initialDelay = initialDelay.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], maxAttempts = maxAttempts.asInstanceOf[js.Any], maxDelay = maxDelay.asInstanceOf[js.Any], minDelay = minDelay.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    if (beforeAttempt != null) __obj.updateDynamic("beforeAttempt")(js.Any.fromFunction2((t0: /* context */ typingsJapgolly.lifeomicAttempt.mod.AttemptContext, t1: /* options */ typingsJapgolly.lifeomicAttempt.mod.AttemptOptions[T]) => beforeAttempt(t0, t1).runNow()))
    if (calculateDelay != null) __obj.updateDynamic("calculateDelay")(js.Any.fromFunction2((t0: /* context */ typingsJapgolly.lifeomicAttempt.mod.AttemptContext, t1: /* options */ typingsJapgolly.lifeomicAttempt.mod.AttemptOptions[T]) => calculateDelay(t0, t1).runNow()))
    if (handleError != null) __obj.updateDynamic("handleError")(js.Any.fromFunction3((t0: /* err */ js.Any, t1: /* context */ typingsJapgolly.lifeomicAttempt.mod.AttemptContext, t2: /* options */ typingsJapgolly.lifeomicAttempt.mod.AttemptOptions[T]) => handleError(t0, t1, t2).runNow()))
    if (handleTimeout != null) __obj.updateDynamic("handleTimeout")(js.Any.fromFunction2((t0: /* context */ typingsJapgolly.lifeomicAttempt.mod.AttemptContext, t1: /* options */ typingsJapgolly.lifeomicAttempt.mod.AttemptOptions[T]) => handleTimeout(t0, t1).runNow()))
    __obj.asInstanceOf[AttemptOptions[T]]
  }
}

