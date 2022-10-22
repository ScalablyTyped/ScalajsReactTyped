package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypeFacet extends StObject {
  
  /**
    * Annotations applied to the facet
    */
  def annotations(): js.Array[IAnnotation]
  
  /**
    * name of the facet
    */
  def facetName(): String
  
  def isConstraint(): Boolean
  
  /**
    * return true if this facet is inheritable
    */
  def isInheritable(): Boolean
  
  /**
    * Returns kind of meta-information this instance represents.
    */
  def kind(): MetaInformationKind
  
  /**
    * returns a type to which this facet  belongs
    */
  def owner(): IParsedType
  
  /**
    * broadest type to which this facet can be added
    */
  def requiredType(): IParsedType
  
  /**
    * validates if the facet is configured properly
    * @param registry
    */
  def validateSelf(registry: ITypeRegistry): IStatus
  
  /**
    * returns value associated with the facet
    */
  def value(): Any
}
object ITypeFacet {
  
  inline def apply(
    annotations: CallbackTo[js.Array[IAnnotation]],
    facetName: CallbackTo[String],
    isConstraint: CallbackTo[Boolean],
    isInheritable: CallbackTo[Boolean],
    kind: CallbackTo[MetaInformationKind],
    owner: CallbackTo[IParsedType],
    requiredType: CallbackTo[IParsedType],
    validateSelf: ITypeRegistry => IStatus,
    value: CallbackTo[Any]
  ): ITypeFacet = {
    val __obj = js.Dynamic.literal(annotations = annotations.toJsFn, facetName = facetName.toJsFn, isConstraint = isConstraint.toJsFn, isInheritable = isInheritable.toJsFn, kind = kind.toJsFn, owner = owner.toJsFn, requiredType = requiredType.toJsFn, validateSelf = js.Any.fromFunction1(validateSelf), value = value.toJsFn)
    __obj.asInstanceOf[ITypeFacet]
  }
  
  extension [Self <: ITypeFacet](x: Self) {
    
    inline def setAnnotations(value: CallbackTo[js.Array[IAnnotation]]): Self = StObject.set(x, "annotations", value.toJsFn)
    
    inline def setFacetName(value: CallbackTo[String]): Self = StObject.set(x, "facetName", value.toJsFn)
    
    inline def setIsConstraint(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConstraint", value.toJsFn)
    
    inline def setIsInheritable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInheritable", value.toJsFn)
    
    inline def setKind(value: CallbackTo[MetaInformationKind]): Self = StObject.set(x, "kind", value.toJsFn)
    
    inline def setOwner(value: CallbackTo[IParsedType]): Self = StObject.set(x, "owner", value.toJsFn)
    
    inline def setRequiredType(value: CallbackTo[IParsedType]): Self = StObject.set(x, "requiredType", value.toJsFn)
    
    inline def setValidateSelf(value: ITypeRegistry => IStatus): Self = StObject.set(x, "validateSelf", js.Any.fromFunction1(value))
    
    inline def setValue(value: CallbackTo[Any]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
