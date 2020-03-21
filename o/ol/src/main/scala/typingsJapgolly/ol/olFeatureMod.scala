package typingsJapgolly.ol

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColongeometry
import typingsJapgolly.ol.styleStyleMod.StyleFunction
import typingsJapgolly.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Feature", JSImport.Namespace)
@js.native
object olFeatureMod extends js.Object {
  @js.native
  trait Feature[GeomType /* <: typingsJapgolly.ol.geometryMod.default */]
    extends typingsJapgolly.ol.objectMod.default {
    def getGeometry(): GeomType = js.native
    def getGeometryName(): String = js.native
    def getId(): Double | String = js.native
    def getStyle(): StyleLike = js.native
    def getStyleFunction(): StyleFunction = js.native
    @JSName("on")
    def on_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    def setGeometry(): Unit = js.native
    def setGeometry(geometry: GeomType): Unit = js.native
    def setGeometryName(name: String): Unit = js.native
    def setId(): Unit = js.native
    def setId(id: String): Unit = js.native
    def setId(id: Double): Unit = js.native
    def setStyle(): Unit = js.native
    def setStyle(style: StyleLike): Unit = js.native
    @JSName("un")
    def un_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  @js.native
  class default[GeomType /* <: typingsJapgolly.ol.geometryMod.default */] () extends Feature[GeomType] {
    def this(opt_geometryOrProperties: GeomType) = this()
    def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
  }
  
  def createStyleFunction(obj: js.Array[typingsJapgolly.ol.styleStyleMod.default]): StyleFunction = js.native
  def createStyleFunction(obj: StyleFunction): StyleFunction = js.native
  def createStyleFunction(obj: typingsJapgolly.ol.styleStyleMod.default): StyleFunction = js.native
  type FeatureClass = Feature[typingsJapgolly.ol.geometryMod.default] | typingsJapgolly.ol.renderFeatureMod.default
  type FeatureLike = Feature[typingsJapgolly.ol.geometryMod.default] | typingsJapgolly.ol.renderFeatureMod.default
}

