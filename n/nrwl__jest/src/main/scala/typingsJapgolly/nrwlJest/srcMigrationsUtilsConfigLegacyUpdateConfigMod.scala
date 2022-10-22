package typingsJapgolly.nrwlJest

import typingsJapgolly.angularDevkitSchematics.mod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMigrationsUtilsConfigLegacyUpdateConfigMod {
  
  @JSImport("@nrwl/jest/src/migrations/utils/config/legacy/update-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPropertyToJestConfig(host: Tree, path: String, propertyName: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToJestConfig")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removePropertyFromJestConfig(host: Tree, path: String, propertyName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removePropertyFromJestConfig")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
