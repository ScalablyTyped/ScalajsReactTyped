package typingsJapgolly.dojo.dojo

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/json.html
  *
  * Functions to parse and serialize JSON
  *
  */
trait json extends js.Object {
  /**
    * Parses a JSON string to return a JavaScript object.
    * This function follows native JSON API
    * Throws for invalid JSON strings. This delegates to eval() if native JSON
    * support is not available. By default this will evaluate any valid JS expression.
    * With the strict parameter set to true, the parser will ensure that only
    * valid JSON strings are parsed (otherwise throwing an error). Without the strict
    * parameter, the content passed to this method must come
    * from a trusted source.
    *
    * @param str a string literal of a JSON item, for instance:'{ "foo": [ "bar", 1, { "baz": "thud" } ] }'
    * @param strict When set to true, this will ensure that only valid, secure JSON is ever parsed.Make sure this is set to true for untrusted content. Note that on browsers/engineswithout native JSON support, setting this to true will run slower.
    */
  def parse(str: js.Any, strict: js.Any): Unit
  /**
    * Returns a JSON serialization of an object.
    * Returns a JSON serialization of an object.
    * This function follows native JSON API
    * Note that this doesn't check for infinite recursion, so don't do that!
    *
    * @param value A value to be serialized.
    * @param replacer A replacer function that is called for each value and can return a replacement
    * @param spacer A spacer string to be used for pretty printing of JSON
    */
  def stringify(value: js.Any, replacer: js.Any, spacer: js.Any): Unit
}

object json {
  @scala.inline
  def apply(parse: (js.Any, js.Any) => Callback, stringify: (js.Any, js.Any, js.Any) => Callback): json = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => parse(t0, t1).runNow()))
    __obj.updateDynamic("stringify")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => stringify(t0, t1, t2).runNow()))
    __obj.asInstanceOf[json]
  }
}

