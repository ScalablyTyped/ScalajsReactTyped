package typingsJapgolly.rcDashMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esInterfaceMod {
  import typingsJapgolly.rcDashMenu.Anon_DomEventKey
  import typingsJapgolly.rcDashMenu.Anon_Hover
  import typingsJapgolly.rcDashMenu.Anon_Item
  import typingsJapgolly.rcDashMenu.rcDashMenuNumbers.`false`
  import typingsJapgolly.react.reactMod.AnimationEvent
  import typingsJapgolly.react.reactMod.CSSProperties
  import typingsJapgolly.react.reactMod.Key
  import typingsJapgolly.react.reactMod.ReactInstance
  import typingsJapgolly.react.reactMod.ReactNode
  import typingsJapgolly.react.reactMod.TransitionEvent
  import typingsJapgolly.std.HTMLElement
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
    /* event */ js.UndefOr[TransitionEvent[HTMLElement] | AnimationEvent[HTMLElement]], 
    js.UndefOr[CSSProperties | `false` | Null | Unit]
  ]
  type MotionNameObject = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in rc-menu.rc-menu/es/interface.MotionStatus | rc-menu.rc-menu/es/interface.MotionActiveStatus ]:? string}
    */ typingsJapgolly.rcDashMenu.rcDashMenuStrings.MotionNameObject with js.Any
  type OpenAnimation = String | (Record[String, js.Any])
  type OpenEventHandler = js.Function1[/* keys */ js.Array[Key] | Anon_Item, Unit]
  type RenderIconType = ReactNode | (js.Function1[/* props */ js.Any, ReactNode])
  type SelectEventHandler = js.Function1[/* info */ SelectInfo, Unit]
  type TransitionNameType = String
}
