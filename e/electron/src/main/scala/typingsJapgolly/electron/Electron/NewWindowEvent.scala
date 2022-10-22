package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.`background-tab`
import typingsJapgolly.electron.electronStrings.`foreground-tab`
import typingsJapgolly.electron.electronStrings.`new-window`
import typingsJapgolly.electron.electronStrings.`save-to-disk`
import typingsJapgolly.electron.electronStrings.default
import typingsJapgolly.electron.electronStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewWindowEvent
  extends StObject
     with Event {
  
  /**
    * Can be `default`, `foreground-tab`, `background-tab`, `new-window`,
    * `save-to-disk` and `other`.
    */
  var disposition: default | `foreground-tab` | `background-tab` | `new-window` | `save-to-disk` | other = js.native
  
  var frameName: String = js.native
  
  /**
    * The options which should be used for creating the new `BrowserWindow`.
    */
  var options: BrowserWindowConstructorOptions = js.native
  
  var url: String = js.native
}
