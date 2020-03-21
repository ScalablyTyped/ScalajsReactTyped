package typingsJapgolly.angularAnimations.mod

import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`0`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`10`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`11`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`12`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`1`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`2`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`3`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`4`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`5`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`6`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`7`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`8`
import typingsJapgolly.angularAnimations.angularAnimationsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`0`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`1`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`2`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`3`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`4`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`5`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`6`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`7`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`8`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`9`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`10`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`11`
  - typingsJapgolly.angularAnimations.angularAnimationsNumbers.`12`
*/
trait AnimationMetadataType extends js.Object

object AnimationMetadataType {
  /**
    * Contains an animation step.
    * See `animate()`
    */
  @scala.inline
  def Animate: `4` = this.cast(4)
  /**
    * Contains data to use in executing child animations returned by a query.
    * See `animateChild()`
    */
  @scala.inline
  def AnimateChild: `9` = this.cast(9)
  /**
    * Contains animation parameters for a re-usable animation.
    * See `useAnimation()`
    */
  @scala.inline
  def AnimateRef: `10` = this.cast(10)
  /**
    * Contains a set of animation steps.
    * See `{@link animations/group group()}`
    */
  @scala.inline
  def Group: `3` = this.cast(3)
  /**
    * Contains a set of animation steps.
    * See `keyframes()`
    */
  @scala.inline
  def Keyframes: `5` = this.cast(5)
  /**
    * Contains child-animation query data.
    * See `query()`
    */
  @scala.inline
  def Query: `11` = this.cast(11)
  /**
    * Contains a re-usable animation.
    * See `animation()`
    */
  @scala.inline
  def Reference: `8` = this.cast(8)
  /**
    * Contains a set of animation steps.
    * See `sequence()`
    */
  @scala.inline
  def Sequence: `2` = this.cast(2)
  /**
    * Contains data for staggering an animation sequence.
    * See `stagger()`
    */
  @scala.inline
  def Stagger: `12` = this.cast(12)
  /**
    * Associates a named animation state with a set of CSS styles.
    * See `state()`
    */
  @scala.inline
  def State: `0` = this.cast(0)
  /**
    * Contains a set of CSS property-value pairs into a named style.
    * See `style()`
    */
  @scala.inline
  def Style: `6` = this.cast(6)
  /**
    * Data for a transition from one animation state to another.
    * See `transition()`
    */
  @scala.inline
  def Transition: `1` = this.cast(1)
  /**
    * Associates an animation with an entry trigger that can be attached to an element.
    * See `trigger()`
    */
  @scala.inline
  def Trigger: `7` = this.cast(7)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

