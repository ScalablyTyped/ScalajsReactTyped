package typingsJapgolly.mendixmodelsdk.mod.rest

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk", "rest.ODataAttribute")
@js.native
class ODataAttribute protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.rest.ODataAttribute {
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
@JSImport("mendixmodelsdk", "rest.ODataAttribute")
@js.native
object ODataAttribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.restMod.rest.ODataAttribute = js.native
  /**
    * Creates and returns a new ODataAttribute instance in the SDK and on the server.
    * The new ODataAttribute will be automatically stored in the 'attributes' property
    * of the parent ODataEntity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.restMod.rest.ODataEntity): typingsJapgolly.mendixmodelsdk.restMod.rest.ODataAttribute = js.native
}

