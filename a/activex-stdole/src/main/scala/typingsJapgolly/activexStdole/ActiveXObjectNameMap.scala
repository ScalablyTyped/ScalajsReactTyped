package typingsJapgolly.activexStdole

import typingsJapgolly.activexStdole.stdole.StdFont
import typingsJapgolly.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var StdFont: typingsJapgolly.activexStdole.stdole.StdFont
  var StdPicture: typingsJapgolly.activexStdole.stdole.StdPicture
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(StdFont: StdFont, StdPicture: StdPicture): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(StdFont = StdFont.asInstanceOf[js.Any], StdPicture = StdPicture.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

