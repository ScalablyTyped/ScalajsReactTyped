package typingsJapgolly.interactjsTypes.coreTypesMod

import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.SVGElement
import org.scalajs.dom.Touch
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.Window
import typingsJapgolly.interactjsTypes.anon.InteractableActions
import typingsJapgolly.interactjsTypes.anon.PartialNativePointerEvent
import typingsJapgolly.interactjsTypes.coreInteractEventMod.EventPhase
import typingsJapgolly.interactjsTypes.coreInteractEventMod.InteractEvent
import typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionChecker = js.Function5[
/* pointerEvent */ Any, 
/* defaultAction */ String, 
/* interactable */ InteractableActions, 
/* element */ Element, 
/* interaction */ Interaction[ActionName], 
ActionProps[scala.Nothing]]

type Context = Document | Element

type CursorChecker = js.Function4[
/* action */ ActionProps[ActionName], 
/* interactable */ InteractableActions, 
/* element */ Element, 
/* interacting */ Boolean, 
String]

type Element = HTMLElement | SVGElement

type EventTarget = Window | Document | Element

type EventTypes = String | ListenerMap | (js.Array[String | ListenerMap])

type InertiaOptions = InertiaOption | Boolean

type Listeners = ListenerMap | js.Array[ListenerMap]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.interactjsTypes.coreTypesMod.Listener
  - typingsJapgolly.interactjsTypes.coreTypesMod.ListenerMap
  - js.Array[
typingsJapgolly.interactjsTypes.coreTypesMod.Listener | typingsJapgolly.interactjsTypes.coreTypesMod.ListenerMap]
*/
type ListenersArg = _ListenersArg | (js.Array[Listener | ListenerMap])

type NativePointerEventType = PointerEvent

type OriginFunction = js.Function1[/* target */ Element, Rect]

type PointerEventType = MouseEvent | TouchEvent | PartialNativePointerEvent | (InteractEvent[scala.Nothing, EventPhase])

type PointerType = MouseEvent | Touch | PartialNativePointerEvent | (InteractEvent[scala.Nothing, EventPhase])

type RectChecker = js.Function1[/* element */ Element, Rect]

type RectFunction[T /* <: js.Array[Any] */] = js.Function1[/* args */ T, Rect | Element]

type RectResolvable[T /* <: js.Array[Any] */] = Rect | String | Element | RectFunction[T]

type Target = EventTarget | String
