package typingsJapgolly.jestConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type JSONString = java.lang.String with js.Object
  type OrArray[T] = T | js.Array[T]
  type ReplaceRootDirConfigObj = typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.jestTypes.configMod.Path]
  type ReplaceRootDirConfigValues = typingsJapgolly.jestConfig.utilsMod.OrArray[
    typingsJapgolly.jestTypes.configMod.Path | js.RegExp | typingsJapgolly.jestConfig.utilsMod.ReplaceRootDirConfigObj
  ]
}
