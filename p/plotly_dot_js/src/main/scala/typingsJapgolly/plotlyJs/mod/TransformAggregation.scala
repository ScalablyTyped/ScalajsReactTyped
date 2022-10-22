package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.avg
import typingsJapgolly.plotlyJs.plotlyJsStrings.count
import typingsJapgolly.plotlyJs.plotlyJsStrings.first
import typingsJapgolly.plotlyJs.plotlyJsStrings.last
import typingsJapgolly.plotlyJs.plotlyJsStrings.max
import typingsJapgolly.plotlyJs.plotlyJsStrings.median
import typingsJapgolly.plotlyJs.plotlyJsStrings.min
import typingsJapgolly.plotlyJs.plotlyJsStrings.mode
import typingsJapgolly.plotlyJs.plotlyJsStrings.population
import typingsJapgolly.plotlyJs.plotlyJsStrings.rms
import typingsJapgolly.plotlyJs.plotlyJsStrings.sample
import typingsJapgolly.plotlyJs.plotlyJsStrings.stddev
import typingsJapgolly.plotlyJs.plotlyJsStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformAggregation extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var func: js.UndefOr[count | sum | avg | median | mode | rms | stddev | min | max | first | last] = js.undefined
  
  var funcmode: js.UndefOr[sample | population] = js.undefined
  
  var target: String
}
object TransformAggregation {
  
  inline def apply(target: String): TransformAggregation = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformAggregation]
  }
  
  extension [Self <: TransformAggregation](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFunc(value: count | sum | avg | median | mode | rms | stddev | min | max | first | last): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setFuncUndefined: Self = StObject.set(x, "func", js.undefined)
    
    inline def setFuncmode(value: sample | population): Self = StObject.set(x, "funcmode", value.asInstanceOf[js.Any])
    
    inline def setFuncmodeUndefined: Self = StObject.set(x, "funcmode", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
