package typingsJapgolly.expressFlashNotification.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait efnOptions extends js.Object {
  var afterAllRender: js.UndefOr[
    js.Function2[
      /* htmlFragments */ js.Array[String], 
      /* callback */ js.Function2[/* err */ js.Any, /* html */ String, Unit], 
      Unit
    ]
  ] = js.undefined
  var beforeSingleRender: js.UndefOr[
    js.Function2[
      /* item */ js.Any, 
      /* callback */ js.Function2[/* err */ js.Any, /* item */ js.Any, Unit], 
      Unit
    ]
  ] = js.undefined
  var localsName: js.UndefOr[String] = js.undefined
  var sessionName: js.UndefOr[String] = js.undefined
  var utilityName: js.UndefOr[String] = js.undefined
  var viewName: js.UndefOr[String] = js.undefined
}

object efnOptions {
  @scala.inline
  def apply(
    afterAllRender: (/* htmlFragments */ js.Array[String], /* callback */ js.Function2[/* err */ js.Any, /* html */ String, Unit]) => Callback = null,
    beforeSingleRender: (/* item */ js.Any, /* callback */ js.Function2[/* err */ js.Any, /* item */ js.Any, Unit]) => Callback = null,
    localsName: String = null,
    sessionName: String = null,
    utilityName: String = null,
    viewName: String = null
  ): efnOptions = {
    val __obj = js.Dynamic.literal()
    if (afterAllRender != null) __obj.updateDynamic("afterAllRender")(js.Any.fromFunction2((t0: /* htmlFragments */ js.Array[java.lang.String], t1: /* callback */ js.Function2[/* err */ js.Any, /* html */ java.lang.String, scala.Unit]) => afterAllRender(t0, t1).runNow()))
    if (beforeSingleRender != null) __obj.updateDynamic("beforeSingleRender")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* callback */ js.Function2[/* err */ js.Any, /* item */ js.Any, scala.Unit]) => beforeSingleRender(t0, t1).runNow()))
    if (localsName != null) __obj.updateDynamic("localsName")(localsName.asInstanceOf[js.Any])
    if (sessionName != null) __obj.updateDynamic("sessionName")(sessionName.asInstanceOf[js.Any])
    if (utilityName != null) __obj.updateDynamic("utilityName")(utilityName.asInstanceOf[js.Any])
    if (viewName != null) __obj.updateDynamic("viewName")(viewName.asInstanceOf[js.Any])
    __obj.asInstanceOf[efnOptions]
  }
}

