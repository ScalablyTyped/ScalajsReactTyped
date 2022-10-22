package typingsJapgolly.activexShell.Shell32

import typingsJapgolly.activexShell.activexShellInts.`1024`
import typingsJapgolly.activexShell.activexShellInts.`128`
import typingsJapgolly.activexShell.activexShellInts.`16`
import typingsJapgolly.activexShell.activexShellInts.`2048`
import typingsJapgolly.activexShell.activexShellInts.`256`
import typingsJapgolly.activexShell.activexShellInts.`4096`
import typingsJapgolly.activexShell.activexShellInts.`4`
import typingsJapgolly.activexShell.activexShellInts.`512`
import typingsJapgolly.activexShell.activexShellInts.`64`
import typingsJapgolly.activexShell.activexShellInts.`8192`
import typingsJapgolly.activexShell.activexShellInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// eslint-disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexShell.activexShellInts.`64`
  - typingsJapgolly.activexShell.activexShellInts.`128`
  - typingsJapgolly.activexShell.activexShellInts.`16`
  - typingsJapgolly.activexShell.activexShellInts.`512`
  - typingsJapgolly.activexShell.activexShellInts.`8192`
  - typingsJapgolly.activexShell.activexShellInts.`2048`
  - typingsJapgolly.activexShell.activexShellInts.`1024`
  - typingsJapgolly.activexShell.activexShellInts.`4096`
  - typingsJapgolly.activexShell.activexShellInts.`8`
  - typingsJapgolly.activexShell.activexShellInts.`4`
  - typingsJapgolly.activexShell.activexShellInts.`256`
*/
trait FileOperationFlag extends StObject
object FileOperationFlag {
  
  /** Preserve undo information, if possible. */
  inline def FOF_ALLOWUNDO: `64` = 64.asInstanceOf[`64`]
  
  /** Perform the operation on files only if a wildcard file name (*.*) is specified. */
  inline def FOF_FILESONLY: `128` = 128.asInstanceOf[`128`]
  
  /** Respond with "Yes to All" for any dialog box that is displayed. */
  inline def FOF_NOCONFIRMATION: `16` = 16.asInstanceOf[`16`]
  
  /** Do not confirm the creation of a new directory if the operation requires one to be created. */
  inline def FOF_NOCONFIRMMKDIR: `512` = 512.asInstanceOf[`512`]
  
  /**
    * Do not copy the security attributes of the file.
    *
    * _[Version 4.7.1](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  inline def FOF_NOCOPYSECURITYATTRIBS: `2048` = 2048.asInstanceOf[`2048`]
  
  /** Do not display a user interface if an error occurs. */
  inline def FOF_NOERRORUI: `1024` = 1024.asInstanceOf[`1024`]
  
  /** Only operate in the local directory. Do not operate recursively into subdirectories. */
  inline def FOF_NORECURSION: `4096` = 4096.asInstanceOf[`4096`]
  
  /**
    * Do not copy connected files as a group. Only copy the specified files.
    *
    * _[Version 5.0](https://msdn.microsoft.com/en-us/library/windows/desktop/bb776779.aspx)_
    */
  inline def FOF_NO_CONNECTED_ELEMENTS: `8192` = 8192.asInstanceOf[`8192`]
  
  /** Give the file being operated on a new name in a move, copy, or rename operation if a file with the target name already exists. */
  inline def FOF_RENAMEONCOLLISION: `8` = 8.asInstanceOf[`8`]
  
  /** Do not display a progress dialog box. */
  inline def FOF_SILENT: `4` = 4.asInstanceOf[`4`]
  
  /** Display a progress dialog box but do not show the file names. */
  inline def FOF_SIMPLEPROGRESS: `256` = 256.asInstanceOf[`256`]
}
