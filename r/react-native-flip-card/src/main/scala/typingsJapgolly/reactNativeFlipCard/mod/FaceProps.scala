package typingsJapgolly.reactNativeFlipCard.mod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceProps extends js.Object {
  var chilren: js.Array[Element]
}

object FaceProps {
  @scala.inline
  def apply(chilren: js.Array[Element]): FaceProps = {
    val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FaceProps]
  }
}

