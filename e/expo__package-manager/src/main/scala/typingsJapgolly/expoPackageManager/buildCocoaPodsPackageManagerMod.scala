package typingsJapgolly.expoPackageManager

import typingsJapgolly.expoPackageManager.anon.Cwd
import typingsJapgolly.expoPackageManager.anon.Message
import typingsJapgolly.expoPackageManager.anon.NonInteractive
import typingsJapgolly.expoPackageManager.anon.ShouldUpdateRepo
import typingsJapgolly.expoPackageManager.anon.Spinner
import typingsJapgolly.expoPackageManager.anon.`0`
import typingsJapgolly.expoPackageManager.buildPackageManagerMod.PackageManager
import typingsJapgolly.expoSpawnAsync.mod.SpawnOptions
import typingsJapgolly.expoSpawnAsync.mod.SpawnResult
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCocoaPodsPackageManagerMod {
  
  @JSImport("@expo/package-manager/build/CocoaPodsPackageManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/package-manager/build/CocoaPodsPackageManager", "CocoaPodsError")
  @js.native
  open class CocoaPodsError protected ()
    extends StObject
       with Error {
    def this(message: String, code: CocoaPodsErrorCode) = this()
    def this(message: String, code: CocoaPodsErrorCode, cause: js.Error) = this()
    
    @JSName("cause")
    var cause_CocoaPodsError: js.UndefOr[js.Error] = js.native
    
    var code: CocoaPodsErrorCode = js.native
    
    val isPackageManagerError: /* true */ Boolean = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@expo/package-manager/build/CocoaPodsPackageManager", "CocoaPodsPackageManager")
  @js.native
  open class CocoaPodsPackageManager protected ()
    extends StObject
       with PackageManager {
    def this(hasCwdSilent: Cwd) = this()
    
    /* private */ var _installAsync: Any = js.native
    
    def _runAsync(args: js.Array[String]): js.Promise[SpawnResult] = js.native
    
    /* CompleteClass */
    override def addAsync(names: String*): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def addDevAsync(names: String*): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def addWithParametersAsync(names: js.Array[String], parameters: js.Array[String]): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def cleanAsync(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def getConfigAsync(key: String): js.Promise[String] = js.native
    
    def handleInstallErrorAsync(hasErrorShouldUpdateUpdatedPackagesSpinner: typingsJapgolly.expoPackageManager.anon.Error): js.Promise[SpawnResult] = js.native
    
    /* CompleteClass */
    override def installAsync(): js.Promise[Unit] = js.native
    def installAsync(hasSpinner: Spinner): js.Promise[Unit] = js.native
    
    def installCLIAsync(): js.Promise[Boolean] = js.native
    
    def isCLIInstalledAsync(): js.Promise[Boolean] = js.native
    
    def name: String = js.native
    
    var options: SpawnOptions = js.native
    
    /* private */ var podRepoUpdateAsync: Any = js.native
    
    /* CompleteClass */
    override def removeLockfileAsync(): js.Promise[Unit] = js.native
    
    /* private */ var runInstallTypeCommandAsync: Any = js.native
    
    /* private */ var silent: Any = js.native
    
    /* CompleteClass */
    override def versionAsync(): js.Promise[String] = js.native
  }
  /* static members */
  object CocoaPodsPackageManager {
    
    @JSImport("@expo/package-manager/build/CocoaPodsPackageManager", "CocoaPodsPackageManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def brewInstallCLIAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("brewInstallCLIAsync")().asInstanceOf[js.Promise[Unit]]
    inline def brewInstallCLIAsync(spawnOptions: SpawnOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("brewInstallCLIAsync")(spawnOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def brewLinkCLIAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("brewLinkCLIAsync")().asInstanceOf[js.Promise[Unit]]
    inline def brewLinkCLIAsync(spawnOptions: SpawnOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("brewLinkCLIAsync")(spawnOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def gemInstallCLIAsync(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("gemInstallCLIAsync")().asInstanceOf[js.Promise[Unit]]
    inline def gemInstallCLIAsync(nonInteractive: Boolean): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("gemInstallCLIAsync")(nonInteractive.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def gemInstallCLIAsync(nonInteractive: Boolean, spawnOptions: SpawnOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("gemInstallCLIAsync")(nonInteractive.asInstanceOf[js.Any], spawnOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def gemInstallCLIAsync(nonInteractive: Unit, spawnOptions: SpawnOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("gemInstallCLIAsync")(nonInteractive.asInstanceOf[js.Any], spawnOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def getPodProjectRoot(projectRoot: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPodProjectRoot")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def installCLIAsync(hasNonInteractiveSpawnOptions: NonInteractive): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("installCLIAsync")(hasNonInteractiveSpawnOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def isAvailable(projectRoot: String, silent: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")(projectRoot.asInstanceOf[js.Any], silent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isCLIInstalledAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCLIInstalledAsync")().asInstanceOf[js.Promise[Boolean]]
    inline def isCLIInstalledAsync(spawnOptions: SpawnOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCLIInstalledAsync")(spawnOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    inline def isUsingPods(projectRoot: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingPods")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def extractMissingDependencyError(errorOutput: String): (js.Tuple2[String, String]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("extractMissingDependencyError")(errorOutput.asInstanceOf[js.Any]).asInstanceOf[(js.Tuple2[String, String]) | Null]
  
  inline def getImprovedPodInstallError(error: SpawnResult & js.Error, hasCwd: `0`): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getImprovedPodInstallError")(error.asInstanceOf[js.Any], hasCwd.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def getPodRepoUpdateMessage(errorOutput: String): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("getPodRepoUpdateMessage")(errorOutput.asInstanceOf[js.Any]).asInstanceOf[Message]
  
  inline def getPodUpdateMessage(output: String): ShouldUpdateRepo = ^.asInstanceOf[js.Dynamic].applyDynamic("getPodUpdateMessage")(output.asInstanceOf[js.Any]).asInstanceOf[ShouldUpdateRepo]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoPackageManager.expoPackageManagerStrings.NON_INTERACTIVE
    - typingsJapgolly.expoPackageManager.expoPackageManagerStrings.NO_CLI
    - typingsJapgolly.expoPackageManager.expoPackageManagerStrings.COMMAND_FAILED
  */
  trait CocoaPodsErrorCode extends StObject
  object CocoaPodsErrorCode {
    
    inline def COMMAND_FAILED: typingsJapgolly.expoPackageManager.expoPackageManagerStrings.COMMAND_FAILED = "COMMAND_FAILED".asInstanceOf[typingsJapgolly.expoPackageManager.expoPackageManagerStrings.COMMAND_FAILED]
    
    inline def NON_INTERACTIVE: typingsJapgolly.expoPackageManager.expoPackageManagerStrings.NON_INTERACTIVE = "NON_INTERACTIVE".asInstanceOf[typingsJapgolly.expoPackageManager.expoPackageManagerStrings.NON_INTERACTIVE]
    
    inline def NO_CLI: typingsJapgolly.expoPackageManager.expoPackageManagerStrings.NO_CLI = "NO_CLI".asInstanceOf[typingsJapgolly.expoPackageManager.expoPackageManagerStrings.NO_CLI]
  }
}
