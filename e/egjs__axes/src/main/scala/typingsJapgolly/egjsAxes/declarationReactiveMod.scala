package typingsJapgolly.egjsAxes

import typingsJapgolly.cfcsCore.declarationReactiveReactiveAdapterMod.ReactiveAdapter
import typingsJapgolly.egjsAxes.declarationAxesMod.AxesOption
import typingsJapgolly.egjsAxes.declarationAxesMod.default
import typingsJapgolly.egjsAxes.declarationAxisManagerMod.AxisOption
import typingsJapgolly.egjsAxes.declarationTypesMod.AxesEvents
import typingsJapgolly.egjsAxes.declarationTypesMod.AxesReactiveState
import typingsJapgolly.egjsAxes.declarationTypesMod.ObjectInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveMod {
  
  @JSImport("@egjs/axes/declaration/reactive", "REACTIVE_AXES")
  @js.native
  val REACTIVE_AXES: ReactiveAdapter[
    default, 
    AxesReactiveState, 
    /* keyof @egjs/axes.@egjs/axes/declaration/types.AxesMethods */ String, 
    AxesData, 
    AxesEvents
  ] = js.native
  
  trait AxesData extends StObject {
    
    var axis: ObjectInterface[AxisOption]
    
    var options: AxesOption
  }
  object AxesData {
    
    inline def apply(axis: ObjectInterface[AxisOption], options: AxesOption): AxesData = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxesData]
    }
    
    extension [Self <: AxesData](x: Self) {
      
      inline def setAxis(value: ObjectInterface[AxisOption]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: AxesOption): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
