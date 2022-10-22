package typingsJapgolly.webdriverio.buildTypesMod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import typingsJapgolly.wdioTypes.buildCapabilitiesMod.RemoteCapability
import typingsJapgolly.wdioTypes.buildOptionsMod.Testrunner
import typingsJapgolly.wdioTypes.buildOptionsMod.WebdriverIO
import typingsJapgolly.webdriver.buildTypesMod.SessionFlags
import typingsJapgolly.webdriverio.webdriverioStrings.async
import typingsJapgolly.webdriverio.webdriverioStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceBase
  extends EventEmitter
     with SessionFlags {
  
  /**
    * @private
    */
  var _NOT_FIBER: js.UndefOr[Boolean] = js.native
  
  /**
    * @private
    */
  var __propertiesObject__ : Record[String, js.PropertyDescriptor] = js.native
  
  /**
    * Applied capabilities used in the current session. Note: these can differ from the actual
    * requested capabilities if the remote end couldn't provide an exact match.
    */
  var capabilities: RemoteCapability = js.native
  
  /**
    * Given WebdriverIO options (including custom configurations)
    */
  var config: WebdriverIO | Testrunner = js.native
  
  /**
    * Applied WebdriverIO options (options that aren't officially part of WebdriverIO are stripped
    * out of this object).
    */
  var options: WebdriverIO | Testrunner = js.native
  
  /**
    * Puppeteer instance
    */
  var puppeteer: js.UndefOr[Browser[sync | async]] = js.native
  
  /**
    * Requested capabilities defined in the config object.
    */
  var requestedCapabilities: RemoteCapability = js.native
  
  /**
    * Session id for the current running session
    */
  var sessionId: String = js.native
  
  var strategies: Map[Any, Any] = js.native
  
  /**
    * @private
    */
  var wdioRetries: js.UndefOr[Double] = js.native
}
