package typingsJapgolly.tcomb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tcomb.AnonCodomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// dict combinator
//
@js.native
trait Dict_[T] extends Type[StringDictionary[T]] {
  @JSName("meta")
  var meta_Dict_ : AnonCodomain[T] = js.native
  @JSName("update")
  var update_Original: Update_[StringDictionary[T]] = js.native
  def update(instance: StringDictionary[T], spec: UpdatePatch): StringDictionary[T] = js.native
}

