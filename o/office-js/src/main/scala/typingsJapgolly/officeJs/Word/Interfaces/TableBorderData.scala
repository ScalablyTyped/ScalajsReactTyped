package typingsJapgolly.officeJs.Word.Interfaces

import typingsJapgolly.officeJs.Word.BorderType
import typingsJapgolly.officeJs.officeJsStrings.DashDotStroked
import typingsJapgolly.officeJs.officeJsStrings.Dashed
import typingsJapgolly.officeJs.officeJsStrings.DashedSmall
import typingsJapgolly.officeJs.officeJsStrings.Dot2Dashed
import typingsJapgolly.officeJs.officeJsStrings.DotDashed
import typingsJapgolly.officeJs.officeJsStrings.Dotted
import typingsJapgolly.officeJs.officeJsStrings.Double
import typingsJapgolly.officeJs.officeJsStrings.DoubleWave
import typingsJapgolly.officeJs.officeJsStrings.Mixed
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.Single
import typingsJapgolly.officeJs.officeJsStrings.ThickThinLarge
import typingsJapgolly.officeJs.officeJsStrings.ThickThinMed
import typingsJapgolly.officeJs.officeJsStrings.ThickThinSmall
import typingsJapgolly.officeJs.officeJsStrings.ThinThickLarge
import typingsJapgolly.officeJs.officeJsStrings.ThinThickMed
import typingsJapgolly.officeJs.officeJsStrings.ThinThickSmall
import typingsJapgolly.officeJs.officeJsStrings.ThinThickThinLarge
import typingsJapgolly.officeJs.officeJsStrings.ThinThickThinMed
import typingsJapgolly.officeJs.officeJsStrings.ThinThickThinSmall
import typingsJapgolly.officeJs.officeJsStrings.ThreeDEmboss
import typingsJapgolly.officeJs.officeJsStrings.ThreeDEngrave
import typingsJapgolly.officeJs.officeJsStrings.Triple
import typingsJapgolly.officeJs.officeJsStrings.Wave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "tableBorder.toJSON()". */
trait TableBorderData extends js.Object {
  /**
    *
    * Gets or sets the table border color.
    *
    * [Api set: WordApi 1.3]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the type of the table border.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
  ] = js.undefined
  /**
    *
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object TableBorderData {
  @scala.inline
  def apply(
    color: String = null,
    `type`: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave = null,
    width: Int | scala.Double = null
  ): TableBorderData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderData]
  }
}

