package typingsJapgolly.hostValidation.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.hostValidation.hostValidationStrings.both
import typingsJapgolly.hostValidation.hostValidationStrings.either
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait config extends js.Object {
  var fail: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary], 
      /* res */ Response_, 
      /* next */ NextFunction, 
      Unit
    ]
  ] = js.undefined
  var hosts: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  var mode: js.UndefOr[both | either] = js.undefined
  var referers: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
}

object config {
  @scala.inline
  def apply(
    fail: (/* req */ Request_[ParamsDictionary], /* res */ Response_, /* next */ NextFunction) => Callback = null,
    hosts: js.Array[String | js.RegExp] = null,
    mode: both | either = null,
    referers: js.Array[String | js.RegExp] = null
  ): config = {
    val __obj = js.Dynamic.literal()
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => fail(t0, t1, t2).runNow()))
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (referers != null) __obj.updateDynamic("referers")(referers.asInstanceOf[js.Any])
    __obj.asInstanceOf[config]
  }
}

