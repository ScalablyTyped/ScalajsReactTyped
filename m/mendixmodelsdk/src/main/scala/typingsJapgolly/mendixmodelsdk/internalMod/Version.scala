package typingsJapgolly.mendixmodelsdk.internalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "Version")
@js.native
class Version protected ()
  extends typingsJapgolly.mendixmodelsdk.versionChecksMod.Version {
  def this(major: Double, minor: Double, patch: Double) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/sdk/internal", "Version")
@js.native
object Version extends js.Object {
  var memoisMap: js.Any = js.native
  /**
    * Parses and @returns the given string as a Version object.
    *
    * This function is memoised to keep memory and time consumption low,
    * given that only a handful of versions exist at any time anyway.
    */
  def parse(versionString: String): typingsJapgolly.mendixmodelsdk.versionChecksMod.Version = js.native
}

