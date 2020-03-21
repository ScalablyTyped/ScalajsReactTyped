package typingsJapgolly.kosCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.kosCore.AnonPayload
import typingsJapgolly.kosCore.AnonPayloadAnonParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KosModel[T] extends js.Object {
  var asyncs: StringDictionary[
    js.Function3[
      /* dispatch */ js.UndefOr[KosDispatch], 
      /* getState */ js.UndefOr[GetKosState[T]], 
      /* action */ js.UndefOr[AnonPayload[T]], 
      Unit
    ]
  ]
  var getAsync: js.UndefOr[
    js.Function1[
      /* key */ String, 
      js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[_]], Unit]
    ]
  ] = js.undefined
  var initial: T
  var namespace: String
  var reducers: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ AnonPayload[T], Unit]]
  var setup: js.UndefOr[
    js.Function3[
      /* dispatch */ KosDispatch, 
      /* getState */ GetKosState[T], 
      /* action */ AnonPayloadAnonParam, 
      Unit
    ]
  ] = js.undefined
}

object KosModel {
  @scala.inline
  def apply[T](
    asyncs: StringDictionary[
      js.Function3[
        /* dispatch */ js.UndefOr[KosDispatch], 
        /* getState */ js.UndefOr[GetKosState[T]], 
        /* action */ js.UndefOr[AnonPayload[T]], 
        Unit
      ]
    ],
    initial: T,
    namespace: String,
    reducers: StringDictionary[js.Function2[/* state */ T, /* hasPayload */ AnonPayload[T], Unit]],
    getAsync: /* key */ String => CallbackTo[
      js.Function2[/* dispatch */ KosDispatch, /* getState */ js.UndefOr[GetKosState[js.Any]], Unit]
    ] = null,
    setup: (/* dispatch */ KosDispatch, /* getState */ GetKosState[T], /* action */ AnonPayloadAnonParam) => Callback = null
  ): KosModel[T] = {
    val __obj = js.Dynamic.literal(asyncs = asyncs.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], reducers = reducers.asInstanceOf[js.Any])
    if (getAsync != null) __obj.updateDynamic("getAsync")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => getAsync(t0).runNow()))
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction3((t0: /* dispatch */ typingsJapgolly.kosCore.mod.KosDispatch, t1: /* getState */ typingsJapgolly.kosCore.mod.GetKosState[T], t2: /* action */ typingsJapgolly.kosCore.AnonPayloadAnonParam) => setup(t0, t1, t2).runNow()))
    __obj.asInstanceOf[KosModel[T]]
  }
}

