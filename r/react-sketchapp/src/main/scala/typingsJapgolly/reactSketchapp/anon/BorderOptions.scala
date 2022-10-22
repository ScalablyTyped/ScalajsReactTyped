package typingsJapgolly.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderOptions extends StObject {
  
  var borderOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.BorderOptions */ Any
  
  var borders: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Border */ Any
  ]
}
object BorderOptions {
  
  inline def apply(
    borderOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.BorderOptions */ Any,
    borders: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Border */ Any
    ]
  ): BorderOptions = {
    val __obj = js.Dynamic.literal(borderOptions = borderOptions.asInstanceOf[js.Any], borders = borders.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderOptions]
  }
  
  extension [Self <: BorderOptions](x: Self) {
    
    inline def setBorderOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.BorderOptions */ Any
    ): Self = StObject.set(x, "borderOptions", value.asInstanceOf[js.Any])
    
    inline def setBorders(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Border */ Any
        ]
    ): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Border */ Any)*
    ): Self = StObject.set(x, "borders", js.Array(value*))
  }
}
