package typingsJapgolly.bizcharts

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.bizcharts.bizchartsStrings.hv
import typingsJapgolly.bizcharts.bizchartsStrings.hvh
import typingsJapgolly.bizcharts.bizchartsStrings.vh
import typingsJapgolly.bizcharts.bizchartsStrings.vhv
import typingsJapgolly.bizcharts.libPlotsLineChartMod.LineOptions
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsStepLineChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/StepLineChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[StepLineOptions & RefAttributes[Any]] = js.native
  
  trait StepLineOptions
    extends StObject
       with LineOptions {
    
    var step: js.UndefOr[hv | vh | vhv | hvh] = js.undefined
  }
  object StepLineOptions {
    
    inline def apply(data: js.Array[Record[String, Any]]): StepLineOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepLineOptions]
    }
    
    extension [Self <: StepLineOptions](x: Self) {
      
      inline def setStep(value: hv | vh | vhv | hvh): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[StepLineOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsStepLineChartMod.foo` */
  override def _to: ForwardRefExoticComponent[StepLineOptions & RefAttributes[Any]] = default
}
