package typingsJapgolly.firefoxWebextBrowser.browser.extensionTypes

import typingsJapgolly.firefoxWebextBrowser.browser.manifest.ExtensionURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.AnonFile
  - typingsJapgolly.firefoxWebextBrowser.AnonCode
*/
trait ExtensionFileOrCode extends js.Object

object ExtensionFileOrCode {
  @scala.inline
  def AnonFile(file: ExtensionURL): ExtensionFileOrCode = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionFileOrCode]
  }
  @scala.inline
  def AnonCode(code: String): ExtensionFileOrCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionFileOrCode]
  }
}

