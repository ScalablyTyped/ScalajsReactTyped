package typingsJapgolly.jsreportJsrender.mod.jsreportCoreAugmentingMod

import typingsJapgolly.jsreportJsrender.jsreportJsrenderStrings.jsrender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var engine: jsrender | String
}

object Template {
  @scala.inline
  def apply(engine: jsrender | String): Template = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Template]
  }
}

