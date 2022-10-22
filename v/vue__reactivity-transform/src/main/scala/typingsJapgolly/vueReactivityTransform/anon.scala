package typingsJapgolly.vueReactivityTransform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  // public prop key
  trait Default extends StObject {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var local: String
  }
  object Default {
    
    inline def apply(local: String): Default = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImportedHelpers extends StObject {
    
    var importedHelpers: js.Array[String]
    
    var rootRefs: js.Array[String]
  }
  object ImportedHelpers {
    
    inline def apply(importedHelpers: js.Array[String], rootRefs: js.Array[String]): ImportedHelpers = {
      val __obj = js.Dynamic.literal(importedHelpers = importedHelpers.asInstanceOf[js.Any], rootRefs = rootRefs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImportedHelpers]
    }
    
    extension [Self <: ImportedHelpers](x: Self) {
      
      inline def setImportedHelpers(value: js.Array[String]): Self = StObject.set(x, "importedHelpers", value.asInstanceOf[js.Any])
      
      inline def setImportedHelpersVarargs(value: String*): Self = StObject.set(x, "importedHelpers", js.Array(value*))
      
      inline def setRootRefs(value: js.Array[String]): Self = StObject.set(x, "rootRefs", value.asInstanceOf[js.Any])
      
      inline def setRootRefsVarargs(value: String*): Self = StObject.set(x, "rootRefs", js.Array(value*))
    }
  }
}
