package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.anon.ValueAsString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsConfigUpdateConfigMod {
  
  @JSImport("@nrwl/jest/src/utils/config/update-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addImportStatementToJestConfig(
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    path: String,
    importStatement: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addImportStatementToJestConfig")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], importStatement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addPropertyToJestConfig(
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    path: String,
    propertyName: String,
    value: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToJestConfig")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addPropertyToJestConfig(
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    path: String,
    propertyName: String,
    value: Any,
    options: ValueAsString
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPropertyToJestConfig")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removePropertyFromJestConfig(
    host: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    path: String,
    propertyName: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removePropertyFromJestConfig")(host.asInstanceOf[js.Any], path.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
