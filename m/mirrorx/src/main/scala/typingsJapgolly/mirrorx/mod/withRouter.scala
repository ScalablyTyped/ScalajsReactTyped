package typingsJapgolly.mirrorx.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mirrorx", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: RouteComponentProps[_] */](component: ComponentType[P]): ComponentClassP[(Omit[P, String]) with js.Object] = js.native
  def apply[TFunction /* <: ComponentClassP[js.Object] */](target: TFunction): TFunction = js.native
}

