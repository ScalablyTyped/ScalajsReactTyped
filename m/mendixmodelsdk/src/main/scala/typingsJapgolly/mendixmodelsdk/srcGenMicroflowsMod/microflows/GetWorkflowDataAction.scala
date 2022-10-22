package typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.IWorkflow
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.12.0: removed experimental
  * In version 9.10.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.GetWorkflowDataAction")
@js.native
open class GetWorkflowDataAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def outputVariableName: String = js.native
  def outputVariableName_=(newValue: String): Unit = js.native
  
  def workflow: IWorkflow | Null = js.native
  
  def workflowQualifiedName: String | Null = js.native
  
  def workflowVariable: String = js.native
  def workflowVariable_=(newValue: String): Unit = js.native
  
  def workflow_=(newValue: IWorkflow | Null): Unit = js.native
}
object GetWorkflowDataAction {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.GetWorkflowDataAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GetWorkflowDataAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): GetWorkflowDataAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[GetWorkflowDataAction]
  
  /**
    * Creates and returns a new GetWorkflowDataAction instance in the SDK and on the server.
    * The new GetWorkflowDataAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.10.0 and higher
    */
  /* static member */
  inline def createIn(container: ActionActivity): GetWorkflowDataAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[GetWorkflowDataAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.GetWorkflowDataAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.GetWorkflowDataAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
