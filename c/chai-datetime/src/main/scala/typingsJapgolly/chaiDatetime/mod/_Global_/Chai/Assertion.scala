package typingsJapgolly.chaiDatetime.mod._Global_.Chai

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.chaiDatetime.mod._Global_.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assertion extends js.Object {
  def afterDate(date: Date): Assertion
  def afterTime(date: Date): Assertion
  def beforeDate(date: Date): Assertion
  def beforeTime(date: Date): Assertion
  def equalDate(date: Date): Assertion
  def equalTime(date: Date): Assertion
  def withinDate(dateFrom: Date, dateTo: Date): Assertion
  def withinTime(dateFrom: Date, dateTo: Date): Assertion
}

object Assertion {
  @scala.inline
  def apply(
    afterDate: Date => CallbackTo[Assertion],
    afterTime: Date => CallbackTo[Assertion],
    beforeDate: Date => CallbackTo[Assertion],
    beforeTime: Date => CallbackTo[Assertion],
    equalDate: Date => CallbackTo[Assertion],
    equalTime: Date => CallbackTo[Assertion],
    withinDate: (Date, Date) => CallbackTo[Assertion],
    withinTime: (Date, Date) => CallbackTo[Assertion]
  ): Assertion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterDate")(js.Any.fromFunction1((t0: typingsJapgolly.chaiDatetime.mod._Global_.Date) => afterDate(t0).runNow()))
    __obj.updateDynamic("afterTime")(js.Any.fromFunction1((t0: typingsJapgolly.chaiDatetime.mod._Global_.Date) => afterTime(t0).runNow()))
    __obj.updateDynamic("beforeDate")(js.Any.fromFunction1((t0: typingsJapgolly.chaiDatetime.mod._Global_.Date) => beforeDate(t0).runNow()))
    __obj.updateDynamic("beforeTime")(js.Any.fromFunction1((t0: typingsJapgolly.chaiDatetime.mod._Global_.Date) => beforeTime(t0).runNow()))
    __obj.updateDynamic("equalDate")(js.Any.fromFunction1((t0: typingsJapgolly.chaiDatetime.mod._Global_.Date) => equalDate(t0).runNow()))
    __obj.updateDynamic("equalTime")(js.Any.fromFunction1((t0: typingsJapgolly.chaiDatetime.mod._Global_.Date) => equalTime(t0).runNow()))
    __obj.updateDynamic("withinDate")(js.Any.fromFunction2((t0: typingsJapgolly.chaiDatetime.mod._Global_.Date, t1: typingsJapgolly.chaiDatetime.mod._Global_.Date) => withinDate(t0, t1).runNow()))
    __obj.updateDynamic("withinTime")(js.Any.fromFunction2((t0: typingsJapgolly.chaiDatetime.mod._Global_.Date, t1: typingsJapgolly.chaiDatetime.mod._Global_.Date) => withinTime(t0, t1).runNow()))
    __obj.asInstanceOf[Assertion]
  }
}

