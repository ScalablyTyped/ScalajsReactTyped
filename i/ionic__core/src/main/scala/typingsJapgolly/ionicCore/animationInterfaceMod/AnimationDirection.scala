package typingsJapgolly.ionicCore.animationInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionicCore.ionicCoreStrings.normal
  - typingsJapgolly.ionicCore.ionicCoreStrings.reverse
  - typingsJapgolly.ionicCore.ionicCoreStrings.alternate
  - typingsJapgolly.ionicCore.ionicCoreStrings.`alternate-reverse`
*/
trait AnimationDirection extends js.Object

object AnimationDirection {
  @scala.inline
  def alternate: typingsJapgolly.ionicCore.ionicCoreStrings.alternate = this.cast("alternate")
  @scala.inline
  def `alternate-reverse`: typingsJapgolly.ionicCore.ionicCoreStrings.`alternate-reverse` = this.cast("alternate-reverse")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typingsJapgolly.ionicCore.ionicCoreStrings.normal = this.cast("normal")
  @scala.inline
  def reverse: typingsJapgolly.ionicCore.ionicCoreStrings.reverse = this.cast("reverse")
}

