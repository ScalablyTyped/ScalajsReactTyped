package typingsJapgolly.nightwatch.anon

import typingsJapgolly.nightwatch.mod.Awaitable
import typingsJapgolly.nightwatch.mod.Definition
import typingsJapgolly.nightwatch.mod.LocateStrategy
import typingsJapgolly.nightwatch.mod.NightwatchAPI
import typingsJapgolly.nightwatch.mod.NightwatchCallbackResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallUsingSelectorPropertyCallback extends StObject {
  
  def apply(selector: Definition, property: String): Awaitable[this.type, Any] = js.native
  def apply(
    selector: Definition,
    property: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): Awaitable[this.type, Any] = js.native
  def apply(`using`: LocateStrategy, selector: Definition, property: String): Awaitable[this.type, Any] = js.native
  def apply(
    `using`: LocateStrategy,
    selector: Definition,
    property: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): Awaitable[this.type, Any] = js.native
}
