package typingsJapgolly.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of customProperty objects.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait CustomPropertyCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the key of the custom property. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var key: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the value type of the custom property. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi 1.7]
    */
  var value: js.UndefOr[Boolean] = js.native
}

