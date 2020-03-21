package typingsJapgolly.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`2`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`3`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`4`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`5`
import typingsJapgolly.fundamentalReact.fundamentalReactNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> */
trait PartialTileContentProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var headingLevel: js.UndefOr[`2` | `3` | `4` | `5` | `6`] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object PartialTileContentProps {
  @scala.inline
  def apply(
    className: String = null,
    headingLevel: `2` | `3` | `4` | `5` | `6` = null,
    title: String = null,
    titleProps: StringDictionary[js.Any] = null
  ): PartialTileContentProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (headingLevel != null) __obj.updateDynamic("headingLevel")(headingLevel.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTileContentProps]
  }
}

