package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.anon.Provider
import typingsJapgolly.appBuilderLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typingsJapgolly.appBuilderLib.outPackagerMod.Packager
import typingsJapgolly.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typingsJapgolly.builderUtil.outArchMod.Arch
import typingsJapgolly.builderUtilRuntime.mod.CancellationToken
import typingsJapgolly.builderUtilRuntime.outPublishOptionsMod.PublishConfiguration
import typingsJapgolly.electronPublish.mod.PublishContext
import typingsJapgolly.electronPublish.mod.PublishOptions
import typingsJapgolly.electronPublish.mod.Publisher
import typingsJapgolly.electronPublish.outMultiProgressMod.MultiProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPublishPublishManagerMod {
  
  @JSImport("app-builder-lib/out/publish/PublishManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/publish/PublishManager", "PublishManager")
  @js.native
  open class PublishManager protected ()
    extends StObject
       with PublishContext {
    def this(packager: Packager, publishOptions: PublishOptions) = this()
    def this(packager: Packager, publishOptions: PublishOptions, cancellationToken: CancellationToken) = this()
    
    /* private */ var artifactCreatedWithoutExplicitPublishConfig: Any = js.native
    
    def awaitTasks(): js.Promise[Unit] = js.native
    
    def cancelTasks(): Unit = js.native
    
    /* CompleteClass */
    override val cancellationToken: CancellationToken = js.native
    
    /* private */ var getAppInfo: Any = js.native
    
    def getGlobalPublishConfigurations(): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
    
    /* private */ var getOrCreatePublisher: Any = js.native
    
    val isPublish: Boolean = js.native
    
    /* private */ val nameToPublisher: Any = js.native
    
    /* private */ val packager: Any = js.native
    
    /* CompleteClass */
    override val progress: MultiProgress | Null = js.native
    
    /* private */ val publishOptions: Any = js.native
    
    /* private */ val taskManager: Any = js.native
    
    /* private */ val updateFileWriteTask: Any = js.native
  }
  
  inline def computeDownloadUrl(publishConfiguration: PublishConfiguration, fileName: String, packager: PlatformPackager[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDownloadUrl")(publishConfiguration.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def computeDownloadUrl(publishConfiguration: PublishConfiguration, fileName: Null, packager: PlatformPackager[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDownloadUrl")(publishConfiguration.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createPublisher(
    context: PublishContext,
    version: String,
    publishConfig: PublishConfiguration,
    options: PublishOptions,
    packager: Packager
  ): Publisher | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createPublisher")(context.asInstanceOf[js.Any], version.asInstanceOf[js.Any], publishConfig.asInstanceOf[js.Any], options.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[Publisher | Null]
  
  inline def getAppUpdatePublishConfiguration(packager: PlatformPackager[Any], arch: Arch, errorIfCannot: Boolean): js.Promise[Provider | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppUpdatePublishConfiguration")(packager.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Provider | Null]]
  
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: Null,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: Null,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: Unit,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: Unit,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: PlatformSpecificBuildOptions,
    arch: Null,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigs(
    platformPackager: PlatformPackager[Any],
    targetSpecificOptions: PlatformSpecificBuildOptions,
    arch: Arch,
    errorIfCannot: Boolean
  ): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigs")(platformPackager.asInstanceOf[js.Any], targetSpecificOptions.asInstanceOf[js.Any], arch.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  
  inline def getPublishConfigsForUpdateInfo(packager: PlatformPackager[Any]): js.Promise[js.Array[PublishConfiguration] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigsForUpdateInfo(packager: PlatformPackager[Any], publishConfigs: js.Array[PublishConfiguration]): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any], publishConfigs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigsForUpdateInfo(packager: PlatformPackager[Any], publishConfigs: js.Array[PublishConfiguration], arch: Arch): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any], publishConfigs.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
  inline def getPublishConfigsForUpdateInfo(packager: PlatformPackager[Any], publishConfigs: Null, arch: Arch): js.Promise[js.Array[PublishConfiguration] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublishConfigsForUpdateInfo")(packager.asInstanceOf[js.Any], publishConfigs.asInstanceOf[js.Any], arch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[PublishConfiguration] | Null]]
}
