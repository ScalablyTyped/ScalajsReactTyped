package typingsJapgolly.webdriverManager

import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.node.childProcessMod.SpawnOptions
import typingsJapgolly.node.childProcessMod.SpawnSyncOptions
import typingsJapgolly.node.childProcessMod.SpawnSyncReturns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibUtilsMod {
  
  @JSImport("webdriver-manager/built/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adb(sdkPath: String, port: Double, command: String, timeout: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("adb")(sdkPath.asInstanceOf[js.Any], port.asInstanceOf[js.Any], command.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def adb(sdkPath: String, port: Double, command: String, timeout: Double, args: js.Array[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("adb")(sdkPath.asInstanceOf[js.Any], port.asInstanceOf[js.Any], command.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def request(method: String, port: String, path: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], port.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def request(method: String, port: String, path: String, timeout: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], port.asInstanceOf[js.Any], path.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def request(method: String, port: String, path: String, timeout: Double, data: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], port.asInstanceOf[js.Any], path.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def request(method: String, port: String, path: String, timeout: Unit, data: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], port.asInstanceOf[js.Any], path.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("webdriver-manager/built/lib/utils", "spawn")
  @js.native
  def spawn: js.Function4[
    /* cmd */ String, 
    /* args */ js.Array[String], 
    /* stdio */ js.UndefOr[Any], 
    /* opts */ js.UndefOr[SpawnOptions], 
    ChildProcess
  ] = js.native
  
  @JSImport("webdriver-manager/built/lib/utils", "spawnSync")
  @js.native
  def spawnSync: js.Function4[
    /* cmd */ String, 
    /* args */ js.Array[String], 
    /* stdio */ js.UndefOr[Any], 
    /* opts */ js.UndefOr[SpawnSyncOptions], 
    SpawnSyncReturns[Any]
  ] = js.native
  inline def spawnSync_=(
    x: js.Function4[
      /* cmd */ String, 
      /* args */ js.Array[String], 
      /* stdio */ js.UndefOr[Any], 
      /* opts */ js.UndefOr[SpawnSyncOptions], 
      SpawnSyncReturns[Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spawnSync")(x.asInstanceOf[js.Any])
  
  inline def spawn_=(
    x: js.Function4[
      /* cmd */ String, 
      /* args */ js.Array[String], 
      /* stdio */ js.UndefOr[Any], 
      /* opts */ js.UndefOr[SpawnOptions], 
      ChildProcess
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spawn")(x.asInstanceOf[js.Any])
}
