package typingsJapgolly.winrtUwp.Windows.UI.Input

import typingsJapgolly.winrtUwp.Windows.Foundation.Point
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import typingsJapgolly.winrtUwp.anon.OutPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides generalized transformation functions. */
trait IPointerPointTransform extends StObject {
  
  /** Gets the inverse of the specified transformation. */
  var inverse: IPointerPointTransform
  
  /**
    * Transforms the specified bounding rectangle.
    * @param rect The bounding rectangle to transform.
    * @return The smallest, axis-aligned bounding box that encloses rect after the transformation. (An axis-aligned bounding box is one which has all sides parallel to the coordinate axes.)
    */
  def transformBounds(rect: Rect): Rect
  
  /**
    * Attempts to perform the transformation on the specified input point.
    * @param inPoint The original input point.
    */
  def tryTransform(inPoint: Point): OutPoint
}
object IPointerPointTransform {
  
  inline def apply(inverse: IPointerPointTransform, transformBounds: Rect => Rect, tryTransform: Point => OutPoint): IPointerPointTransform = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any], transformBounds = js.Any.fromFunction1(transformBounds), tryTransform = js.Any.fromFunction1(tryTransform))
    __obj.asInstanceOf[IPointerPointTransform]
  }
  
  extension [Self <: IPointerPointTransform](x: Self) {
    
    inline def setInverse(value: IPointerPointTransform): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setTransformBounds(value: Rect => Rect): Self = StObject.set(x, "transformBounds", js.Any.fromFunction1(value))
    
    inline def setTryTransform(value: Point => OutPoint): Self = StObject.set(x, "tryTransform", js.Any.fromFunction1(value))
  }
}
