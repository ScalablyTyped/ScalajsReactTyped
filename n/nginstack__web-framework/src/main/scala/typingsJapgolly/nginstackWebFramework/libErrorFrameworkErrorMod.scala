package typingsJapgolly.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libErrorFrameworkErrorMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/error/FrameworkError", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FrameworkError {
    def this(args: Any*) = this()
    
    /* private */ /* CompleteClass */
    var _name: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/error/FrameworkError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/error/FrameworkError", "TIMEOUT")
  @js.native
  val TIMEOUT: Double = js.native
  
  trait FrameworkError extends StObject {
    
    /* private */ var _name: Any
  }
  object FrameworkError {
    
    inline def apply(_name: Any): FrameworkError = {
      val __obj = js.Dynamic.literal(_name = _name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameworkError]
    }
    
    extension [Self <: FrameworkError](x: Self) {
      
      inline def set_name(value: Any): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    }
  }
}
