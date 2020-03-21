package typingsJapgolly.recharts.mod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomizedProps extends js.Object {
  var component: ContentRenderer[_] | Element
}

object CustomizedProps {
  @scala.inline
  def apply(component: ContentRenderer[_] | Element): CustomizedProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomizedProps]
  }
}

