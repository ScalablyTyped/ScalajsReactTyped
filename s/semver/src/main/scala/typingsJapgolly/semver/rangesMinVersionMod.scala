package typingsJapgolly.semver

import typingsJapgolly.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangesMinVersionMod {
  
  /**
    * Return the lowest version that can possibly match the given range.
    */
  inline def apply(range: String): typingsJapgolly.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def apply(range: String, optionsOrLoose: Boolean): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def apply(range: String, optionsOrLoose: Options): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def apply(range: typingsJapgolly.semver.classesRangeMod.^): typingsJapgolly.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def apply(range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Boolean): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def apply(range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Options): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  
  @JSImport("semver/ranges/min-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
