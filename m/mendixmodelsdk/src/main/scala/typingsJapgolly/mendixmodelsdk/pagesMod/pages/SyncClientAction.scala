package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItem
import typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.0.2: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncClientAction")
@js.native
class SyncClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSyncClientAction: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SyncClientAction")
@js.native
object SyncClientAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInActionButtonUnderAction(container: ActionButton): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInActionItemUnderAction(container: ActionItem): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInBottomBarItemUnderAction(container: BottomBarItem): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: DivContainer): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInGridActionButtonUnderAction(container: GridActionButton): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInListViewUnderClickAction(container: ListView): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInListViewUnderPullDownAction(container: ListView): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInMenuItemUnderAction(container: MenuItem): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 and higher
    */
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): SyncClientAction = js.native
  /**
    * Creates and returns a new SyncClientAction instance in the SDK and on the server.
    * The new SyncClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): SyncClientAction = js.native
}

