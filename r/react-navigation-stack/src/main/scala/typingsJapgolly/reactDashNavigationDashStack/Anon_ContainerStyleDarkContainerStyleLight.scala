package typingsJapgolly.reactDashNavigationDashStack

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerStyleDarkContainerStyleLight extends js.Object {
  var containerStyleDark: Anon_BackgroundColor
  var containerStyleLight: Anon_BackgroundColor
  var transitionSpec: Anon_Damping | Anon_Config
  def screenInterpolator(props: SceneInterpolatorProps): Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnonTranslateY
}

object Anon_ContainerStyleDarkContainerStyleLight {
  @scala.inline
  def apply(
    containerStyleDark: Anon_BackgroundColor,
    containerStyleLight: Anon_BackgroundColor,
    screenInterpolator: SceneInterpolatorProps => CallbackTo[
      Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnonTranslateY
    ],
    transitionSpec: Anon_Damping | Anon_Config
  ): Anon_ContainerStyleDarkContainerStyleLight = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.updateDynamic("screenInterpolator")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => screenInterpolator(t0).runNow()))
    __obj.asInstanceOf[Anon_ContainerStyleDarkContainerStyleLight]
  }
}

