package typingsJapgolly.reactNavigation.mod

import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationContainerComponent
  extends Component[
      (NavigationContainerProps[js.Object, js.Object, _]) with (NavigationNavigatorProps[_, js.Object, _]), 
      js.Object, 
      js.Any
    ] {
  var dispatch: NavigationDispatch = js.native
}

