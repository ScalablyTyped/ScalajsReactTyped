package typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.AttributeWidget
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.GridSortItem
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.VariableRefExpression
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.SortItem
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplateParameter
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridColumn
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ListViewSearch
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.MemberWidget
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.RangeSearchField
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.SingleSearchField
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.StaticOrDynamicString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberRef")
@js.native
abstract class MemberRef protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMemberRef: IModel = js.native
  def containerAsAttributeWidget(): AttributeWidget = js.native
  def containerAsClientTemplateParameter(): ClientTemplateParameter = js.native
  def containerAsDataGridColumn(): DataGridColumn = js.native
  def containerAsDocumentTemplatesGridSortItem(): GridSortItem = js.native
  def containerAsGridColumn(): GridColumn = js.native
  def containerAsListViewSearch(): ListViewSearch = js.native
  def containerAsMemberWidget(): MemberWidget = js.native
  def containerAsPagesGridSortItem(): typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSortItem = js.native
  def containerAsRangeSearchField(): RangeSearchField = js.native
  def containerAsSingleSearchField(): SingleSearchField = js.native
  def containerAsSortItem(): SortItem = js.native
  def containerAsStaticOrDynamicString(): StaticOrDynamicString = js.native
  def containerAsVariableRefExpression(): VariableRefExpression = js.native
  def containerAsWidgetValue(): WidgetValue = js.native
  def entityRef(): js.Any = js.native
  def entityRef(newValue: IndirectEntityRef): js.Any = js.native
  @JSName("entityRef")
  def entityRef_Union(): IndirectEntityRef | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.MemberRef")
@js.native
object MemberRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

