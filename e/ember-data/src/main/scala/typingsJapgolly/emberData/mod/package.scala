package typingsJapgolly.emberData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AttributesFor[Model /* <: typingsJapgolly.emberData.mod.DS.Model */] = typingsJapgolly.emberData.mod.ModelKeys[Model]
  type ChangedAttributes = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Tuple2[js.Any, js.Any]]]
  /**
    The keys from the actual Model class, removing all the keys which come from
    the base class.
    */
  type ModelKeys[Model /* <: typingsJapgolly.emberData.mod.DS.Model */] = typingsJapgolly.std.Exclude[java.lang.String, java.lang.String]
  type RelationshipsFor[Model /* <: typingsJapgolly.emberData.mod.DS.Model */] = typingsJapgolly.emberData.mod.ModelKeys[Model]
}
