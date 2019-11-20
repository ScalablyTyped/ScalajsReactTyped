package typingsJapgolly.rcDashMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfaceMod {
  import japgolly.scalajs.react.ReactAnimationEventFrom
  import japgolly.scalajs.react.ReactTransitionEventFrom
  import japgolly.scalajs.react.raw.React.Node
  import org.scalajs.dom.raw.HTMLElement
  import typingsJapgolly.rcDashMenu.Anon_DomEventKey
  import typingsJapgolly.rcDashMenu.Anon_Hover
  import typingsJapgolly.rcDashMenu.Anon_Item
  import typingsJapgolly.rcDashMenu.rcDashMenuNumbers.`false`
  import typingsJapgolly.react.reactMod.CSSProperties
  import typingsJapgolly.react.reactMod.Key
  import typingsJapgolly.react.reactMod.ReactInstance
  import typingsJapgolly.std.Record

  type AnimationType = String | (Record[String, js.Any])
  type BuiltinPlacements = Record[String, js.Any]
  type DestroyEventHandler = js.Function1[/* key */ Key, Unit]
  type HoverEventHandler = js.Function1[/* info */ Anon_Hover, Unit]
  type LegacyFunctionRef = js.Function1[/* node */ ReactInstance, Unit]
  type MenuClickEventHandler = js.Function1[/* info */ MenuInfo, Unit]
  type MenuHoverEventHandler = js.Function1[/* info */ Anon_DomEventKey, Unit]
  type MotionEventHandler = js.Function2[
    /* element */ HTMLElement, 
    /* event */ js.UndefOr[ReactTransitionEventFrom[HTMLElement] | ReactAnimationEventFrom[HTMLElement]], 
    js.UndefOr[CSSProperties | `false` | Null | Unit]
  ]
  type MotionNameObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in rc-menu.rc-menu/lib/interface.MotionStatus | rc-menu.rc-menu/lib/interface.MotionActiveStatus ]:? string}
    */ typingsJapgolly.rcDashMenu.rcDashMenuStrings.MotionNameObject with js.Any
  type OpenAnimation = String | (Record[String, js.Any])
  type OpenEventHandler = js.Function1[/* keys */ js.Array[Key] | Anon_Item, Unit]
  type RenderIconType = Node | (js.Function1[/* props */ js.Any, Node])
  type SelectEventHandler = js.Function1[/* info */ SelectInfo, Unit]
  type TransitionNameType = String
}
