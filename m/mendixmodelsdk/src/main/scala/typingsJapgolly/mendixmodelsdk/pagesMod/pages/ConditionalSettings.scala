package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typingsJapgolly.mendixmodelsdk.enumerationsMod.enumerations.Condition
import typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.Expression
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalSettings")
@js.native
abstract class ConditionalSettings protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FConditionalSettings: IModel = js.native
  def attribute(): js.Any = js.native
  def attribute(newValue: IAttribute): js.Any = js.native
  def attributeQualifiedName(): String | Null = js.native
  @JSName("attribute")
  def attribute_Union(): IAttribute | Null = js.native
  def conditions(): IList[Condition] = js.native
  def containerAsConditionallyEditableWidget(): ConditionallyEditableWidget = js.native
  def containerAsConditionallyVisibleWidget(): ConditionallyVisibleWidget = js.native
  def containerAsControlBarButton(): ControlBarButton = js.native
  def containerAsCustomWidget(): CustomWidget = js.native
  def containerAsLayoutGridRow(): LayoutGridRow = js.native
  def containerAsNavigationListItem(): NavigationListItem = js.native
  def containerAsTabPage(): TabPage = js.native
  def containerAsTableRow(): TableRow = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 7.0.1: introduced
    */
  def expression(): String = js.native
  def expression(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def expressionModel(): Expression = js.native
  def expressionModel(newValue: Expression): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConditionalSettings")
@js.native
object ConditionalSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

