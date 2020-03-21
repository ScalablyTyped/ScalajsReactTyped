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

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandling")
@js.native
abstract class RequestHandling protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRequestHandling: IModel = js.native
  def containerAsExportXmlAction(): ExportXmlAction = js.native
  def containerAsRestCallAction(): RestCallAction = js.native
  def containerAsWebServiceCallAction(): WebServiceCallAction = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RequestHandling")
@js.native
object RequestHandling extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

