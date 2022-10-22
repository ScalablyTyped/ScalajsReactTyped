package typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.EntityWidget
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.CreateObjectClientAction
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.EntityPathSource
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NewButton
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SelectorXPathSource
import typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.IParameter
import typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.Parameter
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
- typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntityRef because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsMemberRef, containerAsParameter */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.EntityRef")
@js.native
open class EntityRef protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsCreateObjectClientAction: CreateObjectClientAction = js.native
  
  def containerAsEntityPathSource: EntityPathSource = js.native
  
  def containerAsEntityWidget: EntityWidget = js.native
  
  def containerAsMemberRef: MemberRef = js.native
  @JSName("containerAsMemberRef")
  val containerAsMemberRef_FEntityRef: IMemberRef = js.native
  
  def containerAsNewButton: NewButton = js.native
  
  def containerAsParameter: Parameter = js.native
  @JSName("containerAsParameter")
  val containerAsParameter_FEntityRef: IParameter = js.native
  
  def containerAsReferenceSetSelector: ReferenceSetSelector = js.native
  
  def containerAsSelectorXPathSource: SelectorXPathSource = js.native
  
  def containerAsWidgetValue: WidgetValue = js.native
}
object EntityRef {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.EntityRef")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.EntityRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.EntityRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
