package typingsJapgolly.mendixmodelsdk.mod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.DocumentTemplateParameterMapping")
@js.native
class DocumentTemplateParameterMapping protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.microflows.DocumentTemplateParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "microflows.DocumentTemplateParameterMapping")
@js.native
object DocumentTemplateParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DocumentTemplateParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.DocumentTemplateParameterMapping = js.native
  /**
    * Creates and returns a new DocumentTemplateParameterMapping instance in the SDK and on the server.
    * The new DocumentTemplateParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent GenerateDocumentAction element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.GenerateDocumentAction): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.DocumentTemplateParameterMapping = js.native
}

