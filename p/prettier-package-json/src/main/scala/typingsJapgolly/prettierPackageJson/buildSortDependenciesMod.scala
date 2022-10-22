package typingsJapgolly.prettierPackageJson

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.prettierPackageJson.buildTypesMod.PackageJson
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bundleDependencies
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.bundledDependencies
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.dependencies
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.devDependencies
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.optionalDependencies
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.peerDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSortDependenciesMod {
  
  @JSImport("prettier-package-json/build/sort-dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TKey /* <: bundledDependencies | bundleDependencies | dependencies | devDependencies | optionalDependencies | peerDependencies */](key: TKey, packageJson: PackageJson): StringDictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: prettier-package-json.prettier-package-json/build/types.PackageJson[TKey] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], packageJson.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: prettier-package-json.prettier-package-json/build/types.PackageJson[TKey] */ js.Any
  ]]
}
