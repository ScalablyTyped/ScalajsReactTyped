package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLabelsTextPathOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Presentation attributes for the text path.
    */
  var attributes: js.UndefOr[SVGAttributes] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Enable or disable `textPath` option for
    * link's or marker's data labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object DataLabelsTextPathOptionsObject {
  
  inline def apply(): DataLabelsTextPathOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabelsTextPathOptionsObject]
  }
  
  extension [Self <: DataLabelsTextPathOptionsObject](x: Self) {
    
    inline def setAttributes(value: SVGAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
