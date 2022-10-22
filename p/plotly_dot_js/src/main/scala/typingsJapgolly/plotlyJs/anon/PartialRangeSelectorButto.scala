package typingsJapgolly.plotlyJs.anon

import typingsJapgolly.plotlyJs.plotlyJsStrings.all
import typingsJapgolly.plotlyJs.plotlyJsStrings.backward
import typingsJapgolly.plotlyJs.plotlyJsStrings.day
import typingsJapgolly.plotlyJs.plotlyJsStrings.hour
import typingsJapgolly.plotlyJs.plotlyJsStrings.minute
import typingsJapgolly.plotlyJs.plotlyJsStrings.month
import typingsJapgolly.plotlyJs.plotlyJsStrings.second
import typingsJapgolly.plotlyJs.plotlyJsStrings.todate
import typingsJapgolly.plotlyJs.plotlyJsStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.RangeSelectorButton> */
trait PartialRangeSelectorButto extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var step: js.UndefOr[second | minute | hour | day | month | year | all] = js.undefined
  
  var stepmode: js.UndefOr[backward | todate] = js.undefined
}
object PartialRangeSelectorButto {
  
  inline def apply(): PartialRangeSelectorButto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRangeSelectorButto]
  }
  
  extension [Self <: PartialRangeSelectorButto](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setStep(value: second | minute | hour | day | month | year | all): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStepmode(value: backward | todate): Self = StObject.set(x, "stepmode", value.asInstanceOf[js.Any])
    
    inline def setStepmodeUndefined: Self = StObject.set(x, "stepmode", js.undefined)
  }
}
