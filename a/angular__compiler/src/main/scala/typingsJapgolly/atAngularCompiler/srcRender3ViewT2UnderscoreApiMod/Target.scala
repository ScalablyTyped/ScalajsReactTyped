package typingsJapgolly.atAngularCompiler.srcRender3ViewT2UnderscoreApiMod

import typingsJapgolly.atAngularCompiler.srcRender3R3UnderscoreAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var template: js.UndefOr[js.Array[Node]] = js.undefined
}

object Target {
  @scala.inline
  def apply(template: js.Array[Node] = null): Target = {
    val __obj = js.Dynamic.literal()
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

