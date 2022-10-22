package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.AttributeWidget
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.GridSortItem
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.VariableRefExpression
import typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.SortItem
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplateParameter
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridColumn
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ListViewSearch
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.MemberWidget
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.RangeSearchField
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SingleSearchField
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.StaticOrDynamicString
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.6.0: added public
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AttributeRef")
@js.native
open class AttributeRef protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object AttributeRef {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AttributeRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInAttributeWidgetUnderAttributeRef(container: AttributeWidget): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInAttributeWidgetUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInClientTemplateParameterUnderAttributeRef(container: ClientTemplateParameter): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateParameterUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInDataGridColumnUnderAttributeRef(container: DataGridColumn): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInDocumentTemplatesGridSortItemUnderAttributeRef(container: GridSortItem): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplatesGridSortItemUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInGridColumnUnderAttributeRef(container: GridColumn): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'searchRefs' property
    * of the parent pages.ListViewSearch element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInListViewSearchUnderSearchRefs(container: ListViewSearch): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInListViewSearchUnderSearchRefs")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.MemberWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInMemberWidgetUnderAttributeRef(container: MemberWidget): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemberWidgetUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInPagesGridSortItemUnderAttributeRef(container: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortItem): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPagesGridSortItemUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'lowerBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInRangeSearchFieldUnderLowerBoundRef(container: RangeSearchField): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRangeSearchFieldUnderLowerBoundRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'upperBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInRangeSearchFieldUnderUpperBoundRef(container: RangeSearchField): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRangeSearchFieldUnderUpperBoundRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.SingleSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInSingleSearchFieldUnderAttributeRef(container: SingleSearchField): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSingleSearchFieldUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent microflows.SortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInSortItemUnderAttributeRef(container: SortItem): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSortItemUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.StaticOrDynamicString element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInStaticOrDynamicStringUnderAttributeRef(container: StaticOrDynamicString): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticOrDynamicStringUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'member' property
    * of the parent expressions.VariableRefExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 to 9.7.0
    */
  /* static member */
  inline def createInVariableRefExpressionUnderMember(container: VariableRefExpression): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInVariableRefExpressionUnderMember")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderAttributeRef(container: WidgetValue): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderAttributeRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AttributeRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.AttributeRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
