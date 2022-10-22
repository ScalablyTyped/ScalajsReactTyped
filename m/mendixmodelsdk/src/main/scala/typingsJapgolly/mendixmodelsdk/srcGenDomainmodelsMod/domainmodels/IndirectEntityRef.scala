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
import typingsJapgolly.mendixmodelsdk.srcGenWorkflowsMod.workflows.Parameter
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
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
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntityRef because Already inherited
- typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IIndirectEntityRef because var conflicts: containerAsMemberRef, containerAsParameter, id, isLoaded, model, structureTypeName, unit. Inlined steps */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.IndirectEntityRef")
@js.native
open class IndirectEntityRef protected () extends EntityRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsMemberRef")
  def containerAsMemberRef_MIndirectEntityRef: MemberRef = js.native
  
  @JSName("containerAsParameter")
  def containerAsParameter_MIndirectEntityRef: Parameter = js.native
  
  /**
    * In version 9.6.0: added public
    */
  def steps: IList[EntityRefStep] = js.native
  /**
    * In version 9.6.0: added public
    */
  @JSName("steps")
  val steps_FIndirectEntityRef: IList[IEntityRefStep] = js.native
}
object IndirectEntityRef {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.IndirectEntityRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateObjectClientActionUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.EntityPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityPathSourceUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent documenttemplates.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInEntityWidgetUnderEntityRef(container: EntityWidget): IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent MemberRef element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInMemberRefUnderEntityRef(container: MemberRef): IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMemberRefUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 to 7.16.0
    */
  /* static member */
  inline def createInNewButtonUnderEntityRef(container: NewButton): IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNewButtonUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent workflows.Parameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.6.0 to 9.9.0
    */
  /* static member */
  inline def createInParameterUnderEntityRef(container: Parameter): IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInParameterUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderConstrainedByRefs")(container.asInstanceOf[js.Any]).asInstanceOf[IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.SelectorXPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorXPathSourceUnderConstrainedByRefs")(container.asInstanceOf[js.Any]).asInstanceOf[IndirectEntityRef]
  
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderEntityRef(container: WidgetValue): IndirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[IndirectEntityRef]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.IndirectEntityRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.IndirectEntityRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
