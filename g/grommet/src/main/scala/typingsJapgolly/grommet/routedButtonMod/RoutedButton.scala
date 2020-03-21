package typingsJapgolly.grommet.routedButtonMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.buttonMod.ButtonProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/RoutedButton", "RoutedButton")
@js.native
class RoutedButton protected ()
  extends Component[RoutedButtonProps with ButtonProps, ComponentState, js.Any] {
  def this(props: RoutedButtonProps with ButtonProps) = this()
  def this(props: RoutedButtonProps with ButtonProps, context: js.Any) = this()
}

@JSImport("grommet/components/RoutedButton", "RoutedButton")
@js.native
object RoutedButton extends TopLevel[ComponentClass[RoutedButtonProps with ButtonProps, ComponentState]]

