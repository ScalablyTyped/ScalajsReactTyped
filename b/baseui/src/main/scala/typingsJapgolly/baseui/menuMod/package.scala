package typingsJapgolly.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object menuMod {
  type ArrayItemsT = js.Array[typingsJapgolly.baseui.menuMod.ItemT]
  type GetRequiredItemProps = js.Function2[
    /* item */ js.Any, 
    /* index */ scala.Double, 
    typingsJapgolly.baseui.menuMod.RenderItemProps
  ]
  type ItemT = js.Any
  type ItemsT = typingsJapgolly.baseui.menuMod.ArrayItemsT | typingsJapgolly.baseui.menuMod.GroupedItemsT
  type OnItemSelect = js.Function1[/* args */ typingsJapgolly.baseui.AnonItem, js.Any]
  type StateReducer = js.Function3[
    /* changeType */ typingsJapgolly.baseui.baseuiStrings.moveDown | typingsJapgolly.baseui.baseuiStrings.moveUp | typingsJapgolly.baseui.baseuiStrings.reset | typingsJapgolly.baseui.baseuiStrings.click | typingsJapgolly.baseui.baseuiStrings.focus | typingsJapgolly.baseui.baseuiStrings.mouseEnter, 
    /* changes */ typingsJapgolly.baseui.menuMod.StatefulContainerState, 
    /* currentState */ typingsJapgolly.baseui.menuMod.StatefulContainerState, 
    typingsJapgolly.baseui.menuMod.StatefulContainerState
  ]
  type StatefulMenuProps = typingsJapgolly.baseui.menuMod.StatefulContainerProps with typingsJapgolly.baseui.menuMod.MenuProps
  type StatelessMenuProps = typingsJapgolly.baseui.menuMod.SharedStatelessProps with typingsJapgolly.baseui.menuMod.MenuProps
}
