package typingsJapgolly.rdfjsTypes

import typingsJapgolly.rdfjsTypes.dataModelMod.Variable
import typingsJapgolly.rdfjsTypes.queryCommonMod.QuadTermName
import typingsJapgolly.rdfjsTypes.rdfjsTypesStrings.asc
import typingsJapgolly.rdfjsTypes.rdfjsTypesStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Direction[T /* <: QuadTermName | Variable */] extends StObject {
    
    var direction: asc | desc
    
    var term: T
  }
  object Direction {
    
    inline def apply[T /* <: QuadTermName | Variable */](direction: asc | desc, term: T): Direction[T] = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction[T]]
    }
    
    extension [Self <: Direction[?], T /* <: QuadTermName | Variable */](x: Self & Direction[T]) {
      
      inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setTerm(value: T): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    }
  }
  
  trait Variables extends StObject {
    
    var variables: js.Array[Variable]
  }
  object Variables {
    
    inline def apply(variables: js.Array[Variable]): Variables = {
      val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variables]
    }
    
    extension [Self <: Variables](x: Self) {
      
      inline def setVariables(value: js.Array[Variable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value*))
    }
  }
}
