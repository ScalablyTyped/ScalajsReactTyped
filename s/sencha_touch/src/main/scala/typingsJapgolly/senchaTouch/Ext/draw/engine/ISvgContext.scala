package typingsJapgolly.senchaTouch.Ext.draw.engine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.IClass
import typingsJapgolly.senchaTouch.Ext.draw.engine.svgcontext.IGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISvgContext extends IBase {
  /** [Method] Adds points to the subpath such that the arc described by the circumference of the circle described by the arguments
  		* @param x Number
  		* @param y Number
  		* @param radius Number
  		* @param startAngle Number
  		* @param endAngle Number
  		* @param anticlockwise Number
  		*/
  var arc: js.UndefOr[
    js.Function6[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* radius */ js.UndefOr[Double], 
      /* startAngle */ js.UndefOr[Double], 
      /* endAngle */ js.UndefOr[Double], 
      /* anticlockwise */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Arc command using svg parameters
  		* @param r1 Number
  		* @param r2 Number
  		* @param rotation Number
  		* @param large Number
  		* @param swipe Number
  		* @param x2 Number
  		* @param y2 Number
  		*/
  var arcSvg: js.UndefOr[
    js.Function7[
      /* r1 */ js.UndefOr[Double], 
      /* r2 */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* large */ js.UndefOr[Double], 
      /* swipe */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Adds an arc with the given control points and radius to the current subpath connected to the previous point by a str
  		* @param x1 Number
  		* @param y1 Number
  		* @param x2 Number
  		* @param y2 Number
  		* @param radiusX Number
  		* @param radiusY Number
  		* @param rotation Number
  		*/
  var arcTo: js.UndefOr[
    js.Function7[
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      /* radiusX */ js.UndefOr[Double], 
      /* radiusY */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Resets the current default path  */
  var beginPath: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Adds the given point to the current subpath connected to the previous one by a cubic B zier curve with the given con
  		* @param x1 Number
  		* @param y1 Number
  		* @param x2 Number
  		* @param y2 Number
  		* @param x3 Number
  		* @param y3 Number
  		*/
  var bezierCurveTo: js.UndefOr[
    js.Function6[
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* x2 */ js.UndefOr[Double], 
      /* y2 */ js.UndefOr[Double], 
      /* x3 */ js.UndefOr[Double], 
      /* y3 */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Clears the context  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Marks the current subpath as closed and starts a new subpath with a point the same as the start and end of the newly  */
  var closePath: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns an object that represents a linear gradient that paints along the line given by the coordinates represented b
  		* @param x0 Number
  		* @param y0 Number
  		* @param x1 Number
  		* @param y1 Number
  		* @returns Ext.draw.engine.SvgContext.Gradient
  		*/
  var createLinearGradient: js.UndefOr[
    js.Function4[
      /* x0 */ js.UndefOr[Double], 
      /* y0 */ js.UndefOr[Double], 
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      IGradient
    ]
  ] = js.undefined
  /** [Method] Returns a CanvasGradient object that represents a radial gradient that paints along the cone given by the circles rep
  		* @param x0 Number
  		* @param y0 Number
  		* @param r0 Number
  		* @param x1 Number
  		* @param y1 Number
  		* @param r1 Number
  		* @returns Ext.draw.engine.SvgContext.Gradient
  		*/
  var createRadialGradient: js.UndefOr[
    js.Function6[
      /* x0 */ js.UndefOr[Double], 
      /* y0 */ js.UndefOr[Double], 
      /* r0 */ js.UndefOr[Double], 
      /* x1 */ js.UndefOr[Double], 
      /* y1 */ js.UndefOr[Double], 
      /* r1 */ js.UndefOr[Double], 
      IGradient
    ]
  ] = js.undefined
  /** [Method] Draws the given image onto the canvas
  		* @param image HTMLElement
  		* @param sx Number
  		* @param sy Number
  		* @param sw Number
  		* @param sh Number
  		* @param dx Number
  		* @param dy Number
  		* @param dw Number
  		* @param dh Number
  		*/
  var drawImage: js.UndefOr[
    js.Function9[
      /* image */ js.UndefOr[HTMLElement], 
      /* sx */ js.UndefOr[Double], 
      /* sy */ js.UndefOr[Double], 
      /* sw */ js.UndefOr[Double], 
      /* sh */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      /* dw */ js.UndefOr[Double], 
      /* dh */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Adds points to the subpath such that the arc described by the circumference of the ellipse described by the arguments
  		* @param x Number
  		* @param y Number
  		* @param radiusX Number
  		* @param radiusY Number
  		* @param rotation Number
  		* @param startAngle Number
  		* @param endAngle Number
  		* @param anticlockwise Number
  		*/
  var ellipse: js.UndefOr[
    js.Function8[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* radiusX */ js.UndefOr[Double], 
      /* radiusY */ js.UndefOr[Double], 
      /* rotation */ js.UndefOr[Double], 
      /* startAngle */ js.UndefOr[Double], 
      /* endAngle */ js.UndefOr[Double], 
      /* anticlockwise */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Fills the subpaths of the current default path or the given path with the current fill style  */
  var fill: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Paints the given rectangle onto the canvas using the current fill style
  		* @param x Number
  		* @param y Number
  		* @param width Number
  		* @param height Number
  		*/
  var fillRect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Note After the method guarantees the transform matrix will be inverted
  		* @param attr Object The attribute object
  		* @param transformFillStroke Boolean Indicate whether to transform fill and stroke. If this is not given, then uses attr.transformFillStroke instead.
  		*/
  var fillStroke: js.UndefOr[
    js.Function2[/* attr */ js.UndefOr[js.Any], /* transformFillStroke */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Method] Fills the given text at the given position
  		* @param text String
  		* @param x Number
  		* @param y Number
  		*/
  var fillText: js.UndefOr[
    js.Function3[
      /* text */ js.UndefOr[String], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Adds the given point to the current subpath connected to the previous one by a straight line
  		* @param x Number
  		* @param y Number
  		*/
  var lineTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Creates a new subpath with the given point
  		* @param x Number
  		* @param y Number
  		*/
  var moveTo: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Adds a new closed subpath to the path representing the given rectangle
  		* @param x Number
  		* @param y Number
  		* @param width Number
  		* @param height Number
  		*/
  var rect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Pops the state stack and restores the state  */
  var restore: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Pushes the context state to the state stack  */
  var save: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Changes the transformation matrix to the matrix given by the arguments as described below
  		* @param xx Number
  		* @param yx Number
  		* @param xy Number
  		* @param yy Number
  		* @param dx Number
  		* @param dy Number
  		*/
  var setTransform: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Strokes the subpaths of the current default path or the given path with the current stroke style  */
  var stroke: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Paints the box that outlines the given rectangle onto the canvas using the current stroke style
  		* @param x Number
  		* @param y Number
  		* @param width Number
  		* @param height Number
  		*/
  var strokeRect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* width */ js.UndefOr[Double], 
      /* height */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Strokes the given text at the given position
  		* @param text String
  		* @param x Number
  		* @param y Number
  		*/
  var strokeText: js.UndefOr[
    js.Function3[
      /* text */ js.UndefOr[String], 
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Changes the transformation matrix to apply the matrix given by the arguments as described below
  		* @param xx Number
  		* @param yx Number
  		* @param xy Number
  		* @param yy Number
  		* @param dx Number
  		* @param dy Number
  		*/
  var transform: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[Double], 
      /* yx */ js.UndefOr[Double], 
      /* xy */ js.UndefOr[Double], 
      /* yy */ js.UndefOr[Double], 
      /* dx */ js.UndefOr[Double], 
      /* dy */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
}

object ISvgContext {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    arc: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radius */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Callback = null,
    arcSvg: (/* r1 */ js.UndefOr[Double], /* r2 */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* large */ js.UndefOr[Double], /* swipe */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double]) => Callback = null,
    arcTo: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double]) => Callback = null,
    beginPath: js.UndefOr[Callback] = js.undefined,
    bezierCurveTo: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* x3 */ js.UndefOr[Double], /* y3 */ js.UndefOr[Double]) => Callback = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callParent: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    callSuper: /* args */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    clear: js.UndefOr[Callback] = js.undefined,
    closePath: js.UndefOr[Callback] = js.undefined,
    config: js.Any = null,
    createLinearGradient: (/* x0 */ js.UndefOr[Double], /* y0 */ js.UndefOr[Double], /* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double]) => CallbackTo[IGradient] = null,
    createRadialGradient: (/* x0 */ js.UndefOr[Double], /* y0 */ js.UndefOr[Double], /* r0 */ js.UndefOr[Double], /* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* r1 */ js.UndefOr[Double]) => CallbackTo[IGradient] = null,
    destroy: js.UndefOr[Callback] = js.undefined,
    drawImage: (/* image */ js.UndefOr[HTMLElement], /* sx */ js.UndefOr[Double], /* sy */ js.UndefOr[Double], /* sw */ js.UndefOr[Double], /* sh */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double], /* dw */ js.UndefOr[Double], /* dh */ js.UndefOr[Double]) => Callback = null,
    ellipse: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Callback = null,
    extend: String = null,
    fill: js.UndefOr[Callback] = js.undefined,
    fillRect: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback = null,
    fillStroke: (/* attr */ js.UndefOr[js.Any], /* transformFillStroke */ js.UndefOr[Boolean]) => Callback = null,
    fillText: (/* text */ js.UndefOr[String], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback = null,
    getInitialConfig: /* name */ js.UndefOr[String] => CallbackTo[js.Any] = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    lineTo: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback = null,
    mixins: js.Any = null,
    moveTo: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback = null,
    platformConfig: js.Any = null,
    rect: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback = null,
    restore: js.UndefOr[Callback] = js.undefined,
    save: js.UndefOr[Callback] = js.undefined,
    self: IClass = null,
    setTransform: (/* xx */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => Callback = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stroke: js.UndefOr[Callback] = js.undefined,
    strokeRect: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback = null,
    strokeText: (/* text */ js.UndefOr[String], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback = null,
    transform: (/* xx */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => Callback = null,
    uses: Array = null
  ): ISvgContext = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (arc != null) __obj.updateDynamic("arc")(js.Any.fromFunction6((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* radius */ js.UndefOr[scala.Double], t3: /* startAngle */ js.UndefOr[scala.Double], t4: /* endAngle */ js.UndefOr[scala.Double], t5: /* anticlockwise */ js.UndefOr[scala.Double]) => arc(t0, t1, t2, t3, t4, t5).runNow()))
    if (arcSvg != null) __obj.updateDynamic("arcSvg")(js.Any.fromFunction7((t0: /* r1 */ js.UndefOr[scala.Double], t1: /* r2 */ js.UndefOr[scala.Double], t2: /* rotation */ js.UndefOr[scala.Double], t3: /* large */ js.UndefOr[scala.Double], t4: /* swipe */ js.UndefOr[scala.Double], t5: /* x2 */ js.UndefOr[scala.Double], t6: /* y2 */ js.UndefOr[scala.Double]) => arcSvg(t0, t1, t2, t3, t4, t5, t6).runNow()))
    if (arcTo != null) __obj.updateDynamic("arcTo")(js.Any.fromFunction7((t0: /* x1 */ js.UndefOr[scala.Double], t1: /* y1 */ js.UndefOr[scala.Double], t2: /* x2 */ js.UndefOr[scala.Double], t3: /* y2 */ js.UndefOr[scala.Double], t4: /* radiusX */ js.UndefOr[scala.Double], t5: /* radiusY */ js.UndefOr[scala.Double], t6: /* rotation */ js.UndefOr[scala.Double]) => arcTo(t0, t1, t2, t3, t4, t5, t6).runNow()))
    beginPath.foreach(p => __obj.updateDynamic("beginPath")(p.toJsFn))
    if (bezierCurveTo != null) __obj.updateDynamic("bezierCurveTo")(js.Any.fromFunction6((t0: /* x1 */ js.UndefOr[scala.Double], t1: /* y1 */ js.UndefOr[scala.Double], t2: /* x2 */ js.UndefOr[scala.Double], t3: /* y2 */ js.UndefOr[scala.Double], t4: /* x3 */ js.UndefOr[scala.Double], t5: /* y3 */ js.UndefOr[scala.Double]) => bezierCurveTo(t0, t1, t2, t3, t4, t5).runNow()))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callOverridden(t0).runNow()))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callParent(t0).runNow()))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1((t0: /* args */ js.UndefOr[js.Any]) => callSuper(t0).runNow()))
    clear.foreach(p => __obj.updateDynamic("clear")(p.toJsFn))
    closePath.foreach(p => __obj.updateDynamic("closePath")(p.toJsFn))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (createLinearGradient != null) __obj.updateDynamic("createLinearGradient")(js.Any.fromFunction4((t0: /* x0 */ js.UndefOr[scala.Double], t1: /* y0 */ js.UndefOr[scala.Double], t2: /* x1 */ js.UndefOr[scala.Double], t3: /* y1 */ js.UndefOr[scala.Double]) => createLinearGradient(t0, t1, t2, t3).runNow()))
    if (createRadialGradient != null) __obj.updateDynamic("createRadialGradient")(js.Any.fromFunction6((t0: /* x0 */ js.UndefOr[scala.Double], t1: /* y0 */ js.UndefOr[scala.Double], t2: /* r0 */ js.UndefOr[scala.Double], t3: /* x1 */ js.UndefOr[scala.Double], t4: /* y1 */ js.UndefOr[scala.Double], t5: /* r1 */ js.UndefOr[scala.Double]) => createRadialGradient(t0, t1, t2, t3, t4, t5).runNow()))
    destroy.foreach(p => __obj.updateDynamic("destroy")(p.toJsFn))
    if (drawImage != null) __obj.updateDynamic("drawImage")(js.Any.fromFunction9((t0: /* image */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], t1: /* sx */ js.UndefOr[scala.Double], t2: /* sy */ js.UndefOr[scala.Double], t3: /* sw */ js.UndefOr[scala.Double], t4: /* sh */ js.UndefOr[scala.Double], t5: /* dx */ js.UndefOr[scala.Double], t6: /* dy */ js.UndefOr[scala.Double], t7: /* dw */ js.UndefOr[scala.Double], t8: /* dh */ js.UndefOr[scala.Double]) => drawImage(t0, t1, t2, t3, t4, t5, t6, t7, t8).runNow()))
    if (ellipse != null) __obj.updateDynamic("ellipse")(js.Any.fromFunction8((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* radiusX */ js.UndefOr[scala.Double], t3: /* radiusY */ js.UndefOr[scala.Double], t4: /* rotation */ js.UndefOr[scala.Double], t5: /* startAngle */ js.UndefOr[scala.Double], t6: /* endAngle */ js.UndefOr[scala.Double], t7: /* anticlockwise */ js.UndefOr[scala.Double]) => ellipse(t0, t1, t2, t3, t4, t5, t6, t7).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    fill.foreach(p => __obj.updateDynamic("fill")(p.toJsFn))
    if (fillRect != null) __obj.updateDynamic("fillRect")(js.Any.fromFunction4((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* width */ js.UndefOr[scala.Double], t3: /* height */ js.UndefOr[scala.Double]) => fillRect(t0, t1, t2, t3).runNow()))
    if (fillStroke != null) __obj.updateDynamic("fillStroke")(js.Any.fromFunction2((t0: /* attr */ js.UndefOr[js.Any], t1: /* transformFillStroke */ js.UndefOr[scala.Boolean]) => fillStroke(t0, t1).runNow()))
    if (fillText != null) __obj.updateDynamic("fillText")(js.Any.fromFunction3((t0: /* text */ js.UndefOr[java.lang.String], t1: /* x */ js.UndefOr[scala.Double], t2: /* y */ js.UndefOr[scala.Double]) => fillText(t0, t1, t2).runNow()))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => getInitialConfig(t0).runNow()))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1((t0: /* instanceConfig */ js.UndefOr[js.Any]) => initConfig(t0).runNow()))
    if (lineTo != null) __obj.updateDynamic("lineTo")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double]) => lineTo(t0, t1).runNow()))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (moveTo != null) __obj.updateDynamic("moveTo")(js.Any.fromFunction2((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double]) => moveTo(t0, t1).runNow()))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (rect != null) __obj.updateDynamic("rect")(js.Any.fromFunction4((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* width */ js.UndefOr[scala.Double], t3: /* height */ js.UndefOr[scala.Double]) => rect(t0, t1, t2, t3).runNow()))
    restore.foreach(p => __obj.updateDynamic("restore")(p.toJsFn))
    save.foreach(p => __obj.updateDynamic("save")(p.toJsFn))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setTransform != null) __obj.updateDynamic("setTransform")(js.Any.fromFunction6((t0: /* xx */ js.UndefOr[scala.Double], t1: /* yx */ js.UndefOr[scala.Double], t2: /* xy */ js.UndefOr[scala.Double], t3: /* yy */ js.UndefOr[scala.Double], t4: /* dx */ js.UndefOr[scala.Double], t5: /* dy */ js.UndefOr[scala.Double]) => setTransform(t0, t1, t2, t3, t4, t5).runNow()))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    stroke.foreach(p => __obj.updateDynamic("stroke")(p.toJsFn))
    if (strokeRect != null) __obj.updateDynamic("strokeRect")(js.Any.fromFunction4((t0: /* x */ js.UndefOr[scala.Double], t1: /* y */ js.UndefOr[scala.Double], t2: /* width */ js.UndefOr[scala.Double], t3: /* height */ js.UndefOr[scala.Double]) => strokeRect(t0, t1, t2, t3).runNow()))
    if (strokeText != null) __obj.updateDynamic("strokeText")(js.Any.fromFunction3((t0: /* text */ js.UndefOr[java.lang.String], t1: /* x */ js.UndefOr[scala.Double], t2: /* y */ js.UndefOr[scala.Double]) => strokeText(t0, t1, t2).runNow()))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction6((t0: /* xx */ js.UndefOr[scala.Double], t1: /* yx */ js.UndefOr[scala.Double], t2: /* xy */ js.UndefOr[scala.Double], t3: /* yy */ js.UndefOr[scala.Double], t4: /* dx */ js.UndefOr[scala.Double], t5: /* dy */ js.UndefOr[scala.Double]) => transform(t0, t1, t2, t3, t4, t5).runNow()))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISvgContext]
  }
}

