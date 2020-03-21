package typingsJapgolly.reactIntl

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactIntl.mod.WrappedComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponentComponentType[P /* <: WrappedComponentProps[IntlPropName] */] extends js.Object {
  var WrappedComponent: ComponentType[P]
}

object AnonWrappedComponentComponentType {
  @scala.inline
  def apply[P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): AnonWrappedComponentComponentType[P] = {
    val __obj = js.Dynamic.literal(WrappedComponent = WrappedComponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWrappedComponentComponentType[P]]
  }
}

