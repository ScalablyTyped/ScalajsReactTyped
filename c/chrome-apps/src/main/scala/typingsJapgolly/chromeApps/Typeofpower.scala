package typingsJapgolly.chromeApps

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpower extends js.Object {
  /**
    * @enum
    * @property SYSTEM - Prevent the system from sleeping in response to user inactivity.
    * @property DISPLAY - Prevent the display from being turned off or dimmed or the system from sleeping in response to user inactivity.
    */
  val Level: AnonDISPLAY
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
      String, 
      Exclude[
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof Level[keyof typeof Level] */ js.Any
      ]
    ]
  ): Unit
}

object Typeofpower {
  @scala.inline
  def apply(
    Level: AnonDISPLAY,
    releaseKeepAwake: Callback,
    requestKeepAwake: ToStringLiteral[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
      String, 
      Exclude[
        String, 
        /* import warning: importer.ImportType#apply Failed type conversion: typeof Level[keyof typeof Level] */ js.Any
      ]
    ] => Callback
  ): Typeofpower = {
    val __obj = js.Dynamic.literal(Level = Level.asInstanceOf[js.Any])
    __obj.updateDynamic("releaseKeepAwake")(releaseKeepAwake.toJsFn)
    __obj.updateDynamic("requestKeepAwake")(js.Any.fromFunction1((t0: typingsJapgolly.chromeApps.chrome.ToStringLiteral[
  /* import warning: importer.ImportType#apply Failed type conversion: typeof Level */ js.Any, 
  java.lang.String, 
  typingsJapgolly.std.Exclude[
    java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof Level[keyof typeof Level] */ js.Any
  ]]) => requestKeepAwake(t0).runNow()))
    __obj.asInstanceOf[Typeofpower]
  }
}

