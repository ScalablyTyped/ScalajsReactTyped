package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "regularexpressions")
@js.native
object regularexpressions extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/regular-expressions relevant section in reference guide}
    */
  @js.native
  class RegularExpression protected ()
    extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.regularexpressions.RegularExpression {
    def this(
      model: typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /* static members */
  @js.native
  object RegularExpression extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.regularexpressionsMod.StructureVersionInfo = js.native
    /**
      * Creates a new RegularExpression unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typingsJapgolly.mendixmodelsdk.regularexpressionsMod.regularexpressions.RegularExpression = js.native
  }
  
}

