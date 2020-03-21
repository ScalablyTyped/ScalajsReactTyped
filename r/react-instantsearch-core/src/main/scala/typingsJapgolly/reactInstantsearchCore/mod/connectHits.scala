package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectHits")
@js.native
object connectHits extends js.Object {
  def apply[THit](stateless: StatelessComponent[HitsProvided[THit]]): ComponentClassP[js.Object] = js.native
  def apply[TProps /* <: HitsProvided[THit] */, THit](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, HitsProvided[THit]]) with js.Object] = js.native
}

