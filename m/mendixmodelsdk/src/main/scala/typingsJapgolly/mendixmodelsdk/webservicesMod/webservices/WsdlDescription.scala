package typingsJapgolly.mendixmodelsdk.webservicesMod.webservices

import typingsJapgolly.mendixmodelsdk.appservicesMod.appservices.Msd
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.webservicesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlSchemaEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlDescription")
@js.native
class WsdlDescription protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FWsdlDescription: IModel = js.native
  def containerAsImportedWebService(): ImportedWebService = js.native
  def containerAsMsd(): Msd = js.native
  def importsHaveLocations(): Boolean = js.native
  def importsHaveLocations(newValue: Boolean): js.Any = js.native
  def schemaEntries(): IList[XmlSchemaEntry] = js.native
  def services(): IList[ServiceInfo] = js.native
  def targetNamespace(): String = js.native
  def targetNamespace(newValue: String): js.Any = js.native
  def wsdlEntries(): IList[WsdlEntry] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlDescription")
@js.native
object WsdlDescription extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WsdlDescription = js.native
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent ImportedWebService element passed as argument.
    */
  def createInImportedWebServiceUnderWsdlDescription(container: ImportedWebService): WsdlDescription = js.native
  /**
    * Creates and returns a new WsdlDescription instance in the SDK and on the server.
    * The new WsdlDescription will be automatically stored in the 'wsdlDescription' property
    * of the parent appservices.Msd element passed as argument.
    */
  def createInMsdUnderWsdlDescription(container: Msd): WsdlDescription = js.native
}

