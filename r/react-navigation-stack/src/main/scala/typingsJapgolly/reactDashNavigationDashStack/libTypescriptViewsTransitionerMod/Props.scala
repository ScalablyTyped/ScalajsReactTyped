package typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsTransitionerMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneDescriptorMap
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var configureTransition: js.UndefOr[
    js.Function2[
      /* current */ TransitionProps, 
      /* previous */ js.UndefOr[TransitionProps], 
      TransitionSpec
    ]
  ] = js.native
  var descriptors: SceneDescriptorMap = js.native
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams] = js.native
  var onTransitionEnd: js.UndefOr[
    js.Function2[
      /* current */ TransitionProps, 
      /* previous */ js.UndefOr[TransitionProps], 
      Unit | js.Promise[_]
    ]
  ] = js.native
  var onTransitionStart: js.UndefOr[
    js.Function2[
      /* current */ TransitionProps, 
      /* previous */ js.UndefOr[TransitionProps], 
      Unit | js.Promise[_]
    ]
  ] = js.native
  var screenProps: js.UndefOr[js.Any] = js.native
  def render(current: TransitionProps): Node = js.native
  def render(current: TransitionProps, previous: TransitionProps): Node = js.native
}

