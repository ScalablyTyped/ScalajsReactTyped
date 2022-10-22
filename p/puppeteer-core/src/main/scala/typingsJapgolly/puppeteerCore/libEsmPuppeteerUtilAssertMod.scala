package typingsJapgolly.puppeteerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerUtilAssertMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/util/assert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assert(value: Any): /* asserts value */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any]).asInstanceOf[/* asserts value */ Boolean]
  inline def assert(value: Any, message: String): /* asserts value */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts value */ Boolean]
}
