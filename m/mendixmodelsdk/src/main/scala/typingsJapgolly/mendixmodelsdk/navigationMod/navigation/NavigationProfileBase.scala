package typingsJapgolly.mendixmodelsdk.navigationMod.navigation

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.Element
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.navigationMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.navigationMod.navigation.INavigationProfileBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsNavigationDocument, name */ @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfileBase")
@js.native
abstract class NavigationProfileBase protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsNavigationDocument")
  val containerAsNavigationDocument_FNavigationProfileBase: INavigationDocument = js.native
  @JSName("model")
  var model_FNavigationProfileBase: IModel = js.native
  /**
    * In version 7.2.0: introduced
    */
  @JSName("name")
  val name_FNavigationProfileBase: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  def containerAsNavigationDocument(): NavigationDocument = js.native
  /**
    * In version 7.2.0: introduced
    */
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.22.0: introduced
    */
  def offlineEntityConfigs(): IList[OfflineEntityConfig] | Null = js.native
  @JSName("qualifiedName")
  def qualifiedName_MNavigationProfileBase(): String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfileBase")
@js.native
object NavigationProfileBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

