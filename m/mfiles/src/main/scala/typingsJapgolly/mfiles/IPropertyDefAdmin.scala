package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyDefAdmin extends js.Object {
  var AllowAutomaticPermissions: Boolean
  var AutomaticValue: IAutomaticValue
  var NamedValueNamespaces: INamedValueNamespaces
  var PropertyDef: IPropertyDef
  var SemanticAliases: ISemanticAliases
  var Validation: IValidation
  def Clone(): IPropertyDefAdmin
}

object IPropertyDefAdmin {
  @scala.inline
  def apply(
    AllowAutomaticPermissions: Boolean,
    AutomaticValue: IAutomaticValue,
    Clone: CallbackTo[IPropertyDefAdmin],
    NamedValueNamespaces: INamedValueNamespaces,
    PropertyDef: IPropertyDef,
    SemanticAliases: ISemanticAliases,
    Validation: IValidation
  ): IPropertyDefAdmin = {
    val __obj = js.Dynamic.literal(AllowAutomaticPermissions = AllowAutomaticPermissions.asInstanceOf[js.Any], AutomaticValue = AutomaticValue.asInstanceOf[js.Any], NamedValueNamespaces = NamedValueNamespaces.asInstanceOf[js.Any], PropertyDef = PropertyDef.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], Validation = Validation.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IPropertyDefAdmin]
  }
}

