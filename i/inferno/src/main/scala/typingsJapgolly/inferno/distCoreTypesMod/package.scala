package typingsJapgolly.inferno.distCoreTypesMod

import org.scalajs.dom.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimationEventHandler[T] = EventHandler[InfernoAnimationEvent[T]]

type Booleanish = Boolean

type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]

type ClipboardEventHandler[T] = EventHandler[ClipboardEvent[T]]

type CompositionEventHandler[T] = EventHandler[CompositionEvent[T]]

type DragEvent[T] = InfernoMouseEvent[T] & org.scalajs.dom.DragEvent

type DragEventHandler[T] = EventHandler[DragEvent[T]]

type EventHandler[E /* <: SemiSyntheticEvent[Any] */] = (js.Function1[/* event */ E, Unit]) | (LinkedEvent[Any, E]) | Null

type FocusEventHandler[T] = EventHandler[FocusEvent[T]]

type FormEvent[T] = SemiSyntheticEvent[T]

type FormEventHandler[T] = EventHandler[FormEvent[T]]

type InfernoEventHandler[T] = EventHandler[SemiSyntheticEvent[T]]

type InfernoWheelEvent[T] = InfernoMouseEvent[T] & WheelEvent

type Key = js.UndefOr[String | Double | Null]

type KeyboardEventHandler[T] = EventHandler[InfernoKeyboardEvent[T]]

type MouseEventHandler[T] = EventHandler[InfernoMouseEvent[T]]

type PointerEventHandler[T] = EventHandler[InfernoPointerEvent[T]]

type Ref[T] = (js.Function1[/* instance */ T | Null, Any]) | RefObject[T]

type TouchEventHandler[T] = EventHandler[InfernoTouchEvent[T]]

type TransitionEventHandler[T] = EventHandler[InfernoTransitionEvent[T]]

type UIEventHandler[T] = EventHandler[InfernoUIEvent[T]]

type WheelEventHandler[T] = EventHandler[InfernoWheelEvent[T]]
