package typingsJapgolly.reactOnclickoutside

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentConstructor[P] = typingsJapgolly.react.mod.ComponentType[P]
  type OnClickOutProps[P] = typingsJapgolly.reactOnclickoutside.mod.WithoutInjectedClickOutProps[P] with typingsJapgolly.reactOnclickoutside.mod.AdditionalProps
  type PropsOf[T] = js.Any
  type WithoutInjectedClickOutProps[P] = typingsJapgolly.std.Pick[P, typingsJapgolly.std.Exclude[java.lang.String, java.lang.String]]
}
