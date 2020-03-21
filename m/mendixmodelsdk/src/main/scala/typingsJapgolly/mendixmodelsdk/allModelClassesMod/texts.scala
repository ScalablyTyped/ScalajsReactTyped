package typingsJapgolly.mendixmodelsdk.allModelClassesMod

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.StaticLabel
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.Title
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationDeleteBehavior
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.ValidationRule
import typingsJapgolly.mendixmodelsdk.enumerationsMod.enumerations.EnumerationValue
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.menusMod.menus.MenuItem
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.Microflow
import typingsJapgolly.mendixmodelsdk.microflowsMod.microflows.TextTemplate
import typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.AttributeWidget
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.AttributeWidgetWithPlaceholder
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Button
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.CallNanoflowClientAction
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ClientTemplate
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ConfirmationInfo
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ControlBarButton
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.DataView
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.DropDown
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.DropDownButtonItem
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridColumn
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.InputWidget
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Label
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.LoginTextBox
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.MasterDetailDetailRegion
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.MicroflowSettings
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.Page
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.PageSettings
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ReferenceSelector
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.SearchField
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.TabPage
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.TextArea
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.WidgetValidation
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IProject
import typingsJapgolly.mendixmodelsdk.reportsMod.reports.BasicReportAggregate
import typingsJapgolly.mendixmodelsdk.reportsMod.reports.BasicReportColumn
import typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportButton
import typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportChart
import typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportChartSeries
import typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeField
import typingsJapgolly.mendixmodelsdk.reportsMod.reports.ReportDateRangeSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "texts")
@js.native
object texts extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Texts`.
    */
  @js.native
  class SystemText protected ()
    extends typingsJapgolly.mendixmodelsdk.textsMod.texts.SystemText {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/system-texts relevant section in reference guide}
    */
  @js.native
  class SystemTextCollection protected ()
    extends typingsJapgolly.mendixmodelsdk.textsMod.texts.SystemTextCollection {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/translatable-texts relevant section in reference guide}
    */
  @js.native
  class Text protected ()
    extends typingsJapgolly.mendixmodelsdk.textsMod.texts.Text {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  @js.native
  class Translation protected ()
    extends typingsJapgolly.mendixmodelsdk.textsMod.texts.Translation {
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
  @js.native
  object SystemText extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.textsMod.texts.SystemText = js.native
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * The new SystemText will be automatically stored in the 'systemTexts' property
      * of the parent SystemTextCollection element passed as argument.
      */
    def createIn(container: typingsJapgolly.mendixmodelsdk.textsMod.texts.SystemTextCollection): typingsJapgolly.mendixmodelsdk.textsMod.texts.SystemText = js.native
  }
  
  /* static members */
  @js.native
  object SystemTextCollection extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    /**
      * Creates a new SystemTextCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: IProject): typingsJapgolly.mendixmodelsdk.textsMod.texts.SystemTextCollection = js.native
  }
  
  /* static members */
  @js.native
  object Text extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'childErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderChildErrorMessage(container: AssociationDeleteBehavior): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'parentErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    def createInAssociationDeleteBehaviorUnderParentErrorMessage(container: AssociationDeleteBehavior): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInAttributeWidgetUnderRequiredMessage(container: AttributeWidget): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.AttributeWidgetWithPlaceholder element passed as argument.
      */
    def createInAttributeWidgetWithPlaceholderUnderPlaceholder(container: AttributeWidgetWithPlaceholder): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportAggregate element passed as argument.
      */
    def createInBasicReportAggregateUnderCaption(container: BasicReportAggregate): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportColumn element passed as argument.
      */
    def createInBasicReportColumnUnderCaption(container: BasicReportColumn): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent nativepages.BottomBarItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    def createInBottomBarItemUnderCaption(container: BottomBarItem): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.Button element passed as argument.
      */
    def createInButtonUnderTooltip(container: Button): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.CallNanoflowClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.8.0 and higher
      */
    def createInCallNanoflowClientActionUnderProgressMessage(container: CallNanoflowClientAction): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fallback' property
      * of the parent pages.ClientTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.3.0 and higher
      */
    def createInClientTemplateUnderFallback(container: ClientTemplate): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'template' property
      * of the parent pages.ClientTemplate element passed as argument.
      */
    def createInClientTemplateUnderTemplate(container: ClientTemplate): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'cancelButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderCancelButtonCaption(container: ConfirmationInfo): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'proceedButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderProceedButtonCaption(container: ConfirmationInfo): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'question' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    def createInConfirmationInfoUnderQuestion(container: ConfirmationInfo): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.ControlBarButton element passed as argument.
      */
    def createInControlBarButtonUnderTooltip(container: ControlBarButton): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      */
    def createInDataGridColumnUnderCaption(container: DataGridColumn): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'noEntityMessage' property
      * of the parent pages.DataView element passed as argument.
      */
    def createInDataViewUnderNoEntityMessage(container: DataView): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.DropDownButtonItem element passed as argument.
      */
    def createInDropDownButtonItemUnderCaption(container: DropDownButtonItem): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.DropDown element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInDropDownUnderEmptyOptionCaption(container: DropDown): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent enumerations.EnumerationValue element passed as argument.
      */
    def createInEnumerationValueUnderCaption(container: EnumerationValue): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'aggregateCaption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderAggregateCaption(container: GridColumn): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    def createInGridColumnUnderCaption(container: GridColumn): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.InputWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.17.0
      */
    def createInInputWidgetUnderLabel(container: InputWidget): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.Label element passed as argument.
      */
    def createInLabelUnderCaption(container: Label): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderLabel(container: LoginTextBox): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    def createInLoginTextBoxUnderPlaceholder(container: LoginTextBox): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.MasterDetailDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    def createInMasterDetailDetailRegionUnderTitle(container: MasterDetailDetailRegion): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent menus.MenuItem element passed as argument.
      */
    def createInMenuItemUnderCaption(container: MenuItem): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.MicroflowSettings element passed as argument.
      */
    def createInMicroflowSettingsUnderProgressMessage(container: MicroflowSettings): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'concurrencyErrorMessage' property
      * of the parent microflows.Microflow element passed as argument.
      */
    def createInMicroflowUnderConcurrencyErrorMessage(container: Microflow): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'formTitle' property
      * of the parent pages.PageSettings element passed as argument.
      */
    def createInPageSettingsUnderFormTitle(container: PageSettings): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.Page element passed as argument.
      */
    def createInPageUnderTitle(container: Page): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInReferenceSelectorUnderEmptyOptionCaption(container: ReferenceSelector): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    def createInReferenceSelectorUnderRequiredMessage(container: ReferenceSelector): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportButton element passed as argument.
      */
    def createInReportButtonUnderCaption(container: ReportButton): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportChartSeries element passed as argument.
      */
    def createInReportChartSeriesUnderCaption(container: ReportChartSeries): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'xAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderXAxisCaption(container: ReportChart): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'yAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      */
    def createInReportChartUnderYAxisCaption(container: ReportChart): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportDateRangeField element passed as argument.
      */
    def createInReportDateRangeFieldUnderCaption(container: ReportDateRangeField): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fromCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderFromCaption(container: ReportDateRangeSelector): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'toCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    def createInReportDateRangeSelectorUnderToCaption(container: ReportDateRangeSelector): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.SearchField element passed as argument.
      */
    def createInSearchFieldUnderCaption(container: SearchField): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.SearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    def createInSearchFieldUnderPlaceholder(container: SearchField): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.StaticLabel element passed as argument.
      */
    def createInStaticLabelUnderCaption(container: StaticLabel): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent SystemText element passed as argument.
      */
    def createInSystemTextUnderText(container: typingsJapgolly.mendixmodelsdk.textsMod.texts.SystemText): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.TabPage element passed as argument.
      */
    def createInTabPageUnderCaption(container: TabPage): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'counterMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderCounterMessage(container: TextArea): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'textTooLongMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    def createInTextAreaUnderTextTooLongMessage(container: TextArea): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent microflows.TextTemplate element passed as argument.
      */
    def createInTextTemplateUnderText(container: TextTemplate): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.Title element passed as argument.
      */
    def createInTitleUnderCaption(container: Title): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'errorMessage' property
      * of the parent domainmodels.ValidationRule element passed as argument.
      */
    def createInValidationRuleUnderErrorMessage(container: ValidationRule): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'message' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    def createInWidgetValidationUnderMessage(container: WidgetValidation): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'translatableValue' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      */
    def createInWidgetValueUnderTranslatableValue(container: WidgetValue): typingsJapgolly.mendixmodelsdk.textsMod.texts.Text = js.native
  }
  
  /* static members */
  @js.native
  object Translation extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typingsJapgolly.mendixmodelsdk.textsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typingsJapgolly.mendixmodelsdk.textsMod.texts.Translation = js.native
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * The new Translation will be automatically stored in the 'translations' property
      * of the parent Text element passed as argument.
      */
    def createIn(container: typingsJapgolly.mendixmodelsdk.textsMod.texts.Text): typingsJapgolly.mendixmodelsdk.textsMod.texts.Translation = js.native
  }
  
}

