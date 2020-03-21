package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Position
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoundaries extends js.Object {
  var boundaries: js.UndefOr[Range] = js.undefined
  var direction: js.UndefOr[forward | backward] = js.undefined
  var ignoreElementEnd: js.UndefOr[Boolean] = js.undefined
  var shallow: js.UndefOr[Boolean] = js.undefined
  var singleCharacters: js.UndefOr[Boolean] = js.undefined
  var startPosition: Position
}

object AnonBoundaries {
  @scala.inline
  def apply(
    startPosition: Position,
    boundaries: Range = null,
    direction: forward | backward = null,
    ignoreElementEnd: js.UndefOr[Boolean] = js.undefined,
    shallow: js.UndefOr[Boolean] = js.undefined,
    singleCharacters: js.UndefOr[Boolean] = js.undefined
  ): AnonBoundaries = {
    val __obj = js.Dynamic.literal(startPosition = startPosition.asInstanceOf[js.Any])
    if (boundaries != null) __obj.updateDynamic("boundaries")(boundaries.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreElementEnd)) __obj.updateDynamic("ignoreElementEnd")(ignoreElementEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow.asInstanceOf[js.Any])
    if (!js.isUndefined(singleCharacters)) __obj.updateDynamic("singleCharacters")(singleCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoundaries]
  }
}

