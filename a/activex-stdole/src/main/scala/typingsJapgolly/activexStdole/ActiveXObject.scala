package typingsJapgolly.activexStdole

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexStdole.activexStdoleStrings.FontChanged
import typingsJapgolly.activexStdole.activexStdoleStrings.PropertyName
import typingsJapgolly.activexStdole.stdole.StdFont
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  def on(
    obj: StdFont,
    event: FontChanged,
    argNames: js.Array[PropertyName],
    handler: js.ThisFunction1[/* this */ StdFont, /* parameter */ AnonPropertyName, Unit]
  ): Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    on: (StdFont, FontChanged, js.Array[PropertyName], js.ThisFunction1[/* this */ StdFont, /* parameter */ AnonPropertyName, Unit]) => Callback
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction4((t0: typingsJapgolly.activexStdole.stdole.StdFont, t1: typingsJapgolly.activexStdole.activexStdoleStrings.FontChanged, t2: js.Array[typingsJapgolly.activexStdole.activexStdoleStrings.PropertyName], t3: js.ThisFunction1[
  /* this */ typingsJapgolly.activexStdole.stdole.StdFont, 
  /* parameter */ typingsJapgolly.activexStdole.AnonPropertyName, 
  scala.Unit]) => on(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ActiveXObject]
  }
}

