package typingsJapgolly.mendixmodelsdk.allModelClassesMod.navigation

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.navigationMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.2.0: added public
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.NavigationProfile")
@js.native
class NavigationProfile protected ()
  extends typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.NavigationProfile")
@js.native
object NavigationProfile extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'profiles' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 and higher
    */
  def createIn(container: typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'desktopProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.1.0
    */
  def createInNavigationDocumentUnderDesktopProfile(container: typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.1.0
    */
  def createInNavigationDocumentUnderHybridPhoneProfile(container: typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile6' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.10.4 to 6.10.4
    */
  def createInNavigationDocumentUnderHybridPhoneProfile6(container: typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.1.0
    */
  def createInNavigationDocumentUnderHybridTabletProfile(container: typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile6' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.10.4 to 6.10.4
    */
  def createInNavigationDocumentUnderHybridTabletProfile6(container: typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'offlinePhoneProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInNavigationDocumentUnderOfflinePhoneProfile(container: typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'phoneProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.1.0
    */
  def createInNavigationDocumentUnderPhoneProfile(container: typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'profiles' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 and higher
    */
  def createInNavigationDocumentUnderProfiles(container: typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'tabletProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.1.0
    */
  def createInNavigationDocumentUnderTabletProfile(container: typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typingsJapgolly.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
}

