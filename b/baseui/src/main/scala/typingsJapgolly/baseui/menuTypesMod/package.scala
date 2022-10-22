package typingsJapgolly.baseui.menuTypesMod

import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.baseui.anon.Body
import typingsJapgolly.baseui.anon.PartialStatefulContainerS
import typingsJapgolly.baseui.baseuiStrings.character
import typingsJapgolly.baseui.baseuiStrings.click
import typingsJapgolly.baseui.baseuiStrings.enter_
import typingsJapgolly.baseui.baseuiStrings.focus
import typingsJapgolly.baseui.baseuiStrings.mouseEnter
import typingsJapgolly.baseui.baseuiStrings.mouseLeave
import typingsJapgolly.baseui.baseuiStrings.moveDown
import typingsJapgolly.baseui.baseuiStrings.moveUp
import typingsJapgolly.baseui.baseuiStrings.reset
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArrayItems = js.Array[Item]

type GetItemLabelFn = js.Function1[/* item */ Item, Node]

type GetProfileItemImgFn = js.Function1[/* item */ Item, String | ComponentType[Any]]

type GetProfileItemImgTextFn = js.Function1[/* item */ Item, String]

type GetProfileItemLabelsFn = js.Function1[/* item */ Item, Body]

type GetRequiredItemPropsFn = js.Function2[/* item */ Item, /* index */ Double, RenderItemProps]

type Item = Any

type Items = ArrayItems | GroupedItems

type OnItemSelectFn = js.Function1[/* a */ typingsJapgolly.baseui.anon.Item, Any]

type SetRootRefFn = js.Function1[
/* ref */ RefHandle[
  /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HTMLElement */ Any
], 
Unit]

type StateReducerFn = js.Function3[
/* changeType */ js.UndefOr[
  click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
], 
/* changes */ PartialStatefulContainerS, 
/* currentState */ StatefulContainerState, 
StatefulContainerState]
