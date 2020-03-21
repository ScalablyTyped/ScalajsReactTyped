package typingsJapgolly.senchaTouch.Ext.draw

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrix extends IBase {
  /** [Property] (Number) */
  var a: js.UndefOr[Double] = js.undefined
  /** [Method] Postpend a matrix onto the current
  		* @param xx Number Coefficient from x to x.
  		* @param xy Number Coefficient from x to y.
  		* @param yx Number Coefficient from y to x.
  		* @param yy Number Coefficient from y to y.
  		* @param dx Number Offset of x.
  		* @param dy Number Offset of y.
  		* @returns Ext.draw.Matrix this
  		*/
  var append: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Postpend a matrix onto the current
  		* @param matrix Ext.draw.Matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var appendMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Clone this matrix
  		* @returns Ext.draw.Matrix
  		*/
  @JSName("clone")
  var clone_FIMatrix: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Determines if this matrix has the same values as another matrix
  		* @param matrix Ext.draw.Matrix
  		* @returns Boolean
  		*/
  @JSName("equals")
  var equals_FIMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], Boolean]] = js.undefined
  /** [Method] Horizontally flip the matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var flipX: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Vertically flip the matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var flipY: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Get offset x component of the matrix
  		* @returns Number
  		*/
  var getDX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get offset y component of the matrix
  		* @returns Number
  		*/
  var getDY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get the x scale of the matrix
  		* @returns Number
  		*/
  var getScaleX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get the y scale of the matrix
  		* @returns Number
  		*/
  var getScaleY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get x to x component of the matrix
  		* @returns Number
  		*/
  var getXX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get x to y component of the matrix
  		* @returns Number
  		*/
  var getXY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get y to x component of the matrix
  		* @returns Number
  		*/
  var getYX: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get y to y component of the matrix
  		* @returns Number
  		*/
  var getYY: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Return a new matrix represents the opposite transformation of the current one
  		* @param target Ext.draw.Matrix A target matrix. If present, it will receive the result of inversion to avoid creating a new object.
  		* @returns Ext.draw.Matrix
  		*/
  var inverse: js.UndefOr[js.Function1[/* target */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Determines whether this matrix is an identity matrix no transform
  		* @returns Boolean
  		*/
  var isIdentity: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Postpend a matrix onto the current
  		* @param matrix Ext.draw.Matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var multiply: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Prepend a matrix onto the current
  		* @param xx Number Coefficient from x to x.
  		* @param xy Number Coefficient from x to y.
  		* @param yx Number Coefficient from y to x.
  		* @param yy Number Coefficient from y to y.
  		* @param dx Number Offset of x.
  		* @param dy Number Offset of y.
  		* @returns Ext.draw.Matrix this
  		*/
  var prepend: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Prepend a matrix onto the current
  		* @param matrix Ext.draw.Matrix
  		* @returns Ext.draw.Matrix this
  		*/
  var prependMatrix: js.UndefOr[js.Function1[/* matrix */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Reset the matrix to identical
  		* @returns Ext.draw.Matrix this
  		*/
  var reset: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Rotate the matrix
  		* @param angle Number Radians to rotate
  		* @param rcx Number|null Center of rotation.
  		* @param rcy Number|null Center of rotation.
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var rotate: js.UndefOr[
    js.Function4[
      /* angle */ js.UndefOr[Double], 
      /* rcx */ js.UndefOr[js.Any], 
      /* rcy */ js.UndefOr[js.Any], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Rotate the matrix by the angle of a vector
  		* @param x Number
  		* @param y Number
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var rotateFromVector: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Scale the matrix
  		* @param sx Number
  		* @param sy Number
  		* @param scx Number
  		* @param scy Number
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var scale: js.UndefOr[
    js.Function5[
      /* sx */ js.UndefOr[Double], 
      /* sy */ js.UndefOr[Double], 
      /* scx */ js.UndefOr[Double], 
      /* scy */ js.UndefOr[Double], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Set the elements of a Matrix
  		* @param xx Number
  		* @param xy Number
  		* @param yx Number
  		* @param yy Number
  		* @param dx Number
  		* @param dy Number
  		* @returns Ext.draw.Matrix this
  		*/
  var set: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Skew the matrix
  		* @param angle Number
  		* @returns Ext.draw.Matrix this
  		*/
  var skewX: js.UndefOr[js.Function1[/* angle */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Skew the matrix
  		* @param angle Number
  		* @returns Ext.draw.Matrix this
  		*/
  var skewY: js.UndefOr[js.Function1[/* angle */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Split matrix into Translate Scale Shear and Rotate
  		* @returns Object
  		*/
  var split: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Create an array of elements by horizontal order xx yx dx yx yy dy
  		* @returns Array
  		*/
  var toArray: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Apply the matrix to a drawing context
  		* @param ctx Object
  		* @returns Ext.draw.Matrix this
  		*/
  var toContext: js.UndefOr[js.Function1[/* ctx */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Get an array of elements
  		* @returns Array
  		*/
  @JSName("toString")
  var toString_FIMatrix: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Return a string that can be used as transform attribute in SVG
  		* @returns String
  		*/
  var toSvg: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Create an array of elements by vertical order xx xy yx yy dx dy
  		* @returns Array|String
  		*/
  var toVerticalArray: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method]
  		* @param bbox Object Given as {x: Number, y: Number, width: Number, height: Number}.
  		* @param radius Number
  		* @param target Object Optional target object to recieve the result. Recommended to use it for better gc.
  		* @returns Object Object with x, y, width and height.
  		*/
  var transformBBox: js.UndefOr[
    js.Function3[
      /* bbox */ js.UndefOr[js.Any], 
      /* radius */ js.UndefOr[Double], 
      /* target */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Transform a list for points
  		* @param list Array
  		* @returns Array list
  		*/
  var transformList: js.UndefOr[js.Function1[/* list */ js.UndefOr[Array], Array]] = js.undefined
  /** [Method] Transform a point to a new array
  		* @param point Array
  		* @returns Array
  		*/
  var transformPoint: js.UndefOr[js.Function1[/* point */ js.UndefOr[Array], Array]] = js.undefined
  /** [Method] Translate the matrix
  		* @param x Number
  		* @param y Number
  		* @param prepend Boolean If true, this will transformation be prepended to the matrix.
  		* @returns Ext.draw.Matrix this
  		*/
  var translate: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* prepend */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Transform point returning the x component of the result
  		* @param x Number
  		* @param y Number
  		* @returns Number x component of the result.
  		*/
  var x: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Transform point returning the y component of the result
  		* @param x Number
  		* @param y Number
  		* @returns Number y component of the result.
  		*/
  var y: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Double]] = js.undefined
}

object IMatrix {
  @scala.inline
  def apply(
    a: Int | Double = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    append: (/* xx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => CallbackTo[IMatrix] = null,
    appendMatrix: /* matrix */ js.UndefOr[IMatrix] => CallbackTo[IMatrix] = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clone: js.UndefOr[CallbackTo[IMatrix]] = js.undefined,
    config: js.Any = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    equals: /* matrix */ js.UndefOr[IMatrix] => CallbackTo[Boolean] = null,
    extend: String = null,
    flipX: js.UndefOr[CallbackTo[IMatrix]] = js.undefined,
    flipY: js.UndefOr[CallbackTo[IMatrix]] = js.undefined,
    getDX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getDY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    getScaleX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getScaleY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getXX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getXY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getYX: js.UndefOr[CallbackTo[Double]] = js.undefined,
    getYY: js.UndefOr[CallbackTo[Double]] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    inverse: /* target */ js.UndefOr[IMatrix] => CallbackTo[IMatrix] = null,
    isIdentity: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    mixins: js.Any = null,
    multiply: /* matrix */ js.UndefOr[IMatrix] => CallbackTo[IMatrix] = null,
    platformConfig: js.Any = null,
    prepend: (/* xx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => CallbackTo[IMatrix] = null,
    prependMatrix: /* matrix */ js.UndefOr[IMatrix] => CallbackTo[IMatrix] = null,
    reset: js.UndefOr[CallbackTo[IMatrix]] = js.undefined,
    rotate: (/* angle */ js.UndefOr[Double], /* rcx */ js.UndefOr[js.Any], /* rcy */ js.UndefOr[js.Any], /* prepend */ js.UndefOr[Boolean]) => CallbackTo[IMatrix] = null,
    rotateFromVector: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* prepend */ js.UndefOr[Boolean]) => CallbackTo[IMatrix] = null,
    scale: (/* sx */ js.UndefOr[Double], /* sy */ js.UndefOr[Double], /* scx */ js.UndefOr[Double], /* scy */ js.UndefOr[Double], /* prepend */ js.UndefOr[Boolean]) => CallbackTo[IMatrix] = null,
    self: IClass = null,
    set: (/* xx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => CallbackTo[IMatrix] = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    skewX: /* angle */ js.UndefOr[Double] => CallbackTo[IMatrix] = null,
    skewY: /* angle */ js.UndefOr[Double] => CallbackTo[IMatrix] = null,
    split: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    statics: js.Any = null,
    toArray: js.UndefOr[CallbackTo[Array]] = js.undefined,
    toContext: /* ctx */ js.UndefOr[js.Any] => CallbackTo[IMatrix] = null,
    toString: js.UndefOr[CallbackTo[Array]] = js.undefined,
    toSvg: js.UndefOr[CallbackTo[String]] = js.undefined,
    toVerticalArray: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    transformBBox: (/* bbox */ js.UndefOr[js.Any], /* radius */ js.UndefOr[Double], /* target */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    transformList: /* list */ js.UndefOr[Array] => CallbackTo[Array] = null,
    transformPoint: /* point */ js.UndefOr[Array] => CallbackTo[Array] = null,
    translate: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* prepend */ js.UndefOr[Boolean]) => CallbackTo[IMatrix] = null,
    uses: Array = null,
    x: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => CallbackTo[Double] = null,
    y: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => CallbackTo[Double] = null
  ): IMatrix = {
    val __obj = js.Dynamic.literal()
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction6((t0: /* xx */ js.UndefOr[scala.Double], t1: /* xy */ js.UndefOr[scala.Double], t2: /* yx */ js.UndefOr[scala.Double], t3: /* yy */ js.UndefOr[scala.Double], t4: /* dx */ js.UndefOr[scala.Double], t5: /* dy */ js.UndefOr[scala.Double]) => append(t0, t1, t2, t3, t4, t5).runNow()))
    if (appendMatrix != null) __obj.updateDynamic("appendMatrix")(js.Any.fromFunction1((t0: /* matrix */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.IMatrix]) => appendMatrix(t0).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clone.foreach(p => __obj.updateDynamic("clone")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: /* matrix */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.IMatrix]) => equals(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    flipX.foreach(p => __obj.updateDynamic("flipX")(p.toJsFn))
    flipY.foreach(p => __obj.updateDynamic("flipY")(p.toJsFn))
    getDX.foreach(p => __obj.updateDynamic("getDX")(p.toJsFn))
    getDY.foreach(p => __obj.updateDynamic("getDY")(p.toJsFn))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    getScaleX.foreach(p => __obj.updateDynamic("getScaleX")(p.toJsFn))
    getScaleY.foreach(p => __obj.updateDynamic("getScaleY")(p.toJsFn))
    getXX.foreach(p => __obj.updateDynamic("getXX")(p.toJsFn))
    getXY.foreach(p => __obj.updateDynamic("getXY")(p.toJsFn))
    getYX.foreach(p => __obj.updateDynamic("getYX")(p.toJsFn))
    getYY.foreach(p => __obj.updateDynamic("getYY")(p.toJsFn))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (inverse != null) __obj.updateDynamic("inverse")(js.Any.fromFunction1((t0: /* target */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.IMatrix]) => inverse(t0).runNow()))
    isIdentity.foreach(p => __obj.updateDynamic("isIdentity")(p.toJsFn))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (multiply != null) __obj.updateDynamic("multiply")(js.Any.fromFunction1((t0: /* matrix */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.IMatrix]) => multiply(t0).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (prepend != null) __obj.updateDynamic("prepend")(js.Any.fromFunction6((t0: /* xx */ js.UndefOr[scala.Double], t1: /* xy */ js.UndefOr[scala.Double], t2: /* yx */ js.UndefOr[scala.Double], t3: /* yy */ js.UndefOr[scala.Double], t4: /* dx */ js.UndefOr[scala.Double], t5: /* dy */ js.UndefOr[scala.Double]) => prepend(t0, t1, t2, t3, t4, t5).runNow()))
    if (prependMatrix != null) __obj.updateDynamic("prependMatrix")(js.Any.fromFunction1((t0: /* matrix */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.draw.IMatrix]) => prependMatrix(t0).runNow()))
    reset.foreach(p => __obj.updateDynamic("reset")(p.toJsFn))
    if (rotate != null) __obj.updateDynamic("rotate")(js.Any.fromFunction4((t0: /* angle */ js.UndefOr[scala.Double], t1: /* rcx */ js.UndefOr[js.Any], t2: /* rcy */ js.UndefOr[js.Any], t3: /* prepend */ js.UndefOr[scala.Boolean]) => rotate(t0, t1, t2, t3).runNow()))
    if (rotateFromVector != null) __obj.updateDynamic("rotateFromVector")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* prepend */ js.UndefOr[scala.Boolean]) => rotateFromVector(t0, t1, t2).runNow()))
    if (scale != null) __obj.updateDynamic("scale")(js.Any.fromFunction5((t0: /* sx */ js.UndefOr[scala.Double], t1: /* sy */ js.UndefOr[scala.Double], t2: /* scx */ js.UndefOr[scala.Double], t3: /* scy */ js.UndefOr[scala.Double], t4: /* prepend */ js.UndefOr[scala.Boolean]) => scale(t0, t1, t2, t3, t4).runNow()))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction6((t0: /* xx */ js.UndefOr[scala.Double], t1: /* xy */ js.UndefOr[scala.Double], t2: /* yx */ js.UndefOr[scala.Double], t3: /* yy */ js.UndefOr[scala.Double], t4: /* dx */ js.UndefOr[scala.Double], t5: /* dy */ js.UndefOr[scala.Double]) => set(t0, t1, t2, t3, t4, t5).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(js.Any.fromFunction1((t0: /* angle */ js.UndefOr[scala.Double]) => skewX(t0).runNow()))
    if (skewY != null) __obj.updateDynamic("skewY")(js.Any.fromFunction1((t0: /* angle */ js.UndefOr[scala.Double]) => skewY(t0).runNow()))
    split.foreach(p => __obj.updateDynamic("split")(p.toJsFn))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    toArray.foreach(p => __obj.updateDynamic("toArray")(p.toJsFn))
    if (toContext != null) __obj.updateDynamic("toContext")(js.Any.fromFunction1((t0: /* ctx */ js.UndefOr[js.Any]) => toContext(t0).runNow()))
    toString.foreach(p => __obj.updateDynamic("toString")(p.toJsFn))
    toSvg.foreach(p => __obj.updateDynamic("toSvg")(p.toJsFn))
    toVerticalArray.foreach(p => __obj.updateDynamic("toVerticalArray")(p.toJsFn))
    if (transformBBox != null) __obj.updateDynamic("transformBBox")(js.Any.fromFunction3((t0: /* bbox */ js.UndefOr[js.Any], t1: /* radius */ js.UndefOr[scala.Double], t2: /* target */ js.UndefOr[js.Any]) => transformBBox(t0, t1, t2).runNow()))
    if (transformList != null) __obj.updateDynamic("transformList")(js.Any.fromFunction1((t0: /* list */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => transformList(t0).runNow()))
    if (transformPoint != null) __obj.updateDynamic("transformPoint")(js.Any.fromFunction1((t0: /* point */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => transformPoint(t0).runNow()))
    if (translate != null) __obj.updateDynamic("translate")(js.Any.fromFunction3((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* prepend */ js.UndefOr[scala.Boolean]) => translate(t0, t1, t2).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double]) => x(t0, t1).runNow()))
    if (y != null) __obj.updateDynamic("y")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double]) => y(t0, t1).runNow()))
    __obj.asInstanceOf[IMatrix]
  }
}

