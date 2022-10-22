package typingsJapgolly.prettierPackageJson

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.parseAuthor.mod.Author
import typingsJapgolly.prettierPackageJson.buildTypesMod.Options
import typingsJapgolly.prettierPackageJson.buildTypesMod.PackageJson
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.author
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.contributors
import typingsJapgolly.prettierPackageJson.prettierPackageJsonStrings.maintainers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSortContributorsMod {
  
  @JSImport("prettier-package-json/build/sort-contributors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TKey /* <: author | contributors | maintainers */](key: TKey, packageJson: PackageJson): StringDictionary[(js.Array[Author | String]) | Author | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], packageJson.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[(js.Array[Author | String]) | Author | String]]
  inline def default[TKey /* <: author | contributors | maintainers */](key: TKey, packageJson: PackageJson, opts: Options): StringDictionary[(js.Array[Author | String]) | Author | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any], packageJson.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[(js.Array[Author | String]) | Author | String]]
}
