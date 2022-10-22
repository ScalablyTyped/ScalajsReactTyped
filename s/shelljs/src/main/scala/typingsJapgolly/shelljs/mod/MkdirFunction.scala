package typingsJapgolly.shelljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MkdirFunction extends StObject {
  
  def apply(dir: String*): ShellString = js.native
  /**
    * Creates directories.
    *
    * @param dir Directories to create.
    * @return    Object with shell exit code, stderr and stdout.
    */
  def apply(dir: js.Array[String]): ShellString = js.native
  def apply(options: String, dir: String*): ShellString = js.native
  /**
    * Creates directories.
    *
    * @param options Available options:
    *        - `-p`: full paths, will create intermediate dirs if necessary
    * @param dir     The directories to create.
    * @return        Object with shell exit code, stderr and stdout.
    */
  def apply(options: String, dir: js.Array[String]): ShellString = js.native
}
