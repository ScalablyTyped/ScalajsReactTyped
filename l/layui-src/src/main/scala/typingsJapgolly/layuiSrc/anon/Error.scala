package typingsJapgolly.layuiSrc.anon

import typingsJapgolly.layuiSrc.layuiSrcStrings.debug
import typingsJapgolly.layuiSrc.layuiSrcStrings.info
import typingsJapgolly.layuiSrc.layuiSrcStrings.log
import typingsJapgolly.layuiSrc.layuiSrcStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error extends StObject {
  
  def error(msg: Any): Unit = js.native
  def error(msg: Any, `type`: log | info | typingsJapgolly.layuiSrc.layuiSrcStrings.error | warn | debug): Unit = js.native
  def error(msg: Any, `type`: String): Unit = js.native
}
