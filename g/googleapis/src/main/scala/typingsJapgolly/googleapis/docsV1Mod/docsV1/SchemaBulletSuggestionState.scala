package typingsJapgolly.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base Bullet have been
  * changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaBulletSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to the list_id.
    */
  var listIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to the nesting_level.
    */
  var nestingLevelSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in text style have been changed
    * in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.native
}

object SchemaBulletSuggestionState {
  @scala.inline
  def apply(
    listIdSuggested: js.UndefOr[Boolean] = js.undefined,
    nestingLevelSuggested: js.UndefOr[Boolean] = js.undefined,
    textStyleSuggestionState: SchemaTextStyleSuggestionState = null
  ): SchemaBulletSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(listIdSuggested)) __obj.updateDynamic("listIdSuggested")(listIdSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(nestingLevelSuggested)) __obj.updateDynamic("nestingLevelSuggested")(nestingLevelSuggested.asInstanceOf[js.Any])
    if (textStyleSuggestionState != null) __obj.updateDynamic("textStyleSuggestionState")(textStyleSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBulletSuggestionState]
  }
}

