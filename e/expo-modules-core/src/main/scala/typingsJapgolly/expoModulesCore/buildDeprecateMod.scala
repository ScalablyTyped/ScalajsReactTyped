package typingsJapgolly.expoModulesCore

import typingsJapgolly.expoModulesCore.anon.CurrentVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildDeprecateMod {
  
  @JSImport("expo-modules-core/build/deprecate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(library: String, deprecatedAPI: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(library.asInstanceOf[js.Any], deprecatedAPI.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(library: String, deprecatedAPI: String, options: CurrentVersion): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(library.asInstanceOf[js.Any], deprecatedAPI.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
