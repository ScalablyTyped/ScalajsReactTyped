package typingsJapgolly.ramlTypesystem.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFacetPrototype extends StObject {
  
  /**
    * creates a facet filled with a passed value
    * @param v
    */
  def createWithValue(v: Any): ITypeFacet
  
  /**
    * checks if the facet represented by this prototype can be added to the given type
    * @param t
    */
  def isApplicable(t: IParsedType): Boolean
  
  /**
    * returns true if this facet is a constraint
    */
  def isConstraint(): Boolean
  
  /**
    * returns true if this facet is inheritable
    */
  def isInheritable(): Boolean
  
  /**
    * returns true if this facet describes a metadata
    */
  def isMeta(): Boolean
  
  /**
    * returns the name of the facet represented by this prototype
    */
  def name(): String
  
  /**
    *creates brand new instance of facet filled with default values
    */
  def newInstance(): ITypeFacet
}
object IFacetPrototype {
  
  inline def apply(
    createWithValue: Any => ITypeFacet,
    isApplicable: IParsedType => Boolean,
    isConstraint: CallbackTo[Boolean],
    isInheritable: CallbackTo[Boolean],
    isMeta: CallbackTo[Boolean],
    name: CallbackTo[String],
    newInstance: CallbackTo[ITypeFacet]
  ): IFacetPrototype = {
    val __obj = js.Dynamic.literal(createWithValue = js.Any.fromFunction1(createWithValue), isApplicable = js.Any.fromFunction1(isApplicable), isConstraint = isConstraint.toJsFn, isInheritable = isInheritable.toJsFn, isMeta = isMeta.toJsFn, name = name.toJsFn, newInstance = newInstance.toJsFn)
    __obj.asInstanceOf[IFacetPrototype]
  }
  
  extension [Self <: IFacetPrototype](x: Self) {
    
    inline def setCreateWithValue(value: Any => ITypeFacet): Self = StObject.set(x, "createWithValue", js.Any.fromFunction1(value))
    
    inline def setIsApplicable(value: IParsedType => Boolean): Self = StObject.set(x, "isApplicable", js.Any.fromFunction1(value))
    
    inline def setIsConstraint(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConstraint", value.toJsFn)
    
    inline def setIsInheritable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInheritable", value.toJsFn)
    
    inline def setIsMeta(value: CallbackTo[Boolean]): Self = StObject.set(x, "isMeta", value.toJsFn)
    
    inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setNewInstance(value: CallbackTo[ITypeFacet]): Self = StObject.set(x, "newInstance", value.toJsFn)
  }
}
