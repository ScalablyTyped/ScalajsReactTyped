package typingsJapgolly.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Size object is used to describe the size or dimensions of
  * something, through its {@link #width} and {@link #height} properties.
  */
@JSGlobal("paper.Size")
@js.native
open class Size protected ()
  extends StObject
     with typingsJapgolly.paper.paper.Size {
  /** 
    * Creates a Size object using the numbers in the given array as
    * dimensions.
    */
  def this(array: js.Array[Any]) = this()
  /** 
    * Creates a Size object using the properties in the given object.
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a Size object using the {@link Point#x} and {@link Point#y}
    * values of the given Point object.
    */
  def this(point: typingsJapgolly.paper.paper.Point) = this()
  /** 
    * Creates a Size object using the coordinates of the given Size object.
    */
  def this(size: typingsJapgolly.paper.paper.Size) = this()
  /** 
    * Creates a Size object with the given width and height values.
    * 
    * @param width - the width
    * @param height - the height
    */
  def this(width: Double, height: Double) = this()
}
object Size {
  
  @JSGlobal("paper.Size")
  @js.native
  val ^ : js.Any = js.native
  
  /** 
    * Returns a new size object with the largest {@link #width} and
    * {@link #height} of the supplied sizes.
    * 
    * @return the newly created size object
    */
  /* static member */
  inline def max(size1: typingsJapgolly.paper.paper.Size, size2: typingsJapgolly.paper.paper.Size): typingsJapgolly.paper.paper.Size = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(size1.asInstanceOf[js.Any], size2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.paper.paper.Size]
  
  /** 
    * Returns a new size object with the smallest {@link #width} and
    * {@link #height} of the supplied sizes.
    * 
    * @return the newly created size object
    */
  /* static member */
  inline def min(size1: typingsJapgolly.paper.paper.Size, size2: typingsJapgolly.paper.paper.Size): typingsJapgolly.paper.paper.Size = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(size1.asInstanceOf[js.Any], size2.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.paper.paper.Size]
  
  /** 
    * Returns a size object with random {@link #width} and {@link #height}
    * values between `0` and `1`.
    * 
    * @return the newly created size object
    */
  /* static member */
  inline def random(): typingsJapgolly.paper.paper.Size = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[typingsJapgolly.paper.paper.Size]
}
