package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IAttribute
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraitRef
  extends StObject
     with Reference {
  
  /**
    * Returns referenced trait
    **/
  def `trait`(): Trait
}
object TraitRef {
  
  inline def apply(
    RAMLVersion: CallbackTo[String],
    highLevel: CallbackTo[IAttribute],
    kind: CallbackTo[String],
    meta: CallbackTo[ValueMetadata],
    name: CallbackTo[String],
    optional: CallbackTo[Boolean],
    parent: CallbackTo[BasicNode],
    structuredValue: CallbackTo[TypeInstance],
    toJSON: CallbackTo[Any],
    `trait`: CallbackTo[Trait],
    value: CallbackTo[IStructuredValue],
    wrapperClassName: CallbackTo[String]
  ): TraitRef = {
    val __obj = js.Dynamic.literal(RAMLVersion = RAMLVersion.toJsFn, highLevel = highLevel.toJsFn, kind = kind.toJsFn, meta = meta.toJsFn, name = name.toJsFn, optional = optional.toJsFn, parent = parent.toJsFn, structuredValue = structuredValue.toJsFn, toJSON = toJSON.toJsFn, value = value.toJsFn, wrapperClassName = wrapperClassName.toJsFn)
    __obj.updateDynamic("trait")(`trait`.toJsFn)
    __obj.asInstanceOf[TraitRef]
  }
  
  extension [Self <: TraitRef](x: Self) {
    
    inline def setTrait(value: CallbackTo[Trait]): Self = StObject.set(x, "trait", value.toJsFn)
  }
}
