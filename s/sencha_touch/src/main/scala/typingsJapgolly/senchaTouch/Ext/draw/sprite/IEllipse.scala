package typingsJapgolly.senchaTouch.Ext.draw.sprite

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEllipse
  extends StObject
     with IPath {
  
  /** [Config Option] (Number) */
  var axisRotation: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var cx: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var cy: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var rx: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var ry: js.UndefOr[Double] = js.undefined
  
  /** [Method] Update the path
    * @param path Object
    * @param attr Object
    */
  @JSName("updatePath")
  var updatePath_IEllipse: js.UndefOr[js.Function2[/* path */ js.UndefOr[Any], /* attr */ js.UndefOr[Any], Unit]] = js.undefined
}
object IEllipse {
  
  inline def apply(): IEllipse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEllipse]
  }
  
  extension [Self <: IEllipse](x: Self) {
    
    inline def setAxisRotation(value: Double): Self = StObject.set(x, "axisRotation", value.asInstanceOf[js.Any])
    
    inline def setAxisRotationUndefined: Self = StObject.set(x, "axisRotation", js.undefined)
    
    inline def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    inline def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    inline def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    inline def setUpdatePath(value: (/* path */ js.UndefOr[Any], /* attr */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "updatePath", js.Any.fromFunction2((t0: /* path */ js.UndefOr[Any], t1: /* attr */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setUpdatePathUndefined: Self = StObject.set(x, "updatePath", js.undefined)
  }
}
