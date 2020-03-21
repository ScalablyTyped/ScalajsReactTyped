package typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate")
@js.native
class ClientTemplate protected ()
  extends typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate")
@js.native
object ClientTemplate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent Button element passed as argument.
    */
  def createInButtonUnderCaption(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Button): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent ControlBarButton element passed as argument.
    */
  def createInControlBarButtonUnderCaption(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ControlBarButton): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  def createInCustomWidgetUnderLabelTemplate(container: CustomWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent DataGrid element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInDataGridUnderCaption(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataGrid): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  def createInDynamicImageViewerUnderAlternativeText(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DynamicImageViewer): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'content' property
    * of the parent DynamicText element passed as argument.
    */
  def createInDynamicTextUnderContent(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DynamicText): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent GroupBox element passed as argument.
    */
  def createInGroupBoxUnderCaption(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.GroupBox): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInInputWidgetUnderLabelTemplate(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.InputWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  def createInStaticImageViewerUnderAlternativeText(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.StaticImageViewer): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.WidgetObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 8.0.0
    */
  def createInWidgetObjectUnderLabelTemplate(container: WidgetObject): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'textTemplate' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 and higher
    */
  def createInWidgetValueUnderTextTemplate(container: WidgetValue): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
}

