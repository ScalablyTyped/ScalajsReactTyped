package typingsJapgolly.googleCloudStorage.fileMod

import typingsJapgolly.googleCloudStorage.googleCloudStorageBooleans.`false`
import typingsJapgolly.googleCloudStorage.googleCloudStorageBooleans.`true`
import typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.crc32c
import typingsJapgolly.googleCloudStorage.googleCloudStorageStrings.md5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReadStreamOptions extends js.Object {
  var decompress: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
  var validation: js.UndefOr[md5 | crc32c | `false` | `true`] = js.undefined
}

object CreateReadStreamOptions {
  @scala.inline
  def apply(
    decompress: js.UndefOr[Boolean] = js.undefined,
    end: Int | Double = null,
    start: Int | Double = null,
    userProject: String = null,
    validation: md5 | crc32c | `false` | `true` = null
  ): CreateReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReadStreamOptions]
  }
}

