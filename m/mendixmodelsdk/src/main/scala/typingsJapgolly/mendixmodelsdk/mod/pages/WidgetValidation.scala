package typingsJapgolly.mendixmodelsdk.mod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.WidgetValidation")
@js.native
class WidgetValidation protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.WidgetValidation {
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
@JSImport("mendixmodelsdk", "pages.WidgetValidation")
@js.native
object WidgetValidation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.WidgetValidation = js.native
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * The new WidgetValidation will be automatically stored in the 'validation' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInAttributeWidgetUnderValidation(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.AttributeWidget): typingsJapgolly.mendixmodelsdk.pagesMod.pages.WidgetValidation = js.native
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * The new WidgetValidation will be automatically stored in the 'validation' property
    * of the parent ReferenceSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInReferenceSelectorUnderValidation(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.ReferenceSelector): typingsJapgolly.mendixmodelsdk.pagesMod.pages.WidgetValidation = js.native
}

