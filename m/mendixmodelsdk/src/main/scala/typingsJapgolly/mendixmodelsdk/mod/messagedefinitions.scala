package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenJsonstructuresMod.jsonstructures.JsonStructure
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagedefinitions {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `MessageDefinitions`.
    */
  /**
    * In version 7.10.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement")
  @js.native
  open class AssociationElement protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.messagedefinitions.AssociationElement {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AssociationElement {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AssociationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AssociationElement]
    
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.Element): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AssociationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AssociationElement]
    
    /**
      * Creates and returns a new AssociationElement instance in the SDK and on the server.
      * The new AssociationElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.10.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AssociationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AssociationElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AssociationElement.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement")
  @js.native
  open class AttributeElement protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.messagedefinitions.AttributeElement {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object AttributeElement {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AttributeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AttributeElement]
    
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.Element): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AttributeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AttributeElement]
    
    /**
      * Creates and returns a new AttributeElement instance in the SDK and on the server.
      * The new AttributeElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AttributeElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.AttributeElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.AttributeElement.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement")
  @js.native
  open class EntityElement protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.messagedefinitions.EntityElement {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EntityElement {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.EntityElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.EntityElement]
    
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.Element): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.EntityElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.EntityElement]
    
    /**
      * Creates and returns a new EntityElement instance in the SDK and on the server.
      * The new EntityElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.EntityElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.EntityElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityElement.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition")
  @js.native
  open class EntityMessageDefinition protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.messagedefinitions.EntityMessageDefinition {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EntityMessageDefinition {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.EntityMessageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.EntityMessageDefinition]
    
    /**
      * Creates and returns a new EntityMessageDefinition instance in the SDK and on the server.
      * The new EntityMessageDefinition will be automatically stored in the 'messageDefinitions' property
      * of the parent MessageDefinitionCollection element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createIn(
      container: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.MessageDefinitionCollection
    ): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.EntityMessageDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.EntityMessageDefinition]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.EntityMessageDefinition.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation")
  @js.native
  open class ExposedAssociation protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.messagedefinitions.ExposedAssociation {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedAssociation {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAssociation]
    
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.Element): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAssociation]
    
    /**
      * Creates and returns a new ExposedAssociation instance in the SDK and on the server.
      * The new ExposedAssociation will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAssociation = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAssociation]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAssociation.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute")
  @js.native
  open class ExposedAttribute protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.messagedefinitions.ExposedAttribute {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedAttribute {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAttribute]
    
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.Element): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAttribute]
    
    /**
      * Creates and returns a new ExposedAttribute instance in the SDK and on the server.
      * The new ExposedAttribute will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedAttribute]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedAttribute.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity")
  @js.native
  open class ExposedEntity protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.messagedefinitions.ExposedEntity {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedEntity {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedEntity]
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.Element): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedEntity]
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'exposedEntity' property
      * of the parent EntityMessageDefinition element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInEntityMessageDefinitionUnderExposedEntity(
      container: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.EntityMessageDefinition
    ): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityMessageDefinitionUnderExposedEntity")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedEntity]
    
    /**
      * Creates and returns a new ExposedEntity instance in the SDK and on the server.
      * The new ExposedEntity will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.ExposedEntity]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntity.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase")
  @js.native
  open class ExposedEntityBase protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.messagedefinitions.ExposedEntityBase {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedEntityBase {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedEntityBase.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember")
  @js.native
  open class ExposedMember protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.messagedefinitions.ExposedMember {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExposedMember {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.ExposedMember.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.6.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition")
  @js.native
  open class MessageDefinition protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.messagedefinitions.MessageDefinition {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MessageDefinition {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinition.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
    *
    * In version 7.6.0: introduced
    */
  @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection")
  @js.native
  open class MessageDefinitionCollection protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.messagedefinitions.MessageDefinitionCollection {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MessageDefinitionCollection {
    
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new MessageDefinitionCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.MessageDefinitionCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.messagedefinitions.MessageDefinitionCollection]
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "messagedefinitions.MessageDefinitionCollection.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenMessagedefinitionsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
