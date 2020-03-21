package typingsJapgolly.mkdirp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsSync extends js.Object {
  var fs: js.UndefOr[FsImplementationSync] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
}

object OptionsSync {
  @scala.inline
  def apply(fs: FsImplementationSync = null, mode: Mode = null): OptionsSync = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSync]
  }
}

