package typingsJapgolly.winjs.WinJS.Utilities

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Properties
//#region Interfaces
trait ILogOptions extends js.Object {
  var action: js.UndefOr[js.Function3[/* message */ String, /* tags */ String, /* type */ String, Unit]] = js.undefined
  var excludeTags: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ILogOptions {
  @scala.inline
  def apply(
    action: (/* message */ String, /* tags */ String, /* type */ String) => Callback = null,
    excludeTags: String = null,
    tags: String = null,
    `type`: String = null
  ): ILogOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction3((t0: /* message */ java.lang.String, t1: /* tags */ java.lang.String, t2: /* type */ java.lang.String) => action(t0, t1, t2).runNow()))
    if (excludeTags != null) __obj.updateDynamic("excludeTags")(excludeTags.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogOptions]
  }
}

