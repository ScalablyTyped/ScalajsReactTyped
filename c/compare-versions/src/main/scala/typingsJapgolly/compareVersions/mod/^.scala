package typingsJapgolly.compareVersions.mod

import typingsJapgolly.compareVersions.compareVersionsNumbers.`-1`
import typingsJapgolly.compareVersions.compareVersionsNumbers.`0`
import typingsJapgolly.compareVersions.compareVersionsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("compare-versions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Compare [semver](https://semver.org/) version strings to find greater, equal or lesser.
    * This library supports the full semver specification, including comparing versions with different number of digits like `1.0.0`, `1.0`, `1`, and pre-release versions like `1.0.0-alpha`.
    * @param firstVersion - First version to compare
    * @param secondVersion - Second version to compare
    * @returns Numeric value compatible with the [Array.sort(fn) interface](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/sort#Parameters).
    */
  def apply(firstVersion: String, secondVersion: String): `1` | `0` | `-1` = js.native
  /**
    * Compare [semver](https://semver.org/) version strings using the specified operator.
    * 
    * @param firstVersion First version to compare
    * @param secondVersion Second version to compare
    * @param operator Allowed arithmetic operator to use
    * @returns `true` if the comparison between the firstVersion and the secondVersion satisfies the operator, `false` otherwise.
    *
    * @example
    * ```
    * compareVersions.compare('10.1.8', '10.0.4', '>'); // return true
    * compareVersions.compare('10.0.1', '10.0.1', '='); // return true
    * compareVersions.compare('10.1.1', '10.2.2', '<'); // return true
    * compareVersions.compare('10.1.1', '10.2.2', '<='); // return true
    * compareVersions.compare('10.1.1', '10.2.2', '>='); // return false
    * ```
    */
  def compare(firstVersion: String, secondVersion: String, operator: CompareOperator): Boolean = js.native
  /**
    * Validate [semver](https://semver.org/) version strings.
    * 
    * @param version Version number to validate
    * @returns `true` if the version number is a valid semver version number, `false` otherwise.
    *
    * @example
    * ```
    * compareVersions.validate('1.0.0-rc.1'); // return true
    * compareVersions.validate('1.0-rc.1'); // return false
    * compareVersions.validate('foo'); // return false
    * ```
    */
  def validate(version: String): Boolean = js.native
}

