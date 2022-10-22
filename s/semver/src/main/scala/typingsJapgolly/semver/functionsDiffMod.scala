package typingsJapgolly.semver

import typingsJapgolly.semver.mod.ReleaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsDiffMod {
  
  /**
    * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
    */
  inline def apply(v1: String, v2: String): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  inline def apply(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  inline def apply(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  inline def apply(v1: typingsJapgolly.semver.classesSemverMod.^, v2: typingsJapgolly.semver.classesSemverMod.^): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  
  @JSImport("semver/functions/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
