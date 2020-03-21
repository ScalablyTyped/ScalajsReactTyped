package typingsJapgolly.textBuffer.mod._Global_.TextBuffer.Options

import typingsJapgolly.textBuffer.textBufferStrings.inside
import typingsJapgolly.textBuffer.textBufferStrings.never
import typingsJapgolly.textBuffer.textBufferStrings.overlap
import typingsJapgolly.textBuffer.textBufferStrings.surround
import typingsJapgolly.textBuffer.textBufferStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyMarker extends js.Object {
  /**
    *  Indicates whether insertions at the start or end of the marked range should
    *  be interpreted as happening outside the marker.
    */
  var exclusive: js.UndefOr[Boolean] = js.undefined
  /** Determines the rules by which changes to the buffer invalidate the marker. */
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  /**
    *  Custom properties to be associated with the marker.
    *  @deprecated
    */
  var properties: js.UndefOr[js.Object] = js.undefined
  /** Creates the marker in a reversed orientation. */
  var reversed: js.UndefOr[Boolean] = js.undefined
  /** Whether or not the marker should be tailed. */
  var tailed: js.UndefOr[Boolean] = js.undefined
}

object CopyMarker {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[Boolean] = js.undefined,
    invalidate: never | surround | overlap | inside | touch = null,
    properties: js.Object = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    tailed: js.UndefOr[Boolean] = js.undefined
  ): CopyMarker = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (invalidate != null) __obj.updateDynamic("invalidate")(invalidate.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(tailed)) __obj.updateDynamic("tailed")(tailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyMarker]
  }
}

