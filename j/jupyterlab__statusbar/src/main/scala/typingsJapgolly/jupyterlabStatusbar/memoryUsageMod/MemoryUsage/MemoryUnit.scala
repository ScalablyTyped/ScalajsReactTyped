package typingsJapgolly.jupyterlabStatusbar.memoryUsageMod.MemoryUsage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of unit used for reporting memory usage.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.B
  - typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB
  - typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB
  - typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB
  - typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB
  - typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB
*/
trait MemoryUnit extends js.Object

object MemoryUnit {
  @scala.inline
  def B: typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.B = this.cast("B")
  @scala.inline
  def GB: typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB = this.cast("GB")
  @scala.inline
  def KB: typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB = this.cast("KB")
  @scala.inline
  def MB: typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB = this.cast("MB")
  @scala.inline
  def PB: typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB = this.cast("PB")
  @scala.inline
  def TB: typingsJapgolly.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB = this.cast("TB")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

