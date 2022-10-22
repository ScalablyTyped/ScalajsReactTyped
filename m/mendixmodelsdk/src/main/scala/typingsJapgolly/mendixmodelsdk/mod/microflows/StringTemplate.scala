package typingsJapgolly.mendixmodelsdk.mod.microflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.UserTask
import typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.Workflow
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.StringTemplate")
@js.native
open class StringTemplate protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.microflows.StringTemplate {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object StringTemplate {
  
  @JSImport("mendixmodelsdk", "microflows.StringTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'reason' property
    * of the parent AbortOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.2.0 and higher
    */
  /* static member */
  inline def createInAbortOperationUnderReason(container: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.AbortOperation): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAbortOperationUnderReason")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent CustomRequestHandling element passed as argument.
    */
  /* static member */
  inline def createInCustomRequestHandlingUnderTemplate(container: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.CustomRequestHandling): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomRequestHandlingUnderTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'customLocationTemplate' property
    * of the parent HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  inline def createInHttpConfigurationUnderCustomLocationTemplate(container: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderCustomLocationTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'messageTemplate' property
    * of the parent LogMessageAction element passed as argument.
    */
  /* static member */
  inline def createInLogMessageActionUnderMessageTemplate(container: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.LogMessageAction): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLogMessageActionUnderMessageTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'template' property
    * of the parent StringTemplateParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 to 8.5.0
    */
  /* static member */
  inline def createInStringTemplateParameterValueUnderTemplate(
    container: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplateParameterValue
  ): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStringTemplateParameterValueUnderTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'taskDescription' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInUserTaskUnderTaskDescription(container: UserTask): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUserTaskUnderTaskDescription")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'taskName' property
    * of the parent workflows.UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInUserTaskUnderTaskName(container: UserTask): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUserTaskUnderTaskName")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'workflowDescription' property
    * of the parent workflows.Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInWorkflowUnderWorkflowDescription(container: Workflow): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderWorkflowDescription")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate]
  
  /**
    * Creates and returns a new StringTemplate instance in the SDK and on the server.
    * The new StringTemplate will be automatically stored in the 'workflowName' property
    * of the parent workflows.Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.2 and higher
    */
  /* static member */
  inline def createInWorkflowUnderWorkflowName(container: Workflow): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderWorkflowName")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.StringTemplate]
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.StringTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
