package typingsJapgolly.winjs.global.WinJS.UI

import org.scalajs.dom.HTMLElement
import typingsJapgolly.winjs.WinJS.Promise
import typingsJapgolly.winjs.WinJS.UI.Animation.IAnimationMethodResponse
import typingsJapgolly.winjs.anon.Entrance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the Windows animations. These functions provide developers with the ability to use animations in their custom controls that are consistent with animations used by Windows controls.
**/
object Animation {
  
  @JSGlobal("WinJS.UI.Animation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Execute a continuum animation, scaling down the incoming page while scaling, rotating, and translating the incoming item.
    * @param page Single element to be scaled down that is the page root and contains the incoming item.
    * @param item Single element to be scaled, rotated, and translated into its final position on the page.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def continuumBackwardIn(page: Any, item: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("continuumBackwardIn")(page.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a continuum animation, scaling down the outgoing page while.
    * @param page Single element to be scaled down that is the page root.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def continuumBackwardOut(page: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("continuumBackwardOut")(page.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a continuum animation, scaling up the incoming page while scaling, rotating, and translating the incoming item.
    * @param page Single element to be scaled up that is the page root and does not contain the incoming item.
    * @param itemRoot Root of the item that will be translated as part of the continuum animation.
    * @param itemContent Content of the item that will be scaled and rotated as part of the continuum animation.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def continuumForwardIn(page: Any, itemRoot: Any, itemContent: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("continuumForwardIn")(page.asInstanceOf[js.Any], itemRoot.asInstanceOf[js.Any], itemContent.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a continuum animation, scaling down the outgoing page while scaling, rotating, and translating the outgoing item.
    * @param page Single element to be scaled down that is the page root and contains the outgoing item.
    * @param item Single element to be scaled, rotated, and translated away from the outgoing page.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def continuumForwardOut(page: Any, item: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("continuumForwardOut")(page.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  //#region Functions
  /**
    * Creates an object that performs an animation that adds an item or items to a list.
    * @param added Element or elements to add to the list.
    * @param affected Element or elements affected by the added items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  inline def createAddToListAnimation(added: Any, affected: Any): IAnimationMethodResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("createAddToListAnimation")(added.asInstanceOf[js.Any], affected.asInstanceOf[js.Any])).asInstanceOf[IAnimationMethodResponse]
  
  /**
    * Creates an object that performs an animation that adds an item or items to a list of search results.
    * @param added Element or elements to add to the list.
    * @param affected Element or elements affected by the added items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  inline def createAddToSearchListAnimation(added: Any, affected: Any): IAnimationMethodResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("createAddToSearchListAnimation")(added.asInstanceOf[js.Any], affected.asInstanceOf[js.Any])).asInstanceOf[IAnimationMethodResponse]
  
  /**
    * Creates an object that performs an animation that collapses a list.
    * @param hidden Element or elements hidden as a result of the collapse.
    * @param affected Element or elements affected by the hidden items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  inline def createCollapseAnimation(hidden: Any, affected: Any): IAnimationMethodResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("createCollapseAnimation")(hidden.asInstanceOf[js.Any], affected.asInstanceOf[js.Any])).asInstanceOf[IAnimationMethodResponse]
  
  /**
    * Creates an object that performs an animation that removes an item or items from a list.
    * @param deleted Element or elements to delete from the list.
    * @param remaining Element or elements affected by the removal of the deleted items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  inline def createDeleteFromListAnimation(deleted: Any, remaining: Any): IAnimationMethodResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteFromListAnimation")(deleted.asInstanceOf[js.Any], remaining.asInstanceOf[js.Any])).asInstanceOf[IAnimationMethodResponse]
  
  /**
    * Creates an object that performs an animation that removes an item or items from a list of search results.
    * @param deleted Element or elements to delete from the list.
    * @param remaining Element or elements affected by the removal of the deleted items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  inline def createDeleteFromSearchListAnimation(deleted: Any, remaining: Any): IAnimationMethodResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteFromSearchListAnimation")(deleted.asInstanceOf[js.Any], remaining.asInstanceOf[js.Any])).asInstanceOf[IAnimationMethodResponse]
  
  /**
    * Creates an object that performs an animation that expands a list.
    * @param revealed Element or elements revealed by the expansion.
    * @param affected Element or elements affected by the newly revealed items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  inline def createExpandAnimation(revealed: Any, affected: Any): IAnimationMethodResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("createExpandAnimation")(revealed.asInstanceOf[js.Any], affected.asInstanceOf[js.Any])).asInstanceOf[IAnimationMethodResponse]
  
  /**
    * Creates an exit and entrance animation to play for a page navigation given the current and incoming pages'
    * animation preferences and whether the pages are navigating forwards or backwards.
    * @param currentPreferredAnimation A value from WinJS.UI.PageNavigationAnimation describing the animation the current page prefers to use.
    * @param A value from nextPreferredAnimation WinJS.UI.PageNavigationAnimation describing the animation the incoming page prefers to use.
    * @param movingBackwards Boolean value for whether the navigation is moving backwards.
    * @returns an object containing the exit and entrance animations to play based on the parameters given.
    **/
  inline def createPageNavigationAnimations(currentPreferredAnimation: String, nextPreferredAnimation: String, movingBackwards: Boolean): Entrance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPageNavigationAnimations")(currentPreferredAnimation.asInstanceOf[js.Any], nextPreferredAnimation.asInstanceOf[js.Any], movingBackwards.asInstanceOf[js.Any])).asInstanceOf[Entrance]
  
  /**
    * Creates an object that performs a peek animation.
    * @param element Element or elements involved in the peek.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  inline def createPeekAnimation(element: Any): IAnimationMethodResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeekAnimation")(element.asInstanceOf[js.Any]).asInstanceOf[IAnimationMethodResponse]
  
  /**
    * Creates an object that performs an animation that moves an item or items.
    * @param element Element or elements involved in the reposition.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise object that completes when the animation is finished.
    **/
  inline def createRepositionAnimation(element: Any): IAnimationMethodResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("createRepositionAnimation")(element.asInstanceOf[js.Any]).asInstanceOf[IAnimationMethodResponse]
  
  /**
    * Performs an animation that fades an item or items in, fading out existing items that occupy the same space.
    * @param incoming Element or elements being faded in.
    * @param outgoing Element or elements being replaced.
    * @returns An object that completes when the animation has finished.
    **/
  inline def crossFade(incoming: Any, outgoing: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("crossFade")(incoming.asInstanceOf[js.Any], outgoing.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation when a dragged object is moved such that dropping it in that position would move other items. The potentially affected items are animated out of the way to show where the object would be dropped.
    * @param target Element or elements that the dragged object would cause to be moved if it were dropped.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  inline def dragBetweenEnter(target: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dragBetweenEnter")(target.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def dragBetweenEnter(target: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragBetweenEnter")(target.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation when a dragged object is moved away from items that it had previously involved in a dragBetweenEnter animation. The affected objects are animated back to their original positions.
    * @param target Element or elements that the dragged object would no longer cause to be displaced, due to its moving away. This should be the same element or element collection passed as the target parameter in the dragBetweenEnter animation.
    * @returns An object that completes when the animation is finished.
    **/
  inline def dragBetweenLeave(target: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dragBetweenLeave")(target.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation when the user finishes dragging an object.
    * @param dragSource Element or elements that were dragged.
    * @param offset Initial offset from the drop point. The dropped object begins at the offset and animates to its final position at the drop point. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param affected Element or elements whose position the dropped object affects. Typically, this is all other items in a reorderable list. This should be the same element or element collection passed as the affected parameter in the dragSourceStart animation.
    * @returns An object that completes when the animation is finished.
    **/
  inline def dragSourceEnd(dragSource: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dragSourceEnd")(dragSource.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def dragSourceEnd(dragSource: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragSourceEnd")(dragSource.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  inline def dragSourceEnd(dragSource: Any, offset: Any, affected: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragSourceEnd")(dragSource.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], affected.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  inline def dragSourceEnd(dragSource: Any, offset: Unit, affected: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragSourceEnd")(dragSource.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], affected.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation when the user begins to drag an object.
    * @param dragSource Element or elements being dragged.
    * @param affected Element or elements whose position is affected by the movement of the dragged object. Typically, this is all other items in a reorderable list.
    * @returns An object that completes when the animation is finished.
    **/
  inline def dragSourceStart(dragSource: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dragSourceStart")(dragSource.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def dragSourceStart(dragSource: Any, affected: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragSourceStart")(dragSource.asInstanceOf[js.Any], affected.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Execute the incoming phase of the drill in animation, scaling up the incoming page while fading it in.
    * @param incomingPage Element to be scaled up and faded in.
    * @returns Promise object that completes when the animation is complete.
    **/
  inline def drillInIncoming(incomingPage: HTMLElement): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("drillInIncoming")(incomingPage.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Execute the outgoing phase of the drill in animation, scaling up the outgoing page while fading it out.
    * @param incomingPage Element to be scaled up and faded out.
    * @returns Promise object that completes when the animation is complete.
    **/
  inline def drillInOutgoing(outgoingPage: HTMLElement): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("drillInOutgoing")(outgoingPage.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Execute the incoming phase of the drill out animation, scaling down the incoming page while fading it in.
    * @param incomingPage Element to be scaled up and faded in.
    * @returns Promise object that completes when the animation is complete.
    **/
  inline def drillOutIncoming(incomingPage: HTMLElement): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("drillOutIncoming")(incomingPage.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Execute the outgoing phase of the drill out animation, scaling down the outgoing page while fading it out.
    * @param outgoingPage Element to be scaled down and faded out.
    * @returns Promise object that completes when the animation is complete.
    **/
  inline def drillOutOutgoing(outgoingPage: HTMLElement): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("drillOutOutgoing")(outgoingPage.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that displays one or more elements on a page.
    * @param incoming Element or elements that compose the incoming content.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
    * @returns An object that completes when the animation is finished.
    **/
  inline def enterContent(incoming: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enterContent")(incoming.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def enterContent(incoming: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("enterContent")(incoming.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  inline def enterContent(incoming: Any, offset: Any, options: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("enterContent")(incoming.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  inline def enterContent(incoming: Any, offset: Unit, options: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("enterContent")(incoming.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that shows a new page of content, either when transitioning between pages in a running app or when displaying the first content in a newly launched app.
    * @param element Element or an array of elements that represent the content. If element refers to an array of elements, the elements enter in array order.
    * @param offset An initial offset where the element or elements begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  inline def enterPage(element: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enterPage")(element.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def enterPage(element: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("enterPage")(element.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that hides one or more elements on a page.
    * @param outgoing Element or elements that compose the outgoing content.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  inline def exitContent(outgoing: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("exitContent")(outgoing.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def exitContent(outgoing: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("exitContent")(outgoing.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that dismisses the current page when transitioning between pages in an app.
    * @param outgoing Element or elements that compose the outgoing page.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  inline def exitPage(outgoing: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("exitPage")(outgoing.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def exitPage(outgoing: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("exitPage")(outgoing.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that fades an item or set of items into view.
    * @param shown Element or elements being faded in.
    * @returns An object that completes when the animation has finished. Use this object when subsequent actions need this animation to finish before they take place.
    **/
  inline def fadeIn(shown: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeIn")(shown.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that fades an item or set of items out of view.
    * @param hidden Element or elements being faded out.
    * @returns An object that completes when the animation is finished.
    **/
  inline def fadeOut(hidden: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fadeOut")(hidden.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that hides edge-based user interface (UI).
    * @param element Element or elements that are being hidden.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements end the animation just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
    * @returns An object that completes when the animation is finished.
    **/
  inline def hideEdgeUI(element: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hideEdgeUI")(element.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def hideEdgeUI(element: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("hideEdgeUI")(element.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  inline def hideEdgeUI(element: Any, offset: Any, options: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("hideEdgeUI")(element.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  inline def hideEdgeUI(element: Any, offset: Unit, options: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("hideEdgeUI")(element.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that hides a panel.
    * @param element Element or elements that are being hidden.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements end the animation just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  inline def hidePanel(element: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hidePanel")(element.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def hidePanel(element: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("hidePanel")(element.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that removes pop-up user interface (UI).
    * @param element Element or elements that are being hidden.
    * @returns An object that completes when the animation is finished.
    **/
  inline def hidePopup(element: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hidePopup")(element.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation when a pointer is pressed on an object.
    * @param element Element or elements on which the pointer is pressed.
    * @returns An object that completes when the animation is finished.
    **/
  inline def pointerDown(element: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerDown")(element.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation when a pointer is released.
    * @param element Element or elements that the pointer was pressed on.
    * @returns An object that completes when the animation is finished.
    **/
  inline def pointerUp(element: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointerUp")(element.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that slides a narrow, edge-based user interface (UI) into view.
    * @param element Element or elements that are being shown.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
    * @returns An object that completes when the animation is finished.
    **/
  inline def showEdgeUI(element: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("showEdgeUI")(element.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def showEdgeUI(element: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("showEdgeUI")(element.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  inline def showEdgeUI(element: Any, offset: Any, options: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("showEdgeUI")(element.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  inline def showEdgeUI(element: Any, offset: Unit, options: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("showEdgeUI")(element.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that slides a large panel user interface (UI) into view.
    * @param element Element or elements that are being shown.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  inline def showPanel(element: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("showPanel")(element.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def showPanel(element: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("showPanel")(element.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that displays a pop-up user interface (UI).
    * @param element Element or elements that are being shown.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Set this parameter to null to use the recommended default offset. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  inline def showPopup(element: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("showPopup")(element.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def showPopup(element: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("showPopup")(element.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a slide down animation.
    * @param incoming Single element or collection of elements to animate sliding down.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def slideDown(incoming: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("slideDown")(incoming.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a slide in from right to left animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding in.
    * @param second Second element or collection of elements to animate sliding in, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding in, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def slideLeftIn(page: Any, first: Any, second: Any, third: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("slideLeftIn")(page.asInstanceOf[js.Any], first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a slide out from right to left animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding out.
    * @param second Second element or collection of elements to animate sliding out, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding out, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def slideLeftOut(page: Any, first: Any, second: Any, third: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("slideLeftOut")(page.asInstanceOf[js.Any], first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a slide in from left to right animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding in.
    * @param second Second element or collection of elements to animate sliding in, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding in, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def slideRightIn(page: Any, first: Any, second: Any, third: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("slideRightIn")(page.asInstanceOf[js.Any], first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a slide out from left to right animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding out.
    * @param second Second element or collection of elements to animate sliding out, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding out, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def slideRightOut(page: Any, first: Any, second: Any, third: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("slideRightOut")(page.asInstanceOf[js.Any], first.asInstanceOf[js.Any], second.asInstanceOf[js.Any], third.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a slide up animation.
    * @param incoming Single element or collection of elements to animate sliding up.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def slideUp(incoming: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("slideUp")(incoming.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Performs a deselection animation in response to a swipe interaction.
    * @param deselected Element or elements that become unselected.
    * @param selection Element or elements that represent the selection, typically a check mark.
    * @returns An object that completes when the animation is finished.
    **/
  inline def swipeDeselect(deselected: Any, selection: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("swipeDeselect")(deselected.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that reveals an item or items in response to a swipe interaction.
    * @param target Element or elements being revealed.
    * @param offset An initial offset where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  inline def swipeReveal(target: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("swipeReveal")(target.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def swipeReveal(target: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("swipeReveal")(target.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Performs a selection animation in response to a swipe interaction.
    * @param selected Element or elements being selected.
    * @param selection Element or elements that show that something is selected, typically a check mark.
    * @returns An object that completes when the animation is finished.
    **/
  inline def swipeSelect(selected: Any, selection: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("swipeSelect")(selected.asInstanceOf[js.Any], selection.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a turnstile backward in animation.
    * @param incoming Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def turnstileBackwardIn(incoming: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("turnstileBackwardIn")(incoming.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a turnstile backward out animation.
    * @param outgoing Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def turnstileBackwardOut(outgoing: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("turnstileBackwardOut")(outgoing.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a turnstile forward in animation.
    * @param incoming Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def turnstileForwardIn(incoming: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("turnstileForwardIn")(incoming.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Execute a turnstile forward out animation.
    * @param outgoing Single element or collection of elements to animate.
    * @returns A Promise that completes when the animation is finished.
    **/
  inline def turnstileForwardOut(outgoing: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("turnstileForwardOut")(outgoing.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  
  /**
    * Performs an animation that updates a badge.
    * @param incoming Element or elements that comprise the new badge.
    * @param offset Initial offsets where incoming animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  inline def updateBadge(incoming: Any): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateBadge")(incoming.asInstanceOf[js.Any]).asInstanceOf[Promise[Any]]
  inline def updateBadge(incoming: Any, offset: Any): Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateBadge")(incoming.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Promise[Any]]
}
