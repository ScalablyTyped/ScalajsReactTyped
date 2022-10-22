package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text
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

/**
  * See: {@link https://docs.mendix.com/refguide/on-click-event relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.MicroflowSettings")
@js.native
open class MicroflowSettings protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def asynchronous: Boolean = js.native
  def asynchronous_=(newValue: Boolean): Unit = js.native
  
  def confirmationInfo: ConfirmationInfo | Null = js.native
  def confirmationInfo_=(newValue: ConfirmationInfo | Null): Unit = js.native
  
  def containerAsAssociationWidget: AssociationWidget = js.native
  
  def containerAsAttributeWidget: AttributeWidget = js.native
  
  def containerAsMicroflowClientAction: MicroflowClientAction = js.native
  
  def containerAsMicroflowSource: MicroflowSource = js.native
  
  def containerAsOnClickMicroflow: OnClickMicroflow = js.native
  
  def containerAsReferenceSetSelector: ReferenceSetSelector = js.native
  
  def containerAsSelectorMicroflowSource: SelectorMicroflowSource = js.native
  
  def formValidations: FormValidations = js.native
  def formValidations_=(newValue: FormValidations): Unit = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 7.19.0: introduced
    */
  def parameterMappings: IList[MicroflowParameterMapping] = js.native
  
  def progressBar: ProgressBarType = js.native
  def progressBar_=(newValue: ProgressBarType): Unit = js.native
  
  def progressMessage: Text | Null = js.native
  def progressMessage_=(newValue: Text | Null): Unit = js.native
  
  /**
    * In version 7.19.0: deleted
    */
  def useAllPages: Boolean = js.native
  def useAllPages_=(newValue: Boolean): Unit = js.native
}
object MicroflowSettings {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.MicroflowSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAssociationWidgetUnderOnChangeMicroflowSettings(container: AssociationWidget): MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnChangeMicroflowSettings(container: AttributeWidget): MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onEnterMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnEnterMicroflowSettings(container: AttributeWidget): MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onLeaveMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnLeaveMicroflowSettings(container: AttributeWidget): MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowClientAction element passed as argument.
    */
  /* static member */
  inline def createInMicroflowClientActionUnderMicroflowSettings(container: MicroflowClientAction): MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowClientActionUnderMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowSource element passed as argument.
    */
  /* static member */
  inline def createInMicroflowSourceUnderMicroflowSettings(container: MicroflowSource): MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowSourceUnderMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent OnClickMicroflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  /* static member */
  inline def createInOnClickMicroflowUnderMicroflowSettings(container: OnClickMicroflow): MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOnClickMicroflowUnderMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInReferenceSetSelectorUnderOnChangeMicroflowSettings(container: ReferenceSetSelector): MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'dataSourceMicroflowSettings' property
    * of the parent SelectorMicroflowSource element passed as argument.
    */
  /* static member */
  inline def createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings(container: SelectorMicroflowSource): MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[MicroflowSettings]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.MicroflowSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.MicroflowSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
