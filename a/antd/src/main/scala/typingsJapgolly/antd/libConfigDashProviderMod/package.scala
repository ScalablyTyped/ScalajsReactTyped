package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libConfigDashProviderMod {
  import japgolly.scalajs.react.raw.React.ComponentClassP
  import typingsJapgolly.react.reactMod.ClassicComponentClass
  import typingsJapgolly.react.reactMod.StatelessComponent

  type IReactComponent[P] = StatelessComponent[P] | (ComponentClassP[P with js.Object]) | ClassicComponentClass[P]
}
