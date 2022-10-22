package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConstraint
  extends StObject
     with ITypeFacet {
  
  def composeWith(r: IConstraint): IConstraint
}
object IConstraint {
  
  inline def apply(
    annotations: CallbackTo[js.Array[IAnnotation]],
    composeWith: IConstraint => IConstraint,
    facetName: CallbackTo[String],
    isConstraint: CallbackTo[Boolean],
    isInheritable: CallbackTo[Boolean],
    kind: CallbackTo[MetaInformationKind],
    owner: CallbackTo[IParsedType],
    requiredType: CallbackTo[IParsedType],
    validateSelf: ITypeRegistry => IStatus,
    value: CallbackTo[Any]
  ): IConstraint = {
    val __obj = js.Dynamic.literal(annotations = annotations.toJsFn, composeWith = js.Any.fromFunction1(composeWith), facetName = facetName.toJsFn, isConstraint = isConstraint.toJsFn, isInheritable = isInheritable.toJsFn, kind = kind.toJsFn, owner = owner.toJsFn, requiredType = requiredType.toJsFn, validateSelf = js.Any.fromFunction1(validateSelf), value = value.toJsFn)
    __obj.asInstanceOf[IConstraint]
  }
  
  extension [Self <: IConstraint](x: Self) {
    
    inline def setComposeWith(value: IConstraint => IConstraint): Self = StObject.set(x, "composeWith", js.Any.fromFunction1(value))
  }
}
