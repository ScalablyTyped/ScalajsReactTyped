package typingsJapgolly.minimatch

import typingsJapgolly.minimatch.mod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofMinimatch extends StObject {
    
    /* static member */
    def defaults(defaultOptions: IOptions): /* import warning: importer.ImportType#apply Failed type conversion: typeof Minimatch */ js.Any
  }
  object TypeofMinimatch {
    
    inline def apply(
      defaults: IOptions => /* import warning: importer.ImportType#apply Failed type conversion: typeof Minimatch */ js.Any
    ): TypeofMinimatch = {
      val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
      __obj.asInstanceOf[TypeofMinimatch]
    }
    
    extension [Self <: TypeofMinimatch](x: Self) {
      
      inline def setDefaults(
        value: IOptions => /* import warning: importer.ImportType#apply Failed type conversion: typeof Minimatch */ js.Any
      ): Self = StObject.set(x, "defaults", js.Any.fromFunction1(value))
    }
  }
}
