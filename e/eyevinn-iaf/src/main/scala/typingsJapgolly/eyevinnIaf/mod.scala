package typingsJapgolly.eyevinnIaf

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait IafFileWatchModule extends StObject {
    
    var fileInput: String
    
    var logger: Logger
    
    def onAdd(
      callback: js.Function3[
          /* filePath */ String, 
          /* readStream */ Readable, 
          /* contentType */ js.UndefOr[String], 
          Any
        ]
    ): Any
  }
  object IafFileWatchModule {
    
    inline def apply(
      fileInput: String,
      logger: Logger,
      onAdd: js.Function3[
          /* filePath */ String, 
          /* readStream */ Readable, 
          /* contentType */ js.UndefOr[String], 
          Any
        ] => Any
    ): IafFileWatchModule = {
      val __obj = js.Dynamic.literal(fileInput = fileInput.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], onAdd = js.Any.fromFunction1(onAdd))
      __obj.asInstanceOf[IafFileWatchModule]
    }
    
    extension [Self <: IafFileWatchModule](x: Self) {
      
      inline def setFileInput(value: String): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setOnAdd(
        value: js.Function3[
              /* filePath */ String, 
              /* readStream */ Readable, 
              /* contentType */ js.UndefOr[String], 
              Any
            ] => Any
      ): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IafUploadModule extends StObject {
    
    def fileUploadedDelegate(result: Any): Any = js.native
    def fileUploadedDelegate(result: Any, error: Any): Any = js.native
    
    var logger: Logger = js.native
    
    def onFileAdd(filePath: String, readStream: Readable): Any = js.native
    def onFileAdd(filePath: String, readStream: Readable, contentType: String): Any = js.native
    
    var playlistName: String = js.native
    
    def progressDelegate(result: Any): Any = js.native
  }
  
  trait Logger extends StObject {
    
    def error(message: String): Unit
    
    def info(message: String): Unit
    
    def verbose(message: String): Unit
    
    def warn(message: String): Unit
  }
  object Logger {
    
    inline def apply(
      error: String => Callback,
      info: String => Callback,
      verbose: String => Callback,
      warn: String => Callback
    ): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: String) => error(t0).runNow()), info = js.Any.fromFunction1((t0: String) => info(t0).runNow()), verbose = js.Any.fromFunction1((t0: String) => verbose(t0).runNow()), warn = js.Any.fromFunction1((t0: String) => warn(t0).runNow()))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setError(value: String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setInfo(value: String => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setVerbose(value: String => Callback): Self = StObject.set(x, "verbose", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setWarn(value: String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
