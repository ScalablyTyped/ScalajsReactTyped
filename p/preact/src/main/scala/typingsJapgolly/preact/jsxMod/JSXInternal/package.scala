package typingsJapgolly.preact.jsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSXInternal {
  type AnimationEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedAnimationEvent[Target]]
  type ClipboardEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedClipboardEvent[Target]]
  type CompositionEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedCompositionEvent[Target]]
  type DragEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedDragEvent[Target]]
  type Element = typingsJapgolly.preact.mod.VNode[js.Any]
  type ElementClass = typingsJapgolly.preact.mod.Component[js.Any, js.Any]
  type EventHandler[E /* <: typingsJapgolly.preact.TargetedEventEventTargetE */] = js.ThisFunction1[
    /* import warning: importer.ImportType#apply Failed type conversion: E['currentTarget'] */ /* this */ js.Any, 
    /* event */ E, 
    scala.Unit
  ]
  type FocusEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedFocusEvent[Target]]
  type GenericEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[
    typingsJapgolly.preact.jsxMod.JSXInternal.TargetedEvent[Target, typingsJapgolly.std.Event_]
  ]
  type KeyboardEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedKeyboardEvent[Target]]
  type LibraryManagedAttributes[Component, Props] = Props | (typingsJapgolly.preact.jsxMod.Defaultize[Props, js.Any])
  type MouseEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedMouseEvent[Target]]
  type PointerEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedPointerEvent[Target]]
  type TargetedEvent[Target /* <: org.scalajs.dom.raw.EventTarget */, TypedEvent /* <: typingsJapgolly.std.Event_ */] = (typingsJapgolly.std.Omit[TypedEvent, typingsJapgolly.preact.preactStrings.currentTarget]) with typingsJapgolly.preact.AnonCurrentTarget[Target]
  type TouchEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedTouchEvent[Target]]
  type TransitionEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedTransitionEvent[Target]]
  type UIEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedUIEvent[Target]]
  type WheelEventHandler[Target /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.preact.jsxMod.JSXInternal.EventHandler[typingsJapgolly.preact.jsxMod.JSXInternal.TargetedWheelEvent[Target]]
}
