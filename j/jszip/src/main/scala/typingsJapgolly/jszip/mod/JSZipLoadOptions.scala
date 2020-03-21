package typingsJapgolly.jszip.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSZipLoadOptions extends js.Object {
  var base64: js.UndefOr[Boolean] = js.undefined
  var checkCRC32: js.UndefOr[Boolean] = js.undefined
  var createFolders: js.UndefOr[Boolean] = js.undefined
  var decodeFileName: js.UndefOr[js.Function1[/* filenameBytes */ scala.scalajs.js.typedarray.Uint8Array, String]] = js.undefined
  var optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
}

object JSZipLoadOptions {
  @scala.inline
  def apply(
    base64: js.UndefOr[Boolean] = js.undefined,
    checkCRC32: js.UndefOr[Boolean] = js.undefined,
    createFolders: js.UndefOr[Boolean] = js.undefined,
    decodeFileName: /* filenameBytes */ scala.scalajs.js.typedarray.Uint8Array => CallbackTo[String] = null,
    optimizedBinaryString: js.UndefOr[Boolean] = js.undefined
  ): JSZipLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base64)) __obj.updateDynamic("base64")(base64.asInstanceOf[js.Any])
    if (!js.isUndefined(checkCRC32)) __obj.updateDynamic("checkCRC32")(checkCRC32.asInstanceOf[js.Any])
    if (!js.isUndefined(createFolders)) __obj.updateDynamic("createFolders")(createFolders.asInstanceOf[js.Any])
    if (decodeFileName != null) __obj.updateDynamic("decodeFileName")(js.Any.fromFunction1((t0: /* filenameBytes */ scala.scalajs.js.typedarray.Uint8Array) => decodeFileName(t0).runNow()))
    if (!js.isUndefined(optimizedBinaryString)) __obj.updateDynamic("optimizedBinaryString")(optimizedBinaryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSZipLoadOptions]
  }
}

