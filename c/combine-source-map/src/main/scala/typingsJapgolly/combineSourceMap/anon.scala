package typingsJapgolly.combineSourceMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Source extends StObject {
    
    var source: String
    
    var sourceFile: String
  }
  object Source {
    
    inline def apply(source: String, sourceFile: String): Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    }
  }
}
