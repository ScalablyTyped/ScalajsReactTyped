package typingsJapgolly.activexShell.Shell32

import typingsJapgolly.activexShell.activexShellInts.`128`
import typingsJapgolly.activexShell.activexShellInts.`16`
import typingsJapgolly.activexShell.activexShellInts.`1`
import typingsJapgolly.activexShell.activexShellInts.`32`
import typingsJapgolly.activexShell.activexShellInts.`4`
import typingsJapgolly.activexShell.activexShellInts.`64`
import typingsJapgolly.activexShell.activexShellInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// eslint-disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexShell.activexShellInts.`1`
  - typingsJapgolly.activexShell.activexShellInts.`4`
  - typingsJapgolly.activexShell.activexShellInts.`8`
  - typingsJapgolly.activexShell.activexShellInts.`16`
  - typingsJapgolly.activexShell.activexShellInts.`32`
  - typingsJapgolly.activexShell.activexShellInts.`64`
  - typingsJapgolly.activexShell.activexShellInts.`128`
*/
trait ShellLinkResolveFlags extends StObject
object ShellLinkResolveFlags {
  
  /** Call the Windows Installer. */
  inline def InvokeMSI: `128` = 128.asInstanceOf[`128`]
  
  /**
    * Disable distributed link tracking. By default, distributed link tracking tracks removable media across multiple devices based on the volume name.
    * It also uses the UNC path to track remote file systems whose drive letter has changed. Setting this flag disables both types of tracking.
    */
  inline def NoLinkInfo: `64` = 64.asInstanceOf[`64`]
  
  /** Do not execute the search heuristics. */
  inline def NoSearch: `16` = 16.asInstanceOf[`16`]
  
  /** Do not use distributed link tracking. */
  inline def NoTrack: `32` = 32.asInstanceOf[`32`]
  
  /**
    * Do not display a dialog box if the link cannot be resolved. When this flag is set, the high-order word of _fFlags_ specifies a time-out duration, in milliseconds.
    * The method returns if the link cannot be resolved within the time-out duration. If the high-order word is set to zero, the time-out duration defaults to 3000 milliseconds (3 seconds).
    */
  inline def NoUI: `1` = 1.asInstanceOf[`1`]
  
  /** Do not update the link information. */
  inline def NoUpdate: `8` = 8.asInstanceOf[`8`]
  
  /** If the link has changed, update its path and list of identifiers. */
  inline def Update: `4` = 4.asInstanceOf[`4`]
}
