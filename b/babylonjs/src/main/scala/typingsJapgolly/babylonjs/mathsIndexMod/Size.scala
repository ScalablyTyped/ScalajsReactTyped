package typingsJapgolly.babylonjs.mathsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/index", "Size")
@js.native
open class Size protected ()
  extends typingsJapgolly.babylonjs.mathsMathMod.Size {
  /**
    * Creates a Size object from the given width and height (floats).
    * @param width width of the new size
    * @param height height of the new size
    */
  def this(width: Double, height: Double) = this()
}
/* static members */
object Size {
  
  @JSImport("babylonjs/Maths/index", "Size")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Size set at the linear interpolation "amount" between "start" and "end"
    * @param start starting size to lerp between
    * @param end end size to lerp between
    * @param amount amount to lerp between the start and end values
    * @returns a new Size set at the linear interpolation "amount" between "start" and "end"
    */
  inline def Lerp(
    start: typingsJapgolly.babylonjs.mathsMathDotsizeMod.Size,
    end: typingsJapgolly.babylonjs.mathsMathDotsizeMod.Size,
    amount: Double
  ): typingsJapgolly.babylonjs.mathsMathDotsizeMod.Size = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotsizeMod.Size]
  
  /**
    * Create a new size of zero
    * @returns a new Size set to (0.0, 0.0)
    */
  inline def Zero(): typingsJapgolly.babylonjs.mathsMathDotsizeMod.Size = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typingsJapgolly.babylonjs.mathsMathDotsizeMod.Size]
}
