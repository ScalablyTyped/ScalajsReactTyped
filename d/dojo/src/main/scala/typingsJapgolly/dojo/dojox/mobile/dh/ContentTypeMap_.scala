package typingsJapgolly.dojo.dojox.mobile.dh

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/dh/ContentTypeMap.html
  *
  * A component that provides a map for determining the content handler
  * class from a content-type.
  *
  */
trait ContentTypeMap_ extends js.Object {
  /**
    *
    */
  var map: js.Object
  /**
    * Adds a handler class for the given content type.
    *
    * @param contentType
    * @param handlerClass
    */
  def add(contentType: String, handlerClass: String): Unit
  /**
    * Returns the handler class for the given content type.
    *
    * @param contentType
    */
  def getHandlerClass(contentType: String): js.Any
}

object ContentTypeMap_ {
  @scala.inline
  def apply(add: (String, String) => Callback, getHandlerClass: String => CallbackTo[js.Any], map: js.Object): ContentTypeMap_ = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => add(t0, t1).runNow()))
    __obj.updateDynamic("getHandlerClass")(js.Any.fromFunction1((t0: java.lang.String) => getHandlerClass(t0).runNow()))
    __obj.asInstanceOf[ContentTypeMap_]
  }
}

