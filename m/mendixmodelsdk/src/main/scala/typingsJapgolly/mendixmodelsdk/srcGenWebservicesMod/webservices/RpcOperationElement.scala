package typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.StructureVersionInfo
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

@JSImport("mendixmodelsdk/src/gen/webservices", "webservices.RpcOperationElement")
@js.native
open class RpcOperationElement protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsOperationInfo: OperationInfo = js.native
  
  def messagePartElements: IList[RpcMessagePartElement] = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
}
object RpcOperationElement {
  
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.RpcOperationElement")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[RpcOperationElement]
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  inline def createInOperationInfoUnderRequestBodyRpcElement(container: OperationInfo): RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderRequestBodyRpcElement")(container.asInstanceOf[js.Any]).asInstanceOf[RpcOperationElement]
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestHeaderRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  inline def createInOperationInfoUnderRequestHeaderRpcElement(container: OperationInfo): RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderRequestHeaderRpcElement")(container.asInstanceOf[js.Any]).asInstanceOf[RpcOperationElement]
  
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'responseBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  /* static member */
  inline def createInOperationInfoUnderResponseBodyRpcElement(container: OperationInfo): RpcOperationElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOperationInfoUnderResponseBodyRpcElement")(container.asInstanceOf[js.Any]).asInstanceOf[RpcOperationElement]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.RpcOperationElement.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.RpcOperationElement.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
