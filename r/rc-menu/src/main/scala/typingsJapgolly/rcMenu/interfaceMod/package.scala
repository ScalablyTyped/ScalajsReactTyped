package typingsJapgolly.rcMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceMod {
  type BuiltinPlacements = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type DestroyEventHandler = js.Function1[/* key */ typingsJapgolly.react.mod.Key, scala.Unit]
  type HoverEventHandler = js.Function1[/* info */ typingsJapgolly.rcMenu.AnonHover, scala.Unit]
  type LegacyFunctionRef = js.Function1[/* node */ typingsJapgolly.react.mod.ReactInstance, scala.Unit]
  type MenuClickEventHandler = js.Function1[/* info */ typingsJapgolly.rcMenu.interfaceMod.MenuInfo, scala.Unit]
  type MenuHoverEventHandler = js.Function1[/* info */ typingsJapgolly.rcMenu.AnonKey, scala.Unit]
  type OpenAnimation = java.lang.String | (typingsJapgolly.std.Record[java.lang.String, js.Any])
  type OpenEventHandler = js.Function1[
    /* keys */ js.Array[typingsJapgolly.react.mod.Key] | typingsJapgolly.rcMenu.AnonOpen, 
    scala.Unit
  ]
  type RenderIconType = japgolly.scalajs.react.raw.React.Node | (js.Function1[/* props */ js.Any, japgolly.scalajs.react.raw.React.Node])
  type SelectEventHandler = js.Function1[/* info */ typingsJapgolly.rcMenu.interfaceMod.SelectInfo, scala.Unit]
}
