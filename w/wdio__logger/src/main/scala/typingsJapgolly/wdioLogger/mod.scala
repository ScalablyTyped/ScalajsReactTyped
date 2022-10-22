package typingsJapgolly.wdioLogger

import typingsJapgolly.loglevel.mod.LogLevelDesc
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(name: String): typingsJapgolly.loglevel.mod.Logger = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.loglevel.mod.Logger]
    
    @JSImport("@wdio/logger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wdio/logger", "default.clearLogger")
    @js.native
    def clearLogger: js.Function0[Unit] = js.native
    inline def clearLogger_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearLogger")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/logger", "default.setLevel")
    @js.native
    def setLevel: js.Function2[/* name */ String, /* level */ LogLevelDesc, Unit] = js.native
    inline def setLevel_=(x: js.Function2[/* name */ String, /* level */ LogLevelDesc, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/logger", "default.setLogLevelsConfig")
    @js.native
    def setLogLevelsConfig: js.Function2[
        /* logLevels */ js.UndefOr[Record[String, LogLevelDesc]], 
        /* wdioLogLevel */ js.UndefOr[LogLevelDesc], 
        Unit
      ] = js.native
    inline def setLogLevelsConfig_=(
      x: js.Function2[
          /* logLevels */ js.UndefOr[Record[String, LogLevelDesc]], 
          /* wdioLogLevel */ js.UndefOr[LogLevelDesc], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setLogLevelsConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@wdio/logger", "default.waitForBuffer")
    @js.native
    def waitForBuffer: js.Function0[js.Promise[Unit]] = js.native
    inline def waitForBuffer_=(x: js.Function0[js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitForBuffer")(x.asInstanceOf[js.Any])
  }
  
  type Logger = typingsJapgolly.loglevel.mod.Logger
}
