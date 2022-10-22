package typingsJapgolly.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Gradient object.
  */
@JSGlobal("paper.Gradient")
@js.native
open class Gradient ()
  extends StObject
     with typingsJapgolly.paper.paper.Gradient {
  
  /** 
    * Checks whether the gradient is equal to the supplied gradient.
    * 
    * @return true if they are equal
    */
  /* CompleteClass */
  override def equals(gradient: typingsJapgolly.paper.paper.Gradient): Boolean = js.native
  
  /** 
    * Specifies whether the gradient is radial or linear.
    */
  /* CompleteClass */
  var radial: Boolean = js.native
  
  /** 
    * The gradient stops on the gradient ramp.
    */
  /* CompleteClass */
  var stops: js.Array[typingsJapgolly.paper.paper.GradientStop] = js.native
}
