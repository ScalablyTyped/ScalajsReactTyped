package typingsJapgolly.farbtastic

import typingsJapgolly.farbtastic.JQueryFarbtastic.Callback
import typingsJapgolly.farbtastic.JQueryFarbtastic.Farbtastic
import typingsJapgolly.farbtastic.JQueryFarbtastic.Options
import typingsJapgolly.farbtastic.JQueryFarbtastic.Placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  def farbtastic(placeholder: Placeholder): Farbtastic = js.native
  def farbtastic(placeholder: Placeholder, callback: Callback): Farbtastic = js.native
  def farbtastic(placeholder: Placeholder, options: Options): Farbtastic = js.native
}

