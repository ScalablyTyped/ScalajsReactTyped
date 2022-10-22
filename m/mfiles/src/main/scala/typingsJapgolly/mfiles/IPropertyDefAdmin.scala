package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyDefAdmin extends StObject {
  
  var AllowAutomaticPermissions: Boolean
  
  var AutomaticValue: IAutomaticValue
  
  def Clone(): IPropertyDefAdmin
  
  var NamedValueNamespaces: INamedValueNamespaces
  
  var PropertyDef: IPropertyDef
  
  var SemanticAliases: ISemanticAliases
  
  var Validation: IValidation
}
object IPropertyDefAdmin {
  
  inline def apply(
    AllowAutomaticPermissions: Boolean,
    AutomaticValue: IAutomaticValue,
    Clone: CallbackTo[IPropertyDefAdmin],
    NamedValueNamespaces: INamedValueNamespaces,
    PropertyDef: IPropertyDef,
    SemanticAliases: ISemanticAliases,
    Validation: IValidation
  ): IPropertyDefAdmin = {
    val __obj = js.Dynamic.literal(AllowAutomaticPermissions = AllowAutomaticPermissions.asInstanceOf[js.Any], AutomaticValue = AutomaticValue.asInstanceOf[js.Any], Clone = Clone.toJsFn, NamedValueNamespaces = NamedValueNamespaces.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], Validation = Validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyDefAdmin]
  }
  
  extension [Self <: IPropertyDefAdmin](x: Self) {
    
    inline def setAllowAutomaticPermissions(value: Boolean): Self = StObject.set(x, "AllowAutomaticPermissions", value.asInstanceOf[js.Any])
    
    inline def setAutomaticValue(value: IAutomaticValue): Self = StObject.set(x, "AutomaticValue", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IPropertyDefAdmin]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setNamedValueNamespaces(value: INamedValueNamespaces): Self = StObject.set(x, "NamedValueNamespaces", value.asInstanceOf[js.Any])
    
    inline def setPropertyDef(value: IPropertyDef): Self = StObject.set(x, "PropertyDef", value.asInstanceOf[js.Any])
    
    inline def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
    
    inline def setValidation(value: IValidation): Self = StObject.set(x, "Validation", value.asInstanceOf[js.Any])
  }
}
