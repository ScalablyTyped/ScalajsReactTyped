package typingsJapgolly.colornames.mod

import typingsJapgolly.colornames.AnonCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to resolve any kind of color by its name.
  */
@js.native
trait GlobalResolver extends js.Object {
  /**
    * Provides the functionality to query colors.
    */
  @JSName("get")
  var get_Original: AnonCall = js.native
  /**
    * Gets the color with the specified name.
    */
  def apply(name: String): js.UndefOr[String] = js.native
  /**
    * Gets all available colors.
    */
  def all(): js.Array[Color] = js.native
  /**
    * Gets the color with the specified name.
    *
    * @param name
    * The name of the color to get.
    */
  /**
    * Provides the functionality to query colors.
    */
  def get(name: String): Color = js.native
}

