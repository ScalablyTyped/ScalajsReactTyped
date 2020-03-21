package typingsJapgolly.winrt.Windows.ApplicationModel.Activation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILaunchActivatedEventArgs extends IActivatedEventArgs {
  var arguments: String
  var tileId: String
}

object ILaunchActivatedEventArgs {
  @scala.inline
  def apply(
    arguments: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: String
  ): ILaunchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], tileId = tileId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILaunchActivatedEventArgs]
  }
}

