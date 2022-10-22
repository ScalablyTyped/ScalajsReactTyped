package typingsJapgolly.wordpressViewport

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofimportedActions extends StObject {
    
    def setIsMatching(values: Record[String, Boolean]): Unit
  }
  object TypeofimportedActions {
    
    inline def apply(setIsMatching: Record[String, Boolean] => Callback): TypeofimportedActions = {
      val __obj = js.Dynamic.literal(setIsMatching = js.Any.fromFunction1((t0: Record[String, Boolean]) => setIsMatching(t0).runNow()))
      __obj.asInstanceOf[TypeofimportedActions]
    }
    
    extension [Self <: TypeofimportedActions](x: Self) {
      
      inline def setSetIsMatching(value: Record[String, Boolean] => Callback): Self = StObject.set(x, "setIsMatching", js.Any.fromFunction1((t0: Record[String, Boolean]) => value(t0).runNow()))
    }
  }
  
  trait TypeofimportedSelectors extends StObject {
    
    def isViewportMatch(query: String): Boolean
  }
  object TypeofimportedSelectors {
    
    inline def apply(isViewportMatch: String => Boolean): TypeofimportedSelectors = {
      val __obj = js.Dynamic.literal(isViewportMatch = js.Any.fromFunction1(isViewportMatch))
      __obj.asInstanceOf[TypeofimportedSelectors]
    }
    
    extension [Self <: TypeofimportedSelectors](x: Self) {
      
      inline def setIsViewportMatch(value: String => Boolean): Self = StObject.set(x, "isViewportMatch", js.Any.fromFunction1(value))
    }
  }
}
