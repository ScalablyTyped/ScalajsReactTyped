package typingsJapgolly.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped node.AnonMode | string | null */ trait WriteOptions extends js.Object {
  var EOL: js.UndefOr[String] = js.undefined
  var fs: js.UndefOr[js.Object] = js.undefined
  var replacer: js.UndefOr[js.Any] = js.undefined
  var spaces: js.UndefOr[Double | String] = js.undefined
}

object WriteOptions {
  @scala.inline
  def apply(EOL: String = null, fs: js.Object = null, replacer: js.Any = null, spaces: Double | String = null): WriteOptions = {
    val __obj = js.Dynamic.literal()
    if (EOL != null) __obj.updateDynamic("EOL")(EOL.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(replacer.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteOptions]
  }
}

