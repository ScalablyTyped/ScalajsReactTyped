package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.webservicesMod.webservices.WsdlDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "xmlschemas")
@js.native
object xmlschemas extends js.Object {
  @js.native
  abstract class MxSchema protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.xmlschemas.MxSchema {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * In version 6.6.0: introduced
    */
  @js.native
  class XmlElement protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlElement {
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
  class XmlPrimitiveType ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlPrimitiveType
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/xml-schemas relevant section in reference guide}
    */
  @js.native
  class XmlSchema protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlSchema {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  class XmlSchemaEntry protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.xmlschemas.XmlSchemaEntry {
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
  object MxSchema extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object XmlElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'children' property
      * of the parent mappings.Element element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInElementUnderChildren(container: typingsJapgolly.mendixmodelsdk.mappingsMod.mappings.Element): typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
    /**
      * Creates and returns a new XmlElement instance in the SDK and on the server.
      * The new XmlElement will be automatically stored in the 'elements' property
      * of the parent jsonstructures.JsonStructure element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.6.0 and higher
      */
    def createInJsonStructureUnderElements(container: JsonStructure): typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlElement = js.native
  }
  
  /* static members */
  @js.native
  object XmlPrimitiveType extends js.Object {
    var AnyType: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Binary: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Boolean: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Date: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var DateTime: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Decimal: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Float: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Integer: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Long: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var String: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Time: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
    var Unknown: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchema extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates a new XmlSchema unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchema = js.native
  }
  
  /* static members */
  @js.native
  object XmlSchemaEntry extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.xmlschemasMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'schemaEntries' property
      * of the parent webservices.WsdlDescription element passed as argument.
      */
    def createInWsdlDescriptionUnderSchemaEntries(container: WsdlDescription): typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
    /**
      * Creates and returns a new XmlSchemaEntry instance in the SDK and on the server.
      * The new XmlSchemaEntry will be automatically stored in the 'entries' property
      * of the parent XmlSchema element passed as argument.
      */
    def createInXmlSchemaUnderEntries(container: typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchema): typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry = js.native
  }
  
}

