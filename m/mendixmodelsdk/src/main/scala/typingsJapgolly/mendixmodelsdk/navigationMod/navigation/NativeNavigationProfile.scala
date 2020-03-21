package typingsJapgolly.mendixmodelsdk.navigationMod.navigation

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typingsJapgolly.mendixmodelsdk.navigationMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.pagesMod.pages.IPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.22.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsJapgolly.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsJapgolly.mendixmodelsdk.navigationMod.navigation.INavigationProfileBase because Already inherited
- typingsJapgolly.mendixmodelsdk.navigationMod.navigation.INativeNavigationProfile because var conflicts: containerAsNavigationDocument, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NativeNavigationProfile")
@js.native
class NativeNavigationProfile protected () extends NavigationProfileBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FNativeNavigationProfile: IModel = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: introduced
    */
  def bottomBarItems(): IList[BottomBarItem] = js.native
  @JSName("containerAsNavigationDocument")
  def containerAsNavigationDocument_MNativeNavigationProfile(): NavigationDocument = js.native
  def homePage(): js.Any = js.native
  def homePage(newValue: IPage): js.Any = js.native
  def homePageQualifiedName(): String | Null = js.native
  @JSName("homePage")
  def homePage_Union(): IPage | Null = js.native
  /**
    * In version 8.0.0: introduced
    */
  def roleBasedNativeHomePages(): IList[RoleBasedNativeHomePage] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NativeNavigationProfile")
@js.native
object NativeNavigationProfile extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NativeNavigationProfile = js.native
  /**
    * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
    * The new NativeNavigationProfile will be automatically stored in the 'profiles' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 and higher
    */
  def createIn(container: NavigationDocument): NativeNavigationProfile = js.native
}

