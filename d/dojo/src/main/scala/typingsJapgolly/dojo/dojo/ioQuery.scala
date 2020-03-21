package typingsJapgolly.dojo.dojo

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/io-query.html
  *
  * This module defines query string processing functions.
  *
  */
trait ioQuery extends js.Object {
  /**
    * takes a name/value mapping object and returns a string representing
    * a URL-encoded version of that object.
    *
    * @param map
    */
  def objectToQuery(map: js.Object): js.Any
  /**
    * Create an object representing a de-serialized query section of a
    * URL. Query keys with multiple values are returned in an array.
    *
    * @param str
    */
  def queryToObject(str: String): js.Object
}

object ioQuery {
  @scala.inline
  def apply(objectToQuery: js.Object => CallbackTo[js.Any], queryToObject: String => CallbackTo[js.Object]): ioQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objectToQuery")(js.Any.fromFunction1((t0: js.Object) => objectToQuery(t0).runNow()))
    __obj.updateDynamic("queryToObject")(js.Any.fromFunction1((t0: java.lang.String) => queryToObject(t0).runNow()))
    __obj.asInstanceOf[ioQuery]
  }
}

