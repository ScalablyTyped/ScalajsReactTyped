package typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConfirmationInfo")
@js.native
class ConfirmationInfo protected ()
  extends typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConfirmationInfo {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ConfirmationInfo")
@js.native
object ConfirmationInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConfirmationInfo = js.native
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.7.0
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConfirmationInfo = js.native
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent CallNanoflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  def createInCallNanoflowClientActionUnderConfirmationInfo(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.CallNanoflowClientAction): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConfirmationInfo = js.native
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    */
  def createInMicroflowSettingsUnderConfirmationInfo(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConfirmationInfo = js.native
}

