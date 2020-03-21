package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "getParsedCommandLineOfConfigFile")
@js.native
object getParsedCommandLineOfConfigFile extends js.Object {
  def apply(configFileName: java.lang.String, optionsToExtend: CompilerOptions, host: ParseConfigFileHost): js.UndefOr[ParsedCommandLine] = js.native
  def apply(
    configFileName: java.lang.String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: Map[ExtendedConfigCacheEntry]
  ): js.UndefOr[ParsedCommandLine] = js.native
  def apply(
    configFileName: java.lang.String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: Map[ExtendedConfigCacheEntry],
    watchOptionsToExtend: WatchOptions
  ): js.UndefOr[ParsedCommandLine] = js.native
}

