package typingsJapgolly.atAngularCommon

import typingsJapgolly.atAngularCommon.atAngularCommonMod.HashLocationStrategy
import typingsJapgolly.atAngularCommon.atAngularCommonMod.Location
import typingsJapgolly.atAngularCommon.atAngularCommonMod.LocationStrategy
import typingsJapgolly.atAngularCommon.atAngularCommonMod.PathLocationStrategy
import typingsJapgolly.atAngularCommon.atAngularCommonMod.PlatformLocation
import typingsJapgolly.atAngularCommon.upgradeUpgradeMod.LocationUpgradeConfig
import typingsJapgolly.atAngularCore.atAngularCoreMod.InjectionToken
import typingsJapgolly.atAngularCore.atAngularCoreMod.ModuleWithProviders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/upgrade", JSImport.Namespace)
@js.native
object upgradeMod extends js.Object {
  @js.native
  class $locationShim protected ()
    extends typingsJapgolly.atAngularCommon.upgradeUpgradeMod.$locationShim {
    def this(
      $injector: js.Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: typingsJapgolly.atAngularCommon.upgradeUpgradeMod.UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
  }
  
  @js.native
  class $locationShimProvider protected ()
    extends typingsJapgolly.atAngularCommon.upgradeUpgradeMod.$locationShimProvider {
    def this(
      ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: typingsJapgolly.atAngularCommon.upgradeUpgradeMod.UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
  }
  
  @js.native
  class AngularJSUrlCodec ()
    extends typingsJapgolly.atAngularCommon.upgradeUpgradeMod.AngularJSUrlCodec
  
  @js.native
  class LocationUpgradeModule ()
    extends typingsJapgolly.atAngularCommon.upgradeUpgradeMod.LocationUpgradeModule
  
  @js.native
  abstract class UrlCodec ()
    extends typingsJapgolly.atAngularCommon.upgradeUpgradeMod.UrlCodec
  
  val LOCATION_UPGRADE_CONFIGURATION: InjectionToken[LocationUpgradeConfig] = js.native
  def ɵangular_packages_common_upgrade_upgrade_a(config: LocationUpgradeConfig): String = js.native
  def ɵangular_packages_common_upgrade_upgrade_a(config: LocationUpgradeConfig, appBaseHref: String): String = js.native
  def ɵangular_packages_common_upgrade_upgrade_b(config: LocationUpgradeConfig): js.Any = js.native
  def ɵangular_packages_common_upgrade_upgrade_c(platformLocation: PlatformLocation, baseHref: String): HashLocationStrategy | PathLocationStrategy = js.native
  def ɵangular_packages_common_upgrade_upgrade_c(platformLocation: PlatformLocation, baseHref: String, options: LocationUpgradeConfig): HashLocationStrategy | PathLocationStrategy = js.native
  def ɵangular_packages_common_upgrade_upgrade_d(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    location: Location,
    platformLocation: PlatformLocation,
    urlCodec: typingsJapgolly.atAngularCommon.upgradeUpgradeMod.UrlCodec,
    locationStrategy: LocationStrategy
  ): typingsJapgolly.atAngularCommon.upgradeUpgradeMod.$locationShim = js.native
  /* static members */
  @js.native
  object LocationUpgradeModule extends js.Object {
    def config(): ModuleWithProviders[typingsJapgolly.atAngularCommon.upgradeUpgradeMod.LocationUpgradeModule] = js.native
    def config(config: LocationUpgradeConfig): ModuleWithProviders[typingsJapgolly.atAngularCommon.upgradeUpgradeMod.LocationUpgradeModule] = js.native
  }
  
}

