package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esMessageMod {
  import japgolly.scalajs.react.raw.React.Node

  type ConfigContent = Node | String
  type ConfigDuration = Double | js.Function0[Unit]
  type ConfigOnClose = js.Function0[Unit]
  type JointContent = ConfigContent | ArgsProps
  type ThenableArgument = js.Function1[/* val */ js.Any, Unit]
}
