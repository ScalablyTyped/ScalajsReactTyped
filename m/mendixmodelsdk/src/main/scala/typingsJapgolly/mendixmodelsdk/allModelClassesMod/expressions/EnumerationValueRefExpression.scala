package typingsJapgolly.mendixmodelsdk.allModelClassesMod.expressions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.expressionsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
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
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.EnumerationValueRefExpression")
@js.native
class EnumerationValueRefExpression protected ()
  extends typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "expressions.EnumerationValueRefExpression")
@js.native
object EnumerationValueRefExpression extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderLeft(container: typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.BinaryExpression): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderRight(container: typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.BinaryExpression): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeListActionUnderValueModel(container: ChangeListAction): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInEndEventUnderReturnValueModel(container: EndEvent): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInFormDataPartUnderValueModel(container: FormDataPart): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInFunctionCallExpressionUnderArguments(container: typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.FunctionCallExpression): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderCondition(container: typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.IfExpression): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfFalse(container: typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.IfExpression): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfTrue(container: typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.IfExpression): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMemberChangeUnderValueModel(container: MemberChange): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInParenthesisExpressionUnderExpression(container: typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.ParenthesisExpression): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInUnaryExpressionUnderExpression(container: typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.UnaryExpression): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.EnumerationValueRefExpression = js.native
}

