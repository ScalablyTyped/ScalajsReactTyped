package typingsJapgolly.chromeApps.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofpower extends StObject {
  
  /**
    * @enum
    * @property SYSTEM - Prevent the system from sleeping in response to user inactivity.
    * @property DISPLAY - Prevent the display from being turned off or dimmed or the system from sleeping in response to user inactivity.
    */
  val Level: DISPLAY
  
  /** Releases a request previously made via requestKeepAwake(). */
  def releaseKeepAwake(): Unit
  
  /**
    * Requests that power management be temporarily disabled.
    * @param level Level describes the degree to which power management should be disabled.
    *              If a request previously made by the same app is still active, it will be replaced by the new request.
    * @see Enum: chrome.power.Level
    */
  def requestKeepAwake(
    level: ToStringLiteral[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
      /* keyof typeof Level */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof Level extends keyof typeof Level ? std.Exclude<keyof typeof Level, typeof Level[keyof typeof Level]> : never */ js.Any
    ]
  ): Unit
}
object Typeofpower {
  
  inline def apply(
    Level: DISPLAY,
    releaseKeepAwake: Callback,
    requestKeepAwake: ToStringLiteral[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
      /* keyof typeof Level */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof Level extends keyof typeof Level ? std.Exclude<keyof typeof Level, typeof Level[keyof typeof Level]> : never */ js.Any
    ] => Callback
  ): Typeofpower = {
    val __obj = js.Dynamic.literal(Level = Level.asInstanceOf[js.Any], releaseKeepAwake = releaseKeepAwake.toJsFn, requestKeepAwake = js.Any.fromFunction1((t0: ToStringLiteral[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
      /* keyof typeof Level */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof Level extends keyof typeof Level ? std.Exclude<keyof typeof Level, typeof Level[keyof typeof Level]> : never */ js.Any
    ]) => requestKeepAwake(t0).runNow()))
    __obj.asInstanceOf[Typeofpower]
  }
  
  extension [Self <: Typeofpower](x: Self) {
    
    inline def setLevel(value: DISPLAY): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setReleaseKeepAwake(value: Callback): Self = StObject.set(x, "releaseKeepAwake", value.toJsFn)
    
    inline def setRequestKeepAwake(
      value: ToStringLiteral[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
          /* keyof typeof Level */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof Level extends keyof typeof Level ? std.Exclude<keyof typeof Level, typeof Level[keyof typeof Level]> : never */ js.Any
        ] => Callback
    ): Self = StObject.set(x, "requestKeepAwake", js.Any.fromFunction1((t0: ToStringLiteral[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
          /* keyof typeof Level */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof typeof Level extends keyof typeof Level ? std.Exclude<keyof typeof Level, typeof Level[keyof typeof Level]> : never */ js.Any
        ]) => value(t0).runNow()))
  }
}
