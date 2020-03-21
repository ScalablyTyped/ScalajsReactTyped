package typingsJapgolly.mendixmodelsdk.mod.domainmodels

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.securityMod.security.AccessRuleContainerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `DomainModels`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/access-rules relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "domainmodels.AccessRule")
@js.native
class AccessRule protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.domainmodels.AccessRule {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "domainmodels.AccessRule")
@js.native
object AccessRule extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule = js.native
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * The new AccessRule will be automatically stored in the 'accessRules' property
    * of the parent security.AccessRuleContainerBase element passed as argument.
    */
  def createInAccessRuleContainerBaseUnderAccessRules(container: AccessRuleContainerBase): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule = js.native
  /**
    * Creates and returns a new AccessRule instance in the SDK and on the server.
    * The new AccessRule will be automatically stored in the 'accessRules' property
    * of the parent Entity element passed as argument.
    */
  def createInEntityUnderAccessRules(container: typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.Entity): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AccessRule = js.native
}

