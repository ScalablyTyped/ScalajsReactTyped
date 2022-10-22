package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenJsonstructuresMod.jsonstructures.JsonStructure
import typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.Element
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices.WsdlDescription
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlschemas {
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.MxSchema")
  @js.native
  open class MxSchema protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.MxSchema {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MxSchema {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.MxSchema")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.MxSchema.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.MxSchema.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 6.6.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlElement")
  @js.native
  open class XmlElement protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object XmlElement {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlElement]
    
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    /* static member */
    inline def createInElementUnderChildren(container: Element): typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlElement]
    
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    /* static member */
    inline def createInJsonStructureUnderElements(container: JsonStructure): typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlElement]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlElement.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType")
  @js.native
  open class XmlPrimitiveType protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object XmlPrimitiveType {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.AnyType")
    @js.native
    def AnyType: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    inline def AnyType_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnyType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.Binary")
    @js.native
    def Binary: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    inline def Binary_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.Boolean")
    @js.native
    def Boolean: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    inline def Boolean_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.Date")
    @js.native
    def Date: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.DateTime")
    @js.native
    def DateTime: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    inline def DateTime_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
    
    inline def Date_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.Decimal")
    @js.native
    def Decimal: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    inline def Decimal_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.Float")
    @js.native
    def Float: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    inline def Float_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.Integer")
    @js.native
    def Integer: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    inline def Integer_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.Long")
    @js.native
    def Long: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    inline def Long_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.String")
    @js.native
    def String: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    inline def String_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.Time")
    @js.native
    def Time: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    inline def Time_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Time")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlPrimitiveType.Unknown")
    @js.native
    def Unknown: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    inline def Unknown_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/xml-schemas relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlSchema")
  @js.native
  open class XmlSchema protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchema {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object XmlSchema {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlSchema")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new XmlSchema unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchema]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlSchema.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlSchema.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlSchemaEntry")
  @js.native
  open class XmlSchemaEntry protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchemaEntry {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object XmlSchemaEntry {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlSchemaEntry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchemaEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchemaEntry]
    
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
      * of the parent webservices.WsdlDescription element passed as argument.
      */
    /* static member */
    inline def createInWsdlDescriptionUnderSchemaEntries(container: WsdlDescription): typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchemaEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWsdlDescriptionUnderSchemaEntries")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchemaEntry]
    
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'entries' property
      * of the parent XmlSchema element passed as argument.
      */
    /* static member */
    inline def createInXmlSchemaUnderEntries(container: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchema): typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchemaEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("createInXmlSchemaUnderEntries")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchemaEntry]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlSchemaEntry.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "xmlschemas.XmlSchemaEntry.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
