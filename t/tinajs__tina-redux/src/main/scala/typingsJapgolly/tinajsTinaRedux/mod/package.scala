package typingsJapgolly.tinajsTinaRedux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MapStateToProps = js.Function1[/* state */ js.Any, js.Any]
  type mapDispatchToProps = js.Function1[
    /* dispatch */ typingsJapgolly.redux.mod.Dispatch[typingsJapgolly.redux.mod.AnyAction], 
    js.Any
  ]
}
