package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.PartialFont
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

trait DataTitle extends js.Object {
  var font: PartialFont
  var position: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  var text: String
}

object DataTitle {
  @scala.inline
  def apply(
    font: PartialFont,
    position: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`),
    text: String
  ): DataTitle = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataTitle]
  }
}

