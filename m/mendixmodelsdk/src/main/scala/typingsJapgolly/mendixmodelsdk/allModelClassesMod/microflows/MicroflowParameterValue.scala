package typingsJapgolly.mendixmodelsdk.allModelClassesMod.microflows

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowParameterValue")
@js.native
class MicroflowParameterValue protected ()
  extends typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterValue {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.MicroflowParameterValue")
@js.native
object MicroflowParameterValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterValue = js.native
  /**
    * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
    * The new MicroflowParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInJavaActionParameterMappingUnderParameterValue(container: typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterValue = js.native
  /**
    * Creates and returns a new MicroflowParameterValue instance in the SDK and on the server.
    * The new MicroflowParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInJavaScriptActionParameterMappingUnderParameterValue(
    container: typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping
  ): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowParameterValue = js.native
}

