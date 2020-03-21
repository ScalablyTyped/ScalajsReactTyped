package typingsJapgolly.reactAlert.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactAlert.AnonAlert
import typingsJapgolly.reactAlert.reactAlertStrings.alert
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-alert", "withAlert")
@js.native
object withAlert extends js.Object {
  def apply[P /* <: AnonAlert */](): js.Function1[/* c */ ComponentType[P], ComponentType[Pick[P, Exclude[String, alert]]]] = js.native
  def apply[P /* <: AnonAlert */](context: Context[js.UndefOr[AlertManager]]): js.Function1[/* c */ ComponentType[P], ComponentType[Pick[P, Exclude[String, alert]]]] = js.native
}

