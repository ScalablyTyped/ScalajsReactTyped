package typingsJapgolly.urlVariables.mod

import typingsJapgolly.tstl.mod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * URLVariables class is for representing variables of HTTP.
  *
  * {@link URLVariables} class allows you to transfer variables between an application and server.
  *
  * When transfering, {@link URLVariables} will be converted to a *URI* string.
  * - URI: Uniform Resource Identifier
  *
  * @reference http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/flash/net/URLVariables.html
  * @author Migrated by Jeongho Nam <http://samchon.org>
  */
@js.native
trait URLVariables extends HashMap[String, String] {
  /**
    * @hidden
    */
  var _Parse: js.Any = js.native
}

