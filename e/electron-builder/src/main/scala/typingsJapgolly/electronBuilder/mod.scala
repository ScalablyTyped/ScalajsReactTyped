package typingsJapgolly.electronBuilder

import typingsJapgolly.appBuilderLib.forgeMakerMod.ForgeOptions
import typingsJapgolly.appBuilderLib.packagerApiMod.PackagerOptions
import typingsJapgolly.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typingsJapgolly.builderUtil.archMod.Arch
import typingsJapgolly.electronBuilder.builderMod.CliOptions
import typingsJapgolly.electronBuilder.electronBuilderStrings.default
import typingsJapgolly.electronBuilder.electronBuilderStrings.dir
import typingsJapgolly.electronPublish.mod.PublishOptions
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AppInfo protected ()
    extends typingsJapgolly.appBuilderLib.mod.AppInfo {
    def this(info: typingsJapgolly.appBuilderLib.packagerMod.Packager) = this()
    def this(info: typingsJapgolly.appBuilderLib.packagerMod.Packager, buildVersion: String) = this()
    def this(
      info: typingsJapgolly.appBuilderLib.packagerMod.Packager,
      buildVersion: js.UndefOr[scala.Nothing],
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typingsJapgolly.appBuilderLib.packagerMod.Packager,
      buildVersion: String,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(
      info: typingsJapgolly.appBuilderLib.packagerMod.Packager,
      buildVersion: Null,
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
  }
  
  @js.native
  class CancellationToken ()
    extends typingsJapgolly.builderUtilRuntime.mod.CancellationToken {
    def this(parent: typingsJapgolly.builderUtilRuntime.cancellationTokenMod.CancellationToken) = this()
  }
  
  @js.native
  class Packager protected ()
    extends typingsJapgolly.appBuilderLib.mod.Packager {
    def this(options: PackagerOptions) = this()
    def this(
      options: PackagerOptions,
      cancellationToken: typingsJapgolly.builderUtilRuntime.mod.CancellationToken
    ) = this()
  }
  
  @js.native
  class Platform protected ()
    extends typingsJapgolly.appBuilderLib.mod.Platform {
    def this(name: String, buildConfigurationKey: String, nodeName: typingsJapgolly.node.NodeJS.Platform) = this()
  }
  
  @js.native
  class PublishManager protected ()
    extends typingsJapgolly.appBuilderLib.mod.PublishManager {
    def this(packager: typingsJapgolly.appBuilderLib.packagerMod.Packager, publishOptions: PublishOptions) = this()
    def this(
      packager: typingsJapgolly.appBuilderLib.packagerMod.Packager,
      publishOptions: PublishOptions,
      cancellationToken: typingsJapgolly.builderUtilRuntime.mod.CancellationToken
    ) = this()
  }
  
  @js.native
  abstract class Target protected ()
    extends typingsJapgolly.appBuilderLib.mod.Target {
    protected def this(name: String) = this()
    protected def this(name: String, isAsyncSupported: Boolean) = this()
  }
  
  val DEFAULT_TARGET: default = js.native
  val DIR_TARGET: dir = js.native
  def archFromString(name: String): Arch = js.native
  def build(): js.Promise[js.Array[String]] = js.native
  def build(rawOptions: CliOptions): js.Promise[js.Array[String]] = js.native
  def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = js.native
  def createTargets(platforms: js.Array[typingsJapgolly.appBuilderLib.mod.Platform]): Map[typingsJapgolly.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  def createTargets(platforms: js.Array[typingsJapgolly.appBuilderLib.mod.Platform], `type`: String): Map[typingsJapgolly.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  def createTargets(platforms: js.Array[typingsJapgolly.appBuilderLib.mod.Platform], `type`: String, arch: String): Map[typingsJapgolly.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  def createTargets(platforms: js.Array[typingsJapgolly.appBuilderLib.mod.Platform], `type`: Null, arch: String): Map[typingsJapgolly.appBuilderLib.mod.Platform, Map[Arch, js.Array[String]]] = js.native
  def getArchSuffix(arch: Arch): String = js.native
  @js.native
  object Arch extends js.Object {
    /* 3 */ val arm64: typingsJapgolly.builderUtil.archMod.Arch.arm64 with Double = js.native
    /* 2 */ val armv7l: typingsJapgolly.builderUtil.archMod.Arch.armv7l with Double = js.native
    /* 0 */ val ia32: typingsJapgolly.builderUtil.archMod.Arch.ia32 with Double = js.native
    /* 1 */ val x64: typingsJapgolly.builderUtil.archMod.Arch.x64 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.builderUtil.archMod.Arch with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Platform extends js.Object {
    var LINUX: typingsJapgolly.appBuilderLib.coreMod.Platform = js.native
    var MAC: typingsJapgolly.appBuilderLib.coreMod.Platform = js.native
    var WINDOWS: typingsJapgolly.appBuilderLib.coreMod.Platform = js.native
    def current(): typingsJapgolly.appBuilderLib.coreMod.Platform = js.native
    def fromString(name: String): typingsJapgolly.appBuilderLib.coreMod.Platform = js.native
  }
  
}

