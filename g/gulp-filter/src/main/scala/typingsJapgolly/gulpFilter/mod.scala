package typingsJapgolly.gulpFilter

import typingsJapgolly.minimatch.mod.IOptions
import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pattern: String): Filter = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Filter]
  inline def apply(pattern: String, options: Options): Filter = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Filter]
  inline def apply(pattern: js.Array[String]): Filter = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Filter]
  inline def apply(pattern: js.Array[String], options: Options): Filter = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Filter]
  inline def apply(pattern: FileFunction): Filter = ^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any]).asInstanceOf[Filter]
  inline def apply(pattern: FileFunction, options: Options): Filter = (^.asInstanceOf[js.Dynamic].apply(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Filter]
  
  @JSImport("gulp-filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type FileFunction = js.Function1[/* file */ File, Boolean]
  
  // A transform stream with a .restore object
  @js.native
  trait Filter
    extends StObject
       with ReadWriteStream {
    
    var restore: ReadWriteStream = js.native
  }
  
  trait Options
    extends StObject
       with IOptions {
    
    var passthrough: js.UndefOr[Boolean] = js.undefined
    
    var restore: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPassthrough(value: Boolean): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      inline def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
      
      inline def setRestore(value: Boolean): Self = StObject.set(x, "restore", value.asInstanceOf[js.Any])
      
      inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    }
  }
}
