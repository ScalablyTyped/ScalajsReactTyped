package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libConfigDashProviderMod {
  import typingsJapgolly.react.reactMod.ClassicComponentClass
  import typingsJapgolly.react.reactMod.ComponentClass
  import typingsJapgolly.react.reactMod.ComponentState
  import typingsJapgolly.react.reactMod.StatelessComponent

  type IReactComponent[P] = StatelessComponent[P] | (ComponentClass[P, ComponentState]) | ClassicComponentClass[P]
}
