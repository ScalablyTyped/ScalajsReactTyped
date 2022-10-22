package typingsJapgolly.yandexMaps.global.ymaps

import typingsJapgolly.yandexMaps.mod.ICircleGeometry
import typingsJapgolly.yandexMaps.mod.ILineStringGeometry
import typingsJapgolly.yandexMaps.mod.IPolygonGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryEditor {
  
  @JSGlobal("ymaps.geometryEditor.Circle")
  @js.native
  open class Circle protected ()
    extends typingsJapgolly.yandexMaps.mod.geometryEditor.Circle {
    def this(geometry: ICircleGeometry) = this()
    def this(geometry: ICircleGeometry, options: js.Object) = this()
  }
  
  @JSGlobal("ymaps.geometryEditor.LineString")
  @js.native
  open class LineString protected ()
    extends typingsJapgolly.yandexMaps.mod.geometryEditor.LineString {
    def this(geometry: ILineStringGeometry) = this()
    def this(geometry: ILineStringGeometry, options: js.Object) = this()
  }
  
  @JSGlobal("ymaps.geometryEditor.Point")
  @js.native
  open class Point ()
    extends typingsJapgolly.yandexMaps.mod.geometryEditor.Point
  
  @JSGlobal("ymaps.geometryEditor.Polygon")
  @js.native
  open class Polygon protected ()
    extends typingsJapgolly.yandexMaps.mod.geometryEditor.Polygon {
    def this(geometry: IPolygonGeometry, options: js.Object) = this()
  }
  
  object model {
    
    @JSGlobal("ymaps.geometryEditor.model.ChildLineString")
    @js.native
    open class ChildLineString ()
      extends typingsJapgolly.yandexMaps.mod.geometryEditor.model.ChildLineString
    
    @JSGlobal("ymaps.geometryEditor.model.ChildLinearRing")
    @js.native
    open class ChildLinearRing ()
      extends typingsJapgolly.yandexMaps.mod.geometryEditor.model.ChildLinearRing
    
    @JSGlobal("ymaps.geometryEditor.model.ChildVertex")
    @js.native
    open class ChildVertex ()
      extends typingsJapgolly.yandexMaps.mod.geometryEditor.model.ChildVertex
    
    @JSGlobal("ymaps.geometryEditor.model.Edge")
    @js.native
    open class Edge ()
      extends typingsJapgolly.yandexMaps.mod.geometryEditor.model.Edge
    
    @JSGlobal("ymaps.geometryEditor.model.EdgeGeometry")
    @js.native
    open class EdgeGeometry ()
      extends typingsJapgolly.yandexMaps.mod.geometryEditor.model.EdgeGeometry
    
    @JSGlobal("ymaps.geometryEditor.model.RootLineString")
    @js.native
    open class RootLineString ()
      extends typingsJapgolly.yandexMaps.mod.geometryEditor.model.RootLineString
    
    @JSGlobal("ymaps.geometryEditor.model.RootPolygon")
    @js.native
    open class RootPolygon ()
      extends typingsJapgolly.yandexMaps.mod.geometryEditor.model.RootPolygon
  }
  
  object view {
    
    @JSGlobal("ymaps.geometryEditor.view.Edge")
    @js.native
    open class Edge ()
      extends typingsJapgolly.yandexMaps.mod.geometryEditor.view.Edge
    
    @JSGlobal("ymaps.geometryEditor.view.MultiPath")
    @js.native
    open class MultiPath ()
      extends typingsJapgolly.yandexMaps.mod.geometryEditor.view.MultiPath
    
    @JSGlobal("ymaps.geometryEditor.view.Path")
    @js.native
    open class Path ()
      extends typingsJapgolly.yandexMaps.mod.geometryEditor.view.Path
    
    @JSGlobal("ymaps.geometryEditor.view.Vertex")
    @js.native
    open class Vertex ()
      extends typingsJapgolly.yandexMaps.mod.geometryEditor.view.Vertex
  }
}
