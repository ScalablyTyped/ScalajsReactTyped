package typingsJapgolly.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleScrollGridState extends StObject {
  
  var forceYScrollbars: Boolean
  
  var scrollerClientHeights: StringDictionary[Double]
  
  var scrollerClientWidths: StringDictionary[Double]
  
  var shrinkWidth: Double | Null
}
object SimpleScrollGridState {
  
  inline def apply(
    forceYScrollbars: Boolean,
    scrollerClientHeights: StringDictionary[Double],
    scrollerClientWidths: StringDictionary[Double]
  ): SimpleScrollGridState = {
    val __obj = js.Dynamic.literal(forceYScrollbars = forceYScrollbars.asInstanceOf[js.Any], scrollerClientHeights = scrollerClientHeights.asInstanceOf[js.Any], scrollerClientWidths = scrollerClientWidths.asInstanceOf[js.Any], shrinkWidth = null)
    __obj.asInstanceOf[SimpleScrollGridState]
  }
  
  extension [Self <: SimpleScrollGridState](x: Self) {
    
    inline def setForceYScrollbars(value: Boolean): Self = StObject.set(x, "forceYScrollbars", value.asInstanceOf[js.Any])
    
    inline def setScrollerClientHeights(value: StringDictionary[Double]): Self = StObject.set(x, "scrollerClientHeights", value.asInstanceOf[js.Any])
    
    inline def setScrollerClientWidths(value: StringDictionary[Double]): Self = StObject.set(x, "scrollerClientWidths", value.asInstanceOf[js.Any])
    
    inline def setShrinkWidth(value: Double): Self = StObject.set(x, "shrinkWidth", value.asInstanceOf[js.Any])
    
    inline def setShrinkWidthNull: Self = StObject.set(x, "shrinkWidth", null)
  }
}
