package typingsJapgolly.dva

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Effect = js.Function2[
    /* action */ typingsJapgolly.redux.mod.AnyAction, 
    /* effects */ typingsJapgolly.dva.mod.EffectsCommandMap, 
    scala.Unit
  ]
  type EffectWithType = js.Tuple2[typingsJapgolly.dva.mod.Effect, typingsJapgolly.dva.AnonType]
  type EffectsMapObject = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.dva.mod.Effect | typingsJapgolly.dva.mod.EffectWithType]
  type ReducerEnhancer = js.Function1[
    /* reducer */ typingsJapgolly.redux.mod.Reducer[js.Any, typingsJapgolly.redux.mod.AnyAction], 
    scala.Unit
  ]
  type ReducersMapObjectWithEnhancer = js.Tuple2[
    typingsJapgolly.redux.mod.ReducersMapObject[js.Any, typingsJapgolly.redux.mod.Action[js.Any]], 
    typingsJapgolly.dva.mod.ReducerEnhancer
  ]
  type Router = js.Function1[
    /* api */ js.UndefOr[typingsJapgolly.dva.mod.RouterAPI], 
    japgolly.scalajs.react.raw.React.Element | js.Object
  ]
  type Subscription = js.Function2[
    /* api */ typingsJapgolly.dva.mod.SubscriptionAPI, 
    /* done */ js.Function, 
    scala.Unit
  ]
  type SubscriptionsMapObject = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.dva.mod.Subscription]
  type onActionFunc = js.Function1[/* api */ typingsJapgolly.redux.mod.MiddlewareAPI[js.Any, js.Any], scala.Unit]
}
