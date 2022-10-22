package typingsJapgolly.mendixmodelsdk.mod.expressions

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
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 9.8.0: deleted
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk", "expressions.VariableRefExpression")
@js.native
open class VariableRefExpression protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.expressions.VariableRefExpression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object VariableRefExpression {
  
  @JSImport("mendixmodelsdk", "expressions.VariableRefExpression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.0.1
    */
  /* static member */
  inline def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAppServiceCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 to 9.7.0
    */
  /* static member */
  inline def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicCodeActionParameterValueUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  /* static member */
  inline def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicJavaActionParameterValueUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInBinaryExpressionUnderLeft(container: typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.BinaryExpression): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryExpressionUnderLeft")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInBinaryExpressionUnderRight(container: typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.BinaryExpression): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryExpressionUnderRight")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBinaryRequestHandlingUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInChangeListActionUnderValueModel(container: ChangeListAction): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInChangeListActionUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInChangeVariableActionUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionalSettingsUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 to 9.7.0
    */
  /* static member */
  inline def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConsumedODataServiceUnderTimeoutModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateVariableActionUnderInitialValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomRangeUnderLimitExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomRangeUnderOffsetExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInEndEventUnderReturnValueModel(container: EndEvent): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEndEventUnderReturnValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionListOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.0.3 to 9.7.0
    */
  /* static member */
  inline def createInExpressionListOperationUnderExpressionModel(container: ExpressionListOperation): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInExpressionListOperationUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInExpressionSplitConditionUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 9.7.0
    */
  /* static member */
  inline def createInFormDataPartUnderValueModel(container: FormDataPart): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInFormDataPartUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInFunctionCallExpressionUnderArguments(container: typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.FunctionCallExpression): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInFunctionCallExpressionUnderArguments")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginBottomInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginLeftInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginRightInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGenerateDocumentActionUnderMarginTopInInchModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderCustomLocationModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderPassword")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpConfigurationUnderUsername")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInHttpHeaderEntryUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInIfExpressionUnderCondition(container: typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.IfExpression): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderCondition")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInIfExpressionUnderIfFalse(container: typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.IfExpression): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderIfFalse")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInIfExpressionUnderIfTrue(container: typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.IfExpression): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInIfExpressionUnderIfTrue")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInspectAttributeUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLogMessageActionUnderNodeModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInMemberChangeUnderValueModel(container: MemberChange): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemberChangeUnderValueModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 9.7.0
    */
  /* static member */
  inline def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNanoflowCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInParenthesisExpressionUnderExpression(container: typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.ParenthesisExpression): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInParenthesisExpressionUnderExpression")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderHostExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderPasswordExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderPortExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderUseConfigurationExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInProxyConfigurationUnderUsernameExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderTimeOutModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRuleCallParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTemplateArgumentUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInUnaryExpressionUnderExpression(container: typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.UnaryExpression): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInUnaryExpressionUnderExpression")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 to 9.7.0
    */
  /* static member */
  inline def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderTimeOutModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceOperationParameterMappingUnderArgumentModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /**
    * Creates and returns a new VariableRefExpression instance in the SDK and on the server.
    * The new VariableRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 9.7.0
    */
  /* static member */
  inline def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValidationUnderExpressionModel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression]
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.VariableRefExpression.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "expressions.VariableRefExpression.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
