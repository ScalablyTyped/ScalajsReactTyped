package typingsJapgolly.webdriverio

import typingsJapgolly.webdriverio.anon.PartialWaitUntilOptions
import typingsJapgolly.webdriverio.webdriverioBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserWaitUntilMod {
  
  @JSImport("webdriverio/build/commands/browser/waitUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(condition: js.Function0[Boolean | js.Promise[Boolean]]): js.Promise[`true` | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any]).asInstanceOf[js.Promise[`true` | Unit]]
  inline def default(
    condition: js.Function0[Boolean | js.Promise[Boolean]],
    hasTimeoutIntervalTimeoutMsg: PartialWaitUntilOptions
  ): js.Promise[`true` | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any], hasTimeoutIntervalTimeoutMsg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[`true` | Unit]]
}
