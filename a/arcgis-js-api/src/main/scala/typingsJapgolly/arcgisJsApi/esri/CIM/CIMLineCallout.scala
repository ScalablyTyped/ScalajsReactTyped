package typingsJapgolly.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMLineCallout
  extends StObject
     with CIMCalloutBase {
  
  /**
    * The gap (in points) between the point symbol and the beginning of the leader line.
    */
  var gap: js.UndefOr[Double] = js.undefined
  
  /**
    * The line symbol to draw leaders with.
    */
  var leaderLineSymbol: js.UndefOr[CIMLineSymbol] = js.undefined
  
  /**
    * The style of line to generate when a Point leader is drawn defined by an enumeration value. Line leaders will always be drawn with their own geometry.
    */
  var lineStyle: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LeaderLineStyle * / any */ String
  ] = js.undefined
}
object CIMLineCallout {
  
  inline def apply(`type`: String): CIMLineCallout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMLineCallout]
  }
  
  extension [Self <: CIMLineCallout](x: Self) {
    
    inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setLeaderLineSymbol(value: CIMLineSymbol): Self = StObject.set(x, "leaderLineSymbol", value.asInstanceOf[js.Any])
    
    inline def setLeaderLineSymbolUndefined: Self = StObject.set(x, "leaderLineSymbol", js.undefined)
    
    inline def setLineStyle(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LeaderLineStyle * / any */ String
    ): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
  }
}
