package typingsJapgolly.readPkg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NormalizedPackageJson = typingsJapgolly.readPkg.mod.PackageJson with typingsJapgolly.normalizePackageData.mod.Package
  type PackageJson = typingsJapgolly.typeFest.packageJsonMod.PackageJson
}
