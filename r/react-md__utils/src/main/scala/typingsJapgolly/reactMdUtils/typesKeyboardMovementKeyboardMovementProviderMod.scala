package typingsJapgolly.reactMdUtils

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactMdUtils.typesKeyboardMovementTypesMod.KeyboardMovementBehavior
import typingsJapgolly.reactMdUtils.typesKeyboardMovementTypesMod.KeyboardMovementConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementKeyboardMovementProviderMod {
  
  @JSImport("@react-md/utils/types/keyboardMovement/KeyboardMovementProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def KeyboardMovementProvider(
    hasChildrenLoopableSearchableHorizontalIncludeDisabledPropIncrementKeysPropDecrementKeysPropJumpToFirstKeysPropJumpToLastKeys: KeyboardMovementProviderProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("KeyboardMovementProvider")(hasChildrenLoopableSearchableHorizontalIncludeDisabledPropIncrementKeysPropDecrementKeysPropJumpToFirstKeysPropJumpToLastKeys.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait KeyboardMovementProviderProps
    extends StObject
       with KeyboardMovementBehavior
       with KeyboardMovementConfiguration {
    
    var children: Node
  }
  object KeyboardMovementProviderProps {
    
    inline def apply(): KeyboardMovementProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[KeyboardMovementProviderProps]
    }
    
    extension [Self <: KeyboardMovementProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
