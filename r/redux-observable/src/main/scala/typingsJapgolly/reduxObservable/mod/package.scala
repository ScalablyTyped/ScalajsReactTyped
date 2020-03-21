package typingsJapgolly.reduxObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Epic[Input /* <: typingsJapgolly.redux.mod.Action[_] */, Output /* <: Input */, State, Dependencies] = js.Function3[
    /* action$ */ typingsJapgolly.reduxObservable.mod.ActionsObservable[Input], 
    /* state$ */ typingsJapgolly.reduxObservable.mod.StateObservable[State], 
    /* dependencies */ Dependencies, 
    typingsJapgolly.rxjs.mod.Observable_[Output]
  ]
}
