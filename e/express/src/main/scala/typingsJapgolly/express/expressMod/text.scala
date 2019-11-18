package typingsJapgolly.express.expressMod

import typingsJapgolly.bodyDashParser.bodyDashParserMod.OptionsText
import typingsJapgolly.connect.connectMod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
  * @since 4.17.0
  */
@JSImport("express", "text")
@js.native
object text extends js.Object {
  def apply(): NextHandleFunction = js.native
  def apply(options: OptionsText): NextHandleFunction = js.native
}

