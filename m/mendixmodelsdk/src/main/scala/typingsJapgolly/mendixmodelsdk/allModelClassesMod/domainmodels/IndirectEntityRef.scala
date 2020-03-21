package typingsJapgolly.mendixmodelsdk.allModelClassesMod.domainmodels

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsJapgolly.mendixmodelsdk.documenttemplatesMod.documenttemplates.EntityWidget
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.CreateObjectClientAction
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.EntityPathSource
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.NewButton
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.SelectorXPathSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.IndirectEntityRef")
@js.native
class IndirectEntityRef protected ()
  extends typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.IndirectEntityRef")
@js.native
object IndirectEntityRef extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.CreateObjectClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInCreateObjectClientActionUnderEntityRef(container: CreateObjectClientAction): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.EntityPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInEntityPathSourceUnderEntityRef(container: EntityPathSource): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent documenttemplates.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInEntityWidgetUnderEntityRef(container: EntityWidget): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent MemberRef element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInMemberRefUnderEntityRef(container: typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.MemberRef): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent pages.NewButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 to 7.16.0
    */
  def createInNewButtonUnderEntityRef(container: NewButton): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInReferenceSetSelectorUnderConstrainedByRefs(container: ReferenceSetSelector): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'constrainedByRefs' property
    * of the parent pages.SelectorXPathSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInSelectorXPathSourceUnderConstrainedByRefs(container: SelectorXPathSource): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
  /**
    * Creates and returns a new IndirectEntityRef instance in the SDK and on the server.
    * The new IndirectEntityRef will be automatically stored in the 'entityRef' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createInWidgetValueUnderEntityRef(container: WidgetValue): typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IndirectEntityRef = js.native
}

