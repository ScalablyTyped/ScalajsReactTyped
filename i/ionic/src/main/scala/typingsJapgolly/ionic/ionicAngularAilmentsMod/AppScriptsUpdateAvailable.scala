package typingsJapgolly.ionic.ionicAngularAilmentsMod

import typingsJapgolly.ionic.ionicBooleans.`true`
import typingsJapgolly.ionic.ionicStrings.`app-scripts-update-available`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.ionic.definitionsMod.IAilment because Already inherited
- typingsJapgolly.ionic.definitionsMod.TreatableAilment because var conflicts: `implicit`, projects. Inlined treatable */ @JSImport("ionic/lib/project/ionic-angular/ailments", "AppScriptsUpdateAvailable")
@js.native
class AppScriptsUpdateAvailable () extends IonicAngularAilment {
  var currentVersion: js.UndefOr[String] = js.native
  @JSName("id")
  val id_AppScriptsUpdateAvailable: `app-scripts-update-available` = js.native
  var latestVersion: js.UndefOr[String] = js.native
  val treatable: Boolean | `true` = js.native
  def getVersionPair(): js.Promise[js.Tuple2[String, String]] = js.native
}

