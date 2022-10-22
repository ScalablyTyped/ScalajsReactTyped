package typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SortItemList")
@js.native
open class SortItemList protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsDatabaseRetrieveSource: DatabaseRetrieveSource = js.native
  
  def containerAsSort: Sort = js.native
  
  def items: IList[SortItem] = js.native
}
object SortItemList {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SortItemList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): SortItemList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[SortItemList]
  
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * The new SortItemList will be automatically stored in the 'sortItemList' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  /* static member */
  inline def createInDatabaseRetrieveSourceUnderSortItemList(container: DatabaseRetrieveSource): SortItemList = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDatabaseRetrieveSourceUnderSortItemList")(container.asInstanceOf[js.Any]).asInstanceOf[SortItemList]
  
  /**
    * Creates and returns a new SortItemList instance in the SDK and on the server.
    * The new SortItemList will be automatically stored in the 'sortItemList' property
    * of the parent Sort element passed as argument.
    */
  /* static member */
  inline def createInSortUnderSortItemList(container: Sort): SortItemList = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSortUnderSortItemList")(container.asInstanceOf[js.Any]).asInstanceOf[SortItemList]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SortItemList.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.SortItemList.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
