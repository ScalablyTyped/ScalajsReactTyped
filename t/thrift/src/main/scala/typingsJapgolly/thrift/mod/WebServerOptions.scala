package typingsJapgolly.thrift.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.thrift.AnonHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServerOptions[TProcessor, THandler] extends js.Object {
  var services: StringDictionary[AnonHandler[TProcessor, THandler]]
}

object WebServerOptions {
  @scala.inline
  def apply[TProcessor, THandler](services: StringDictionary[AnonHandler[TProcessor, THandler]]): WebServerOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebServerOptions[TProcessor, THandler]]
  }
}

