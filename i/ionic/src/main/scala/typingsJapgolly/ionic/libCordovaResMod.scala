package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.definitionsMod.IShellRunOptions
import typingsJapgolly.ionic.definitionsMod.NpmClient
import typingsJapgolly.ionic.libErrorsMod.FatalException
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCordovaResMod {
  
  @JSImport("ionic/lib/cordova-res", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/cordova-res", "SUPPORTED_PLATFORMS")
  @js.native
  val SUPPORTED_PLATFORMS: js.Array[String] = js.native
  
  inline def checkCordovaRes(hasConfig: CheckCordovaResDeps): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkCordovaRes")(hasConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def createCordovaResArgs(hasPlatform: CordovaResSchema, options: CommandLineOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCordovaResArgs")(hasPlatform.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def createCordovaResNotFoundError(npmClient: NpmClient): js.Promise[FatalException] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCordovaResNotFoundError")(npmClient.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FatalException]]
  
  inline def createCordovaResNotFoundMessage(npmClient: NpmClient): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCordovaResNotFoundMessage")(npmClient.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def findCordovaRes(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findCordovaRes")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def runCordovaRes(hasConfigLogShell: RunCordovaResDeps, args: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCordovaRes")(hasConfigLogShell.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def runCordovaRes(hasConfigLogShell: RunCordovaResDeps, args: js.Array[String], options: IShellRunOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCordovaRes")(hasConfigLogShell.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait CheckCordovaResDeps extends StObject {
    
    val config: IConfig
  }
  object CheckCordovaResDeps {
    
    inline def apply(config: IConfig): CheckCordovaResDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckCordovaResDeps]
    }
    
    extension [Self <: CheckCordovaResDeps](x: Self) {
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
  
  trait CordovaResSchema extends StObject {
    
    var platform: js.UndefOr[String] = js.undefined
  }
  object CordovaResSchema {
    
    inline def apply(): CordovaResSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CordovaResSchema]
    }
    
    extension [Self <: CordovaResSchema](x: Self) {
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
  
  trait RunCordovaResDeps extends StObject {
    
    val config: IConfig
    
    val log: ILogger
    
    val shell: IShell
  }
  object RunCordovaResDeps {
    
    inline def apply(config: IConfig, log: ILogger, shell: IShell): RunCordovaResDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunCordovaResDeps]
    }
    
    extension [Self <: RunCordovaResDeps](x: Self) {
      
      inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
}
