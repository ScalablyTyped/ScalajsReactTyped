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
  * In version 7.17.0: added public
  */
@JSImport("mendixmodelsdk", "pages.LayoutCall")
@js.native
class LayoutCall protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.pages.LayoutCall {
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
@JSImport("mendixmodelsdk", "pages.LayoutCall")
@js.native
object LayoutCall extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.23.0
    */
  def createInLayoutUnderLayoutCall(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Layout): typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 and higher
    */
  def createInPageTemplateUnderLayoutCall(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageTemplate): typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Page element passed as argument.
    */
  def createInPageUnderLayoutCall(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.Page): typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderLayoutCall(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.WebLayoutContent): typingsJapgolly.mendixmodelsdk.pagesMod.pages.LayoutCall = js.native
}

