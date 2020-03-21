package typingsJapgolly.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Copies data from the source to the destination.
  */
@js.native
trait SchemaCopyPasteRequest extends js.Object {
  /**
    * The location to paste to. If the range covers a span that&#39;s a
    * multiple of the source&#39;s height or width, then the data will be
    * repeated to fill in the destination range. If the range is smaller than
    * the source range, the entire source data will still be copied (beyond the
    * end of the destination range).
    */
  var destination: js.UndefOr[SchemaGridRange] = js.native
  /**
    * How that data should be oriented when pasting.
    */
  var pasteOrientation: js.UndefOr[String] = js.native
  /**
    * What kind of data to paste.
    */
  var pasteType: js.UndefOr[String] = js.native
  /**
    * The source range to copy.
    */
  var source: js.UndefOr[SchemaGridRange] = js.native
}

object SchemaCopyPasteRequest {
  @scala.inline
  def apply(
    destination: SchemaGridRange = null,
    pasteOrientation: String = null,
    pasteType: String = null,
    source: SchemaGridRange = null
  ): SchemaCopyPasteRequest = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (pasteOrientation != null) __obj.updateDynamic("pasteOrientation")(pasteOrientation.asInstanceOf[js.Any])
    if (pasteType != null) __obj.updateDynamic("pasteType")(pasteType.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCopyPasteRequest]
  }
}

