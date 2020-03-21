package typingsJapgolly.jsreportChromePdf.mod.jsreportCoreAugmentingMod

import typingsJapgolly.jsreportChromePdf.PartialChrome
import typingsJapgolly.jsreportChromePdf.PartialChromeImage
import typingsJapgolly.jsreportChromePdf.jsreportChromePdfStrings.`chrome-image`
import typingsJapgolly.jsreportChromePdf.jsreportChromePdfStrings.`chrome-pdf`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  var chrome: js.UndefOr[PartialChrome] = js.undefined
  var chromeImage: js.UndefOr[PartialChromeImage] = js.undefined
  var recipe: `chrome-pdf` | `chrome-image` | String
}

object Template {
  @scala.inline
  def apply(
    recipe: `chrome-pdf` | `chrome-image` | String,
    chrome: PartialChrome = null,
    chromeImage: PartialChromeImage = null
  ): Template = {
    val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
    if (chrome != null) __obj.updateDynamic("chrome")(chrome.asInstanceOf[js.Any])
    if (chromeImage != null) __obj.updateDynamic("chromeImage")(chromeImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

