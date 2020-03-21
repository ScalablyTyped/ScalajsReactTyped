package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.plotlyJsStrings.`bottom center`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`bottom left`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`bottom right`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`middle center`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`top center`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`top left`
import typingsJapgolly.plotlyJs.plotlyJsStrings.`top right`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.DataTitle> */
trait PartialDataTitle extends js.Object {
  var font: js.UndefOr[PartialFont] = js.undefined
  var position: js.UndefOr[
    (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  ] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object PartialDataTitle {
  @scala.inline
  def apply(
    font: PartialFont = null,
    position: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`) = null,
    text: String = null
  ): PartialDataTitle = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDataTitle]
  }
}

