package typingsJapgolly.semver

import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.mod.RangeOptions
import typingsJapgolly.semver.mod.ReleaseType
import typingsJapgolly.semver.semverInts.`-1`
import typingsJapgolly.semver.semverInts.`0`
import typingsJapgolly.semver.semverInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classesSemverMod {
  
  @JSImport("semver/classes/semver", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SemVer {
    def this(version: String) = this()
    def this(version: SemVer) = this()
    def this(version: String, optionsOrLoose: Boolean) = this()
    def this(version: String, optionsOrLoose: RangeOptions) = this()
    def this(version: SemVer, optionsOrLoose: Boolean) = this()
    def this(version: SemVer, optionsOrLoose: RangeOptions) = this()
  }
  
  @js.native
  trait SemVer extends StObject {
    
    var build: js.Array[String] = js.native
    
    /**
      * Compares two versions excluding build identifiers (the bit after `+` in the semantic version string).
      *
      * @return
      * - `0` if `this` == `other`
      * - `1` if `this` is greater
      * - `-1` if `other` is greater.
      */
    def compare(other: String): `1` | `0` | `-1` = js.native
    def compare(other: SemVer): `1` | `0` | `-1` = js.native
    
    /**
      * Compares the build identifier of two versions.
      *
      * @return
      * - `0` if `this` == `other`
      * - `1` if `this` is greater
      * - `-1` if `other` is greater.
      */
    def compareBuild(other: String): `1` | `0` | `-1` = js.native
    def compareBuild(other: SemVer): `1` | `0` | `-1` = js.native
    
    /**
      * Compares the release portion of two versions.
      *
      * @return
      * - `0` if `this` == `other`
      * - `1` if `this` is greater
      * - `-1` if `other` is greater.
      */
    def compareMain(other: String): `1` | `0` | `-1` = js.native
    def compareMain(other: SemVer): `1` | `0` | `-1` = js.native
    
    /**
      * Compares the prerelease portion of two versions.
      *
      * @return
      * - `0` if `this` == `other`
      * - `1` if `this` is greater
      * - `-1` if `other` is greater.
      */
    def comparePre(other: String): `1` | `0` | `-1` = js.native
    def comparePre(other: SemVer): `1` | `0` | `-1` = js.native
    
    def format(): String = js.native
    
    def inc(release: ReleaseType): SemVer = js.native
    def inc(release: ReleaseType, identifier: String): SemVer = js.native
    
    def inspect(): String = js.native
    
    var loose: Boolean = js.native
    
    var major: Double = js.native
    
    var minor: Double = js.native
    
    var options: Options = js.native
    
    var patch: Double = js.native
    
    var prerelease: js.Array[String | Double] = js.native
    
    var raw: String = js.native
    
    var version: String = js.native
  }
}
