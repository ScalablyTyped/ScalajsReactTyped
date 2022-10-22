package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointStatesNormalOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock) Animation when returning to normal state after
    * hovering.
    */
  var animation: js.UndefOr[Boolean | PartialAnimationOptionsOb] = js.undefined
}
object PointStatesNormalOptionsObject {
  
  inline def apply(): PointStatesNormalOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointStatesNormalOptionsObject]
  }
  
  extension [Self <: PointStatesNormalOptionsObject](x: Self) {
    
    inline def setAnimation(value: Boolean | PartialAnimationOptionsOb): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
  }
}
