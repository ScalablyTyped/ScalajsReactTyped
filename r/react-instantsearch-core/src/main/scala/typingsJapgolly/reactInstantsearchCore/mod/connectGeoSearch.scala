package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectGeoSearch")
@js.native
object connectGeoSearch extends js.Object {
  def apply(stateless: StatelessComponent[GeoSearchProvided[_]]): ComponentClassP[GeoSearchExposed with js.Object] = js.native
  def apply[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, GeoSearchProvided[THit]]) with GeoSearchExposed with js.Object] = js.native
}

