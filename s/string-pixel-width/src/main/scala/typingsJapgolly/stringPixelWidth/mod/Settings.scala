package typingsJapgolly.stringPixelWidth.mod

import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.`andale mono`
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.`avenir next`
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.`comic sans ms`
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.`courier new`
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.`open sans`
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.`times new roman`
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.`trebuchet ms`
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.arial
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.avenir
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.georgia
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.impact
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.tahoma
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.verdana
import typingsJapgolly.stringPixelWidth.stringPixelWidthStrings.webdings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var bold: js.UndefOr[Boolean] = js.undefined
  var font: js.UndefOr[
    (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings
  ] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    font: (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

