package typingsJapgolly.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoubleOptions extends js.Object {
  /**
    * A value to use for the field if the field isn't specified for a document. This can be important if you are using the field in an expression and that field is not present in every document.
    */
  var DefaultValue: js.UndefOr[Double] = js.native
  /**
    * Whether facet information can be returned for the field.
    */
  var FacetEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the contents of the field can be returned in the search results.
    */
  var ReturnEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the contents of the field are searchable.
    */
  var SearchEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the field can be used to sort the search results.
    */
  var SortEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the source field to map to the field. 
    */
  var SourceField: js.UndefOr[FieldName] = js.native
}

object DoubleOptions {
  @scala.inline
  def apply(
    DefaultValue: Int | scala.Double = null,
    FacetEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ReturnEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SearchEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SortEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SourceField: FieldName = null
  ): DoubleOptions = {
    val __obj = js.Dynamic.literal()
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(FacetEnabled)) __obj.updateDynamic("FacetEnabled")(FacetEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(ReturnEnabled)) __obj.updateDynamic("ReturnEnabled")(ReturnEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(SearchEnabled)) __obj.updateDynamic("SearchEnabled")(SearchEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(SortEnabled)) __obj.updateDynamic("SortEnabled")(SortEnabled.asInstanceOf[js.Any])
    if (SourceField != null) __obj.updateDynamic("SourceField")(SourceField.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleOptions]
  }
}

