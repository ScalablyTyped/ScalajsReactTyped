package typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.AppServiceCallParameterMapping
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.BasicCodeActionParameterValue
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.BasicJavaActionParameterValue
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.BinaryRequestHandling
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ChangeListAction
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ChangeVariableAction
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.CreateVariableAction
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.CustomRange
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.DocumentTemplateParameterMapping
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.EndEvent
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ExpressionListOperation
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ExpressionSplitCondition
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.FormDataPart
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.GenerateDocumentAction
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpConfiguration
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.HttpHeaderEntry
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.InspectAttribute
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.LogMessageAction
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MemberChange
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.MicroflowCallParameterMapping
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.NanoflowCallParameterMapping
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ProxyConfiguration
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.RestCallAction
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.RuleCallParameterMapping
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.TemplateArgument
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.WebServiceCallAction
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.WebServiceOperationParameterMapping
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConditionalSettings
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.WidgetValidation
import typingsJapgolly.mendixmodelsdk.srcGenRestMod.rest.ConsumedODataService
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Expressions`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide9/expressions relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 9.8.0: deleted
  * In version 7.9.0: introduced
  */
/* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.Expression")
@js.native
open class Expression protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAppServiceCallParameterMapping: AppServiceCallParameterMapping = js.native
  
  def containerAsBasicCodeActionParameterValue: BasicCodeActionParameterValue = js.native
  
  def containerAsBasicJavaActionParameterValue: BasicJavaActionParameterValue = js.native
  
  def containerAsBinaryExpression: BinaryExpression = js.native
  
  def containerAsBinaryRequestHandling: BinaryRequestHandling = js.native
  
  def containerAsChangeListAction: ChangeListAction = js.native
  
  def containerAsChangeVariableAction: ChangeVariableAction = js.native
  
  def containerAsConditionalSettings: ConditionalSettings = js.native
  
  def containerAsConsumedODataService: ConsumedODataService = js.native
  
  def containerAsCreateVariableAction: CreateVariableAction = js.native
  
  def containerAsCustomRange: CustomRange = js.native
  
  def containerAsDocumentTemplateParameterMapping: DocumentTemplateParameterMapping = js.native
  
  def containerAsEndEvent: EndEvent = js.native
  
  def containerAsExpressionListOperation: ExpressionListOperation = js.native
  
  def containerAsExpressionSplitCondition: ExpressionSplitCondition = js.native
  
  def containerAsFormDataPart: FormDataPart = js.native
  
  def containerAsFunctionCallExpression: FunctionCallExpression = js.native
  
  def containerAsGenerateDocumentAction: GenerateDocumentAction = js.native
  
  def containerAsHttpConfiguration: HttpConfiguration = js.native
  
  def containerAsHttpHeaderEntry: HttpHeaderEntry = js.native
  
  def containerAsIfExpression: IfExpression = js.native
  
  def containerAsInspectAttribute: InspectAttribute = js.native
  
  def containerAsLogMessageAction: LogMessageAction = js.native
  
  def containerAsMemberChange: MemberChange = js.native
  
  def containerAsMicroflowCallParameterMapping: MicroflowCallParameterMapping = js.native
  
  def containerAsNanoflowCallParameterMapping: NanoflowCallParameterMapping = js.native
  
  def containerAsParenthesisExpression: ParenthesisExpression = js.native
  
  def containerAsProxyConfiguration: ProxyConfiguration = js.native
  
  def containerAsRestCallAction: RestCallAction = js.native
  
  def containerAsRuleCallParameterMapping: RuleCallParameterMapping = js.native
  
  def containerAsTemplateArgument: TemplateArgument = js.native
  
  def containerAsUnaryExpression: UnaryExpression = js.native
  
  def containerAsWebServiceCallAction: WebServiceCallAction = js.native
  
  def containerAsWebServiceOperationParameterMapping: WebServiceOperationParameterMapping = js.native
  
  def containerAsWidgetValidation: WidgetValidation = js.native
}
object Expression {
  
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.Expression")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.Expression.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/expressions", "expressions.Expression.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
