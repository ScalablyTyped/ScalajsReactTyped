package typingsJapgolly.antvG2plot

import typingsJapgolly.antvG2.libInterfaceMod.ShapePoint
import typingsJapgolly.antvG2.libInterfaceMod.StateOption
import typingsJapgolly.antvG2.mod.Element
import typingsJapgolly.antvG2.mod.Geometry
import typingsJapgolly.antvG2plot.libTypesCommonMod.Data
import typingsJapgolly.antvG2plot.libTypesCommonMod.Datum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesStateMod {
  
  type State = StateOption
  
  type StateCondition = js.Function1[/* data */ Datum | Data, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antvG2plot.antvG2plotStrings.active
    - typingsJapgolly.antvG2plot.antvG2plotStrings.inactive
    - typingsJapgolly.antvG2plot.antvG2plotStrings.selected
    - typingsJapgolly.antvG2plot.antvG2plotStrings.default
  */
  trait StateName extends StObject
  object StateName {
    
    inline def default: typingsJapgolly.antvG2plot.antvG2plotStrings.default = "default".asInstanceOf[typingsJapgolly.antvG2plot.antvG2plotStrings.default]
    
    inline def active: typingsJapgolly.antvG2plot.antvG2plotStrings.active = "active".asInstanceOf[typingsJapgolly.antvG2plot.antvG2plotStrings.active]
    
    inline def inactive: typingsJapgolly.antvG2plot.antvG2plotStrings.inactive = "inactive".asInstanceOf[typingsJapgolly.antvG2plot.antvG2plotStrings.inactive]
    
    inline def selected: typingsJapgolly.antvG2plot.antvG2plotStrings.selected = "selected".asInstanceOf[typingsJapgolly.antvG2plot.antvG2plotStrings.selected]
  }
  
  trait StateObject extends StObject {
    
    var data: Datum | Data
    
    var element: Element
    
    var geometry: Geometry[ShapePoint]
    
    var state: String
  }
  object StateObject {
    
    inline def apply(data: Datum | Data, element: Element, geometry: Geometry[ShapePoint], state: String): StateObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateObject]
    }
    
    extension [Self <: StateObject](x: Self) {
      
      inline def setData(value: Datum | Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setGeometry(value: Geometry[ShapePoint]): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
