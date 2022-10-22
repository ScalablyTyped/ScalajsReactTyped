package typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices

import typingsJapgolly.mendixmodelsdk.srcGenAppservicesMod.appservices.Msd
import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenXmlschemasMod.xmlschemas.XmlSchemaEntry
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/webservices", "webservices.WsdlDescription")
@js.native
open class WsdlDescription protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsImportedWebService: ImportedWebService = js.native
  
  def containerAsMsd: Msd = js.native
  
  def importsHaveLocations: Boolean = js.native
  def importsHaveLocations_=(newValue: Boolean): Unit = js.native
  
  def schemaEntries: IList[XmlSchemaEntry] = js.native
  
  def services: IList[ServiceInfo] = js.native
  
  def targetNamespace: String = js.native
  def targetNamespace_=(newValue: String): Unit = js.native
  
  def wsdlEntries: IList[WsdlEntry] = js.native
}
object WsdlDescription {
  
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.WsdlDescription")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): WsdlDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WsdlDescription]
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent ImportedWebService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createIn(container: ImportedWebService): WsdlDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WsdlDescription]
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent ImportedWebService element passed as argument.
    */
  /* static member */
  inline def createInImportedWebServiceUnderWsdlDescription(container: ImportedWebService): WsdlDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportedWebServiceUnderWsdlDescription")(container.asInstanceOf[js.Any]).asInstanceOf[WsdlDescription]
  
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent appservices.Msd element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 9.0.1
    */
  /* static member */
  inline def createInMsdUnderWsdlDescription(container: Msd): WsdlDescription = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMsdUnderWsdlDescription")(container.asInstanceOf[js.Any]).asInstanceOf[WsdlDescription]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.WsdlDescription.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.WsdlDescription.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
