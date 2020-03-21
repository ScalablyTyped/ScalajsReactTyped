package typingsJapgolly.dexie.mod.Dexie

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  def stores(schema: StringDictionary[String | Null]): Version
  def upgrade(fn: js.Function1[/* trans */ Transaction, Unit]): Version
}

object Version {
  @scala.inline
  def apply(
    stores: StringDictionary[String | Null] => CallbackTo[Version],
    upgrade: js.Function1[/* trans */ Transaction, Unit] => CallbackTo[Version]
  ): Version = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stores")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]) => stores(t0).runNow()))
    __obj.updateDynamic("upgrade")(js.Any.fromFunction1((t0: js.Function1[/* trans */ typingsJapgolly.dexie.mod.Dexie.Transaction, scala.Unit]) => upgrade(t0).runNow()))
    __obj.asInstanceOf[Version]
  }
}

