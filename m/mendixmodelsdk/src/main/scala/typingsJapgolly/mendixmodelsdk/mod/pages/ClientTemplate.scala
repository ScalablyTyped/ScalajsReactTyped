package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetObject
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.ClientTemplate")
@js.native
open class ClientTemplate protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages.ClientTemplate {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ClientTemplate {
  
  @JSImport("mendixmodelsdk", "pages.ClientTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent Button element passed as argument.
    */
  /* static member */
  inline def createInButtonUnderCaption(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Button): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInButtonUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  inline def createInControlBarButtonUnderCaption(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ControlBarButton): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  /* static member */
  inline def createInCustomWidgetUnderLabelTemplate(container: CustomWidget): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetUnderLabelTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent DataGrid element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  inline def createInDataGridUnderCaption(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DataGrid): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  inline def createInDynamicImageViewerUnderAlternativeText(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DynamicImageViewer): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicImageViewerUnderAlternativeText")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'content' property
    * of the parent DynamicText element passed as argument.
    */
  /* static member */
  inline def createInDynamicTextUnderContent(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DynamicText): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicTextUnderContent")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent GroupBox element passed as argument.
    */
  /* static member */
  inline def createInGroupBoxUnderCaption(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GroupBox): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGroupBoxUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  /* static member */
  inline def createInInputWidgetUnderLabelTemplate(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.InputWidget): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInputWidgetUnderLabelTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'screenReaderLabel' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.12.0 and higher
    */
  /* static member */
  inline def createInInputWidgetUnderScreenReaderLabel(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.InputWidget): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInputWidgetUnderScreenReaderLabel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  inline def createInStaticImageViewerUnderAlternativeText(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.StaticImageViewer): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticImageViewerUnderAlternativeText")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'badge' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  inline def createInTabPageUnderBadge(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TabPage): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderBadge")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.WidgetObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 8.0.0
    */
  /* static member */
  inline def createInWidgetObjectUnderLabelTemplate(container: WidgetObject): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetObjectUnderLabelTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'textTemplate' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderTextTemplate(container: WidgetValue): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderTextTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ClientTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ClientTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
