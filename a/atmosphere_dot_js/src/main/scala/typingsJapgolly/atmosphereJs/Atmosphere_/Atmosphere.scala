package typingsJapgolly.atmosphereJs.Atmosphere_

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Atmosphere extends js.Object {
  var AtmosphereRequest: js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.AtmosphereRequest] = js.undefined
  /**
    * The atmosphere API is a little bit special here: the first parameter can either be
    * a URL string or a Request object. If it is a URL string, then the additional parameters are expected.
    */
  var subscribe: js.UndefOr[
    js.Function3[
      /* requestOrUrl */ js.Any, 
      /* callback */ js.UndefOr[js.Function], 
      /* request */ js.UndefOr[Request], 
      Request
    ]
  ] = js.undefined
  var unsubscribe: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Atmosphere {
  @scala.inline
  def apply(
    AtmosphereRequest: AtmosphereRequest = null,
    subscribe: (/* requestOrUrl */ js.Any, /* callback */ js.UndefOr[js.Function], /* request */ js.UndefOr[Request]) => CallbackTo[Request] = null,
    unsubscribe: js.UndefOr[Callback] = js.undefined
  ): Atmosphere = {
    val __obj = js.Dynamic.literal()
    if (AtmosphereRequest != null) __obj.updateDynamic("AtmosphereRequest")(AtmosphereRequest.asInstanceOf[js.Any])
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction3((t0: /* requestOrUrl */ js.Any, t1: /* callback */ js.UndefOr[js.Function], t2: /* request */ js.UndefOr[typingsJapgolly.atmosphereJs.Atmosphere_.Request]) => subscribe(t0, t1, t2).runNow()))
    unsubscribe.foreach(p => __obj.updateDynamic("unsubscribe")(p.toJsFn))
    __obj.asInstanceOf[Atmosphere]
  }
}

