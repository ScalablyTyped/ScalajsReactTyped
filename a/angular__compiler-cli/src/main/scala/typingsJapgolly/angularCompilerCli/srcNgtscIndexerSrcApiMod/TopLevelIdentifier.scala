package typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod

import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Element
import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Method
import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Property
import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Template
import typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Variable
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.PropertyIdentifier
  - typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.ElementIdentifier
  - typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.TemplateNodeIdentifier
  - typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.ReferenceIdentifier
  - typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.VariableIdentifier
  - typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.MethodIdentifier
*/
trait TopLevelIdentifier extends StObject
object TopLevelIdentifier {
  
  inline def ElementIdentifier(
    attributes: Set[AttributeIdentifier],
    kind: Element,
    name: String,
    span: AbsoluteSourceSpan,
    usedDirectives: Set[DirectiveReference]
  ): typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.ElementIdentifier = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], usedDirectives = usedDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.ElementIdentifier]
  }
  
  inline def MethodIdentifier(kind: Method, name: String, span: AbsoluteSourceSpan): typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.MethodIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.MethodIdentifier]
  }
  
  inline def PropertyIdentifier(kind: Property, name: String, span: AbsoluteSourceSpan): typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.PropertyIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.PropertyIdentifier]
  }
  
  inline def ReferenceIdentifier(kind: Reference, name: String, span: AbsoluteSourceSpan): typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.ReferenceIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], target = null)
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.ReferenceIdentifier]
  }
  
  inline def TemplateNodeIdentifier(
    attributes: Set[AttributeIdentifier],
    kind: Template,
    name: String,
    span: AbsoluteSourceSpan,
    usedDirectives: Set[DirectiveReference]
  ): typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.TemplateNodeIdentifier = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], usedDirectives = usedDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.TemplateNodeIdentifier]
  }
  
  inline def VariableIdentifier(kind: Variable, name: String, span: AbsoluteSourceSpan): typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.VariableIdentifier = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompilerCli.srcNgtscIndexerSrcApiMod.VariableIdentifier]
  }
}
