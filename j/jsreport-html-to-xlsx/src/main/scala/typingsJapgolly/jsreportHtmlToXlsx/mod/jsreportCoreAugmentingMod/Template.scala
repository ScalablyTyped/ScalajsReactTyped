package typingsJapgolly.jsreportHtmlToXlsx.mod.jsreportCoreAugmentingMod

import typingsJapgolly.jsreportHtmlToXlsx.AnonHtmlEngine
import typingsJapgolly.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.`html-to-xlsx`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var htmlToXlsx: AnonHtmlEngine
  var recipe: `html-to-xlsx` | String
}

object Template {
  @scala.inline
  def apply(htmlToXlsx: AnonHtmlEngine, recipe: `html-to-xlsx` | String): Template = {
    val __obj = js.Dynamic.literal(htmlToXlsx = htmlToXlsx.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Template]
  }
}

