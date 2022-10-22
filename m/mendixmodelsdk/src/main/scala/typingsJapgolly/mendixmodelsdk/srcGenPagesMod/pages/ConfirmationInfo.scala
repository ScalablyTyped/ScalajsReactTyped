package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.ConfirmationInfo")
@js.native
open class ConfirmationInfo protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def cancelButtonCaption: Text = js.native
  def cancelButtonCaption_=(newValue: Text): Unit = js.native
  
  def containerAsCallNanoflowClientAction: CallNanoflowClientAction = js.native
  
  def containerAsCallWorkflowClientAction: CallWorkflowClientAction = js.native
  
  def containerAsMicroflowSettings: MicroflowSettings = js.native
  
  def proceedButtonCaption: Text = js.native
  def proceedButtonCaption_=(newValue: Text): Unit = js.native
  
  def question: Text = js.native
  def question_=(newValue: Text): Unit = js.native
}
object ConfirmationInfo {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ConfirmationInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ConfirmationInfo]
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.7.0
    */
  /* static member */
  inline def createIn(container: MicroflowSettings): ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ConfirmationInfo]
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent CallNanoflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  /* static member */
  inline def createInCallNanoflowClientActionUnderConfirmationInfo(container: CallNanoflowClientAction): ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCallNanoflowClientActionUnderConfirmationInfo")(container.asInstanceOf[js.Any]).asInstanceOf[ConfirmationInfo]
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent CallWorkflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.12.0 and higher
    */
  /* static member */
  inline def createInCallWorkflowClientActionUnderConfirmationInfo(container: CallWorkflowClientAction): ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCallWorkflowClientActionUnderConfirmationInfo")(container.asInstanceOf[js.Any]).asInstanceOf[ConfirmationInfo]
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    */
  /* static member */
  inline def createInMicroflowSettingsUnderConfirmationInfo(container: MicroflowSettings): ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowSettingsUnderConfirmationInfo")(container.asInstanceOf[js.Any]).asInstanceOf[ConfirmationInfo]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ConfirmationInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ConfirmationInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
