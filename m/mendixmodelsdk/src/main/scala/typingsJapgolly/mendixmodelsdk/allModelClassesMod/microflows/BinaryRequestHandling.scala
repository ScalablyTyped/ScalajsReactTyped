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
  * In version 6.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.BinaryRequestHandling")
@js.native
class BinaryRequestHandling protected ()
  extends typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.BinaryRequestHandling {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.BinaryRequestHandling")
@js.native
object BinaryRequestHandling extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.BinaryRequestHandling = js.native
  /**
    * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
    * The new BinaryRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 and higher
    */
  def createInRestCallActionUnderRequestHandling(container: typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.RestCallAction): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.BinaryRequestHandling = js.native
  /**
    * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
    * The new BinaryRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 and higher
    */
  def createInWebServiceCallActionUnderRequestBodyHandling(container: typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.BinaryRequestHandling = js.native
  /**
    * Creates and returns a new BinaryRequestHandling instance in the SDK and on the server.
    * The new BinaryRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.9.0 and higher
    */
  def createInWebServiceCallActionUnderRequestHeaderHandling(container: typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction): typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.BinaryRequestHandling = js.native
}

