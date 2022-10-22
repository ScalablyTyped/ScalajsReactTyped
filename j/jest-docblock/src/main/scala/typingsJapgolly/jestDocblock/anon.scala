package typingsJapgolly.jestDocblock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Comments extends StObject {
    
    var comments: String
    
    var pragmas: typingsJapgolly.jestDocblock.mod.Pragmas
  }
  object Comments {
    
    inline def apply(comments: String, pragmas: typingsJapgolly.jestDocblock.mod.Pragmas): Comments = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], pragmas = pragmas.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comments]
    }
    
    extension [Self <: Comments](x: Self) {
      
      inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setPragmas(value: typingsJapgolly.jestDocblock.mod.Pragmas): Self = StObject.set(x, "pragmas", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pragmas extends StObject {
    
    var comments: js.UndefOr[String] = js.undefined
    
    var pragmas: js.UndefOr[typingsJapgolly.jestDocblock.mod.Pragmas] = js.undefined
  }
  object Pragmas {
    
    inline def apply(): Pragmas = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pragmas]
    }
    
    extension [Self <: Pragmas](x: Self) {
      
      inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      inline def setPragmas(value: typingsJapgolly.jestDocblock.mod.Pragmas): Self = StObject.set(x, "pragmas", value.asInstanceOf[js.Any])
      
      inline def setPragmasUndefined: Self = StObject.set(x, "pragmas", js.undefined)
    }
  }
}
