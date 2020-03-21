package typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.EntityWidget
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.CreateObjectClientAction
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.EntityPathSource
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.NewButton
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.SelectorXPathSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRef")
@js.native
abstract class EntityRef protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEntityRef: IModel = js.native
  def containerAsCreateObjectClientAction(): CreateObjectClientAction = js.native
  def containerAsEntityPathSource(): EntityPathSource = js.native
  def containerAsEntityWidget(): EntityWidget = js.native
  def containerAsMemberRef(): MemberRef = js.native
  def containerAsNewButton(): NewButton = js.native
  def containerAsReferenceSetSelector(): ReferenceSetSelector = js.native
  def containerAsSelectorXPathSource(): SelectorXPathSource = js.native
  def containerAsWidgetValue(): WidgetValue = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRef")
@js.native
object EntityRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

