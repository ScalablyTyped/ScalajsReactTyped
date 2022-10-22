package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.workflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.0.5: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "workflows.NoEvent")
@js.native
open class NoEvent protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.NoEvent {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object NoEvent {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "workflows.NoEvent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NoEvent instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.NoEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.NoEvent]
  
  /**
    * Creates and returns a new NoEvent instance in the SDK and on the server.
    * The new NoEvent will be automatically stored in the 'onCreatedEvent' property
    * of the parent UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.5 and higher
    */
  /* static member */
  inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.UserTask): typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.NoEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.NoEvent]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "workflows.NoEvent.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "workflows.NoEvent.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
