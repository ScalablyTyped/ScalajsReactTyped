package typingsJapgolly.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebDriverProtocolDocumentHandling extends StObject {
  
  def execute[T](body: String): Awaitable[this.type, T] = js.native
  def execute[T](body: String, args: js.Array[Any]): Awaitable[this.type, T] = js.native
  def execute[T](
    body: String,
    args: js.Array[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[T], Unit]
  ): Awaitable[this.type, T] = js.native
  def execute[T](
    body: String,
    args: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[T], Unit]
  ): Awaitable[this.type, T] = js.native
  /**
    * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame. The executed script is assumed to be synchronous.
    * The script argument defines the script to execute in the form of a function body. The value returned by that function will be returned to the client.
    *
    * The function will be invoked with the provided args array and the values may be accessed via the arguments object in the order specified.
    *
    * Under the hood, if the `body` param is a function it is converted to a string with `<function>.toString()`. Any references to your current scope are ignored.
    *
    * To ensure cross-browser compatibility, the specified function should not be in ES6 format (i.e. `() => {}`).
    * If the execution of the function fails, the first argument of the callback contains error information.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.execute(function(imageData) {
    *      // resize operation
    *      return true;
    *    }, [imageData], function(result) {
    *      // result.value === true
    *    });
    * }
    */
  def execute[T](body: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, T]): Awaitable[this.type, T] = js.native
  def execute[T](body: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, T], args: js.Array[Any]): Awaitable[this.type, T] = js.native
  def execute[T](
    body: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, T],
    args: js.Array[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[T], Unit]
  ): Awaitable[this.type, T] = js.native
  def execute[T](
    body: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, T],
    args: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[T], Unit]
  ): Awaitable[this.type, T] = js.native
  
  def executeAsync(script: String): this.type = js.native
  def executeAsync(script: String, args: js.Array[Any]): this.type = js.native
  def executeAsync(
    script: String,
    args: js.Array[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): this.type = js.native
  def executeAsync(
    script: String,
    args: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): this.type = js.native
  /**
    * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame. The executed script is assumed to be asynchronous.
    *
    * The function to be injected receives the `done` callback as argument which needs to be called when the asynchronous operation finishes.
    * The value passed to the `done` callback is returned to the client.
    * Additional arguments for the injected function may be passed as a non-empty array which will be passed before the `done` callback.
    *
    * Asynchronous script commands may not span page loads. If an unload event is fired while waiting for the script result, an error will be returned.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.executeAsync(function(done) {
    *      setTimeout(function() {
    *        done(true);
    *      }, 500);
    *    }, function(result) {
    *      // result.value === true
    *    });
    *
    *    browser.executeAsync(function(arg1, arg2, done) {
    *      setTimeout(function() {
    *        done(true);
    *      }, 500);
    *    }, [arg1, arg2], function(result) {
    *      // result.value === true
    *    });
    * }
    */
  def executeAsync(script: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, Any]): this.type = js.native
  def executeAsync(script: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, Any], args: js.Array[Any]): this.type = js.native
  def executeAsync(
    script: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, Any],
    args: js.Array[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): this.type = js.native
  def executeAsync(
    script: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, Any],
    args: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Any], Unit]
  ): this.type = js.native
  
  /**
    *
    * Inject a snippet of JavaScript into the page for execution in the context of the currently selected frame.
    * The executed script is assumed to be asynchronous.
    *
    * The function to be injected receives the `done` callback as argument which needs to be called
    * when the asynchronous operation finishes. The value passed to the `done` callback is returned to the client.
    * Additional arguments for the injected function may be passed as a non-empty array which
    * will be passed before the `done` callback.
    *
    * Asynchronous script commands may not span page loads. If an unload event is fired
    *  while waiting for the script result, an error will be returned.
    *
    * @example
    *  this.demoTest = function (browser) {
    *    browser.executeAsyncScript(function(done) {
    *      setTimeout(function() {
    *        done(true);
    *      }, 500);
    *    }, function(result) {
    *      // result.value === true
    *    });
    *
    *    browser.executeAsyncScript(function(arg1, arg2, done) {
    *      setTimeout(function() {
    *        done(true);
    *      }, 500);
    *    }, [arg1, arg2], function(result) {
    *      // result.value === true
    *    });
    * }
    */
  def executeAsyncScript[T](script: String, args: js.Array[Any]): this.type = js.native
  def executeAsyncScript[T](
    script: String,
    args: js.Array[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[T], Unit]
  ): this.type = js.native
  def executeAsyncScript[T](script: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, T], args: js.Array[Any]): this.type = js.native
  def executeAsyncScript[T](
    script: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, T],
    args: js.Array[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[T], Unit]
  ): this.type = js.native
  
  def executeScript[T](body: String): Awaitable[this.type, T] = js.native
  def executeScript[T](body: String, args: js.Array[Any]): Awaitable[this.type, T] = js.native
  def executeScript[T](
    body: String,
    args: js.Array[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[T], Unit]
  ): Awaitable[this.type, T] = js.native
  def executeScript[T](
    body: String,
    args: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[T], Unit]
  ): Awaitable[this.type, T] = js.native
  def executeScript[T](body: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, T]): Awaitable[this.type, T] = js.native
  def executeScript[T](body: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, T], args: js.Array[Any]): Awaitable[this.type, T] = js.native
  def executeScript[T](
    body: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, T],
    args: js.Array[Any],
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[T], Unit]
  ): Awaitable[this.type, T] = js.native
  def executeScript[T](
    body: js.ThisFunction1[/* this */ Unit, /* repeated */ Any, T],
    args: Unit,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[T], Unit]
  ): Awaitable[this.type, T] = js.native
  
  /**
    * Returns a string serialisation of the DOM of the current page.
    *
    * @example
    * browser.source();
    */
  def source(): this.type = js.native
  def source(
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[String], Unit]
  ): this.type = js.native
}
