package typingsJapgolly.phantom.mod

import typingsJapgolly.phantom.AnonBottom
import typingsJapgolly.phantom.AnonContents
import typingsJapgolly.phantom.phantomStrings.A3
import typingsJapgolly.phantom.phantomStrings.A4
import typingsJapgolly.phantom.phantomStrings.A5
import typingsJapgolly.phantom.phantomStrings.Legal
import typingsJapgolly.phantom.phantomStrings.Letter
import typingsJapgolly.phantom.phantomStrings.Tabloid
import typingsJapgolly.phantom.phantomStrings.landscape
import typingsJapgolly.phantom.phantomStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaperSizeOptions extends js.Object {
  var footer: js.UndefOr[AnonContents] = js.undefined
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
  var header: js.UndefOr[AnonContents] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[String | AnonBottom] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object IPaperSizeOptions {
  @scala.inline
  def apply(
    footer: AnonContents = null,
    format: A3 | A4 | A5 | Legal | Letter | Tabloid = null,
    header: AnonContents = null,
    height: String = null,
    margin: String | AnonBottom = null,
    orientation: portrait | landscape = null,
    width: String = null
  ): IPaperSizeOptions = {
    val __obj = js.Dynamic.literal()
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaperSizeOptions]
  }
}

