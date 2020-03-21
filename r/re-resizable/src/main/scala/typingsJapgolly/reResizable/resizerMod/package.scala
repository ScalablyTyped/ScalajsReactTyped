package typingsJapgolly.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resizerMod {
  type OnStartCallback = js.Function2[
    /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement] | japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLDivElement], 
    /* dir */ typingsJapgolly.reResizable.resizerMod.Direction, 
    scala.Unit
  ]
}
