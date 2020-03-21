package typingsJapgolly.mendixmodelsdk.expressionsMod.expressions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.expressionsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.BasicCodeActionParameterValue
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.BasicJavaActionParameterValue
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.BinaryRequestHandling
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.ChangeListAction
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.ChangeVariableAction
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.CreateVariableAction
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.CustomRange
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.DocumentTemplateParameterMapping
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.EndEvent
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.ExpressionSplitCondition
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.FormDataPart
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.GenerateDocumentAction
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.HttpHeaderEntry
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.InspectAttribute
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.LogMessageAction
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MemberChange
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.MicroflowCallParameterMapping
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.NanoflowCallParameterMapping
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.ProxyConfiguration
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.RestCallAction
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.RuleCallParameterMapping
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.TemplateArgument
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.WebServiceOperationParameterMapping
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.WidgetValidation
import typingsJapgolly.mendixmodelsdk.restMod.rest.ConsumedODataService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Expressions`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/microflow-expressions relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.Expression")
@js.native
abstract class Expression protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FExpression: IModel = js.native
  def containerAsAppServiceCallParameterMapping(): AppServiceCallParameterMapping = js.native
  def containerAsBasicCodeActionParameterValue(): BasicCodeActionParameterValue = js.native
  def containerAsBasicJavaActionParameterValue(): BasicJavaActionParameterValue = js.native
  def containerAsBinaryExpression(): BinaryExpression = js.native
  def containerAsBinaryRequestHandling(): BinaryRequestHandling = js.native
  def containerAsChangeListAction(): ChangeListAction = js.native
  def containerAsChangeVariableAction(): ChangeVariableAction = js.native
  def containerAsConditionalSettings(): ConditionalSettings = js.native
  def containerAsConsumedODataService(): ConsumedODataService = js.native
  def containerAsCreateVariableAction(): CreateVariableAction = js.native
  def containerAsCustomRange(): CustomRange = js.native
  def containerAsDocumentTemplateParameterMapping(): DocumentTemplateParameterMapping = js.native
  def containerAsEndEvent(): EndEvent = js.native
  def containerAsExpressionSplitCondition(): ExpressionSplitCondition = js.native
  def containerAsFormDataPart(): FormDataPart = js.native
  def containerAsFunctionCallExpression(): FunctionCallExpression = js.native
  def containerAsGenerateDocumentAction(): GenerateDocumentAction = js.native
  def containerAsHttpConfiguration(): HttpConfiguration = js.native
  def containerAsHttpHeaderEntry(): HttpHeaderEntry = js.native
  def containerAsIfExpression(): IfExpression = js.native
  def containerAsInspectAttribute(): InspectAttribute = js.native
  def containerAsLogMessageAction(): LogMessageAction = js.native
  def containerAsMemberChange(): MemberChange = js.native
  def containerAsMicroflowCallParameterMapping(): MicroflowCallParameterMapping = js.native
  def containerAsNanoflowCallParameterMapping(): NanoflowCallParameterMapping = js.native
  def containerAsParenthesisExpression(): ParenthesisExpression = js.native
  def containerAsProxyConfiguration(): ProxyConfiguration = js.native
  def containerAsRestCallAction(): RestCallAction = js.native
  def containerAsRuleCallParameterMapping(): RuleCallParameterMapping = js.native
  def containerAsTemplateArgument(): TemplateArgument = js.native
  def containerAsUnaryExpression(): UnaryExpression = js.native
  def containerAsWebServiceCallAction(): WebServiceCallAction = js.native
  def containerAsWebServiceOperationParameterMapping(): WebServiceOperationParameterMapping = js.native
  def containerAsWidgetValidation(): WidgetValidation = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.Expression")
@js.native
object Expression extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

