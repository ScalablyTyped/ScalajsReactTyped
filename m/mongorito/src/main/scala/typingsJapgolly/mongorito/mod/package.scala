package typingsJapgolly.mongorito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Class[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type ModelClass = typingsJapgolly.mongorito.mod.Class[typingsJapgolly.mongorito.mod.Model]
  type Plugin = js.Function1[
    /* modelClass */ typingsJapgolly.mongorito.mod.ModelClass, 
    js.Function1[
      /* store */ typingsJapgolly.mongorito.mod.PluginStore, 
      js.Function1[
        /* next */ typingsJapgolly.mongorito.mod.PluginNext, 
        js.Function1[/* action */ typingsJapgolly.mongorito.mod.Action, scala.Unit]
      ]
    ]
  ]
  type PluginNext = js.Function1[/* action */ typingsJapgolly.mongorito.mod.Action, scala.Unit]
  type Reducer[S] = js.Function2[
    /* state */ S, 
    /* action */ typingsJapgolly.mongorito.mod.Action, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer<any> */ js.Object
  ]
  type ReducerModifier = js.Function1[
    /* reducerState */ typingsJapgolly.mongorito.mod.ReducerState, 
    typingsJapgolly.mongorito.mod.ReducerState
  ]
  type ReducerState = typingsJapgolly.mongorito.mod.DefaultReducer with (typingsJapgolly.std.Map[_, typingsJapgolly.mongorito.mod.Reducer[_]])
  type State = typingsJapgolly.mongorito.mod.DefaultState with js.Any
}
