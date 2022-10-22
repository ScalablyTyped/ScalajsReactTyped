package typingsJapgolly.puppeteerCore.mod

import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetchanged_
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetcreated
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetdestroyed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetchanged_
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetcreated
  - typingsJapgolly.puppeteerCore.puppeteerCoreStrings.targetdestroyed
*/
trait BrowserContextEmittedEvents extends StObject
object BrowserContextEmittedEvents {
  
  /**
    * Emitted when the url of a target inside the browser context changes.
    * Contains a {@link Target} instance.
    */
  inline def TargetChanged: targetchanged_ = "targetchanged".asInstanceOf[targetchanged_]
  
  /**
    * Emitted when a target is created within the browser context, for example
    * when a new page is opened by
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/Window/open | window.open}
    * or by {@link BrowserContext.newPage | browserContext.newPage}
    *
    * Contains a {@link Target} instance.
    */
  inline def TargetCreated: targetcreated = "targetcreated".asInstanceOf[targetcreated]
  
  /**
    * Emitted when a target is destroyed within the browser context, for example
    * when a page is closed. Contains a {@link Target} instance.
    */
  inline def TargetDestroyed: targetdestroyed = "targetdestroyed".asInstanceOf[targetdestroyed]
}
