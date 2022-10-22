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
trait FnCallUsingSelectorInputValueCallback extends StObject {
  
  def apply(selector: Definition, inputValue: String): Awaitable[this.type, Null] = js.native
  def apply(
    selector: Definition,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def apply(selector: Definition, inputValue: js.Array[String]): Awaitable[this.type, Null] = js.native
  def apply(
    selector: Definition,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def apply(`using`: LocateStrategy, selector: Definition, inputValue: String): Awaitable[this.type, Null] = js.native
  def apply(
    `using`: LocateStrategy,
    selector: Definition,
    inputValue: String,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
  def apply(`using`: LocateStrategy, selector: Definition, inputValue: js.Array[String]): Awaitable[this.type, Null] = js.native
  def apply(
    `using`: LocateStrategy,
    selector: Definition,
    inputValue: js.Array[String],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Null], Unit]
  ): Awaitable[this.type, Null] = js.native
}
