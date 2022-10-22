package typingsJapgolly.puppeteerCore

import typingsJapgolly.puppeteerCore.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonFetchMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFetch(): js.Promise[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFetch")().asInstanceOf[js.Promise[FnCall]]
}
