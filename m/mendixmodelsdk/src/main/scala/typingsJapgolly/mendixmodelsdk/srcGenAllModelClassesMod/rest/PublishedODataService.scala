package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.rest

import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/published-odata-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.PublishedODataService")
@js.native
open class PublishedODataService protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.PublishedODataService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object PublishedODataService {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.PublishedODataService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PublishedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.PublishedODataService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.PublishedODataService]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.PublishedODataService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.PublishedODataService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
