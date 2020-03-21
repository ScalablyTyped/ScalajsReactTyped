package typingsJapgolly.cosmiconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Cache = typingsJapgolly.std.Map[java.lang.String, typingsJapgolly.cosmiconfig.typesMod.CosmiconfigResult]
  type Config = js.Any
  type CosmiconfigResult = typingsJapgolly.cosmiconfig.AnonConfig | scala.Null
  type LoadedFileContent = js.UndefOr[typingsJapgolly.cosmiconfig.typesMod.Config | scala.Null]
  type Loaders = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.cosmiconfig.mod.Loader]
  type LoadersSync = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.cosmiconfig.mod.LoaderSync]
}
