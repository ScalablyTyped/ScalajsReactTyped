package typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels

import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.EntityWidget
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.CreateObjectClientAction
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.EntityPathSource
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.NewButton
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.ReferenceSetSelector
import typingsJapgolly.mendixmodelsdk.srcGenPagesMod.pages.SelectorXPathSource
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
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.DirectEntityRef")
@js.native
open class DirectEntityRef protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DirectEntityRef {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.DirectEntityRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef]
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  inline def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCreateObjectClientActionUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef]
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.EntityPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityPathSourceUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef]
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent documenttemplates.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInEntityWidgetUnderEntityRef(container: EntityWidget): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInEntityWidgetUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef]
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 to 7.16.0
    */
  /* static member */
  inline def createInNewButtonUnderEntityRef(container: NewButton): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNewButtonUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef]
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSetSelectorUnderConstrainedByRefs")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef]
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.SelectorXPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorXPathSourceUnderConstrainedByRefs")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef]
  
  /**
    * Creates and returns a new DirectEntityRef instance in the SDK and on the server.
    * The new DirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  /* static member */
  inline def createInWidgetValueUnderEntityRef(container: WidgetValue): typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWidgetValueUnderEntityRef")(container.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DirectEntityRef]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.DirectEntityRef.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.DirectEntityRef.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
