package typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod

import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Element
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementIdentifier
  extends StObject
     with BaseElementOrTemplateIdentifier
     with TopLevelIdentifier {
  
  @JSName("kind")
  var kind_ElementIdentifier: Element
}
object ElementIdentifier {
  
  inline def apply(
    attributes: Set[AttributeIdentifier],
    kind: Element,
    name: String,
    span: AbsoluteSourceSpan,
    usedDirectives: Set[DirectiveReference]
  ): ElementIdentifier = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], usedDirectives = usedDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementIdentifier]
  }
  
  extension [Self <: ElementIdentifier](x: Self) {
    
    inline def setKind(value: Element): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
