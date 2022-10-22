package typingsJapgolly.mendixmodelsdk.mod.workflows

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
  * In version 9.12.0: added public
  * In version 9.11.0: introduced
  */
@JSImport("mendixmodelsdk", "workflows.PageReference")
@js.native
open class PageReference protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.workflows.PageReference {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object PageReference {
  
  @JSImport("mendixmodelsdk", "workflows.PageReference")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageReference instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference]
  
  /**
    * Creates and returns a new PageReference instance in the SDK and on the server.
    * The new PageReference will be automatically stored in the 'taskPage' property
    * of the parent UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.11.0 and higher
    */
  /* static member */
  inline def createInUserTaskUnderTaskPage(container: typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.UserTask): typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUserTaskUnderTaskPage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference]
  
  /**
    * Creates and returns a new PageReference instance in the SDK and on the server.
    * The new PageReference will be automatically stored in the 'adminPage' property
    * of the parent Workflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.11.0 and higher
    */
  /* static member */
  inline def createInWorkflowUnderAdminPage(container: typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.Workflow): typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderAdminPage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.PageReference]
  
  /* static member */
  @JSImport("mendixmodelsdk", "workflows.PageReference.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "workflows.PageReference.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
