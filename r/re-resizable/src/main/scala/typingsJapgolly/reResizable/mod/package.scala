package typingsJapgolly.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ResizeCallback = js.Function4[
    /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent, 
    /* direction */ typingsJapgolly.reResizable.resizerMod.Direction, 
    /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, 
    /* delta */ typingsJapgolly.reResizable.mod.NumberSize, 
    scala.Unit
  ]
  type ResizeDirection = typingsJapgolly.reResizable.resizerMod.Direction
  type ResizeStartCallback = js.Function3[
    /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement] | japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement], 
    /* dir */ typingsJapgolly.reResizable.resizerMod.Direction, 
    /* elementRef */ org.scalajs.dom.raw.HTMLDivElement, 
    scala.Unit | scala.Boolean
  ]
}
