package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rewriter extends StObject {
  
  var rewriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5-html-rewriting-stream */ Any
  
  var transformedContent: js.Promise[String]
}
object Rewriter {
  
  inline def apply(
    rewriter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5-html-rewriting-stream */ Any,
    transformedContent: js.Promise[String]
  ): Rewriter = {
    val __obj = js.Dynamic.literal(rewriter = rewriter.asInstanceOf[js.Any], transformedContent = transformedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rewriter]
  }
  
  extension [Self <: Rewriter](x: Self) {
    
    inline def setRewriter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_parse5-html-rewriting-stream */ Any
    ): Self = StObject.set(x, "rewriter", value.asInstanceOf[js.Any])
    
    inline def setTransformedContent(value: js.Promise[String]): Self = StObject.set(x, "transformedContent", value.asInstanceOf[js.Any])
  }
}
