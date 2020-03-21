package typingsJapgolly.mendixmodelsdk.securityMod.security

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.securityMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Security`.
  */
@JSImport("mendixmodelsdk/dist/gen/security", "security.AccessRuleContainerBase")
@js.native
abstract class AccessRuleContainerBase protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FAccessRuleContainerBase: IModel = js.native
  def accessRules(): IList[AccessRule] = js.native
  def containerAsProjectSecurity(): ProjectSecurity = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/security", "security.AccessRuleContainerBase")
@js.native
object AccessRuleContainerBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

