package typingsJapgolly.reactPose

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactPose.reactPoseBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTransitionTypesMod {
  
  trait Props
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var animateOnMount: js.UndefOr[Boolean] = js.undefined
    
    var children: TransitionChildren[Any]
    
    var enterAfterExit: js.UndefOr[Boolean] = js.undefined
    
    var enterPose: js.UndefOr[String] = js.undefined
    
    var exitPose: js.UndefOr[String] = js.undefined
    
    var flipMove: js.UndefOr[Boolean] = js.undefined
    
    var onRest: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preEnterPose: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(children: TransitionChildren[Any]): Props = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAnimateOnMount(value: Boolean): Self = StObject.set(x, "animateOnMount", value.asInstanceOf[js.Any])
      
      inline def setAnimateOnMountUndefined: Self = StObject.set(x, "animateOnMount", js.undefined)
      
      inline def setChildren(value: TransitionChildren[Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: TransitionChild[Any]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEnterAfterExit(value: Boolean): Self = StObject.set(x, "enterAfterExit", value.asInstanceOf[js.Any])
      
      inline def setEnterAfterExitUndefined: Self = StObject.set(x, "enterAfterExit", js.undefined)
      
      inline def setEnterPose(value: String): Self = StObject.set(x, "enterPose", value.asInstanceOf[js.Any])
      
      inline def setEnterPoseUndefined: Self = StObject.set(x, "enterPose", js.undefined)
      
      inline def setExitPose(value: String): Self = StObject.set(x, "exitPose", value.asInstanceOf[js.Any])
      
      inline def setExitPoseUndefined: Self = StObject.set(x, "exitPose", js.undefined)
      
      inline def setFlipMove(value: Boolean): Self = StObject.set(x, "flipMove", value.asInstanceOf[js.Any])
      
      inline def setFlipMoveUndefined: Self = StObject.set(x, "flipMove", js.undefined)
      
      inline def setOnRest(value: Callback): Self = StObject.set(x, "onRest", value.toJsFn)
      
      inline def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      inline def setPreEnterPose(value: String): Self = StObject.set(x, "preEnterPose", value.asInstanceOf[js.Any])
      
      inline def setPreEnterPoseUndefined: Self = StObject.set(x, "preEnterPose", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var displayedChildren: js.Array[Element]
    
    var finishedLeaving: StringDictionary[Boolean]
    
    var hasInitialized: Boolean
    
    var indexedChildren: StringDictionary[Element]
    
    def scheduleChildRemoval(key: String): Unit
  }
  object State {
    
    inline def apply(
      displayedChildren: js.Array[Element],
      finishedLeaving: StringDictionary[Boolean],
      hasInitialized: Boolean,
      indexedChildren: StringDictionary[Element],
      scheduleChildRemoval: String => Callback
    ): State = {
      val __obj = js.Dynamic.literal(displayedChildren = displayedChildren.asInstanceOf[js.Any], finishedLeaving = finishedLeaving.asInstanceOf[js.Any], hasInitialized = hasInitialized.asInstanceOf[js.Any], indexedChildren = indexedChildren.asInstanceOf[js.Any], scheduleChildRemoval = js.Any.fromFunction1((t0: String) => scheduleChildRemoval(t0).runNow()))
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setDisplayedChildren(value: js.Array[Element]): Self = StObject.set(x, "displayedChildren", value.asInstanceOf[js.Any])
      
      inline def setDisplayedChildrenVarargs(value: Element*): Self = StObject.set(x, "displayedChildren", js.Array(value*))
      
      inline def setFinishedLeaving(value: StringDictionary[Boolean]): Self = StObject.set(x, "finishedLeaving", value.asInstanceOf[js.Any])
      
      inline def setHasInitialized(value: Boolean): Self = StObject.set(x, "hasInitialized", value.asInstanceOf[js.Any])
      
      inline def setIndexedChildren(value: StringDictionary[Element]): Self = StObject.set(x, "indexedChildren", value.asInstanceOf[js.Any])
      
      inline def setScheduleChildRemoval(value: String => Callback): Self = StObject.set(x, "scheduleChildRemoval", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type TransitionChild[T] = Element | `false` | Unit
  
  type TransitionChildren[T] = TransitionChild[T] | js.Array[TransitionChild[T]]
}
