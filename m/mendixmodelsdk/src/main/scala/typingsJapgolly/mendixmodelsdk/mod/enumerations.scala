package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.ConditionSettings
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "enumerations")
@js.native
object enumerations extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Enumerations`.
    */
  @js.native
  class Condition protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.enumerations.Condition {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumerations relevant section in reference guide}
    */
  @js.native
  class Enumeration protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.enumerations.Enumeration {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/enumeration-values relevant section in reference guide}
    */
  @js.native
  class EnumerationValue protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.enumerations.EnumerationValue {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object Condition extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent documenttemplates.ConditionSettings element passed as argument.
      */
    def createInConditionSettingsUnderConditions(container: ConditionSettings): typingsJapgolly.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
    /**
      * Creates and returns a new Condition instance in the SDK and on the server.
      * The new Condition will be automatically stored in the 'conditions' property
      * of the parent pages.ConditionalSettings element passed as argument.
      */
    def createInConditionalSettingsUnderConditions(container: ConditionalSettings): typingsJapgolly.mendixmodelsdk.enumerationsMod.enumerations.Condition = js.native
  }
  
  /* static members */
  @js.native
  object Enumeration extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Enumeration unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.enumerationsMod.enumerations.Enumeration = js.native
  }
  
  /* static members */
  @js.native
  object EnumerationValue extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.enumerationsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue = js.native
    /**
      * Creates and returns a new EnumerationValue instance in the SDK and on the server.
      * The new EnumerationValue will be automatically stored in the 'values' property
      * of the parent Enumeration element passed as argument.
      */
    def createIn(container: typingsJapgolly.mendixmodelsdk.enumerationsMod.enumerations.Enumeration): typingsJapgolly.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue = js.native
  }
  
}

