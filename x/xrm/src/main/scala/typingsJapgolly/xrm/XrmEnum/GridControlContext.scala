package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmNumbers.`0`
import typingsJapgolly.xrm.xrmNumbers.`1`
import typingsJapgolly.xrm.xrmNumbers.`2`
import typingsJapgolly.xrm.xrmNumbers.`3`
import typingsJapgolly.xrm.xrmNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enumeration of grid control context resolutions.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmNumbers.`0`
  - typingsJapgolly.xrm.xrmNumbers.`1`
  - typingsJapgolly.xrm.xrmNumbers.`2`
  - typingsJapgolly.xrm.xrmNumbers.`3`
  - typingsJapgolly.xrm.xrmNumbers.`4`
*/
trait GridControlContext extends js.Object

object GridControlContext {
  @scala.inline
  def FormContextRelated: `4` = this.cast(4)
  @scala.inline
  def FormContextUnrelated: `3` = this.cast(3)
  @scala.inline
  def RibbonContextForm: `1` = this.cast(1)
  @scala.inline
  def RibbonContextListing: `2` = this.cast(2)
  @scala.inline
  def Unknown: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

