package typingsJapgolly.ionic

import typingsJapgolly.ionic.ailmentsBaseMod.AilmentDeps
import typingsJapgolly.ionic.definitionsMod.IAilment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/doctor", JSImport.Namespace)
@js.native
object libDoctorMod extends js.Object {
  @js.native
  abstract class Ailment protected ()
    extends typingsJapgolly.ionic.ailmentsMod.Ailment {
    def this(hasClientConfigLogProjectShellSession: AilmentDeps) = this()
  }
  
  @js.native
  class AilmentRegistry ()
    extends typingsJapgolly.ionic.ailmentsBaseMod.AilmentRegistry
  
  @js.native
  class CordovaPlatformsCommitted ()
    extends typingsJapgolly.ionic.ailmentsMod.CordovaPlatformsCommitted
  
  @js.native
  class DefaultCordovaBundleIdUsed ()
    extends typingsJapgolly.ionic.ailmentsMod.DefaultCordovaBundleIdUsed
  
  @js.native
  class GitConfigInvalid ()
    extends typingsJapgolly.ionic.ailmentsMod.GitConfigInvalid
  
  @js.native
  class GitNotUsed ()
    extends typingsJapgolly.ionic.ailmentsMod.GitNotUsed
  
  @js.native
  class IonicCLIInstalledLocally ()
    extends typingsJapgolly.ionic.ailmentsMod.IonicCLIInstalledLocally
  
  @js.native
  class IonicNativeOldVersionInstalled ()
    extends typingsJapgolly.ionic.ailmentsMod.IonicNativeOldVersionInstalled
  
  @js.native
  class NpmInstalledLocally ()
    extends typingsJapgolly.ionic.ailmentsMod.NpmInstalledLocally
  
  @js.native
  class UnsavedCordovaPlatforms ()
    extends typingsJapgolly.ionic.ailmentsMod.UnsavedCordovaPlatforms
  
  @js.native
  class ViewportFitNotSet ()
    extends typingsJapgolly.ionic.ailmentsMod.ViewportFitNotSet
  
  def formatAilmentMessage(ailment: IAilment): js.Promise[String] = js.native
}

