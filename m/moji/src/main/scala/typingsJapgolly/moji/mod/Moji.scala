package typingsJapgolly.moji.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Moji extends js.Object {
  def convert(beforeType: Mojisyu, afterType: Mojisyu): Moji
  def filter(`type`: Mojisyu): Moji
  def reject(`type`: Mojisyu): Moji
  def trim(): Moji
}

object Moji {
  @scala.inline
  def apply(
    convert: (Mojisyu, Mojisyu) => CallbackTo[Moji],
    filter: Mojisyu => CallbackTo[Moji],
    reject: Mojisyu => CallbackTo[Moji],
    trim: CallbackTo[Moji]
  ): Moji = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convert")(js.Any.fromFunction2((t0: typingsJapgolly.moji.mod.Mojisyu, t1: typingsJapgolly.moji.mod.Mojisyu) => convert(t0, t1).runNow()))
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: typingsJapgolly.moji.mod.Mojisyu) => filter(t0).runNow()))
    __obj.updateDynamic("reject")(js.Any.fromFunction1((t0: typingsJapgolly.moji.mod.Mojisyu) => reject(t0).runNow()))
    __obj.updateDynamic("trim")(trim.toJsFn)
    __obj.asInstanceOf[Moji]
  }
}

