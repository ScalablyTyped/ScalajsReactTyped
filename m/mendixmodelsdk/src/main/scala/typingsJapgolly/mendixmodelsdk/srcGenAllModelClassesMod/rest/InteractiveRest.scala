package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.rest

import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typingsJapgolly.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/interactive-rest relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 9.17.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.InteractiveRest")
@js.native
open class InteractiveRest protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.InteractiveRest {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object InteractiveRest {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.InteractiveRest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new InteractiveRest unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.InteractiveRest = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.InteractiveRest]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.InteractiveRest.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "rest.InteractiveRest.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
