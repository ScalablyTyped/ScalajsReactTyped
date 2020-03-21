package typingsJapgolly.reactInstantsearchNative.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.mod.GeoSearchExposed
import typingsJapgolly.reactInstantsearchCore.mod.GeoSearchProvided
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectGeoSearch")
@js.native
object connectGeoSearch extends js.Object {
  def apply(stateless: StatelessComponent[GeoSearchProvided[_]]): ComponentClassP[GeoSearchExposed with js.Object] = js.native
  def apply[TProps /* <: Partial[GeoSearchProvided[THit]] */, THit](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, GeoSearchProvided[THit]]) with GeoSearchExposed with js.Object] = js.native
}

