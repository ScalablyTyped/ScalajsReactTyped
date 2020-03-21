package typingsJapgolly.antDesignReactNative.tabBarMod

import typingsJapgolly.antDesignReactNative.AnonBadge
import typingsJapgolly.antDesignReactNative.libStyleMod.Theme
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBar
  extends Component[TabBarNativeProps, js.Any, js.Any] {
  def getPanes(styles: ReturnType[js.Function1[/* theme */ Theme, AnonBadge]], content: Boolean): js.Array[_] = js.native
}

