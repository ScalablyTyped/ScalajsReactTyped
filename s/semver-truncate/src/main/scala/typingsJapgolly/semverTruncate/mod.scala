package typingsJapgolly.semverTruncate

import typingsJapgolly.semverTruncate.semverTruncateStrings.major
import typingsJapgolly.semverTruncate.semverTruncateStrings.minor
import typingsJapgolly.semverTruncate.semverTruncateStrings.patch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver-truncate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(version: String, `type`: patch | minor | major): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(version.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
}
