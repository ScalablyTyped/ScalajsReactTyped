package typingsJapgolly.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children
  extends Array[Ractive[Ractive[js.Any]]] {
  /** Lists of instances targetting anchors by name. */
  var byName: StringDictionary[js.Array[Ractive[Ractive[_]]]] = js.native
}

