package typingsJapgolly.senchaTouch.Ext.util

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILineSegment
  extends StObject
     with IBase {
  
  /** [Method] Returns the point where two lines intersect
    * @param lineSegment Ext.util.LineSegment The line to intersect with.
    * @returns Ext.util.Point
    */
  var intersects: js.UndefOr[js.Function1[/* lineSegment */ js.UndefOr[this.type], IPoint]] = js.undefined
  
  /** [Method] Returns string representation of the line
    * @returns String For example Point[12,8] Point[0,0]
    */
  @JSName("toString")
  var toString_FILineSegment: js.UndefOr[js.Function0[String]] = js.undefined
}
object ILineSegment {
  
  inline def apply(): ILineSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILineSegment]
  }
  
  extension [Self <: ILineSegment](x: Self) {
    
    inline def setIntersects(value: /* lineSegment */ js.UndefOr[ILineSegment] => IPoint): Self = StObject.set(x, "intersects", js.Any.fromFunction1(value))
    
    inline def setIntersectsUndefined: Self = StObject.set(x, "intersects", js.undefined)
    
    inline def setToString_(value: CallbackTo[String]): Self = StObject.set(x, "toString", value.toJsFn)
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
  }
}
