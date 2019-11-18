package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.flexible
import typingsJapgolly.electron.electronStrings.large
import typingsJapgolly.electron.electronStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBarSpacerConstructorOptions extends js.Object {
  /**
    * Size of spacer, possible values are:
    */
  var size: js.UndefOr[small | large | flexible] = js.undefined
}

object TouchBarSpacerConstructorOptions {
  @scala.inline
  def apply(size: small | large | flexible = null): TouchBarSpacerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSpacerConstructorOptions]
  }
}

