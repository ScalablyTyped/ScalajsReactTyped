package typingsJapgolly.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorCommentOptions extends js.Object {
  var hint: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
}

object CursorCommentOptions {
  @scala.inline
  def apply(
    hint: String = null,
    limit: Int | scala.Double = null,
    maxTimeMS: Int | scala.Double = null,
    readPreference: ReadPreferenceOrMode = null,
    skip: Int | scala.Double = null
  ): CursorCommentOptions = {
    val __obj = js.Dynamic.literal()
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorCommentOptions]
  }
}

