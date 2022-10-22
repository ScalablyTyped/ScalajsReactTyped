package typingsJapgolly.cucumberGherkin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cells extends StObject {
    
    var cells: js.Array[Location]
    
    var id: String
    
    var location: typingsJapgolly.cucumberMessages.mod.Location
  }
  object Cells {
    
    inline def apply(cells: js.Array[Location], id: String, location: typingsJapgolly.cucumberMessages.mod.Location): Cells = {
      val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cells]
    }
    
    extension [Self <: Cells](x: Self) {
      
      inline def setCells(value: js.Array[Location]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(value: Location*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: typingsJapgolly.cucumberMessages.mod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var location: typingsJapgolly.cucumberMessages.mod.Location
    
    var value: String
  }
  object Location {
    
    inline def apply(location: typingsJapgolly.cucumberMessages.mod.Location, value: String): Location = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setLocation(value: typingsJapgolly.cucumberMessages.mod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
