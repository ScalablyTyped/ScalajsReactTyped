package typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages

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

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PageClientAction")
@js.native
class PageClientAction protected ()
  extends typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.PageClientAction")
@js.native
object PageClientAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    */
  def createInActionButtonUnderAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ActionButton): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    */
  def createInActionItemUnderAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ActionItem): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.AssociationWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.AttributeWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.AttributeWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.AttributeWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInBottomBarItemUnderAction(container: BottomBarItem): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent DataViewActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.6.0
    */
  def createInDataViewActionButtonUnderAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataViewActionButton): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DivContainer): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.DynamicImageViewer): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    */
  def createInGridActionButtonUnderAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridActionButton): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    */
  def createInListViewUnderClickAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListView): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInListViewUnderPullDownAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListView): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    */
  def createInMenuItemUnderAction(container: MenuItem): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    */
  def createInStaticImageViewerUnderClickAction(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.StaticImageViewer): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageClientAction = js.native
}

