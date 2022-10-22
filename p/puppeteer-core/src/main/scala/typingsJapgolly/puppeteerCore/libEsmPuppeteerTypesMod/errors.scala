package typingsJapgolly.puppeteerCore.libEsmPuppeteerTypesMod

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonErrorsMod.PuppeteerErrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errors extends Shortcut {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "errors")
  @js.native
  val ^ : PuppeteerErrors = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "errors.ProtocolError")
  @js.native
  open class ProtocolErrorCls ()
    extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonErrorsMod.ProtocolError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("puppeteer-core/lib/esm/puppeteer/types", "errors.TimeoutError")
  @js.native
  open class TimeoutErrorCls ()
    extends typingsJapgolly.puppeteerCore.libEsmPuppeteerCommonErrorsMod.TimeoutError
  
  type _To = PuppeteerErrors
  
  /* This means you don't have to write `^`, but can instead just say `errors.foo` */
  override def _to: PuppeteerErrors = ^
}
