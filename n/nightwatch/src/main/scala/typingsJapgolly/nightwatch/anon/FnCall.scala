package typingsJapgolly.nightwatch.anon

import typingsJapgolly.nightwatch.mod.Awaitable
import typingsJapgolly.nightwatch.mod.Definition
import typingsJapgolly.nightwatch.mod.JSON_WEB_OBJECT
import typingsJapgolly.nightwatch.mod.LocateStrategy
import typingsJapgolly.nightwatch.mod.NightwatchAPI
import typingsJapgolly.nightwatch.mod.NightwatchCallbackResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def apply(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def apply(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
  def apply(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[JSON_WEB_OBJECT], 
      Unit
    ]
  ): Awaitable[this.type, JSON_WEB_OBJECT] = js.native
}
