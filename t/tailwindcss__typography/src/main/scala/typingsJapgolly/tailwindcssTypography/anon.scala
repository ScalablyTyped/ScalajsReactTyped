package typingsJapgolly.tailwindcssTypography

import japgolly.scalajs.react.Callback
import typingsJapgolly.tailwindcssTypography.tailwindcssTypographyStrings.legacy
import typingsJapgolly.tailwindcssTypography.tailwindcssTypographyStrings.modern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Handler extends StObject {
    
    def handler(): Unit
  }
  object Handler {
    
    inline def apply(handler: Callback): Handler = {
      val __obj = js.Dynamic.literal(handler = handler.toJsFn)
      __obj.asInstanceOf[Handler]
    }
    
    extension [Self <: Handler](x: Self) {
      
      inline def setHandler(value: Callback): Self = StObject.set(x, "handler", value.toJsFn)
    }
  }
  
  /* Inlined std.Partial<{  className :string,   target :'modern' | 'legacy'}> */
  trait PartialclassNamestringtar extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[modern | legacy] = js.undefined
  }
  object PartialclassNamestringtar {
    
    inline def apply(): PartialclassNamestringtar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialclassNamestringtar]
    }
    
    extension [Self <: PartialclassNamestringtar](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTarget(value: modern | legacy): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
