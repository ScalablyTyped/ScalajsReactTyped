package typingsJapgolly.semanticUiReact.transitionTransitionMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.semanticUiReact.transitionGroupMod.TransitionGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionComponent extends ComponentClass[TransitionProps, ComponentState] {
  var ENTERED: typingsJapgolly.semanticUiReact.semanticUiReactStrings.ENTERED = js.native
  var ENTERING: typingsJapgolly.semanticUiReact.semanticUiReactStrings.ENTERING = js.native
  var EXITED: typingsJapgolly.semanticUiReact.semanticUiReactStrings.EXITED = js.native
  var EXITING: typingsJapgolly.semanticUiReact.semanticUiReactStrings.EXITING = js.native
  var Group: ComponentClassP[TransitionGroupProps with js.Object] = js.native
  var UNMOUNTED: typingsJapgolly.semanticUiReact.semanticUiReactStrings.UNMOUNTED = js.native
}

