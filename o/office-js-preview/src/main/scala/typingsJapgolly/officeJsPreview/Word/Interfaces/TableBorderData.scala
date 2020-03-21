package typingsJapgolly.officeJsPreview.Word.Interfaces

import typingsJapgolly.officeJsPreview.Word.BorderType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashDotStroked
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dashed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DashedSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dot2Dashed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DotDashed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Dotted
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Double
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DoubleWave
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Mixed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Single
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThickThinLarge
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThickThinMed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThickThinSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickLarge
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickMed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickThinLarge
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickThinMed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThinThickThinSmall
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeDEmboss
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ThreeDEngrave
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Triple
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Wave
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

