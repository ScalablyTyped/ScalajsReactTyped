package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings")
@js.native
class ConditionalEditabilitySettings protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.ConditionalEditabilitySettings {
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
@JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings")
@js.native
object ConditionalEditabilitySettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = js.native
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent ConditionallyEditableWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.0.0
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConditionallyEditableWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = js.native
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent ConditionallyEditableWidget element passed as argument.
    */
  def createInConditionallyEditableWidgetUnderConditionalEditabilitySettings(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConditionallyEditableWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = js.native
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  def createInCustomWidgetUnderConditionalEditabilitySettings(container: CustomWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = js.native
}

