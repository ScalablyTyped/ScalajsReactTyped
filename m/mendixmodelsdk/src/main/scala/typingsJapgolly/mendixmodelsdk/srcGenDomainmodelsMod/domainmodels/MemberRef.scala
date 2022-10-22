package typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

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
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.6.0: added public
  * In version 7.11.0: introduced
  */
/* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IMemberRef because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined entityRef */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.MemberRef")
@js.native
open class MemberRef protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAttributeWidget: AttributeWidget = js.native
  
  def containerAsClientTemplateParameter: ClientTemplateParameter = js.native
  
  def containerAsDataGridColumn: DataGridColumn = js.native
  
  def containerAsDocumentTemplatesGridSortItem: GridSortItem = js.native
  
  def containerAsGridColumn: GridColumn = js.native
  
  def containerAsListViewSearch: ListViewSearch = js.native
  
  def containerAsMemberWidget: MemberWidget = js.native
  
  def containerAsPagesGridSortItem: typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.GridSortItem = js.native
  
  def containerAsRangeSearchField: RangeSearchField = js.native
  
  def containerAsSingleSearchField: SingleSearchField = js.native
  
  def containerAsSortItem: SortItem = js.native
  
  def containerAsStaticOrDynamicString: StaticOrDynamicString = js.native
  
  def containerAsVariableRefExpression: VariableRefExpression = js.native
  
  def containerAsWidgetValue: WidgetValue = js.native
  
  /**
    * In version 9.6.0: added public
    */
  def entityRef: IndirectEntityRef | Null = js.native
  def entityRef_=(newValue: IndirectEntityRef | Null): Unit = js.native
  /**
    * In version 9.6.0: added public
    */
  @JSName("entityRef")
  val entityRef_FMemberRef: IIndirectEntityRef | Null = js.native
}
object MemberRef {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.MemberRef")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.MemberRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.MemberRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
