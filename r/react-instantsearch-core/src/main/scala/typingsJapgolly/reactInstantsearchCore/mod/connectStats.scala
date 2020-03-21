package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.PartialStatsProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectStats")
@js.native
object connectStats extends js.Object {
  def apply(stateless: StatelessComponent[StatsProvided]): ComponentClassP[js.Object] = js.native
  def apply[TProps /* <: PartialStatsProvided */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, StatsProvided]) with js.Object] = js.native
}

