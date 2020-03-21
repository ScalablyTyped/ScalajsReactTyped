package typingsJapgolly.fastq.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait queue extends js.Object {
  var concurrency: Double
  def drain(): js.Any
  def empty(): Unit
  def idle(): Boolean
  def kill(): js.Any
  def killAndDrain(): js.Any
  def length(): Double
  def pause(): js.Any
  def push(task: js.Any, done: done): Unit
  def resume(): js.Any
  def saturated(): Unit
  def unshift(task: js.Any, done: done): Unit
}

object queue {
  @scala.inline
  def apply(
    concurrency: Double,
    drain: CallbackTo[js.Any],
    empty: Callback,
    idle: CallbackTo[Boolean],
    kill: CallbackTo[js.Any],
    killAndDrain: CallbackTo[js.Any],
    length: CallbackTo[Double],
    pause: CallbackTo[js.Any],
    push: (js.Any, done) => Callback,
    resume: CallbackTo[js.Any],
    saturated: Callback,
    unshift: (js.Any, done) => Callback
  ): queue = {
    val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any])
    __obj.updateDynamic("drain")(drain.toJsFn)
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.updateDynamic("idle")(idle.toJsFn)
    __obj.updateDynamic("kill")(kill.toJsFn)
    __obj.updateDynamic("killAndDrain")(killAndDrain.toJsFn)
    __obj.updateDynamic("length")(length.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.fastq.mod.done) => push(t0, t1).runNow()))
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("saturated")(saturated.toJsFn)
    __obj.updateDynamic("unshift")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.fastq.mod.done) => unshift(t0, t1).runNow()))
    __obj.asInstanceOf[queue]
  }
}

