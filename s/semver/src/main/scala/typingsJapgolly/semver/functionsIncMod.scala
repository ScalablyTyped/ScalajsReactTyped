package typingsJapgolly.semver

import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.mod.ReleaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsIncMod {
  
  /**
    * Return the version incremented by the release type (major, minor, patch, or prerelease), or null if it's not valid.
    */
  inline def apply(version: String, release: ReleaseType): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, optionsOrLoose: Unit, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: typingsJapgolly.semver.classesSemverMod.^, release: ReleaseType): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: typingsJapgolly.semver.classesSemverMod.^, release: ReleaseType, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: typingsJapgolly.semver.classesSemverMod.^, release: ReleaseType, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(
    version: typingsJapgolly.semver.classesSemverMod.^,
    release: ReleaseType,
    optionsOrLoose: Boolean,
    identifier: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(
    version: typingsJapgolly.semver.classesSemverMod.^,
    release: ReleaseType,
    optionsOrLoose: Unit,
    identifier: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: typingsJapgolly.semver.classesSemverMod.^, release: ReleaseType, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(
    version: typingsJapgolly.semver.classesSemverMod.^,
    release: ReleaseType,
    optionsOrLoose: Options,
    identifier: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("semver/functions/inc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
