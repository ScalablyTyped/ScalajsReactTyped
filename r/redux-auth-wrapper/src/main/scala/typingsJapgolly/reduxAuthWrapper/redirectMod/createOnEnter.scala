package typingsJapgolly.reduxAuthWrapper.redirectMod

import typingsJapgolly.history.mod.LocationDescriptorObject
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-auth-wrapper/history3/redirect", "createOnEnter")
@js.native
object createOnEnter extends js.Object {
  def apply[State](config: CreateOnEnterConfig[State]): js.Function3[
    /* store */ Store[_, AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[/* location */ LocationDescriptorObject[LocationState], Unit], 
    Unit
  ] = js.native
}

