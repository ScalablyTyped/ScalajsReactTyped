package typingsJapgolly.swag

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.swag.anon.TypeofHandlebars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("swag", JSImport.Namespace)
  @js.native
  val ^ : SwagStatic = js.native
  
  trait SwagStatic extends StObject {
    
    def registerHelpers(handlebars: TypeofHandlebars): Unit
  }
  object SwagStatic {
    
    inline def apply(registerHelpers: TypeofHandlebars => Callback): SwagStatic = {
      val __obj = js.Dynamic.literal(registerHelpers = js.Any.fromFunction1((t0: TypeofHandlebars) => registerHelpers(t0).runNow()))
      __obj.asInstanceOf[SwagStatic]
    }
    
    extension [Self <: SwagStatic](x: Self) {
      
      inline def setRegisterHelpers(value: TypeofHandlebars => Callback): Self = StObject.set(x, "registerHelpers", js.Any.fromFunction1((t0: TypeofHandlebars) => value(t0).runNow()))
    }
  }
  
  type _To = SwagStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SwagStatic = ^
}
