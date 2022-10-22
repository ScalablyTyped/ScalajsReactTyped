package typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod

import typingsJapgolly.angularCompilerCli.anon.Directive
import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceIdentifier
  extends StObject
     with TemplateIdentifier
     with TopLevelIdentifier {
  
  @JSName("kind")
  var kind_ReferenceIdentifier: Reference
  
  /** The target of this reference. If the target is not known, this is `null`. */
  var target: Directive | Null
}
object ReferenceIdentifier {
  
  inline def apply(kind: Reference, name: String, span: AbsoluteSourceSpan): ReferenceIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[ReferenceIdentifier]
  }
  
  extension [Self <: ReferenceIdentifier](x: Self) {
    
    inline def setKind(value: Reference): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Directive): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
  }
}
