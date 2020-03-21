package typingsJapgolly.transducersJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletingTransformer[TResult, TCompleteResult, TInput] extends js.Object {
  @JSName("@@transducer/init")
  def `@@transducerSlashinit`(): TResult | Unit
  @JSName("@@transducer/result")
  def `@@transducerSlashresult`(result: TResult): TCompleteResult
  @JSName("@@transducer/step")
  def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced_[TResult]
}

object CompletingTransformer {
  @scala.inline
  def apply[TResult, TCompleteResult, TInput](
    `@@transducerSlashinit`: CallbackTo[TResult | Unit],
    `@@transducerSlashresult`: TResult => CallbackTo[TCompleteResult],
    `@@transducerSlashstep`: (TResult, TInput) => CallbackTo[TResult | Reduced_[TResult]]
  ): CompletingTransformer[TResult, TCompleteResult, TInput] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducerSlashinit")(`@@transducerSlashinit`.toJsFn)
    __obj.updateDynamic("@@transducerSlashresult")(js.Any.fromFunction1((t0: TResult) => `@@transducerSlashresult`(t0).runNow()))
    __obj.updateDynamic("@@transducerSlashstep")(js.Any.fromFunction2((t0: TResult, t1: TInput) => `@@transducerSlashstep`(t0, t1).runNow()))
    __obj.asInstanceOf[CompletingTransformer[TResult, TCompleteResult, TInput]]
  }
}

