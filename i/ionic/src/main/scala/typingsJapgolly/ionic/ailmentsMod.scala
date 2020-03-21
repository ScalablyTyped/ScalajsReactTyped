package typingsJapgolly.ionic

import typingsJapgolly.ionic.ailmentsBaseMod.AilmentDeps
import typingsJapgolly.ionic.definitionsMod.IAilment
import typingsJapgolly.ionic.ionicBooleans.`true`
import typingsJapgolly.ionic.ionicStrings.`cordova-platforms-committed`
import typingsJapgolly.ionic.ionicStrings.`default-cordova-bundle-id-used`
import typingsJapgolly.ionic.ionicStrings.`git-config-invalid`
import typingsJapgolly.ionic.ionicStrings.`git-not-used`
import typingsJapgolly.ionic.ionicStrings.`ionic-installed-locally`
import typingsJapgolly.ionic.ionicStrings.`ionic-native-old-version-installed`
import typingsJapgolly.ionic.ionicStrings.`npm-installed-locally`
import typingsJapgolly.ionic.ionicStrings.`unsaved-cordova-platforms`
import typingsJapgolly.ionic.ionicStrings.`viewport-fit-not-set`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor/ailments", JSImport.Namespace)
@js.native
object ailmentsMod extends js.Object {
  @js.native
  abstract class Ailment protected ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @js.native
  class AilmentRegistry ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.AilmentRegistry
  
  @js.native
  class CordovaPlatformsCommitted ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_CordovaPlatformsCommitted: `cordova-platforms-committed` = js.native
  }
  
  @js.native
  class DefaultCordovaBundleIdUsed ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_DefaultCordovaBundleIdUsed: `default-cordova-bundle-id-used` = js.native
  }
  
  @js.native
  class GitConfigInvalid ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_GitConfigInvalid: `git-config-invalid` = js.native
  }
  
  @js.native
  class GitNotUsed ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_GitNotUsed: `git-not-used` = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.ionic.definitionsMod.IAilment because Already inherited
  - typingsJapgolly.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @js.native
  class IonicCLIInstalledLocally ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_IonicCLIInstalledLocally: `ionic-installed-locally` = js.native
    val treatable: Boolean | `true` = js.native
  }
  
  @js.native
  class IonicNativeOldVersionInstalled ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_IonicNativeOldVersionInstalled: `ionic-native-old-version-installed` = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.ionic.definitionsMod.IAilment because Already inherited
  - typingsJapgolly.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @js.native
  class NpmInstalledLocally ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_NpmInstalledLocally: `npm-installed-locally` = js.native
    val treatable: Boolean | `true` = js.native
  }
  
  @js.native
  class UnsavedCordovaPlatforms ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_UnsavedCordovaPlatforms: `unsaved-cordova-platforms` = js.native
  }
  
  @js.native
  class ViewportFitNotSet ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.Ailment {
    @JSName("id")
    val id_ViewportFitNotSet: `viewport-fit-not-set` = js.native
  }
  
  def formatAilmentMessage(ailment: IAilment): js.Promise[String] = js.native
}

