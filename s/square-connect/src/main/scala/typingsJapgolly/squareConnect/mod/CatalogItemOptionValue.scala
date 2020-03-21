package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogItemOptionValue")
@js.native
class CatalogItemOptionValue () extends js.Object {
  /**
    * The HTML color for this value in the format #FFRRGGBB or #RRGGBB (e.g., \"#ff8d4e85\").
    * Only displayed if parent Item Option's `show_colors` flag is enabled. value.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The option value's human-readable description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Unique ID of the associated item option.
    */
  var item_option_id: js.UndefOr[String] = js.native
  /**
    * The number of [CatalogItemVariation(#type-catalogitemvariation)s that currently make use of this Item Option value.
    * Present only if `retrieve_counts` was specified on the request used to retrieve the parent Item Option of this value.
    * Maximum: 100 counts.
    */
  var item_variation_count: js.UndefOr[Double] = js.native
  /**
    * Name of this item option value. Searchable.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Determines where this option value appears in a list of option values.
    */
  var ordinal: js.UndefOr[Double] = js.native
}

