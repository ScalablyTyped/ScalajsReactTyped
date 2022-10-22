package typingsJapgolly.baseui.menuTypesMod

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.baseui.anon.Body
import typingsJapgolly.baseui.anon.PartialStatefulContainerS
import typingsJapgolly.baseui.anon.`14`
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

trait StatefulMenuProfileProps
  extends StObject
     with StatefulContainerProps
     with MenuProfileProps
object StatefulMenuProfileProps {
  
  inline def apply(
    children: RenderProps => Node,
    forceHighlight: Boolean,
    getProfileItemImg: /* item */ Item => String | ComponentType[Any],
    getProfileItemImgText: /* item */ Item => String,
    getProfileItemLabels: /* item */ Item => Body,
    getRequiredItemProps: (/* item */ Item, /* index */ Double) => RenderItemProps,
    initialState: InitialState,
    items: Items,
    keyboardControlNode: `14`,
    onItemSelect: /* a */ typingsJapgolly.baseui.anon.Item => Any,
    stateReducer: (/* changeType */ js.UndefOr[
      click | moveUp | moveDown | mouseEnter | mouseLeave | focus | reset | character | enter_ | Null
    ], /* changes */ PartialStatefulContainerS, /* currentState */ StatefulContainerState) => StatefulContainerState,
    typeAhead: Boolean
  ): StatefulMenuProfileProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), forceHighlight = forceHighlight.asInstanceOf[js.Any], getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), getRequiredItemProps = js.Any.fromFunction2(getRequiredItemProps), initialState = initialState.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], keyboardControlNode = keyboardControlNode.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction1(onItemSelect), stateReducer = js.Any.fromFunction3(stateReducer), typeAhead = typeAhead.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulMenuProfileProps]
  }
}
