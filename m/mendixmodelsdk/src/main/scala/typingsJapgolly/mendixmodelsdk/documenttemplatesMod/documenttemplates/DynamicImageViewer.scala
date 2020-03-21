package typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.imagesMod.images.IImage
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/dynamic-image-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DynamicImageViewer")
@js.native
class DynamicImageViewer protected () extends EntityWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDynamicImageViewer: IModel = js.native
  def defaultImage(): js.Any = js.native
  def defaultImage(newValue: IImage): js.Any = js.native
  def defaultImageQualifiedName(): String | Null = js.native
  @JSName("defaultImage")
  def defaultImage_Union(): IImage | Null = js.native
  def height(): Double = js.native
  def height(newValue: Double): js.Any = js.native
  def useThumbnail(): Boolean = js.native
  def useThumbnail(newValue: Boolean): js.Any = js.native
  def width(): Double = js.native
  def width(newValue: Double): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DynamicImageViewer")
@js.native
object DynamicImageViewer extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DynamicImageViewer = js.native
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * The new DynamicImageViewer will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): DynamicImageViewer = js.native
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * The new DynamicImageViewer will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: DropZone): DynamicImageViewer = js.native
}

