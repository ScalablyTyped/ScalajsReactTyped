package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/on-click-event relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.MicroflowSettings")
@js.native
open class MicroflowSettings protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object MicroflowSettings {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.MicroflowSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAssociationWidgetUnderOnChangeMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.AssociationWidget): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationWidgetUnderOnChangeMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnChangeMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnChangeMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onEnterMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnEnterMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnEnterMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onLeaveMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInAttributeWidgetUnderOnLeaveMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderOnLeaveMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowClientAction element passed as argument.
    */
  /* static member */
  inline def createInMicroflowClientActionUnderMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowClientAction): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowClientActionUnderMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowSource element passed as argument.
    */
  /* static member */
  inline def createInMicroflowSourceUnderMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSource): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowSourceUnderMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent OnClickMicroflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  /* static member */
  inline def createInOnClickMicroflowUnderMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.OnClickMicroflow): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOnClickMicroflowUnderMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  inline def createInReferenceSetSelectorUnderOnChangeMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderOnChangeMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings]
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'dataSourceMicroflowSettings' property
    * of the parent SelectorMicroflowSource element passed as argument.
    */
  /* static member */
  inline def createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SelectorMicroflowSource): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.MicroflowSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.MicroflowSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
