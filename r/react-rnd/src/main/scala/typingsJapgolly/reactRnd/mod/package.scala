package typingsJapgolly.reactRnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Grid = js.Tuple2[scala.Double, scala.Double]
  type RndDragCallback = typingsJapgolly.reactDraggable.mod.DraggableEventHandler
  type RndDragEvent = (japgolly.scalajs.react.ReactMouseEventFrom[
    (org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.SVGElement) with org.scalajs.dom.raw.Element
  ]) | (japgolly.scalajs.react.ReactTouchEventFrom[
    (org.scalajs.dom.raw.HTMLElement | org.scalajs.dom.raw.SVGElement) with org.scalajs.dom.raw.Element
  ]) | org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent
  type RndResizeCallback = js.Function5[
    /* e */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, 
    /* dir */ typingsJapgolly.reResizable.mod.ResizeDirection, 
    /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, 
    /* delta */ typingsJapgolly.reactRnd.mod.ResizableDelta, 
    /* position */ typingsJapgolly.reactRnd.mod.Position, 
    scala.Unit
  ]
  type RndResizeStartCallback = js.Function3[
    /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement] | japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement], 
    /* dir */ typingsJapgolly.reResizable.mod.ResizeDirection, 
    /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, 
    scala.Unit
  ]
  type TODO = js.Any
}
