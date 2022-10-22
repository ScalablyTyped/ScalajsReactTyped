package typingsJapgolly.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The GradientStop object.
  */
@JSGlobal("paper.GradientStop")
@js.native
/** 
  * Creates a GradientStop object.
  * 
  * @param color - the color of the stop
  * @param offset - the position of the stop on the gradient
  * ramp as a value between `0` and `1`; `null` or `undefined` for automatic
  * assignment.
  */
open class GradientStop ()
  extends StObject
     with typingsJapgolly.paper.paper.GradientStop {
  def this(color: typingsJapgolly.paper.paper.Color) = this()
  def this(color: Unit, offset: Double) = this()
  def this(color: typingsJapgolly.paper.paper.Color, offset: Double) = this()
  
  /** 
    * The color of the gradient stop.
    */
  /* CompleteClass */
  var color: typingsJapgolly.paper.paper.Color = js.native
  
  /** 
    * The ramp-point of the gradient stop as a value between `0` and `1`.
    */
  /* CompleteClass */
  var offset: Double = js.native
}
