package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenJsonstructuresMod.jsonstructures.JsonStructure
import typingsJapgolly.mendixmodelsdk.srcGenMappingsMod.mappings.Element
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices.WsdlDescription
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenXmlschemasMod {
  
  @JSImport("mendixmodelsdk/src/gen/xmlschemas", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object xmlschemas {
    
    /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.IMxSchema because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.MxSchema")
    @js.native
    open class MxSchema protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MMxSchema: FolderBase = js.native
    }
    object MxSchema {
      
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.MxSchema")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.MxSchema.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.MxSchema.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 6.6.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlElement")
    @js.native
    open class XmlElement protected () extends Element {
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
      
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new XmlElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): XmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[XmlElement]
      
      /**
        * Creates and returns a new XmlElement instance in the SDK and on the server.
        * The new XmlElement will be automatically stored in the 'children' property
        * of the parent mappings.Element element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      /* static member */
      inline def createInElementUnderChildren(container: Element): XmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[XmlElement]
      
      /**
        * Creates and returns a new XmlElement instance in the SDK and on the server.
        * The new XmlElement will be automatically stored in the 'elements' property
        * of the parent jsonstructures.JsonStructure element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.6.0 and higher
        */
      /* static member */
      inline def createInJsonStructureUnderElements(container: JsonStructure): XmlElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInJsonStructureUnderElements")(container.asInstanceOf[js.Any]).asInstanceOf[XmlElement]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType")
    @js.native
    open class XmlPrimitiveType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object XmlPrimitiveType {
      
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.AnyType")
      @js.native
      def AnyType: XmlPrimitiveType = js.native
      inline def AnyType_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnyType")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Binary")
      @js.native
      def Binary: XmlPrimitiveType = js.native
      inline def Binary_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Binary")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Boolean")
      @js.native
      def Boolean: XmlPrimitiveType = js.native
      inline def Boolean_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Date")
      @js.native
      def Date: XmlPrimitiveType = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.DateTime")
      @js.native
      def DateTime: XmlPrimitiveType = js.native
      inline def DateTime_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DateTime")(x.asInstanceOf[js.Any])
      
      inline def Date_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Date")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Decimal")
      @js.native
      def Decimal: XmlPrimitiveType = js.native
      inline def Decimal_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Decimal")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Float")
      @js.native
      def Float: XmlPrimitiveType = js.native
      inline def Float_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Float")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Integer")
      @js.native
      def Integer: XmlPrimitiveType = js.native
      inline def Integer_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Long")
      @js.native
      def Long: XmlPrimitiveType = js.native
      inline def Long_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.String")
      @js.native
      def String: XmlPrimitiveType = js.native
      inline def String_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Time")
      @js.native
      def Time: XmlPrimitiveType = js.native
      inline def Time_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Time")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlPrimitiveType.Unknown")
      @js.native
      def Unknown: XmlPrimitiveType = js.native
      inline def Unknown_=(x: XmlPrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/xml-schemas relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.IMxSchema because Already inherited
    - typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.IXmlSchema because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlSchema")
    @js.native
    open class XmlSchema protected () extends MxSchema {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MXmlSchema: FolderBase = js.native
      
      def entries: IList[XmlSchemaEntry] = js.native
      
      def filePath: String = js.native
      def filePath_=(newValue: String): Unit = js.native
    }
    object XmlSchema {
      
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlSchema")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new XmlSchema unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): XmlSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[XmlSchema]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlSchema.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlSchema.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlSchemaEntry")
    @js.native
    open class XmlSchemaEntry protected ()
      extends typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsWsdlDescription: WsdlDescription = js.native
      
      def containerAsXmlSchema: XmlSchema = js.native
      
      def contents: String = js.native
      def contents_=(newValue: String): Unit = js.native
      
      def localizedContentsFormat: String = js.native
      def localizedContentsFormat_=(newValue: String): Unit = js.native
      
      def localizedLocationFormat: String = js.native
      def localizedLocationFormat_=(newValue: String): Unit = js.native
      
      def location: String = js.native
      def location_=(newValue: String): Unit = js.native
      
      def targetNamespace: String = js.native
      def targetNamespace_=(newValue: String): Unit = js.native
    }
    object XmlSchemaEntry {
      
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlSchemaEntry")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): XmlSchemaEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[XmlSchemaEntry]
      
      /**
        * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
        * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
        * of the parent webservices.WsdlDescription element passed as argument.
        */
      /* static member */
      inline def createInWsdlDescriptionUnderSchemaEntries(container: WsdlDescription): XmlSchemaEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWsdlDescriptionUnderSchemaEntries")(container.asInstanceOf[js.Any]).asInstanceOf[XmlSchemaEntry]
      
      /**
        * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
        * The new XmlSchemaEntry will be automatically stored in the 'entries' property
        * of the parent XmlSchema element passed as argument.
        */
      /* static member */
      inline def createInXmlSchemaUnderEntries(container: XmlSchema): XmlSchemaEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("createInXmlSchemaUnderEntries")(container.asInstanceOf[js.Any]).asInstanceOf[XmlSchemaEntry]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlSchemaEntry.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/xmlschemas", "xmlschemas.XmlSchemaEntry.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `XmlSchemas`.
      */
    @js.native
    trait IMxSchema
      extends StObject
         with IDocument
    
    /**
      * See: {@link https://docs.mendix.com/refguide/xml-schemas relevant section in reference guide}
      */
    @js.native
    trait IXmlSchema
      extends StObject
         with IMxSchema
  }
}
