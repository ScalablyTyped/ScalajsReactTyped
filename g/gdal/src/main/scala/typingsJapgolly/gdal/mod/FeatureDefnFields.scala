package typingsJapgolly.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureDefnFields extends js.Object {
  val featureDefn: FeatureDefn = js.native
  def add(field: js.Array[FieldDefn]): Unit = js.native
  def add(field: FieldDefn): Unit = js.native
  def count(): Double = js.native
  def forEach(callback: js.Function2[/* field */ FieldDefn, /* i */ Double, Unit]): Unit = js.native
  def get(key: String): FieldDefn = js.native
  def get(key: Double): FieldDefn = js.native
  def getNames(): js.Array[String] = js.native
  def indexOf(name: String): Double = js.native
  def map[T](callback: js.Function2[/* field */ FieldDefn, /* i */ Double, T]): js.Array[T] = js.native
  def remove(key: String): Unit = js.native
  def remove(key: Double): Unit = js.native
  def reorder(map: js.Array[Double]): Unit = js.native
}

