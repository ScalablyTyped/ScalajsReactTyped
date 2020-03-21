package typingsJapgolly.xlsx.mod

import typingsJapgolly.xlsx.xlsxNumbers.`0`
import typingsJapgolly.xlsx.xlsxNumbers.`1`
import typingsJapgolly.xlsx.xlsxNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetProps extends js.Object {
  /** Name of Document Module in associated VBA Project */
  var CodeName: js.UndefOr[String] = js.undefined
  /** Sheet Visibility (0=Visible 1=Hidden 2=VeryHidden) */
  var Hidden: js.UndefOr[`0` | `1` | `2`] = js.undefined
}

object SheetProps {
  @scala.inline
  def apply(CodeName: String = null, Hidden: `0` | `1` | `2` = null): SheetProps = {
    val __obj = js.Dynamic.literal()
    if (CodeName != null) __obj.updateDynamic("CodeName")(CodeName.asInstanceOf[js.Any])
    if (Hidden != null) __obj.updateDynamic("Hidden")(Hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetProps]
  }
}

