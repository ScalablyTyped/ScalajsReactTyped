package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.StaticLabel
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Title
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationDeleteBehavior
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.ValidationRule
import typingsJapgolly.mendixmodelsdk.srcGenEnumerationsMod.enumerations.EnumerationValue
import typingsJapgolly.mendixmodelsdk.srcGenMenusMod.menus.MenuItem
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.Microflow
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.TextTemplate
import typingsJapgolly.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem
import typingsJapgolly.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidget
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.AttributeWidgetWithPlaceholder
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Button
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.CallNanoflowClientAction
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ConfirmationInfo
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ControlBarButton
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DataView
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DropDown
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.DropDownButtonItem
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridColumn
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.InputWidget
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Label
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.LoginTextBox
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MasterDetailDetailRegion
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MicroflowSettings
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.Page
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.PageSettings
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSelector
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SearchField
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TabPage
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.TextArea
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.WidgetValidation
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IProject
import typingsJapgolly.mendixmodelsdk.srcGenReportsMod.reports.BasicReportAggregate
import typingsJapgolly.mendixmodelsdk.srcGenReportsMod.reports.BasicReportColumn
import typingsJapgolly.mendixmodelsdk.srcGenReportsMod.reports.ReportButton
import typingsJapgolly.mendixmodelsdk.srcGenReportsMod.reports.ReportChart
import typingsJapgolly.mendixmodelsdk.srcGenReportsMod.reports.ReportChartSeries
import typingsJapgolly.mendixmodelsdk.srcGenReportsMod.reports.ReportDateRangeField
import typingsJapgolly.mendixmodelsdk.srcGenReportsMod.reports.ReportDateRangeSelector
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object texts {
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Texts`.
    */
  @JSImport("mendixmodelsdk", "texts.SystemText")
  @js.native
  open class SystemText protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.texts.SystemText {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object SystemText {
    
    @JSImport("mendixmodelsdk", "texts.SystemText")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.SystemText = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.SystemText]
    
    /**
      * Creates and returns a new SystemText instance in the SDK and on the server.
      * The new SystemText will be automatically stored in the 'systemTexts' property
      * of the parent SystemTextCollection element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.SystemTextCollection): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.SystemText = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.SystemText]
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.SystemText.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.SystemText.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenTextsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenTextsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/system-texts relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "texts.SystemTextCollection")
  @js.native
  open class SystemTextCollection protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.texts.SystemTextCollection {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object SystemTextCollection {
    
    @JSImport("mendixmodelsdk", "texts.SystemTextCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new SystemTextCollection unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IProject): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.SystemTextCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.SystemTextCollection]
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.SystemTextCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.SystemTextCollection.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenTextsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenTextsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/translatable-texts relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "texts.Text")
  @js.native
  open class Text protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.texts.Text {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Text {
    
    @JSImport("mendixmodelsdk", "texts.Text")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'childErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    /* static member */
    inline def createInAssociationDeleteBehaviorUnderChildErrorMessage(container: AssociationDeleteBehavior): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationDeleteBehaviorUnderChildErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'parentErrorMessage' property
      * of the parent domainmodels.AssociationDeleteBehavior element passed as argument.
      */
    /* static member */
    inline def createInAssociationDeleteBehaviorUnderParentErrorMessage(container: AssociationDeleteBehavior): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAssociationDeleteBehaviorUnderParentErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.AttributeWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    /* static member */
    inline def createInAttributeWidgetUnderRequiredMessage(container: AttributeWidget): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderRequiredMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.AttributeWidgetWithPlaceholder element passed as argument.
      */
    /* static member */
    inline def createInAttributeWidgetWithPlaceholderUnderPlaceholder(container: AttributeWidgetWithPlaceholder): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetWithPlaceholderUnderPlaceholder")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportAggregate element passed as argument.
      */
    /* static member */
    inline def createInBasicReportAggregateUnderCaption(container: BasicReportAggregate): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicReportAggregateUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.BasicReportColumn element passed as argument.
      */
    /* static member */
    inline def createInBasicReportColumnUnderCaption(container: BasicReportColumn): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBasicReportColumnUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent nativepages.BottomBarItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createInBottomBarItemUnderCaption(container: BottomBarItem): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInBottomBarItemUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.Button element passed as argument.
      */
    /* static member */
    inline def createInButtonUnderTooltip(container: Button): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInButtonUnderTooltip")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.CallNanoflowClientAction element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.8.0 and higher
      */
    /* static member */
    inline def createInCallNanoflowClientActionUnderProgressMessage(container: CallNanoflowClientAction): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCallNanoflowClientActionUnderProgressMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fallback' property
      * of the parent pages.ClientTemplate element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.3.0 and higher
      */
    /* static member */
    inline def createInClientTemplateUnderFallback(container: ClientTemplate): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateUnderFallback")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'template' property
      * of the parent pages.ClientTemplate element passed as argument.
      */
    /* static member */
    inline def createInClientTemplateUnderTemplate(container: ClientTemplate): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateUnderTemplate")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'cancelButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    /* static member */
    inline def createInConfirmationInfoUnderCancelButtonCaption(container: ConfirmationInfo): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConfirmationInfoUnderCancelButtonCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'proceedButtonCaption' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    /* static member */
    inline def createInConfirmationInfoUnderProceedButtonCaption(container: ConfirmationInfo): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConfirmationInfoUnderProceedButtonCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'question' property
      * of the parent pages.ConfirmationInfo element passed as argument.
      */
    /* static member */
    inline def createInConfirmationInfoUnderQuestion(container: ConfirmationInfo): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConfirmationInfoUnderQuestion")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'tooltip' property
      * of the parent pages.ControlBarButton element passed as argument.
      */
    /* static member */
    inline def createInControlBarButtonUnderTooltip(container: ControlBarButton): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInControlBarButtonUnderTooltip")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.DataGridColumn element passed as argument.
      */
    /* static member */
    inline def createInDataGridColumnUnderCaption(container: DataGridColumn): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'noEntityMessage' property
      * of the parent pages.DataView element passed as argument.
      */
    /* static member */
    inline def createInDataViewUnderNoEntityMessage(container: DataView): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataViewUnderNoEntityMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.DropDownButtonItem element passed as argument.
      */
    /* static member */
    inline def createInDropDownButtonItemUnderCaption(container: DropDownButtonItem): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropDownButtonItemUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.DropDown element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    /* static member */
    inline def createInDropDownUnderEmptyOptionCaption(container: DropDown): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropDownUnderEmptyOptionCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent enumerations.EnumerationValue element passed as argument.
      */
    /* static member */
    inline def createInEnumerationValueUnderCaption(container: EnumerationValue): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEnumerationValueUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'aggregateCaption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    /* static member */
    inline def createInGridColumnUnderAggregateCaption(container: GridColumn): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderAggregateCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.GridColumn element passed as argument.
      */
    /* static member */
    inline def createInGridColumnUnderCaption(container: GridColumn): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.InputWidget element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.17.0
      */
    /* static member */
    inline def createInInputWidgetUnderLabel(container: InputWidget): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInInputWidgetUnderLabel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.Label element passed as argument.
      */
    /* static member */
    inline def createInLabelUnderCaption(container: Label): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLabelUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'label' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    /* static member */
    inline def createInLoginTextBoxUnderLabel(container: LoginTextBox): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLoginTextBoxUnderLabel")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.LoginTextBox element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 and higher
      */
    /* static member */
    inline def createInLoginTextBoxUnderPlaceholder(container: LoginTextBox): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInLoginTextBoxUnderPlaceholder")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.MasterDetailDetailRegion element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.1.0 to 7.14.0
      */
    /* static member */
    inline def createInMasterDetailDetailRegionUnderTitle(container: MasterDetailDetailRegion): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMasterDetailDetailRegionUnderTitle")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'alternativeText' property
      * of the parent menus.MenuItem element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.12.0 and higher
      */
    /* static member */
    inline def createInMenuItemUnderAlternativeText(container: MenuItem): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderAlternativeText")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent menus.MenuItem element passed as argument.
      */
    /* static member */
    inline def createInMenuItemUnderCaption(container: MenuItem): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMenuItemUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'progressMessage' property
      * of the parent pages.MicroflowSettings element passed as argument.
      */
    /* static member */
    inline def createInMicroflowSettingsUnderProgressMessage(container: MicroflowSettings): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowSettingsUnderProgressMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'concurrencyErrorMessage' property
      * of the parent microflows.Microflow element passed as argument.
      */
    /* static member */
    inline def createInMicroflowUnderConcurrencyErrorMessage(container: Microflow): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowUnderConcurrencyErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'appTitle' property
      * of the parent navigation.NavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.12.0 and higher
      */
    /* static member */
    inline def createInNavigationProfileUnderAppTitle(container: NavigationProfile): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationProfileUnderAppTitle")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'formTitle' property
      * of the parent pages.PageSettings element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 8.11.0
      */
    /* static member */
    inline def createInPageSettingsUnderFormTitle(container: PageSettings): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageSettingsUnderFormTitle")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'title' property
      * of the parent pages.Page element passed as argument.
      */
    /* static member */
    inline def createInPageUnderTitle(container: Page): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPageUnderTitle")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'emptyOptionCaption' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    /* static member */
    inline def createInReferenceSelectorUnderEmptyOptionCaption(container: ReferenceSelector): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderEmptyOptionCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'requiredMessage' property
      * of the parent pages.ReferenceSelector element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.5.0
      */
    /* static member */
    inline def createInReferenceSelectorUnderRequiredMessage(container: ReferenceSelector): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderRequiredMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportButton element passed as argument.
      */
    /* static member */
    inline def createInReportButtonUnderCaption(container: ReportButton): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportButtonUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportChartSeries element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.0
      */
    /* static member */
    inline def createInReportChartSeriesUnderCaption(container: ReportChartSeries): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportChartSeriesUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'xAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.0
      */
    /* static member */
    inline def createInReportChartUnderXAxisCaption(container: ReportChart): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportChartUnderXAxisCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'yAxisCaption' property
      * of the parent reports.ReportChart element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 9.0.0
      */
    /* static member */
    inline def createInReportChartUnderYAxisCaption(container: ReportChart): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportChartUnderYAxisCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent reports.ReportDateRangeField element passed as argument.
      */
    /* static member */
    inline def createInReportDateRangeFieldUnderCaption(container: ReportDateRangeField): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportDateRangeFieldUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'fromCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    /* static member */
    inline def createInReportDateRangeSelectorUnderFromCaption(container: ReportDateRangeSelector): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportDateRangeSelectorUnderFromCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'toCaption' property
      * of the parent reports.ReportDateRangeSelector element passed as argument.
      */
    /* static member */
    inline def createInReportDateRangeSelectorUnderToCaption(container: ReportDateRangeSelector): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReportDateRangeSelectorUnderToCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.SearchField element passed as argument.
      */
    /* static member */
    inline def createInSearchFieldUnderCaption(container: SearchField): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSearchFieldUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'placeholder' property
      * of the parent pages.SearchField element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.21.0 and higher
      */
    /* static member */
    inline def createInSearchFieldUnderPlaceholder(container: SearchField): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSearchFieldUnderPlaceholder")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.StaticLabel element passed as argument.
      */
    /* static member */
    inline def createInStaticLabelUnderCaption(container: StaticLabel): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticLabelUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent SystemText element passed as argument.
      */
    /* static member */
    inline def createInSystemTextUnderText(container: typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.SystemText): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSystemTextUnderText")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent pages.TabPage element passed as argument.
      */
    /* static member */
    inline def createInTabPageUnderCaption(container: TabPage): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTabPageUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'counterMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    /* static member */
    inline def createInTextAreaUnderCounterMessage(container: TextArea): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextAreaUnderCounterMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'textTooLongMessage' property
      * of the parent pages.TextArea element passed as argument.
      */
    /* static member */
    inline def createInTextAreaUnderTextTooLongMessage(container: TextArea): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextAreaUnderTextTooLongMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'text' property
      * of the parent microflows.TextTemplate element passed as argument.
      */
    /* static member */
    inline def createInTextTemplateUnderText(container: TextTemplate): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextTemplateUnderText")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'caption' property
      * of the parent documenttemplates.Title element passed as argument.
      */
    /* static member */
    inline def createInTitleUnderCaption(container: Title): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTitleUnderCaption")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'errorMessage' property
      * of the parent domainmodels.ValidationRule element passed as argument.
      */
    /* static member */
    inline def createInValidationRuleUnderErrorMessage(container: ValidationRule): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInValidationRuleUnderErrorMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'message' property
      * of the parent pages.WidgetValidation element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.6.0 and higher
      */
    /* static member */
    inline def createInWidgetValidationUnderMessage(container: WidgetValidation): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValidationUnderMessage")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /**
      * Creates and returns a new Text instance in the SDK and on the server.
      * The new Text will be automatically stored in the 'translatableValue' property
      * of the parent customwidgets.WidgetValue element passed as argument.
      */
    /* static member */
    inline def createInWidgetValueUnderTranslatableValue(container: WidgetValue): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderTranslatableValue")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text]
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Text.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenTextsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenTextsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "texts.Translation")
  @js.native
  open class Translation protected ()
    extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.texts.Translation {
    def this(
      model: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Translation {
    
    @JSImport("mendixmodelsdk", "texts.Translation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Translation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Translation]
    
    /**
      * Creates and returns a new Translation instance in the SDK and on the server.
      * The new Translation will be automatically stored in the 'translations' property
      * of the parent Text element passed as argument.
      */
    /* static member */
    inline def createIn(container: typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Text): typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Translation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenTextsMod.texts.Translation]
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Translation.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "texts.Translation.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.mendixmodelsdk.srcGenTextsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.mendixmodelsdk.srcGenTextsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
