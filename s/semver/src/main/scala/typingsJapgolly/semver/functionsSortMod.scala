package typingsJapgolly.semver

import typingsJapgolly.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsSortMod {
  
  /**
    * Sorts an array of semver entries in ascending order using `compareBuild()`.
    */
  inline def apply[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def apply[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def apply[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("semver/functions/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
