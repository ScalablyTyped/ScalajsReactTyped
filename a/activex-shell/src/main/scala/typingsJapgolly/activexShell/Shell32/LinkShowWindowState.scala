package typingsJapgolly.activexShell.Shell32

import typingsJapgolly.activexShell.activexShellInts.`1`
import typingsJapgolly.activexShell.activexShellInts.`2`
import typingsJapgolly.activexShell.activexShellInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// eslint-disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexShell.activexShellInts.`1`
  - typingsJapgolly.activexShell.activexShellInts.`2`
  - typingsJapgolly.activexShell.activexShellInts.`3`
*/
trait LinkShowWindowState extends StObject
object LinkShowWindowState {
  
  /** Activates the window and displays it as a maximized window. */
  inline def Maximized: `3` = 3.asInstanceOf[`3`]
  
  /** Activates the window and displays it as a minimized window. */
  inline def Minimized: `2` = 2.asInstanceOf[`2`]
  
  /** Activates and displays a window. If the window is minimized or maximized, the system restores it to its original size and position. */
  inline def Normal: `1` = 1.asInstanceOf[`1`]
}
