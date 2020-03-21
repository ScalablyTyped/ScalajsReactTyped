package typingsJapgolly.dojo.dojox.geo.openlayers

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.html
  *
  *
  */
trait base_ extends js.Object {
  /**
    * Defines the base layer types to be used at Map construction time or
    * with the setBaseLayerType function.
    *
    */
  var BaseLayerType: js.Object
  /**
    *
    */
  var EPSG4326: js.Object
  /**
    *
    */
  var GreatCircle: js.Object
  /**
    *
    */
  var widget: js.Object
  /**
    *
    */
  def Collection(): Unit
  /**
    *
    */
  def Feature(): Unit
  /**
    *
    */
  def Geometry(): Unit
  /**
    *
    */
  def GeometryFeature(): Unit
  /**
    *
    */
  def GfxLayer(): Unit
  /**
    *
    */
  def JsonImport(): Unit
  /**
    *
    */
  def Layer(): Unit
  /**
    *
    */
  def LineString(): Unit
  /**
    *
    */
  def Map(): Unit
  /**
    *
    */
  def Point(): Unit
  /**
    *
    */
  def TouchInteractionSupport(): Unit
  /**
    *
    */
  def WidgetFeature(): Unit
  /**
    * Parses the specified string and returns degree minute second or decimal degree.
    * Parses the specified string and returns degree minute second or decimal degree.
    *
    * @param v The string to parse
    * @param toDecimal Specifies if the result should be returned in decimal degrees or in an arraycontaining the degrees, minutes, seconds values.
    */
  def parseDMS(v: String, toDecimal: Boolean): Double
}

object base_ {
  @scala.inline
  def apply(
    BaseLayerType: js.Object,
    Collection: Callback,
    EPSG4326: js.Object,
    Feature: Callback,
    Geometry: Callback,
    GeometryFeature: Callback,
    GfxLayer: Callback,
    GreatCircle: js.Object,
    JsonImport: Callback,
    Layer: Callback,
    LineString: Callback,
    Map: Callback,
    Point: Callback,
    TouchInteractionSupport: Callback,
    WidgetFeature: Callback,
    parseDMS: (String, Boolean) => CallbackTo[Double],
    widget: js.Object
  ): base_ = {
    val __obj = js.Dynamic.literal(BaseLayerType = BaseLayerType.asInstanceOf[js.Any], EPSG4326 = EPSG4326.asInstanceOf[js.Any], GreatCircle = GreatCircle.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any])
    __obj.updateDynamic("Collection")(Collection.toJsFn)
    __obj.updateDynamic("Feature")(Feature.toJsFn)
    __obj.updateDynamic("Geometry")(Geometry.toJsFn)
    __obj.updateDynamic("GeometryFeature")(GeometryFeature.toJsFn)
    __obj.updateDynamic("GfxLayer")(GfxLayer.toJsFn)
    __obj.updateDynamic("JsonImport")(JsonImport.toJsFn)
    __obj.updateDynamic("Layer")(Layer.toJsFn)
    __obj.updateDynamic("LineString")(LineString.toJsFn)
    __obj.updateDynamic("Map")(Map.toJsFn)
    __obj.updateDynamic("Point")(Point.toJsFn)
    __obj.updateDynamic("TouchInteractionSupport")(TouchInteractionSupport.toJsFn)
    __obj.updateDynamic("WidgetFeature")(WidgetFeature.toJsFn)
    __obj.updateDynamic("parseDMS")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => parseDMS(t0, t1).runNow()))
    __obj.asInstanceOf[base_]
  }
}

