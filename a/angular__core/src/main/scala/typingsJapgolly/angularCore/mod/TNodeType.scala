package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.angularCoreNumbers.`0`
import typingsJapgolly.angularCore.angularCoreNumbers.`1`
import typingsJapgolly.angularCore.angularCoreNumbers.`2`
import typingsJapgolly.angularCore.angularCoreNumbers.`3`
import typingsJapgolly.angularCore.angularCoreNumbers.`4`
import typingsJapgolly.angularCore.angularCoreNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TNodeType corresponds to the {@link TNode} `type` property.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCore.angularCoreNumbers.`0`
  - typingsJapgolly.angularCore.angularCoreNumbers.`1`
  - typingsJapgolly.angularCore.angularCoreNumbers.`2`
  - typingsJapgolly.angularCore.angularCoreNumbers.`3`
  - typingsJapgolly.angularCore.angularCoreNumbers.`4`
  - typingsJapgolly.angularCore.angularCoreNumbers.`5`
*/
trait TNodeType extends js.Object

object TNodeType {
  /**
    * The TNode contains information about an {@link LContainer} for embedded views.
    */
  @scala.inline
  def Container: `0` = this.cast(0)
  /**
    * The TNode contains information about a DOM element aka {@link RNode}.
    */
  @scala.inline
  def Element: `3` = this.cast(3)
  /**
    * The TNode contains information about an `<ng-container>` element {@link RNode}.
    */
  @scala.inline
  def ElementContainer: `4` = this.cast(4)
  /**
    * The TNode contains information about an ICU comment used in `i18n`.
    */
  @scala.inline
  def IcuContainer: `5` = this.cast(5)
  /**
    * The TNode contains information about an `<ng-content>` projection
    */
  @scala.inline
  def Projection: `1` = this.cast(1)
  /**
    * The TNode contains information about an {@link LView}
    */
  @scala.inline
  def View: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

