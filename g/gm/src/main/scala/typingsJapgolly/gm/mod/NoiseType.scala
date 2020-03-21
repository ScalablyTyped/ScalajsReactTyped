package typingsJapgolly.gm.mod

import typingsJapgolly.gm.gmStrings.gaussian_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gm.gmStrings.uniform
  - typingsJapgolly.gm.gmStrings.gaussian_
  - typingsJapgolly.gm.gmStrings.multiplicative
  - typingsJapgolly.gm.gmStrings.impulse
  - typingsJapgolly.gm.gmStrings.laplacian
  - typingsJapgolly.gm.gmStrings.poisson
*/
trait NoiseType extends js.Object

object NoiseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gaussian: gaussian_ = this.cast("gaussian")
  @scala.inline
  def impulse: typingsJapgolly.gm.gmStrings.impulse = this.cast("impulse")
  @scala.inline
  def laplacian: typingsJapgolly.gm.gmStrings.laplacian = this.cast("laplacian")
  @scala.inline
  def multiplicative: typingsJapgolly.gm.gmStrings.multiplicative = this.cast("multiplicative")
  @scala.inline
  def poisson: typingsJapgolly.gm.gmStrings.poisson = this.cast("poisson")
  @scala.inline
  def uniform: typingsJapgolly.gm.gmStrings.uniform = this.cast("uniform")
}

