package typingsJapgolly.dojo.dojox.mobile.dh

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/PatternFileTypeMap.html
  *
  * A component that provides a map for determining content-type from
  * the pattern of the URL.
  *
  */
trait PatternFileTypeMap_ extends js.Object {
  /**
    *
    */
  var map: js.Object
  /**
    * Adds a handler class for the given content type.
    *
    * @param key
    * @param contentType
    */
  def add(key: String, contentType: String): Unit
  /**
    * Returns the handler class for the given content type.
    *
    * @param fileName
    */
  def getContentType(fileName: String): Unit
}

object PatternFileTypeMap_ {
  @scala.inline
  def apply(add: (String, String) => Callback, getContentType: String => Callback, map: js.Object): PatternFileTypeMap_ = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => add(t0, t1).runNow()))
    __obj.updateDynamic("getContentType")(js.Any.fromFunction1((t0: java.lang.String) => getContentType(t0).runNow()))
    __obj.asInstanceOf[PatternFileTypeMap_]
  }
}

