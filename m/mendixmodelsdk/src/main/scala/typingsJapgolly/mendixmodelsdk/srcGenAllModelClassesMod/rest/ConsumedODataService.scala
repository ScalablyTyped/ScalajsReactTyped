package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.rest

import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/consumed-odata-service-properties relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.18.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.ConsumedODataService")
@js.native
open class ConsumedODataService protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.ConsumedODataService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object ConsumedODataService {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.ConsumedODataService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsumedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.ConsumedODataService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.ConsumedODataService]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.ConsumedODataService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.ConsumedODataService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
