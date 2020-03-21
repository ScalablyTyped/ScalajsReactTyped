package typingsJapgolly.dojo.dojox.gfx3d

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dojox.gfx3d.lighting.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.html
  *
  *
  */
trait base_ extends js.Object {
  /**
    *
    */
  var defaultCube: js.Object
  /**
    *
    */
  var defaultCylinder: js.Object
  /**
    *
    */
  var defaultEdges: js.Object
  /**
    *
    */
  var defaultOrbit: js.Object
  /**
    *
    */
  var defaultPath3d: js.Object
  /**
    *
    */
  var defaultPolygon: js.Object
  /**
    *
    */
  var defaultQuads: js.Object
  /**
    *
    */
  var defaultTriangles: js.Object
  /**
    *
    */
  var drawer: js.Object
  /**
    *
    */
  var lighting: js.Object
  /**
    *
    */
  var matrix: js.Object
  /**
    *
    */
  var scheduler: js.Object
  /**
    *
    */
  var vector: js.Object
  /**
    *
    */
  def Cube(): Unit
  /**
    *
    */
  def Cylinder(): Unit
  /**
    *
    */
  def Edges(): Unit
  /**
    * a 3D matrix object
    * Normalizes a 3D matrix-like object. If arrays is passed,
    * all objects of the array are normalized and multiplied sequentially.
    *
    * @param arg a 3D matrix-like object, a number, or an array of such objects
    */
  def Matrix3D(arg: js.Object): Unit
  /**
    *
    */
  def Object(): Unit
  /**
    *
    */
  def Orbit(): Unit
  /**
    *
    */
  def Path3d(): Unit
  /**
    *
    */
  def Polygon(): Unit
  /**
    *
    */
  def Quads(): Unit
  /**
    *
    */
  def Scene(): Unit
  /**
    *
    */
  def Triangles(): Unit
  /**
    *
    */
  def Viewport(): Unit
  /**
    * calculate a cylindrical gradient
    *
    * @param model color model
    * @param material defines visual properties
    * @param center center of the cylinder's bottom
    * @param radius radius of the cylinder
    * @param from from position in radians
    * @param to from position in radians
    * @param matrix the cumulative transformation matrix
    */
  def gradient(
    model: Model,
    material: js.Object,
    center: js.Object,
    radius: Double,
    from: Double,
    to: Double,
    matrix: js.Object
  ): js.Object
}

object base_ {
  @scala.inline
  def apply(
    Cube: Callback,
    Cylinder: Callback,
    Edges: Callback,
    Matrix3D: js.Object => Callback,
    Object: Callback,
    Orbit: Callback,
    Path3d: Callback,
    Polygon: Callback,
    Quads: Callback,
    Scene: Callback,
    Triangles: Callback,
    Viewport: Callback,
    defaultCube: js.Object,
    defaultCylinder: js.Object,
    defaultEdges: js.Object,
    defaultOrbit: js.Object,
    defaultPath3d: js.Object,
    defaultPolygon: js.Object,
    defaultQuads: js.Object,
    defaultTriangles: js.Object,
    drawer: js.Object,
    gradient: (Model, js.Object, js.Object, Double, Double, Double, js.Object) => CallbackTo[js.Object],
    lighting: js.Object,
    matrix: js.Object,
    scheduler: js.Object,
    vector: js.Object
  ): base_ = {
    val __obj = js.Dynamic.literal(defaultCube = defaultCube.asInstanceOf[js.Any], defaultCylinder = defaultCylinder.asInstanceOf[js.Any], defaultEdges = defaultEdges.asInstanceOf[js.Any], defaultOrbit = defaultOrbit.asInstanceOf[js.Any], defaultPath3d = defaultPath3d.asInstanceOf[js.Any], defaultPolygon = defaultPolygon.asInstanceOf[js.Any], defaultQuads = defaultQuads.asInstanceOf[js.Any], defaultTriangles = defaultTriangles.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], lighting = lighting.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any], vector = vector.asInstanceOf[js.Any])
    __obj.updateDynamic("Cube")(Cube.toJsFn)
    __obj.updateDynamic("Cylinder")(Cylinder.toJsFn)
    __obj.updateDynamic("Edges")(Edges.toJsFn)
    __obj.updateDynamic("Matrix3D")(js.Any.fromFunction1((t0: js.Object) => Matrix3D(t0).runNow()))
    __obj.updateDynamic("Object")(Object.toJsFn)
    __obj.updateDynamic("Orbit")(Orbit.toJsFn)
    __obj.updateDynamic("Path3d")(Path3d.toJsFn)
    __obj.updateDynamic("Polygon")(Polygon.toJsFn)
    __obj.updateDynamic("Quads")(Quads.toJsFn)
    __obj.updateDynamic("Scene")(Scene.toJsFn)
    __obj.updateDynamic("Triangles")(Triangles.toJsFn)
    __obj.updateDynamic("Viewport")(Viewport.toJsFn)
    __obj.updateDynamic("gradient")(js.Any.fromFunction7((t0: typingsJapgolly.dojo.dojox.gfx3d.lighting.Model, t1: js.Object, t2: js.Object, t3: scala.Double, t4: scala.Double, t5: scala.Double, t6: js.Object) => gradient(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.asInstanceOf[base_]
  }
}

