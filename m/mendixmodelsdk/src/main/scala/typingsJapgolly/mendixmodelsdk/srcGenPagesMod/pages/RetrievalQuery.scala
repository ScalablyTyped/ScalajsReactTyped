package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.IUserRole
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

/**
  * In version 7.12.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.RetrievalQuery")
@js.native
open class RetrievalQuery protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def allowedUserRoles: IList[IUserRole] = js.native
  
  def allowedUserRolesQualifiedNames: js.Array[String] = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def entityPath: String = js.native
  def entityPath_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.21.0: introduced
    */
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 7.14.0: introduced
    */
  def pageName: String = js.native
  def pageName_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.6.0: introduced
    */
  def parameters: IList[RetrievalQueryParameter] = js.native
  
  def queryId: String = js.native
  def queryId_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.4.0: deleted
    */
  def schemaId: String = js.native
  def schemaId_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.4.0: introduced
    */
  def usedAssociations: IList[String] = js.native
  
  /**
    * In version 8.11.0: introduced
    */
  def usedAttributes: IList[String] = js.native
  
  /**
    * In version 8.4.0: introduced
    */
  def widgetName: String = js.native
  def widgetName_=(newValue: String): Unit = js.native
  
  def xPath: String = js.native
  def xPath_=(newValue: String): Unit = js.native
}
object RetrievalQuery {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RetrievalQuery")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RetrievalQuery instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): RetrievalQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[RetrievalQuery]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RetrievalQuery.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RetrievalQuery.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
