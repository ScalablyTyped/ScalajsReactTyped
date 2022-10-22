package typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenJavaactionsMod.javaactions.IJavaAction
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenQueuesMod.queues.IQueue
import typingsJapgolly.mendixmodelsdk.srcGenQueuesMod.queues.QueueSettings
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/java-action-call relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaActionCallAction")
@js.native
open class JavaActionCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def javaAction: IJavaAction | Null = js.native
  
  def javaActionQualifiedName: String | Null = js.native
  
  def javaAction_=(newValue: IJavaAction | Null): Unit = js.native
  
  def outputVariableName: String = js.native
  def outputVariableName_=(newValue: String): Unit = js.native
  
  def parameterMappings: IList[JavaActionParameterMapping] = js.native
  
  /**
    * In version 9.10.0: deleted
    * In version 9.0.5: introduced
    */
  def queue: IQueue | Null = js.native
  
  def queueQualifiedName: String | Null = js.native
  
  /**
    * In version 9.10.0: introduced
    */
  def queueSettings: QueueSettings | Null = js.native
  def queueSettings_=(newValue: QueueSettings | Null): Unit = js.native
  
  def queue_=(newValue: IQueue | Null): Unit = js.native
  
  /**
    * In version 7.13.0: introduced
    */
  def useReturnVariable: Boolean = js.native
  def useReturnVariable_=(newValue: Boolean): Unit = js.native
}
object JavaActionCallAction {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaActionCallAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new JavaActionCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): JavaActionCallAction = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[JavaActionCallAction]
  
  /**
    * Creates and returns a new JavaActionCallAction instance in the SDK and on the server.
    * The new JavaActionCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  /* static member */
  inline def createIn(container: ActionActivity): JavaActionCallAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[JavaActionCallAction]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaActionCallAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.JavaActionCallAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
