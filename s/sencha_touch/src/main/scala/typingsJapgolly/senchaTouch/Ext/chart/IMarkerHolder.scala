package typingsJapgolly.senchaTouch.Ext.chart

import japgolly.scalajs.react.Callback
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMarkerHolder
  extends StObject
     with IBase {
  
  /** [Method]
    * @param name String
    * @param marker Ext.chart.Markers
    */
  var bindMarker: js.UndefOr[
    js.Function2[/* name */ js.UndefOr[String], /* marker */ js.UndefOr[IMarkers], Unit]
  ] = js.undefined
}
object IMarkerHolder {
  
  inline def apply(): IMarkerHolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMarkerHolder]
  }
  
  extension [Self <: IMarkerHolder](x: Self) {
    
    inline def setBindMarker(value: (/* name */ js.UndefOr[String], /* marker */ js.UndefOr[IMarkers]) => Callback): Self = StObject.set(x, "bindMarker", js.Any.fromFunction2((t0: /* name */ js.UndefOr[String], t1: /* marker */ js.UndefOr[IMarkers]) => (value(t0, t1)).runNow()))
    
    inline def setBindMarkerUndefined: Self = StObject.set(x, "bindMarker", js.undefined)
  }
}
