package typingsJapgolly.mendixmodelsdk.mod.customwidgets

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "customwidgets.WidgetValueType")
@js.native
class WidgetValueType protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.customwidgets.WidgetValueType {
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
@JSImport("mendixmodelsdk", "customwidgets.WidgetValueType")
@js.native
object WidgetValueType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetValueType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType = js.native
  /**
    * Creates and returns a new WidgetValueType instance in the SDK and on the server.
    * The new WidgetValueType will be automatically stored in the 'valueType' property
    * of the parent WidgetPropertyType element passed as argument.
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetPropertyType): typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValueType = js.native
}

