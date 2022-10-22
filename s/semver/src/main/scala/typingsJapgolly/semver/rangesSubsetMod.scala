package typingsJapgolly.semver

import typingsJapgolly.semver.mod.RangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangesSubsetMod {
  
  /**
    * Return true if the subRange range is entirely contained by the superRange range.
    */
  inline def apply(sub: String, dom: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: String, dom: String, options: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: String, dom: typingsJapgolly.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: String, dom: typingsJapgolly.semver.classesRangeMod.^, options: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: typingsJapgolly.semver.classesRangeMod.^, dom: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: typingsJapgolly.semver.classesRangeMod.^, dom: String, options: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: typingsJapgolly.semver.classesRangeMod.^, dom: typingsJapgolly.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    sub: typingsJapgolly.semver.classesRangeMod.^,
    dom: typingsJapgolly.semver.classesRangeMod.^,
    options: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("semver/ranges/subset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
