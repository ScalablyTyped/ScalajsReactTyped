package typingsJapgolly.puppeteer.mod

import typingsJapgolly.puppeteer.puppeteerStrings.targetchanged
import typingsJapgolly.puppeteer.puppeteerStrings.targetcreated
import typingsJapgolly.puppeteer.puppeteerStrings.targetdestroyed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.puppeteer.puppeteerStrings.targetchanged
  - typingsJapgolly.puppeteer.puppeteerStrings.targetcreated
  - typingsJapgolly.puppeteer.puppeteerStrings.targetdestroyed
*/
trait BrowserContextEmittedEvents extends StObject
object BrowserContextEmittedEvents {
  
  /**
    * Emitted when the url of a target inside the browser context changes.
    * Contains a {@link Target} instance.
    */
  inline def TargetChanged: targetchanged = "targetchanged".asInstanceOf[targetchanged]
  
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
