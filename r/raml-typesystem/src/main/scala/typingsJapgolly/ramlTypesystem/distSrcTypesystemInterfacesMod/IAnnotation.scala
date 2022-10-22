package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotation
  extends StObject
     with ITypeFacet {
  
  /**
    * Annotation definition type
    */
  def definition(): IParsedType
  
  /**
    * Annotation name
    */
  def name(): String
  
  /**
    * Returns owner facet for annotations applied to facets
    */
  def ownerFacet(): ITypeFacet
}
object IAnnotation {
  
  inline def apply(
    annotations: CallbackTo[js.Array[IAnnotation]],
    definition: CallbackTo[IParsedType],
    facetName: CallbackTo[String],
    isConstraint: CallbackTo[Boolean],
    isInheritable: CallbackTo[Boolean],
    kind: CallbackTo[MetaInformationKind],
    name: CallbackTo[String],
    owner: CallbackTo[IParsedType],
    ownerFacet: CallbackTo[ITypeFacet],
    requiredType: CallbackTo[IParsedType],
    validateSelf: ITypeRegistry => IStatus,
    value: CallbackTo[Any]
  ): IAnnotation = {
    val __obj = js.Dynamic.literal(annotations = annotations.toJsFn, definition = definition.toJsFn, facetName = facetName.toJsFn, isConstraint = isConstraint.toJsFn, isInheritable = isInheritable.toJsFn, kind = kind.toJsFn, name = name.toJsFn, owner = owner.toJsFn, ownerFacet = ownerFacet.toJsFn, requiredType = requiredType.toJsFn, validateSelf = js.Any.fromFunction1(validateSelf), value = value.toJsFn)
    __obj.asInstanceOf[IAnnotation]
  }
  
  extension [Self <: IAnnotation](x: Self) {
    
    inline def setDefinition(value: CallbackTo[IParsedType]): Self = StObject.set(x, "definition", value.toJsFn)
    
    inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setOwnerFacet(value: CallbackTo[ITypeFacet]): Self = StObject.set(x, "ownerFacet", value.toJsFn)
  }
}
