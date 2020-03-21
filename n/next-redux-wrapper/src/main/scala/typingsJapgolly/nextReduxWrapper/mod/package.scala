package typingsJapgolly.nextReduxWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MakeStore = js.Function2[
    /* initialState */ js.Any, 
    /* options */ typingsJapgolly.nextReduxWrapper.mod.MakeStoreOptions, 
    typingsJapgolly.redux.mod.Store[js.Any, typingsJapgolly.redux.mod.AnyAction]
  ]
}
