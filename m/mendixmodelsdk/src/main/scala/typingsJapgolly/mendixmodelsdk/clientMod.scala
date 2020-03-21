package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.internalMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typingsJapgolly.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/client", JSImport.Namespace)
@js.native
object clientMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typingsJapgolly.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object client extends js.Object {
    @js.native
    class SupportedPlatform () extends AbstractEnum
    
    /* static members */
    @js.native
    object SupportedPlatform extends js.Object {
      var All: SupportedPlatform = js.native
      var Native: SupportedPlatform = js.native
      var Web: SupportedPlatform = js.native
    }
    
  }
  
}

