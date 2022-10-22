package typingsJapgolly.ol

import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.formatFilterFilterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterMod {
  
  @JSImport("ol/format/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def and(conditions: default*): typingsJapgolly.ol.formatFilterAndMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(conditions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.ol.formatFilterAndMod.default]
  
  inline def bbox(geometryName: String, extent: Extent): typingsJapgolly.ol.formatFilterBboxMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(geometryName.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterBboxMod.default]
  inline def bbox(geometryName: String, extent: Extent, opt_srsName: String): typingsJapgolly.ol.formatFilterBboxMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(geometryName.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterBboxMod.default]
  
  inline def between(propertyName: String, lowerBoundary: Double, upperBoundary: Double): typingsJapgolly.ol.formatFilterIsBetweenMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(propertyName.asInstanceOf[js.Any], lowerBoundary.asInstanceOf[js.Any], upperBoundary.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsBetweenMod.default]
  
  inline def contains(geometryName: String, geometry: typingsJapgolly.ol.geomGeometryMod.default): typingsJapgolly.ol.formatFilterContainsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterContainsMod.default]
  inline def contains(geometryName: String, geometry: typingsJapgolly.ol.geomGeometryMod.default, opt_srsName: String): typingsJapgolly.ol.formatFilterContainsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterContainsMod.default]
  
  inline def disjoint(geometryName: String, geometry: typingsJapgolly.ol.geomGeometryMod.default): typingsJapgolly.ol.formatFilterDisjointMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("disjoint")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterDisjointMod.default]
  inline def disjoint(geometryName: String, geometry: typingsJapgolly.ol.geomGeometryMod.default, opt_srsName: String): typingsJapgolly.ol.formatFilterDisjointMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("disjoint")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterDisjointMod.default]
  
  inline def during(propertyName: String, begin: String, end: String): typingsJapgolly.ol.formatFilterDuringMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("during")(propertyName.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterDuringMod.default]
  
  inline def dwithin(
    geometryName: String,
    geometry: typingsJapgolly.ol.geomGeometryMod.default,
    distance: Double,
    unit: String
  ): typingsJapgolly.ol.formatFilterDwithinMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("dwithin")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterDwithinMod.default]
  inline def dwithin(
    geometryName: String,
    geometry: typingsJapgolly.ol.geomGeometryMod.default,
    distance: Double,
    unit: String,
    opt_srsName: String
  ): typingsJapgolly.ol.formatFilterDwithinMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("dwithin")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterDwithinMod.default]
  
  inline def equalTo(propertyName: String, expression: String): typingsJapgolly.ol.formatFilterEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterEqualToMod.default]
  inline def equalTo(propertyName: String, expression: String, opt_matchCase: Boolean): typingsJapgolly.ol.formatFilterEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterEqualToMod.default]
  inline def equalTo(propertyName: String, expression: Double): typingsJapgolly.ol.formatFilterEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterEqualToMod.default]
  inline def equalTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typingsJapgolly.ol.formatFilterEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterEqualToMod.default]
  
  inline def greaterThan(propertyName: String, expression: Double): typingsJapgolly.ol.formatFilterGreaterThanMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterGreaterThanMod.default]
  
  inline def greaterThanOrEqualTo(propertyName: String, expression: Double): typingsJapgolly.ol.formatFilterGreaterThanOrEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterGreaterThanOrEqualToMod.default]
  
  inline def intersects(geometryName: String, geometry: typingsJapgolly.ol.geomGeometryMod.default): typingsJapgolly.ol.formatFilterIntersectsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIntersectsMod.default]
  inline def intersects(geometryName: String, geometry: typingsJapgolly.ol.geomGeometryMod.default, opt_srsName: String): typingsJapgolly.ol.formatFilterIntersectsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIntersectsMod.default]
  
  inline def isNull(propertyName: String): typingsJapgolly.ol.formatFilterIsNullMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(propertyName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ol.formatFilterIsNullMod.default]
  
  inline def lessThan(propertyName: String, expression: Double): typingsJapgolly.ol.formatFilterLessThanMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterLessThanMod.default]
  
  inline def lessThanOrEqualTo(propertyName: String, expression: Double): typingsJapgolly.ol.formatFilterLessThanOrEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterLessThanOrEqualToMod.default]
  
  inline def like(propertyName: String, pattern: String): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(propertyName: String, pattern: String, opt_wildCard: String): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: String
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(propertyName: String, pattern: String, opt_wildCard: Unit, opt_singleChar: String): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: String
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: String
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typingsJapgolly.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterIsLikeMod.default]
  
  inline def not(condition: default): typingsJapgolly.ol.formatFilterNotMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(condition.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ol.formatFilterNotMod.default]
  
  inline def notEqualTo(propertyName: String, expression: String): typingsJapgolly.ol.formatFilterNotEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterNotEqualToMod.default]
  inline def notEqualTo(propertyName: String, expression: String, opt_matchCase: Boolean): typingsJapgolly.ol.formatFilterNotEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterNotEqualToMod.default]
  inline def notEqualTo(propertyName: String, expression: Double): typingsJapgolly.ol.formatFilterNotEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterNotEqualToMod.default]
  inline def notEqualTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typingsJapgolly.ol.formatFilterNotEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterNotEqualToMod.default]
  
  inline def or(conditions: default*): typingsJapgolly.ol.formatFilterOrMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(conditions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.ol.formatFilterOrMod.default]
  
  inline def within(geometryName: String, geometry: typingsJapgolly.ol.geomGeometryMod.default): typingsJapgolly.ol.formatFilterWithinMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterWithinMod.default]
  inline def within(geometryName: String, geometry: typingsJapgolly.ol.geomGeometryMod.default, opt_srsName: String): typingsJapgolly.ol.formatFilterWithinMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ol.formatFilterWithinMod.default]
}
