package typingsJapgolly.ibmMobilefirst.WL.JSONStore

import typingsJapgolly.ibmMobilefirst.WL.Options
import typingsJapgolly.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.JSONStore.destroy")
@js.native
object destroy extends js.Object {
  /**
    * Completely wipes data for all users, destroys the internal storage, and clears security artifacts.
    * @parameters options is @deprecated
    */
  def apply(username: String): JQueryDeferred[Double] = js.native
  def apply(username: String, options: Options): JQueryDeferred[Double] = js.native
}

