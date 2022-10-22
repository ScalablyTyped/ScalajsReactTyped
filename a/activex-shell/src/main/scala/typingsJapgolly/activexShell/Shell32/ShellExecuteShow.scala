package typingsJapgolly.activexShell.Shell32

import typingsJapgolly.activexShell.activexShellInts.`0`
import typingsJapgolly.activexShell.activexShellInts.`10`
import typingsJapgolly.activexShell.activexShellInts.`1`
import typingsJapgolly.activexShell.activexShellInts.`2`
import typingsJapgolly.activexShell.activexShellInts.`3`
import typingsJapgolly.activexShell.activexShellInts.`4`
import typingsJapgolly.activexShell.activexShellInts.`5`
import typingsJapgolly.activexShell.activexShellInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// eslint-disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexShell.activexShellInts.`0`
  - typingsJapgolly.activexShell.activexShellInts.`1`
  - typingsJapgolly.activexShell.activexShellInts.`2`
  - typingsJapgolly.activexShell.activexShellInts.`3`
  - typingsJapgolly.activexShell.activexShellInts.`4`
  - typingsJapgolly.activexShell.activexShellInts.`5`
  - typingsJapgolly.activexShell.activexShellInts.`7`
  - typingsJapgolly.activexShell.activexShellInts.`10`
*/
trait ShellExecuteShow extends StObject
object ShellExecuteShow {
  
  /** Open the application with its window in the default state specified by the application. */
  inline def Application: `10` = 10.asInstanceOf[`10`]
  
  /** Open the application with its window at its current size and position. */
  inline def Current: `5` = 5.asInstanceOf[`5`]
  
  /** Open the application with a hidden window. */
  inline def Hidden: `0` = 0.asInstanceOf[`0`]
  
  /** Open the application with its window at its most recent size and position. The active window remains active. */
  inline def Last: `4` = 4.asInstanceOf[`4`]
  
  /** Open the application with a maximized window. */
  inline def Maximized: `3` = 3.asInstanceOf[`3`]
  
  /** Open the application with a minimized window. */
  inline def Minimized: `2` = 2.asInstanceOf[`2`]
  
  /** Open the application with a minimized window. The active window remains active. */
  inline def MinimizedNotActivated: `7` = 7.asInstanceOf[`7`]
  
  /** Open the application with a normal window. If the window is minimized or maximized, the system restores it to its original size and position. */
  inline def Normal: `1` = 1.asInstanceOf[`1`]
}
