package typingsJapgolly.mendixmodelsdk.microflowsMod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Range")
@js.native
abstract class Range protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRange: IModel = js.native
  def containerAsDatabaseRetrieveSource(): DatabaseRetrieveSource = js.native
  def containerAsImportMappingCall(): ImportMappingCall = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.Range")
@js.native
object Range extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

