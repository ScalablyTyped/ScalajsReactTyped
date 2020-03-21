package typingsJapgolly.mendixmodelsdk.mod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/annotation-flow relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "microflows.AnnotationFlow")
@js.native
class AnnotationFlow protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.microflows.AnnotationFlow {
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
@JSImport("mendixmodelsdk", "microflows.AnnotationFlow")
@js.native
object AnnotationFlow extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AnnotationFlow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.AnnotationFlow = js.native
  /**
    * Creates and returns a new AnnotationFlow instance in the SDK and on the server.
    * The new AnnotationFlow will be automatically stored in the 'flows' property
    * of the parent MicroflowBase element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowBase): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.AnnotationFlow = js.native
}

