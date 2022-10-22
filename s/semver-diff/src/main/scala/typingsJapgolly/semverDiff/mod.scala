package typingsJapgolly.semverDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(versionA: String, versionB: String): js.UndefOr[Difference] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(versionA.asInstanceOf[js.Any], versionB.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Difference]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semverDiff.semverDiffStrings.major
    - typingsJapgolly.semverDiff.semverDiffStrings.premajor
    - typingsJapgolly.semverDiff.semverDiffStrings.minor
    - typingsJapgolly.semverDiff.semverDiffStrings.preminor
    - typingsJapgolly.semverDiff.semverDiffStrings.patch
    - typingsJapgolly.semverDiff.semverDiffStrings.prepatch
    - typingsJapgolly.semverDiff.semverDiffStrings.prerelease
    - typingsJapgolly.semverDiff.semverDiffStrings.build
  */
  trait Difference extends StObject
  object Difference {
    
    inline def build: typingsJapgolly.semverDiff.semverDiffStrings.build = "build".asInstanceOf[typingsJapgolly.semverDiff.semverDiffStrings.build]
    
    inline def major: typingsJapgolly.semverDiff.semverDiffStrings.major = "major".asInstanceOf[typingsJapgolly.semverDiff.semverDiffStrings.major]
    
    inline def minor: typingsJapgolly.semverDiff.semverDiffStrings.minor = "minor".asInstanceOf[typingsJapgolly.semverDiff.semverDiffStrings.minor]
    
    inline def patch: typingsJapgolly.semverDiff.semverDiffStrings.patch = "patch".asInstanceOf[typingsJapgolly.semverDiff.semverDiffStrings.patch]
    
    inline def premajor: typingsJapgolly.semverDiff.semverDiffStrings.premajor = "premajor".asInstanceOf[typingsJapgolly.semverDiff.semverDiffStrings.premajor]
    
    inline def preminor: typingsJapgolly.semverDiff.semverDiffStrings.preminor = "preminor".asInstanceOf[typingsJapgolly.semverDiff.semverDiffStrings.preminor]
    
    inline def prepatch: typingsJapgolly.semverDiff.semverDiffStrings.prepatch = "prepatch".asInstanceOf[typingsJapgolly.semverDiff.semverDiffStrings.prepatch]
    
    inline def prerelease: typingsJapgolly.semverDiff.semverDiffStrings.prerelease = "prerelease".asInstanceOf[typingsJapgolly.semverDiff.semverDiffStrings.prerelease]
  }
}
