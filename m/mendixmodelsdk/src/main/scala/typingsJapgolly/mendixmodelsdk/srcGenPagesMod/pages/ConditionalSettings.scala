package typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.CustomWidget
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttribute
import typingsJapgolly.mendixmodelsdk.srcGenEnumerationsMod.enumerations.Condition
import typingsJapgolly.mendixmodelsdk.srcGenExpressionsMod.expressions.Expression
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element
import typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/pages", "pages.ConditionalSettings")
@js.native
open class ConditionalSettings protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def attribute: IAttribute | Null = js.native
  
  def attributeQualifiedName: String | Null = js.native
  
  def attribute_=(newValue: IAttribute | Null): Unit = js.native
  
  def conditions: IList[Condition] = js.native
  
  def containerAsConditionallyEditableWidget: ConditionallyEditableWidget = js.native
  
  def containerAsConditionallyVisibleWidget: ConditionallyVisibleWidget = js.native
  
  def containerAsControlBarButton: ControlBarButton = js.native
  
  def containerAsCustomWidget: CustomWidget = js.native
  
  def containerAsLayoutGridRow: LayoutGridRow = js.native
  
  def containerAsNavigationListItem: NavigationListItem = js.native
  
  def containerAsTabPage: TabPage = js.native
  
  def containerAsTableRow: TableRow = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 7.0.1: introduced
    */
  def expression: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.8.0: deleted
    * In version 7.9.0: introduced
    */
  def expressionModel: Expression = js.native
  def expressionModel_=(newValue: Expression): Unit = js.native
  
  def expression_=(newValue: String): Unit = js.native
}
object ConditionalSettings {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ConditionalSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ConditionalSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ConditionalSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
