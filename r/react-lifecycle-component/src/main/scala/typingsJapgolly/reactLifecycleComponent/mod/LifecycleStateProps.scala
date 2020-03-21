package typingsJapgolly.reactLifecycleComponent.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleStateProps[P, S] extends js.Object {
  var component: ComponentClassP[P with js.Object]
}

object LifecycleStateProps {
  @scala.inline
  def apply[P, S](component: ComponentClassP[P with js.Object]): LifecycleStateProps[P, S] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LifecycleStateProps[P, S]]
  }
}

