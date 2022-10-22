package typingsJapgolly.semver

import typingsJapgolly.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsCleanMod {
  
  /**
    * Returns cleaned (removed leading/trailing whitespace, remove '=v' prefix) and parsed version, or null if version is invalid.
    */
  inline def apply(version: String): String | Null = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(version: String, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(version: String, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  @JSImport("semver/functions/clean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
