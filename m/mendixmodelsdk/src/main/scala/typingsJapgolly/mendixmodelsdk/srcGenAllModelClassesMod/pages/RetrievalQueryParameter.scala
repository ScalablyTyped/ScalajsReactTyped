package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.RetrievalQueryParameter")
@js.native
open class RetrievalQueryParameter protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQueryParameter {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object RetrievalQueryParameter {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.RetrievalQueryParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RetrievalQueryParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQueryParameter]
  
  /**
    * Creates and returns a new RetrievalQueryParameter instance in the SDK and on the server.
    * The new RetrievalQueryParameter will be automatically stored in the 'parameters' property
    * of the parent RetrievalQuery element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 to 9.16.0
    */
  /* static member */
  inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQuery): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQueryParameter]
  
  /**
    * Creates and returns a new RetrievalQueryParameter instance in the SDK and on the server.
    * The new RetrievalQueryParameter will be automatically stored in the 'parameters' property
    * of the parent RetrievalQuery element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  inline def createInRetrievalQueryUnderParameters(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQuery): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRetrievalQueryUnderParameters")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQueryParameter]
  
  /**
    * Creates and returns a new RetrievalQueryParameter instance in the SDK and on the server.
    * The new RetrievalQueryParameter will be automatically stored in the 'parameters' property
    * of the parent RuntimeOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.17.0 and higher
    */
  /* static member */
  inline def createInRuntimeOperationUnderParameters(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RuntimeOperation): typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQueryParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRuntimeOperationUnderParameters")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RetrievalQueryParameter]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.RetrievalQueryParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "pages.RetrievalQueryParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
