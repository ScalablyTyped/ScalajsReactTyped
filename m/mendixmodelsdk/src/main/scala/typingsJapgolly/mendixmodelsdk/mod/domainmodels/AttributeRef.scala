package typingsJapgolly.mendixmodelsdk.mod.domainmodels

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.AttributeWidget
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.GridSortItem
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.expressionsMod.expressions.VariableRefExpression
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
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
@JSImport("mendixmodelsdk", "domainmodels.AttributeRef")
@js.native
class AttributeRef protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.domainmodels.AttributeRef {
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
@JSImport("mendixmodelsdk", "domainmodels.AttributeRef")
@js.native
object AttributeRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInAttributeWidgetUnderAttributeRef(container: AttributeWidget): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInClientTemplateParameterUnderAttributeRef(container: ClientTemplateParameter): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInDataGridColumnUnderAttributeRef(container: DataGridColumn): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent documenttemplates.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInDocumentTemplatesGridSortItemUnderAttributeRef(container: GridSortItem): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInGridColumnUnderAttributeRef(container: GridColumn): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'searchRefs' property
    * of the parent pages.ListViewSearch element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInListViewSearchUnderSearchRefs(container: ListViewSearch): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.MemberWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInMemberWidgetUnderAttributeRef(container: MemberWidget): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.GridSortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInPagesGridSortItemUnderAttributeRef(container: typingsJapgolly.mendixmodelsdk.pagesMod.pages.GridSortItem): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'lowerBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInRangeSearchFieldUnderLowerBoundRef(container: RangeSearchField): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'upperBoundRef' property
    * of the parent pages.RangeSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInRangeSearchFieldUnderUpperBoundRef(container: RangeSearchField): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.SingleSearchField element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInSingleSearchFieldUnderAttributeRef(container: SingleSearchField): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent microflows.SortItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInSortItemUnderAttributeRef(container: SortItem): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent pages.StaticOrDynamicString element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInStaticOrDynamicStringUnderAttributeRef(container: StaticOrDynamicString): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'member' property
    * of the parent expressions.VariableRefExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInVariableRefExpressionUnderMember(container: VariableRefExpression): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
  /**
    * Creates and returns a new AttributeRef instance in the SDK and on the server.
    * The new AttributeRef will be automatically stored in the 'attributeRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInWidgetValueUnderAttributeRef(container: WidgetValue): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef = js.native
}

