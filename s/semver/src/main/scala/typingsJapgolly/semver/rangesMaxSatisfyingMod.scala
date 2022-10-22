package typingsJapgolly.semver

import typingsJapgolly.semver.mod.RangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangesMaxSatisfyingMod {
  
  /**
    * Return the highest version in the list that satisfies the range, or null if none of them do.
    */
  inline def apply[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: String): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: RangeOptions): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: typingsJapgolly.semver.classesRangeMod.^): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Boolean): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](
    versions: js.Array[T],
    range: typingsJapgolly.semver.classesRangeMod.^,
    optionsOrLoose: RangeOptions
  ): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  @JSImport("semver/ranges/max-satisfying", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
