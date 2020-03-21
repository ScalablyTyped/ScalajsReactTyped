package typingsJapgolly.semanticUiReact.sidebarSidebarMod

import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.sidebarPushableMod.SidebarPushableProps
import typingsJapgolly.semanticUiReact.sidebarPusherMod.SidebarPusherProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarComponent extends ComponentClass[SidebarProps, ComponentState] {
  var Pushable: StatelessComponent[SidebarPushableProps] = js.native
  var Pusher: StatelessComponent[SidebarPusherProps] = js.native
}

