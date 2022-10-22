package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.microflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
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
  * In version 9.3.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.ContinueOperation")
@js.native
open class ContinueOperation protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContinueOperation {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ContinueOperation {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.ContinueOperation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ContinueOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContinueOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContinueOperation]
  
  /**
    * Creates and returns a new ContinueOperation instance in the SDK and on the server.
    * The new ContinueOperation will be automatically stored in the 'operation' property
    * of the parent WorkflowOperationAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.3.0 and higher
    */
  /* static member */
  inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.WorkflowOperationAction): typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContinueOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContinueOperation]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.ContinueOperation.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.ContinueOperation.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
