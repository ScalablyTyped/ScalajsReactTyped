package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "mappings")
@js.native
object mappings extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Mappings`.
    */
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  abstract class Element protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.mappings.Element {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ElementType ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.mappings.ElementType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
    */
  @js.native
  abstract class MappingDocument protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.mappings.MappingDocument {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  abstract class MappingElement protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.mappings.MappingElement {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MappingMicroflowCall protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.mappings.MappingMicroflowCall {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class MappingMicroflowParameter protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.mappings.MappingMicroflowParameter {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  class ObjectHandlingBackupEnum ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.mappings.ObjectHandlingBackupEnum
  
  @js.native
  class ObjectHandlingEnum ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.mappings.ObjectHandlingEnum
  
  @js.native
  abstract class ObjectMappingElement protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.mappings.ObjectMappingElement {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit,
      container: typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  @js.native
  abstract class ValueMappingElement protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.mappings.ValueMappingElement {
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
  object Element extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ElementType extends js.Object {
    var All: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Array: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Choice: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Inheritance: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var NamedArray: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Object: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Sequence: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Undefined: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Value: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
    var Wrapper: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ElementType = js.native
  }
  
  /* static members */
  @js.native
  object MappingDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowCall extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall = js.native
    /**
      * Creates and returns a new MappingMicroflowCall instance in the SDK and on the server.
      * The new MappingMicroflowCall will be automatically stored in the 'mappingMicroflowCall' property
      * of the parent ObjectMappingElement element passed as argument.
      */
    def createIn(container: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement): typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall = js.native
  }
  
  /* static members */
  @js.native
  object MappingMicroflowParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter = js.native
    /**
      * Creates and returns a new MappingMicroflowParameter instance in the SDK and on the server.
      * The new MappingMicroflowParameter will be automatically stored in the 'parameterMappings' property
      * of the parent MappingMicroflowCall element passed as argument.
      */
    def createIn(container: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowCall): typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.MappingMicroflowParameter = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingBackupEnum extends js.Object {
    var Create: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    var Error: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
    var Ignore: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingBackupEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectHandlingEnum extends js.Object {
    var Create: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    var Custom: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    var Find: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
    var Parameter: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.ObjectHandlingEnum = js.native
  }
  
  /* static members */
  @js.native
  object ObjectMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ValueMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.mappingsMod.StructureVersionInfo = js.native
  }
  
}

