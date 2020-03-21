package typingsJapgolly.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Root popup in the popup stack
			 * 1 - Root - Root popup in the popup stack,
			 * 2 - Nested - Not root popup in the popup stack
			 */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1`
  - typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2`
*/
trait PopupType extends js.Object

object PopupType {
  @scala.inline
  def `1`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`1` = this.cast(1)
  @scala.inline
  def `2`: typingsJapgolly.powerappsComponentFramework.powerappsComponentFrameworkNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

