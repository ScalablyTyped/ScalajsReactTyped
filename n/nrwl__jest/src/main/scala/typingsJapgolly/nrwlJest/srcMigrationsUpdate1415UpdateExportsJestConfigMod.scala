package typingsJapgolly.nrwlJest

import typingsJapgolly.nrwlJest.anon.DidUpdateRootPreset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMigrationsUpdate1415UpdateExportsJestConfigMod {
  
  @JSImport("@nrwl/jest/src/migrations/update-14-1-5/update-exports-jest-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tree.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def updateExportsJestConfig(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("updateExportsJestConfig")(tree.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def updateRootFiles(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any
  ): DidUpdateRootPreset = ^.asInstanceOf[js.Dynamic].applyDynamic("updateRootFiles")(tree.asInstanceOf[js.Any]).asInstanceOf[DidUpdateRootPreset]
  
  inline def updateToDefaultExport(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tree */ Any,
    filePath: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateToDefaultExport")(tree.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
