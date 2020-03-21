package typingsJapgolly.reactFlexr

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactFlexr.ReactFlexr.CellProps
import typingsJapgolly.reactFlexr.ReactFlexr.ErgonomicType
import typingsJapgolly.reactFlexr.ReactFlexr.GridProps
import typingsJapgolly.reactFlexr.ReactFlexr.OptimizedResize_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-flexr", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Cell ()
    extends Component[CellProps, js.Object, js.Any]
  
  @js.native
  class Grid ()
    extends Component[GridProps, js.Object, js.Any]
  
  val desk: String = js.native
  val lap: String = js.native
  val optimizedResize: OptimizedResize_ = js.native
  val palm: String = js.native
  val portable: String = js.native
  def findBreakpoints(): js.Array[ErgonomicType] | Boolean = js.native
  def findMatch(arguments: ErgonomicType*): Boolean = js.native
  def getCurrentBreakpoints(): js.Array[ErgonomicType] = js.native
  def setBreakpoints(breakpoints: js.Array[ErgonomicType]): Unit = js.native
}

