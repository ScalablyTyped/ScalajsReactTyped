package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IAttribute
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeRef
  extends StObject
     with Reference {
  
  /**
    * Returns AST node of security scheme, this reference refers to, or null.
    **/
  def securityScheme(): AbstractSecurityScheme
  
  /**
    * Returns the name of security scheme, this reference refers to.
    **/
  def securitySchemeName(): String
}
object SecuritySchemeRef {
  
  inline def apply(
    RAMLVersion: CallbackTo[String],
    highLevel: CallbackTo[IAttribute],
    kind: CallbackTo[String],
    meta: CallbackTo[ValueMetadata],
    name: CallbackTo[String],
    optional: CallbackTo[Boolean],
    parent: CallbackTo[BasicNode],
    securityScheme: CallbackTo[AbstractSecurityScheme],
    securitySchemeName: CallbackTo[String],
    structuredValue: CallbackTo[TypeInstance],
    toJSON: CallbackTo[Any],
    value: CallbackTo[IStructuredValue],
    wrapperClassName: CallbackTo[String]
  ): SecuritySchemeRef = {
    val __obj = js.Dynamic.literal(RAMLVersion = RAMLVersion.toJsFn, highLevel = highLevel.toJsFn, kind = kind.toJsFn, meta = meta.toJsFn, name = name.toJsFn, optional = optional.toJsFn, parent = parent.toJsFn, securityScheme = securityScheme.toJsFn, securitySchemeName = securitySchemeName.toJsFn, structuredValue = structuredValue.toJsFn, toJSON = toJSON.toJsFn, value = value.toJsFn, wrapperClassName = wrapperClassName.toJsFn)
    __obj.asInstanceOf[SecuritySchemeRef]
  }
  
  extension [Self <: SecuritySchemeRef](x: Self) {
    
    inline def setSecurityScheme(value: CallbackTo[AbstractSecurityScheme]): Self = StObject.set(x, "securityScheme", value.toJsFn)
    
    inline def setSecuritySchemeName(value: CallbackTo[String]): Self = StObject.set(x, "securitySchemeName", value.toJsFn)
  }
}
