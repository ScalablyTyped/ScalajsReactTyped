package typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows

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

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ConstantRange")
@js.native
open class ConstantRange protected () extends Range {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def singleObject: Boolean = js.native
  def singleObject_=(newValue: Boolean): Unit = js.native
}
object ConstantRange {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ConstantRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ConstantRange = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ConstantRange]
  
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * The new ConstantRange will be automatically stored in the 'range' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  /* static member */
  inline def createInDatabaseRetrieveSourceUnderRange(container: DatabaseRetrieveSource): ConstantRange = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDatabaseRetrieveSourceUnderRange")(container.asInstanceOf[js.Any]).asInstanceOf[ConstantRange]
  
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * The new ConstantRange will be automatically stored in the 'range' property
    * of the parent ImportMappingCall element passed as argument.
    */
  /* static member */
  inline def createInImportMappingCallUnderRange(container: ImportMappingCall): ConstantRange = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportMappingCallUnderRange")(container.asInstanceOf[js.Any]).asInstanceOf[ConstantRange]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ConstantRange.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ConstantRange.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
