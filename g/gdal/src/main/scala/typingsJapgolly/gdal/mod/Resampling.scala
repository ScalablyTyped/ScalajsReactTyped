package typingsJapgolly.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gdal.gdalStrings.NEAREST
  - typingsJapgolly.gdal.gdalStrings.GAUSS
  - typingsJapgolly.gdal.gdalStrings.CUBIC
  - typingsJapgolly.gdal.gdalStrings.AVERAGE
  - typingsJapgolly.gdal.gdalStrings.MODE
  - typingsJapgolly.gdal.gdalStrings.AVERAGE_MAGPHASE
  - typingsJapgolly.gdal.gdalStrings.NONE
*/
trait Resampling extends js.Object

object Resampling {
  @scala.inline
  def AVERAGE: typingsJapgolly.gdal.gdalStrings.AVERAGE = this.cast("AVERAGE")
  @scala.inline
  def AVERAGE_MAGPHASE: typingsJapgolly.gdal.gdalStrings.AVERAGE_MAGPHASE = this.cast("AVERAGE_MAGPHASE")
  @scala.inline
  def CUBIC: typingsJapgolly.gdal.gdalStrings.CUBIC = this.cast("CUBIC")
  @scala.inline
  def GAUSS: typingsJapgolly.gdal.gdalStrings.GAUSS = this.cast("GAUSS")
  @scala.inline
  def MODE: typingsJapgolly.gdal.gdalStrings.MODE = this.cast("MODE")
  @scala.inline
  def NEAREST: typingsJapgolly.gdal.gdalStrings.NEAREST = this.cast("NEAREST")
  @scala.inline
  def NONE: typingsJapgolly.gdal.gdalStrings.NONE = this.cast("NONE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

