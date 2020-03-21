package typingsJapgolly.jestConfig.mod

import typingsJapgolly.jestTypes.configMod.Argv
import typingsJapgolly.jestTypes.configMod.InitialOptions
import typingsJapgolly.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config", "readConfig")
@js.native
object readConfig extends js.Object {
  def apply(argv: Argv, packageRootOrConfig: InitialOptions): ReadConfig_ = js.native
  def apply(argv: Argv, packageRootOrConfig: InitialOptions, skipArgvConfigOption: Boolean): ReadConfig_ = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Null,
    projectIndex: Double
  ): ReadConfig_ = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Path
  ): ReadConfig_ = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: InitialOptions,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Path,
    projectIndex: Double
  ): ReadConfig_ = js.native
  def apply(argv: Argv, packageRootOrConfig: Path): ReadConfig_ = js.native
  def apply(argv: Argv, packageRootOrConfig: Path, skipArgvConfigOption: Boolean): ReadConfig_ = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: Path,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Null,
    projectIndex: Double
  ): ReadConfig_ = js.native
  def apply(argv: Argv, packageRootOrConfig: Path, skipArgvConfigOption: Boolean, parentConfigPath: Path): ReadConfig_ = js.native
  def apply(
    argv: Argv,
    packageRootOrConfig: Path,
    skipArgvConfigOption: Boolean,
    parentConfigPath: Path,
    projectIndex: Double
  ): ReadConfig_ = js.native
}

