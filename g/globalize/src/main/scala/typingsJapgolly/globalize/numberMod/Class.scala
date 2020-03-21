package typingsJapgolly.globalize.numberMod

import typingsJapgolly.cldrjs.mod.CldrStatic
import typingsJapgolly.globalize.globalizeMod.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("globalize/dist/globalize/number", JSImport.Namespace)
@js.native
class Class protected () extends Shared {
  /**
  		 * Create a Globalize instance.
  		 * @param cldr Cldr instance of the instance.
  		 * @returns {Globalize} A Globalize instance
  		 */
  def this(cldr: CldrStatic) = this()
  /**
  		 * Create a Globalize instance.
  		 * @param {string} Locale string of the instance.
  		 * @returns {Globalize} A Globalize instance
  		 */
  def this(locale: String) = this()
}

