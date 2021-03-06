package typingsJapgolly.mendixmodelsdk.pagesMod.pages

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.EntityRef
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorXPathSource")
@js.native
class SelectorXPathSource protected () extends SelectorSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSelectorXPathSource: IModel = js.native
  /**
    * In version 8.0.0: deleted
    */
  def applyContext(): Boolean = js.native
  def applyContext(newValue: Boolean): js.Any = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    */
  def constrainedBy(): IList[String] = js.native
  /**
    * In version 7.11.0: introduced
    */
  def constrainedByRefs(): IList[EntityRef] = js.native
  /**
    * In version 8.0.0: deleted
    */
  def removeAllFromContext(): Boolean = js.native
  def removeAllFromContext(newValue: Boolean): js.Any = js.native
  /**
    * In version 8.0.0: deleted
    */
  def removeFromContextEntities(): IList[IEntity] = js.native
  def removeFromContextEntitiesQualifiedNames(): js.Array[String] = js.native
  def sortBar(): GridSortBar = js.native
  def sortBar(newValue: GridSortBar): js.Any = js.native
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def xPathConstraint(): String = js.native
  def xPathConstraint(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectorXPathSource")
@js.native
object SelectorXPathSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new SelectorXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SelectorXPathSource = js.native
  /**
    * Creates and returns a new SelectorXPathSource instance in the SDK and on the server.
    * The new SelectorXPathSource will be automatically stored in the 'selectorSource' property
    * of the parent AssociationWidget element passed as argument.
    */
  def createIn(container: AssociationWidget): SelectorXPathSource = js.native
}

