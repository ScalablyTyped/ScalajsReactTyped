package typingsJapgolly.materialUiCore.createShallowMod

import typingsJapgolly.enzyme.mod.EnzymeSelector
import typingsJapgolly.materialUiCore.Fn1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowOptions extends js.Object {
  var dive: Boolean = js.native
  var shallow: Fn1 = js.native
  var untilSelector: EnzymeSelector = js.native
}

object ShallowOptions {
  @scala.inline
  def apply(dive: Boolean, shallow: Fn1, untilSelector: EnzymeSelector): ShallowOptions = {
    val __obj = js.Dynamic.literal(dive = dive.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], untilSelector = untilSelector.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShallowOptions]
  }
}

