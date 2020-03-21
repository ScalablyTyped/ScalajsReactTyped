package typingsJapgolly.reactDraggable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Draggable = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactDraggable.PartialDraggableProps with js.Object, js.Object]
  type DraggableEvent = (japgolly.scalajs.react.ReactMouseEventFrom[
    (org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.SVGElement) with org.scalajs.dom.raw.Element
  ]) | (japgolly.scalajs.react.ReactTouchEventFrom[
    (org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.SVGElement) with org.scalajs.dom.raw.Element
  ]) | org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent
  type DraggableEventHandler = js.Function2[
    /* e */ typingsJapgolly.reactDraggable.mod.DraggableEvent, 
    /* data */ typingsJapgolly.reactDraggable.mod.DraggableData, 
    scala.Unit | typingsJapgolly.reactDraggable.reactDraggableBooleans.`false`
  ]
}
