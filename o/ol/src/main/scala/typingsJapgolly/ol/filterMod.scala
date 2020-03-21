package typingsJapgolly.ol

import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.filterFilterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  def and(conditions: default*): typingsJapgolly.ol.andMod.default = js.native
  def bbox(geometryName: String, extent: Extent): typingsJapgolly.ol.bboxMod.default = js.native
  def bbox(geometryName: String, extent: Extent, opt_srsName: String): typingsJapgolly.ol.bboxMod.default = js.native
  def between(propertyName: String, lowerBoundary: Double, upperBoundary: Double): typingsJapgolly.ol.isBetweenMod.default = js.native
  def contains(geometryName: String, geometry: typingsJapgolly.ol.geometryMod.default): typingsJapgolly.ol.containsMod.default = js.native
  def contains(geometryName: String, geometry: typingsJapgolly.ol.geometryMod.default, opt_srsName: String): typingsJapgolly.ol.containsMod.default = js.native
  def during(propertyName: String, begin: String, end: String): typingsJapgolly.ol.duringMod.default = js.native
  def equalTo(propertyName: String, expression: String): typingsJapgolly.ol.equalToMod.default = js.native
  def equalTo(propertyName: String, expression: String, opt_matchCase: Boolean): typingsJapgolly.ol.equalToMod.default = js.native
  def equalTo(propertyName: String, expression: Double): typingsJapgolly.ol.equalToMod.default = js.native
  def equalTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typingsJapgolly.ol.equalToMod.default = js.native
  def greaterThan(propertyName: String, expression: Double): typingsJapgolly.ol.greaterThanMod.default = js.native
  def greaterThanOrEqualTo(propertyName: String, expression: Double): typingsJapgolly.ol.greaterThanOrEqualToMod.default = js.native
  def intersects(geometryName: String, geometry: typingsJapgolly.ol.geometryMod.default): typingsJapgolly.ol.intersectsMod.default = js.native
  def intersects(geometryName: String, geometry: typingsJapgolly.ol.geometryMod.default, opt_srsName: String): typingsJapgolly.ol.intersectsMod.default = js.native
  def isNull(propertyName: String): typingsJapgolly.ol.isNullMod.default = js.native
  def lessThan(propertyName: String, expression: Double): typingsJapgolly.ol.lessThanMod.default = js.native
  def lessThanOrEqualTo(propertyName: String, expression: Double): typingsJapgolly.ol.lessThanOrEqualToMod.default = js.native
  def like(propertyName: String, pattern: String): typingsJapgolly.ol.isLikeMod.default = js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String): typingsJapgolly.ol.isLikeMod.default = js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): typingsJapgolly.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String
  ): typingsJapgolly.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typingsJapgolly.ol.isLikeMod.default = js.native
  def not(condition: default): typingsJapgolly.ol.notMod.default = js.native
  def notEqualTo(propertyName: String, expression: String): typingsJapgolly.ol.notEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: String, opt_matchCase: Boolean): typingsJapgolly.ol.notEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: Double): typingsJapgolly.ol.notEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typingsJapgolly.ol.notEqualToMod.default = js.native
  def or(conditions: default*): typingsJapgolly.ol.orMod.default = js.native
  def within(geometryName: String, geometry: typingsJapgolly.ol.geometryMod.default): typingsJapgolly.ol.withinMod.default = js.native
  def within(geometryName: String, geometry: typingsJapgolly.ol.geometryMod.default, opt_srsName: String): typingsJapgolly.ol.withinMod.default = js.native
}

