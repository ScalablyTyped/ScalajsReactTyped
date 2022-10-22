package typingsJapgolly.semver

import typingsJapgolly.semver.mod.CoerceOptions
import typingsJapgolly.semver.mod.Operator
import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.mod.RangeOptions
import typingsJapgolly.semver.mod.ReleaseType
import typingsJapgolly.semver.semverInts.`-1`
import typingsJapgolly.semver.semverInts.`0`
import typingsJapgolly.semver.semverInts.`1`
import typingsJapgolly.semver.semverStrings.Greaterthansign
import typingsJapgolly.semver.semverStrings.Lessthansign
import typingsJapgolly.semver.semverStrings.`2Dot0Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preloadMod {
  
  @JSImport("semver/preload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("semver/preload", "Comparator")
  @js.native
  open class Comparator protected ()
    extends typingsJapgolly.semver.mod.Comparator {
    def this(comp: String) = this()
    def this(comp: typingsJapgolly.semver.classesComparatorMod.Comparator) = this()
    def this(comp: String, optionsOrLoose: Boolean) = this()
    def this(comp: String, optionsOrLoose: Options) = this()
    def this(comp: typingsJapgolly.semver.classesComparatorMod.Comparator, optionsOrLoose: Boolean) = this()
    def this(comp: typingsJapgolly.semver.classesComparatorMod.Comparator, optionsOrLoose: Options) = this()
  }
  
  @JSImport("semver/preload", "Range")
  @js.native
  open class Range protected ()
    extends typingsJapgolly.semver.mod.Range {
    def this(range: String) = this()
    def this(range: typingsJapgolly.semver.classesRangeMod.Range) = this()
    def this(range: String, optionsOrLoose: Boolean) = this()
    def this(range: String, optionsOrLoose: Options) = this()
    def this(range: typingsJapgolly.semver.classesRangeMod.Range, optionsOrLoose: Boolean) = this()
    def this(range: typingsJapgolly.semver.classesRangeMod.Range, optionsOrLoose: Options) = this()
  }
  
  @JSImport("semver/preload", "SEMVER_SPEC_VERSION")
  @js.native
  val SEMVER_SPEC_VERSION: `2Dot0Dot0` = js.native
  
  @JSImport("semver/preload", "SemVer")
  @js.native
  open class SemVer protected ()
    extends typingsJapgolly.semver.mod.SemVer {
    def this(version: String) = this()
    def this(version: typingsJapgolly.semver.classesSemverMod.SemVer) = this()
    def this(version: String, optionsOrLoose: Boolean) = this()
    def this(version: String, optionsOrLoose: RangeOptions) = this()
    def this(version: typingsJapgolly.semver.classesSemverMod.SemVer, optionsOrLoose: Boolean) = this()
    def this(version: typingsJapgolly.semver.classesSemverMod.SemVer, optionsOrLoose: RangeOptions) = this()
  }
  
  /**
    * Returns cleaned (removed leading/trailing whitespace, remove '=v' prefix) and parsed version, or null if version is invalid.
    */
  inline def clean(version: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")(version.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def clean(version: String, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("clean")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def clean(version: String, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("clean")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  /**
    * Pass in a comparison string, and it'll call the corresponding semver comparison function.
    * "===" and "!==" do simple string comparison, but are included for completeness.
    * Throws if an invalid comparison string is provided.
    */
  inline def cmp(v1: String, operator: Operator, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cmp(v1: String, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cmp(v1: String, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cmp(v1: String, operator: Operator, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cmp(
    v1: String,
    operator: Operator,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cmp(
    v1: String,
    operator: Operator,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cmp(v1: typingsJapgolly.semver.classesSemverMod.^, operator: Operator, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cmp(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    operator: Operator,
    v2: String,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cmp(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    operator: Operator,
    v2: String,
    optionsOrLoose: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cmp(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    operator: Operator,
    v2: typingsJapgolly.semver.classesSemverMod.^
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cmp(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    operator: Operator,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def cmp(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    operator: Operator,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(v1.asInstanceOf[js.Any], operator.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Coerces a string to SemVer if possible
    */
  inline def coerce(): typingsJapgolly.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")().asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def coerce(version: String): typingsJapgolly.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(version.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def coerce(version: String, options: CoerceOptions): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def coerce(version: Double): typingsJapgolly.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(version.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def coerce(version: Double, options: CoerceOptions): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def coerce(version: Null, options: CoerceOptions): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def coerce(version: Unit, options: CoerceOptions): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def coerce(version: typingsJapgolly.semver.classesSemverMod.^): typingsJapgolly.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(version.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def coerce(version: typingsJapgolly.semver.classesSemverMod.^, options: CoerceOptions): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(version.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  
  /**
    * Compares two versions excluding build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    */
  inline def compare(v1: String, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compare(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compare(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compare(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compare(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compare(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compare(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compare(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compare(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compare(v1: typingsJapgolly.semver.classesSemverMod.^, v2: typingsJapgolly.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compare(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compare(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  /**
    * Compares two versions including build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    *
    * @since 6.1.0
    */
  inline def compareBuild(a: String, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareBuild(a: String, b: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareBuild(a: String, b: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareBuild(a: String, b: typingsJapgolly.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareBuild(a: String, b: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareBuild(a: String, b: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareBuild(a: typingsJapgolly.semver.classesSemverMod.^, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareBuild(a: typingsJapgolly.semver.classesSemverMod.^, b: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareBuild(a: typingsJapgolly.semver.classesSemverMod.^, b: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareBuild(a: typingsJapgolly.semver.classesSemverMod.^, b: typingsJapgolly.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareBuild(
    a: typingsJapgolly.semver.classesSemverMod.^,
    b: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareBuild(
    a: typingsJapgolly.semver.classesSemverMod.^,
    b: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBuild")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  inline def compareIdentifiers(): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIdentifiers")().asInstanceOf[`1` | `0` | `-1`]
  inline def compareIdentifiers(a: String): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIdentifiers")(a.asInstanceOf[js.Any]).asInstanceOf[`1` | `0` | `-1`]
  inline def compareIdentifiers(a: String, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareIdentifiers(a: Unit, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  inline def compareLoose(v1: String, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareLoose")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareLoose(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareLoose")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareLoose(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareLoose")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def compareLoose(v1: typingsJapgolly.semver.classesSemverMod.^, v2: typingsJapgolly.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareLoose")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  /**
    * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
    */
  inline def diff(v1: String, v2: String): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  inline def diff(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  inline def diff(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  inline def diff(v1: typingsJapgolly.semver.classesSemverMod.^, v2: typingsJapgolly.semver.classesSemverMod.^): ReleaseType | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[ReleaseType | Null]
  
  /**
    * v1 == v2 This is true if they're logically equivalent, even if they're not the exact same string. You already know how to compare strings.
    */
  inline def eq_(v1: String, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(v1: String, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(v1: typingsJapgolly.semver.classesSemverMod.^, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def eq_(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * v1 > v2
    */
  inline def gt(v1: String, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(v1: String, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(v1: typingsJapgolly.semver.classesSemverMod.^, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * v1 >= v2
    */
  inline def gte(v1: String, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(v1: String, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(v1: typingsJapgolly.semver.classesSemverMod.^, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gte(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Return true if version is greater than all the versions possible in the range.
    */
  inline def gtr(version: String, range: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gtr(version: String, range: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gtr(version: String, range: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gtr(version: String, range: typingsJapgolly.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gtr(version: String, range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gtr(version: String, range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gtr(version: typingsJapgolly.semver.classesSemverMod.^, range: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gtr(version: typingsJapgolly.semver.classesSemverMod.^, range: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gtr(version: typingsJapgolly.semver.classesSemverMod.^, range: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gtr(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gtr(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gtr(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gtr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Return the version incremented by the release type (major, minor, patch, or prerelease), or null if it's not valid.
    */
  inline def inc(version: String, release: ReleaseType): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(version: String, release: ReleaseType, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(version: String, release: ReleaseType, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(version: String, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(version: String, release: ReleaseType, optionsOrLoose: Unit, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(version: String, release: ReleaseType, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(version: String, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(version: typingsJapgolly.semver.classesSemverMod.^, release: ReleaseType): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(version: typingsJapgolly.semver.classesSemverMod.^, release: ReleaseType, identifier: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(version: typingsJapgolly.semver.classesSemverMod.^, release: ReleaseType, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(
    version: typingsJapgolly.semver.classesSemverMod.^,
    release: ReleaseType,
    optionsOrLoose: Boolean,
    identifier: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(
    version: typingsJapgolly.semver.classesSemverMod.^,
    release: ReleaseType,
    optionsOrLoose: Unit,
    identifier: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(version: typingsJapgolly.semver.classesSemverMod.^, release: ReleaseType, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def inc(
    version: typingsJapgolly.semver.classesSemverMod.^,
    release: ReleaseType,
    optionsOrLoose: Options,
    identifier: String
  ): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("inc")(version.asInstanceOf[js.Any], release.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  /**
    * Return true if any of the ranges comparators intersect
    */
  inline def intersects(range1: String, range2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersects(range1: String, range2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersects(range1: String, range2: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersects(range1: String, range2: typingsJapgolly.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersects(range1: String, range2: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersects(range1: String, range2: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersects(range1: typingsJapgolly.semver.classesRangeMod.^, range2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersects(range1: typingsJapgolly.semver.classesRangeMod.^, range2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersects(range1: typingsJapgolly.semver.classesRangeMod.^, range2: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersects(range1: typingsJapgolly.semver.classesRangeMod.^, range2: typingsJapgolly.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersects(
    range1: typingsJapgolly.semver.classesRangeMod.^,
    range2: typingsJapgolly.semver.classesRangeMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def intersects(
    range1: typingsJapgolly.semver.classesRangeMod.^,
    range2: typingsJapgolly.semver.classesRangeMod.^,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * v1 < v2
    */
  inline def lt(v1: String, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(v1: String, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(v1: typingsJapgolly.semver.classesSemverMod.^, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * v1 <= v2
    */
  inline def lte(v1: String, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(v1: String, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(v1: typingsJapgolly.semver.classesSemverMod.^, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lte(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Return true if version is less than all the versions possible in the range.
    */
  inline def ltr(version: String, range: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ltr(version: String, range: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ltr(version: String, range: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ltr(version: String, range: typingsJapgolly.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ltr(version: String, range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ltr(version: String, range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ltr(version: typingsJapgolly.semver.classesSemverMod.^, range: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ltr(version: typingsJapgolly.semver.classesSemverMod.^, range: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ltr(version: typingsJapgolly.semver.classesSemverMod.^, range: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ltr(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ltr(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def ltr(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ltr")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Return the major version number.
    */
  inline def major(version: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("major")(version.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def major(version: String, optionsOrLoose: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("major")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def major(version: String, optionsOrLoose: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("major")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def major(version: typingsJapgolly.semver.classesSemverMod.^): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("major")(version.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def major(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("major")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def major(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("major")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Return the highest version in the list that satisfies the range, or null if none of them do.
    */
  inline def maxSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: String): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def maxSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def maxSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: RangeOptions): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def maxSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: typingsJapgolly.semver.classesRangeMod.^): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def maxSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Boolean): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def maxSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](
    versions: js.Array[T],
    range: typingsJapgolly.semver.classesRangeMod.^,
    optionsOrLoose: RangeOptions
  ): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("maxSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  /**
    * Return the lowest version in the list that satisfies the range, or null if none of them do.
    */
  inline def minSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: String): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def minSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def minSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: RangeOptions): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def minSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: typingsJapgolly.semver.classesRangeMod.^): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def minSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](versions: js.Array[T], range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Boolean): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def minSatisfying[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](
    versions: js.Array[T],
    range: typingsJapgolly.semver.classesRangeMod.^,
    optionsOrLoose: RangeOptions
  ): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minSatisfying")(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  /**
    * Return the lowest version that can possibly match the given range.
    */
  inline def minVersion(range: String): typingsJapgolly.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("minVersion")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def minVersion(range: String, optionsOrLoose: Boolean): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minVersion")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def minVersion(range: String, optionsOrLoose: Options): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minVersion")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def minVersion(range: typingsJapgolly.semver.classesRangeMod.^): typingsJapgolly.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("minVersion")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def minVersion(range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Boolean): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minVersion")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def minVersion(range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Options): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("minVersion")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  
  /**
    * Return the minor version number.
    */
  inline def minor(version: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minor")(version.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def minor(version: String, optionsOrLoose: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("minor")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def minor(version: String, optionsOrLoose: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("minor")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def minor(version: typingsJapgolly.semver.classesSemverMod.^): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minor")(version.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def minor(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("minor")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def minor(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("minor")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * v1 != v2 The opposite of eq.
    */
  inline def neq(v1: String, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(v1: String, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(v1: typingsJapgolly.semver.classesSemverMod.^, v2: typingsJapgolly.semver.classesSemverMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def neq(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Return true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  inline def outside(version: String, range: String, hilo: Greaterthansign | Lessthansign): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def outside(version: String, range: String, hilo: Greaterthansign | Lessthansign, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def outside(version: String, range: String, hilo: Greaterthansign | Lessthansign, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def outside(
    version: String,
    range: typingsJapgolly.semver.classesRangeMod.^,
    hilo: Greaterthansign | Lessthansign
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def outside(
    version: String,
    range: typingsJapgolly.semver.classesRangeMod.^,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def outside(
    version: String,
    range: typingsJapgolly.semver.classesRangeMod.^,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def outside(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: String,
    hilo: Greaterthansign | Lessthansign
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def outside(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: String,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def outside(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: String,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def outside(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^,
    hilo: Greaterthansign | Lessthansign
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def outside(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def outside(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^,
    hilo: Greaterthansign | Lessthansign,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("outside")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], hilo.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Return the parsed version as a SemVer object, or null if it's not valid.
    */
  inline def parse(): typingsJapgolly.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def parse(version: String): typingsJapgolly.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def parse(version: String, optionsOrLoose: Boolean): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def parse(version: String, optionsOrLoose: Options): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def parse(version: Null, optionsOrLoose: Boolean): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def parse(version: Null, optionsOrLoose: Options): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def parse(version: Unit, optionsOrLoose: Boolean): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def parse(version: Unit, optionsOrLoose: Options): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def parse(version: typingsJapgolly.semver.classesSemverMod.^): typingsJapgolly.semver.classesSemverMod.^ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def parse(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  inline def parse(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): typingsJapgolly.semver.classesSemverMod.^ | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.semver.classesSemverMod.^ | Null]
  
  /**
    * Return the patch version number.
    */
  inline def patch(version: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(version.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def patch(version: String, optionsOrLoose: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def patch(version: String, optionsOrLoose: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def patch(version: typingsJapgolly.semver.classesSemverMod.^): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(version.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def patch(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def patch(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  inline def prerelease(version: String): (js.Array[String | Double]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("prerelease")(version.asInstanceOf[js.Any]).asInstanceOf[(js.Array[String | Double]) | Null]
  inline def prerelease(version: String, optionsOrLoose: Boolean): (js.Array[String | Double]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("prerelease")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[(js.Array[String | Double]) | Null]
  inline def prerelease(version: String, optionsOrLoose: Options): (js.Array[String | Double]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("prerelease")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[(js.Array[String | Double]) | Null]
  inline def prerelease(version: typingsJapgolly.semver.classesSemverMod.^): (js.Array[String | Double]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("prerelease")(version.asInstanceOf[js.Any]).asInstanceOf[(js.Array[String | Double]) | Null]
  inline def prerelease(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): (js.Array[String | Double]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("prerelease")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[(js.Array[String | Double]) | Null]
  inline def prerelease(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): (js.Array[String | Double]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("prerelease")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[(js.Array[String | Double]) | Null]
  
  /**
    * The reverse of compare.
    *
    * Sorts in descending order when passed to `Array.sort()`.
    */
  inline def rcompare(v1: String, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompare(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompare(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompare(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompare(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompare(v1: String, v2: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompare(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompare(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompare(v1: typingsJapgolly.semver.classesSemverMod.^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompare(v1: typingsJapgolly.semver.classesSemverMod.^, v2: typingsJapgolly.semver.classesSemverMod.^): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompare(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Boolean
  ): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompare(
    v1: typingsJapgolly.semver.classesSemverMod.^,
    v2: typingsJapgolly.semver.classesSemverMod.^,
    optionsOrLoose: Options
  ): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  inline def rcompareIdentifiers(): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("rcompareIdentifiers")().asInstanceOf[`1` | `0` | `-1`]
  inline def rcompareIdentifiers(a: String): `1` | `0` | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("rcompareIdentifiers")(a.asInstanceOf[js.Any]).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompareIdentifiers(a: String, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  inline def rcompareIdentifiers(a: Unit, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("rcompareIdentifiers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  /**
    * Sorts an array of semver entries in descending order using `compareBuild()`.
    */
  inline def rsort[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("rsort")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def rsort[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("rsort")(list.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def rsort[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("rsort")(list.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /**
    * Return true if the version satisfies the range.
    */
  inline def satisfies(version: String, range: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def satisfies(version: String, range: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def satisfies(version: String, range: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def satisfies(version: String, range: typingsJapgolly.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def satisfies(version: String, range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def satisfies(version: String, range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def satisfies(version: typingsJapgolly.semver.classesSemverMod.^, range: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def satisfies(version: typingsJapgolly.semver.classesSemverMod.^, range: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def satisfies(version: typingsJapgolly.semver.classesSemverMod.^, range: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def satisfies(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def satisfies(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def satisfies(
    version: typingsJapgolly.semver.classesSemverMod.^,
    range: typingsJapgolly.semver.classesRangeMod.^,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Return a "simplified" range that matches the same items in `versions` list as the range specified.
    * Note that it does *not* guarantee that it would match the same versions in all cases,
    * only for the set of versions provided.
    * This is useful when generating ranges by joining together multiple versions with `||` programmatically,
    * to provide the user with something a bit more ergonomic.
    * If the provided range is shorter in string-length than the generated range, then that is returned.
    */
  inline def simplifyRange(ranges: js.Array[String], range: String): String | typingsJapgolly.semver.classesRangeMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyRange")(ranges.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[String | typingsJapgolly.semver.classesRangeMod.^]
  inline def simplifyRange(ranges: js.Array[String], range: String, options: Options): String | typingsJapgolly.semver.classesRangeMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyRange")(ranges.asInstanceOf[js.Any], range.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | typingsJapgolly.semver.classesRangeMod.^]
  inline def simplifyRange(ranges: js.Array[String], range: typingsJapgolly.semver.classesRangeMod.^): String | typingsJapgolly.semver.classesRangeMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyRange")(ranges.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[String | typingsJapgolly.semver.classesRangeMod.^]
  inline def simplifyRange(ranges: js.Array[String], range: typingsJapgolly.semver.classesRangeMod.^, options: Options): String | typingsJapgolly.semver.classesRangeMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyRange")(ranges.asInstanceOf[js.Any], range.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | typingsJapgolly.semver.classesRangeMod.^]
  
  /**
    * Sorts an array of semver entries in ascending order using `compareBuild()`.
    */
  inline def sort[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def sort[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(list.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def sort[T /* <: String | typingsJapgolly.semver.classesSemverMod.^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(list.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /**
    * Return true if the subRange range is entirely contained by the superRange range.
    */
  inline def subset(sub: String, dom: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subset")(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def subset(sub: String, dom: String, options: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subset")(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def subset(sub: String, dom: typingsJapgolly.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subset")(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def subset(sub: String, dom: typingsJapgolly.semver.classesRangeMod.^, options: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subset")(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def subset(sub: typingsJapgolly.semver.classesRangeMod.^, dom: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subset")(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def subset(sub: typingsJapgolly.semver.classesRangeMod.^, dom: String, options: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subset")(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def subset(sub: typingsJapgolly.semver.classesRangeMod.^, dom: typingsJapgolly.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subset")(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def subset(
    sub: typingsJapgolly.semver.classesRangeMod.^,
    dom: typingsJapgolly.semver.classesRangeMod.^,
    options: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("subset")(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Mostly just for testing and legacy API reasons
    */
  inline def toComparators(range: String): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toComparators")(range.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  inline def toComparators(range: String, optionsOrLoose: Boolean): js.Array[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toComparators")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String]]]
  inline def toComparators(range: String, optionsOrLoose: Options): js.Array[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toComparators")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String]]]
  inline def toComparators(range: typingsJapgolly.semver.classesRangeMod.^): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toComparators")(range.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  inline def toComparators(range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Boolean): js.Array[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toComparators")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String]]]
  inline def toComparators(range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Options): js.Array[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toComparators")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String]]]
  
  /**
    * Return the parsed version as a string, or null if it's not valid.
    */
  inline def valid(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")().asInstanceOf[String | Null]
  inline def valid(version: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(version.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def valid(version: String, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def valid(version: String, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def valid(version: Null, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def valid(version: Null, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def valid(version: Unit, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def valid(version: Unit, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def valid(version: typingsJapgolly.semver.classesSemverMod.^): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("valid")(version.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def valid(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def valid(version: typingsJapgolly.semver.classesSemverMod.^, optionsOrLoose: Options): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("valid")(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  /**
    * Return the valid range or null if it's not valid
    */
  inline def validRange(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validRange")().asInstanceOf[String | Null]
  inline def validRange(range: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(range.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def validRange(range: String, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def validRange(range: String, optionsOrLoose: RangeOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def validRange(range: Null, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def validRange(range: Null, optionsOrLoose: RangeOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def validRange(range: Unit, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def validRange(range: Unit, optionsOrLoose: RangeOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def validRange(range: typingsJapgolly.semver.classesRangeMod.^): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(range.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def validRange(range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def validRange(range: typingsJapgolly.semver.classesRangeMod.^, optionsOrLoose: RangeOptions): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("validRange")(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
