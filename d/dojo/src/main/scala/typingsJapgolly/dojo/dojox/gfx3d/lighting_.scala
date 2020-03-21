package typingsJapgolly.dojo.dojox.gfx3d

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/lighting.html
  *
  *
  */
trait lighting_ extends js.Object {
  /**
    *
    */
  var finish: js.Object
  /**
    *
    */
  def Model(): Unit
  /**
    *
    * @param a
    * @param b
    */
  def add(a: js.Any, b: js.Any): js.Object
  /**
    *
    * @param a
    * @param b
    */
  def addColor(a: js.Any, b: js.Any): js.Object
  /**
    *
    */
  def black(): js.Object
  /**
    *
    * @param c1
    * @param c2
    */
  def diff2Color(c1: js.Any, c2: js.Any): Double
  /**
    *
    * @param normal
    * @param lights
    */
  def diffuse(normal: js.Any, lights: js.Any): js.Any
  /**
    *
    * @param a
    * @param b
    */
  def dot(a: js.Any, b: js.Any): Double
  /**
    *
    * @param n
    * @param i
    */
  def faceforward(n: js.Any, i: js.Any): js.Any
  /**
    *
    * @param c
    */
  def fromStdColor(c: js.Any): js.Any
  /**
    *
    * @param v
    */
  def length(v: js.Any): js.Any
  /**
    *
    * @param c
    */
  def length2Color(c: js.Any): Double
  /**
    *
    * @param c1
    * @param c2
    * @param s
    */
  def mixColor(c1: js.Any, c2: js.Any, s: js.Any): js.Any
  /**
    *
    * @param a
    * @param b
    */
  def multiplyColor(a: js.Any, b: js.Any): js.Object
  /**
    *
    * @param v
    */
  def normalize(v: js.Any): js.Any
  /**
    *
    * @param normal
    * @param v
    * @param size
    * @param lights
    */
  def phong(normal: js.Any, v: js.Any, size: js.Any, lights: js.Any): js.Any
  /**
    *
    * @param i
    * @param n
    */
  def reflect(i: js.Any, n: js.Any): js.Any
  /**
    *
    * @param v
    */
  def saturate(v: js.Any): js.Any
  /**
    *
    * @param c
    */
  def saturateColor(c: js.Any): js.Object
  /**
    *
    * @param s
    * @param v
    */
  def scale(s: js.Any, v: js.Any): js.Object
  /**
    *
    * @param s
    * @param c
    */
  def scaleColor(s: js.Any, c: js.Any): js.Object
  /**
    *
    * @param normal
    * @param v
    * @param roughness
    * @param lights
    */
  def specular(normal: js.Any, v: js.Any, roughness: js.Any, lights: js.Any): js.Any
  /**
    *
    * @param c
    */
  def toStdColor(c: js.Any): js.Object
  /**
    *
    */
  def white(): js.Object
}

object lighting_ {
  @scala.inline
  def apply(
    Model: Callback,
    add: (js.Any, js.Any) => CallbackTo[js.Object],
    addColor: (js.Any, js.Any) => CallbackTo[js.Object],
    black: CallbackTo[js.Object],
    diff2Color: (js.Any, js.Any) => CallbackTo[Double],
    diffuse: (js.Any, js.Any) => CallbackTo[js.Any],
    dot: (js.Any, js.Any) => CallbackTo[Double],
    faceforward: (js.Any, js.Any) => CallbackTo[js.Any],
    finish: js.Object,
    fromStdColor: js.Any => CallbackTo[js.Any],
    length: js.Any => CallbackTo[js.Any],
    length2Color: js.Any => CallbackTo[Double],
    mixColor: (js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    multiplyColor: (js.Any, js.Any) => CallbackTo[js.Object],
    normalize: js.Any => CallbackTo[js.Any],
    phong: (js.Any, js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    reflect: (js.Any, js.Any) => CallbackTo[js.Any],
    saturate: js.Any => CallbackTo[js.Any],
    saturateColor: js.Any => CallbackTo[js.Object],
    scale: (js.Any, js.Any) => CallbackTo[js.Object],
    scaleColor: (js.Any, js.Any) => CallbackTo[js.Object],
    specular: (js.Any, js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    toStdColor: js.Any => CallbackTo[js.Object],
    white: CallbackTo[js.Object]
  ): lighting_ = {
    val __obj = js.Dynamic.literal(finish = finish.asInstanceOf[js.Any])
    __obj.updateDynamic("Model")(Model.toJsFn)
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => add(t0, t1).runNow()))
    __obj.updateDynamic("addColor")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => addColor(t0, t1).runNow()))
    __obj.updateDynamic("black")(black.toJsFn)
    __obj.updateDynamic("diff2Color")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => diff2Color(t0, t1).runNow()))
    __obj.updateDynamic("diffuse")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => diffuse(t0, t1).runNow()))
    __obj.updateDynamic("dot")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => dot(t0, t1).runNow()))
    __obj.updateDynamic("faceforward")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => faceforward(t0, t1).runNow()))
    __obj.updateDynamic("fromStdColor")(js.Any.fromFunction1((t0: js.Any) => fromStdColor(t0).runNow()))
    __obj.updateDynamic("length")(js.Any.fromFunction1((t0: js.Any) => length(t0).runNow()))
    __obj.updateDynamic("length2Color")(js.Any.fromFunction1((t0: js.Any) => length2Color(t0).runNow()))
    __obj.updateDynamic("mixColor")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => mixColor(t0, t1, t2).runNow()))
    __obj.updateDynamic("multiplyColor")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => multiplyColor(t0, t1).runNow()))
    __obj.updateDynamic("normalize")(js.Any.fromFunction1((t0: js.Any) => normalize(t0).runNow()))
    __obj.updateDynamic("phong")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => phong(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("reflect")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => reflect(t0, t1).runNow()))
    __obj.updateDynamic("saturate")(js.Any.fromFunction1((t0: js.Any) => saturate(t0).runNow()))
    __obj.updateDynamic("saturateColor")(js.Any.fromFunction1((t0: js.Any) => saturateColor(t0).runNow()))
    __obj.updateDynamic("scale")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => scale(t0, t1).runNow()))
    __obj.updateDynamic("scaleColor")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => scaleColor(t0, t1).runNow()))
    __obj.updateDynamic("specular")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => specular(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("toStdColor")(js.Any.fromFunction1((t0: js.Any) => toStdColor(t0).runNow()))
    __obj.updateDynamic("white")(white.toJsFn)
    __obj.asInstanceOf[lighting_]
  }
}

