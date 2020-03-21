package typingsJapgolly.vuex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Action[S, R] = (typingsJapgolly.vuex.mod.ActionHandler[S, R]) | (typingsJapgolly.vuex.mod.ActionObject[S, R])
  type ActionHandler[S, R] = js.ThisFunction2[
    /* this */ typingsJapgolly.vuex.mod.Store[R], 
    /* injectee */ typingsJapgolly.vuex.mod.ActionContext[S, R], 
    /* payload */ js.UndefOr[js.Any], 
    js.Any
  ]
  type ActionSubscriber[P, S] = js.Function2[/* action */ P, /* state */ S, js.Any]
  type ActionTree[S, R] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vuex.mod.Action[S, R]]
  type Getter[S, R] = js.Function4[/* state */ S, /* getters */ js.Any, /* rootState */ R, /* rootGetters */ js.Any, js.Any]
  type GetterTree[S, R] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vuex.mod.Getter[S, R]]
  type ModuleTree[R] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vuex.mod.Module[js.Any, R]]
  type Mutation[S] = js.Function2[/* state */ S, /* payload */ js.UndefOr[js.Any], js.Any]
  type MutationTree[S] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vuex.mod.Mutation[S]]
  type Plugin[S] = js.Function1[/* store */ typingsJapgolly.vuex.mod.Store[S], js.Any]
  type SubscribeActionOptions[P, S] = (typingsJapgolly.vuex.mod.ActionSubscriber[P, S]) | (typingsJapgolly.vuex.mod.ActionSubscribersObject[P, S])
}
