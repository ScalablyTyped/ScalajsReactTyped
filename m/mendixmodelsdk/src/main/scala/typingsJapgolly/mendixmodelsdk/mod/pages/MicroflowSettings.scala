package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/starting-microflows relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "pages.MicroflowSettings")
@js.native
class MicroflowSettings protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.MicroflowSettings {
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
@JSImport("mendixmodelsdk", "pages.MicroflowSettings")
@js.native
object MicroflowSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAssociationWidgetUnderOnChangeMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.AssociationWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAttributeWidgetUnderOnChangeMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.AttributeWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onEnterMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAttributeWidgetUnderOnEnterMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.AttributeWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onLeaveMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAttributeWidgetUnderOnLeaveMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.AttributeWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowClientAction element passed as argument.
    */
  def createInMicroflowClientActionUnderMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowClientAction): typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowSource element passed as argument.
    */
  def createInMicroflowSourceUnderMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSource): typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent OnClickMicroflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  def createInOnClickMicroflowUnderMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.OnClickMicroflow): typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInReferenceSetSelectorUnderOnChangeMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector): typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'dataSourceMicroflowSettings' property
    * of the parent SelectorMicroflowSource element passed as argument.
    */
  def createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.SelectorMicroflowSource): typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings = js.native
}

