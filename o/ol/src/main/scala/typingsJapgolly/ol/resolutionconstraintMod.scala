package typingsJapgolly.ol

import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/resolutionconstraint", JSImport.Namespace)
@js.native
object resolutionconstraintMod extends js.Object {
  def createMinMaxResolution(maxResolution: Double, minResolution: Double): Type = js.native
  def createMinMaxResolution(maxResolution: Double, minResolution: Double, opt_smooth: Boolean): Type = js.native
  def createMinMaxResolution(maxResolution: Double, minResolution: Double, opt_smooth: Boolean, opt_maxExtent: Extent): Type = js.native
  def createSnapToPower(power: Double, maxResolution: Double): Type = js.native
  def createSnapToPower(power: Double, maxResolution: Double, opt_minResolution: Double): Type = js.native
  def createSnapToPower(power: Double, maxResolution: Double, opt_minResolution: Double, opt_smooth: Boolean): Type = js.native
  def createSnapToPower(
    power: Double,
    maxResolution: Double,
    opt_minResolution: Double,
    opt_smooth: Boolean,
    opt_maxExtent: Extent
  ): Type = js.native
  def createSnapToResolutions(resolutions: js.Array[Double]): Type = js.native
  def createSnapToResolutions(resolutions: js.Array[Double], opt_smooth: Boolean): Type = js.native
  def createSnapToResolutions(resolutions: js.Array[Double], opt_smooth: Boolean, opt_maxExtent: Extent): Type = js.native
  type Type = js.Function4[
    /* p0 */ js.UndefOr[Double], 
    /* p1 */ Double, 
    /* p2 */ Size, 
    /* p3 */ js.UndefOr[Boolean], 
    Double
  ]
}

