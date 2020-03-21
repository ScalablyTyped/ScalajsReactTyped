package typingsJapgolly.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A collection of custom XML parts.
  *
  * [Api set: ExcelApi 1.5]
  */
@js.native
trait CustomXmlPartCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: The custom XML part's ID. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: The custom XML part's namespace URI. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var namespaceUri: js.UndefOr[Boolean] = js.native
}

