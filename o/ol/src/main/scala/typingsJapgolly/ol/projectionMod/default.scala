package typingsJapgolly.ol.projectionMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.unitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj/Projection", JSImport.Default)
@js.native
class default protected () extends Projection {
  def this(options: Options) = this()
  /* CompleteClass */
  override def canWrapX(): Boolean = js.native
  /* CompleteClass */
  override def getAxisOrientation(): String = js.native
  /* CompleteClass */
  override def getCode(): String = js.native
  /* CompleteClass */
  override def getDefaultTileGrid(): typingsJapgolly.ol.tilegridTileGridMod.default = js.native
  /* CompleteClass */
  override def getExtent(): Extent = js.native
  /* CompleteClass */
  override def getMetersPerUnit(): Double = js.native
  /* CompleteClass */
  override def getPointResolutionFunc(): js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] = js.native
  /* CompleteClass */
  override def getUnits(): Units = js.native
  /* CompleteClass */
  override def getWorldExtent(): Extent = js.native
  /* CompleteClass */
  override def isGlobal(): Boolean = js.native
  /* CompleteClass */
  override def setDefaultTileGrid(tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default): Unit = js.native
  /* CompleteClass */
  override def setExtent(extent: Extent): Unit = js.native
  /* CompleteClass */
  override def setGetPointResolution(func: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Unit = js.native
  /* CompleteClass */
  override def setGlobal(global: Boolean): Unit = js.native
  /* CompleteClass */
  override def setWorldExtent(worldExtent: Extent): Unit = js.native
}

