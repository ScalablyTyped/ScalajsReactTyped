package typingsJapgolly.barnard59Base

import typingsJapgolly.glob.mod.IOptions
import typingsJapgolly.readableStream.mod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globMod {
  
  @JSImport("barnard59-base/glob", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(arg: Options): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(arg.asInstanceOf[js.Any]).asInstanceOf[Readable]
  
  trait Options
    extends StObject
       with IOptions {
    
    var pattern: String
  }
  object Options {
    
    inline def apply(pattern: String): Options = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
}
