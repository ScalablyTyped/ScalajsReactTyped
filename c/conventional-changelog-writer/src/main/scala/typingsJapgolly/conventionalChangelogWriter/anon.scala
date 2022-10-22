package typingsJapgolly.conventionalChangelogWriter

import typingsJapgolly.conventionalCommitsParser.mod.Commit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Raw[T /* <: Commit[String | Double | js.Symbol] */] extends StObject {
    
    var raw: T
  }
  object Raw {
    
    inline def apply[T /* <: Commit[String | Double | js.Symbol] */](raw: T): Raw[T] = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Raw[T]]
    }
    
    extension [Self <: Raw[?], T /* <: Commit[String | Double | js.Symbol] */](x: Self & Raw[T]) {
      
      inline def setRaw(value: T): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
}
