package typingsJapgolly.senchaTouch.Ext.draw

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.senchaTouch.Ext.IBase
import typingsJapgolly.senchaTouch.Ext.draw.engine.svgcontext.IGradient
import typingsJapgolly.senchaTouch.Ext.draw.sprite.ISprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engine {
  
  trait ICanvas
    extends StObject
       with ISurface {
    
    /** [Method] Clears the current transformation state on the surface  */
    var clearTransform: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Returns the value of highPrecision
      * @returns Boolean
      */
    var getHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var highPrecision: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Initialize the canvas element  */
    var initElement: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Sets the value of highPrecision
      * @param highPrecision Boolean The new value.
      */
    var setHighPrecision: js.UndefOr[js.Function1[/* highPrecision */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object ICanvas {
    
    inline def apply(): ICanvas = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICanvas]
    }
    
    extension [Self <: ICanvas](x: Self) {
      
      inline def setClearTransform(value: Callback): Self = StObject.set(x, "clearTransform", value.toJsFn)
      
      inline def setClearTransformUndefined: Self = StObject.set(x, "clearTransform", js.undefined)
      
      inline def setGetHighPrecision(value: CallbackTo[Boolean]): Self = StObject.set(x, "getHighPrecision", value.toJsFn)
      
      inline def setGetHighPrecisionUndefined: Self = StObject.set(x, "getHighPrecision", js.undefined)
      
      inline def setHighPrecision(value: Boolean): Self = StObject.set(x, "highPrecision", value.asInstanceOf[js.Any])
      
      inline def setHighPrecisionUndefined: Self = StObject.set(x, "highPrecision", js.undefined)
      
      inline def setInitElement(value: Callback): Self = StObject.set(x, "initElement", value.toJsFn)
      
      inline def setInitElementUndefined: Self = StObject.set(x, "initElement", js.undefined)
      
      inline def setSetHighPrecision(value: /* highPrecision */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setHighPrecision", js.Any.fromFunction1((t0: /* highPrecision */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetHighPrecisionUndefined: Self = StObject.set(x, "setHighPrecision", js.undefined)
    }
  }
  
  trait ISvg
    extends StObject
       with ISurface {
    
    /** [Method] Clears the current transformation state on the surface  */
    var clearTransform: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Creates a DOM element under the SVG namespace of the given type
      * @param type String The type of the SVG DOM element.
      * @returns * The created element.
      */
    var createSvgNode: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Any]] = js.undefined
    
    /** [Method] Destroys the Canvas element and prepares it for Garbage Collection
      * @param path Object
      * @param matrix Object
      * @param band Object
      */
    @JSName("destroy")
    var destroy_ISvg: js.UndefOr[
        js.Function3[
          /* path */ js.UndefOr[Any], 
          /* matrix */ js.UndefOr[Any], 
          /* band */ js.UndefOr[Any], 
          Unit
        ]
      ] = js.undefined
    
    /** [Method] Returns the value of highPrecision
      * @returns Boolean
      */
    var getHighPrecision: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Config Option] (Boolean) */
    var highPrecision: js.UndefOr[Boolean] = js.undefined
    
    /** [Method] Remove a given sprite from the surface optionally destroying the sprite in the process
      * @param sprite Object
      * @param destroySprite Object
      */
    @JSName("remove")
    var remove_ISvg: js.UndefOr[
        js.Function2[/* sprite */ js.UndefOr[Any], /* destroySprite */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Method] Renders a single sprite into the surface
      * @param sprite Ext.draw.sprite.Sprite The Sprite to be rendered.
      * @returns Boolean returns false to stop the rendering to continue.
      */
    var renderSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Boolean]] = js.undefined
    
    /** [Method] Sets the value of highPrecision
      * @param highPrecision Boolean The new value.
      */
    var setHighPrecision: js.UndefOr[js.Function1[/* highPrecision */ js.UndefOr[Boolean], Unit]] = js.undefined
  }
  object ISvg {
    
    inline def apply(): ISvg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISvg]
    }
    
    extension [Self <: ISvg](x: Self) {
      
      inline def setClearTransform(value: Callback): Self = StObject.set(x, "clearTransform", value.toJsFn)
      
      inline def setClearTransformUndefined: Self = StObject.set(x, "clearTransform", js.undefined)
      
      inline def setCreateSvgNode(value: /* type */ js.UndefOr[String] => Any): Self = StObject.set(x, "createSvgNode", js.Any.fromFunction1(value))
      
      inline def setCreateSvgNodeUndefined: Self = StObject.set(x, "createSvgNode", js.undefined)
      
      inline def setDestroy(
        value: (/* path */ js.UndefOr[Any], /* matrix */ js.UndefOr[Any], /* band */ js.UndefOr[Any]) => Callback
      ): Self = StObject.set(x, "destroy", js.Any.fromFunction3((t0: /* path */ js.UndefOr[Any], t1: /* matrix */ js.UndefOr[Any], t2: /* band */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setGetHighPrecision(value: CallbackTo[Boolean]): Self = StObject.set(x, "getHighPrecision", value.toJsFn)
      
      inline def setGetHighPrecisionUndefined: Self = StObject.set(x, "getHighPrecision", js.undefined)
      
      inline def setHighPrecision(value: Boolean): Self = StObject.set(x, "highPrecision", value.asInstanceOf[js.Any])
      
      inline def setHighPrecisionUndefined: Self = StObject.set(x, "highPrecision", js.undefined)
      
      inline def setRemove(value: (/* sprite */ js.UndefOr[Any], /* destroySprite */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction2((t0: /* sprite */ js.UndefOr[Any], t1: /* destroySprite */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRenderSprite(value: /* sprite */ js.UndefOr[ISprite] => Boolean): Self = StObject.set(x, "renderSprite", js.Any.fromFunction1(value))
      
      inline def setRenderSpriteUndefined: Self = StObject.set(x, "renderSprite", js.undefined)
      
      inline def setSetHighPrecision(value: /* highPrecision */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setHighPrecision", js.Any.fromFunction1((t0: /* highPrecision */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetHighPrecisionUndefined: Self = StObject.set(x, "setHighPrecision", js.undefined)
    }
  }
  
  trait ISvgContext
    extends StObject
       with IBase {
    
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
        js.Function2[/* attr */ js.UndefOr[Any], /* transformFillStroke */ js.UndefOr[Boolean], Unit]
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
    
    inline def apply(): ISvgContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISvgContext]
    }
    
    extension [Self <: ISvgContext](x: Self) {
      
      inline def setArc(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radius */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "arc", js.Any.fromFunction6((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double], t2: /* radius */ js.UndefOr[Double], t3: /* startAngle */ js.UndefOr[Double], t4: /* endAngle */ js.UndefOr[Double], t5: /* anticlockwise */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setArcSvg(
        value: (/* r1 */ js.UndefOr[Double], /* r2 */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* large */ js.UndefOr[Double], /* swipe */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "arcSvg", js.Any.fromFunction7((t0: /* r1 */ js.UndefOr[Double], t1: /* r2 */ js.UndefOr[Double], t2: /* rotation */ js.UndefOr[Double], t3: /* large */ js.UndefOr[Double], t4: /* swipe */ js.UndefOr[Double], t5: /* x2 */ js.UndefOr[Double], t6: /* y2 */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      
      inline def setArcSvgUndefined: Self = StObject.set(x, "arcSvg", js.undefined)
      
      inline def setArcTo(
        value: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "arcTo", js.Any.fromFunction7((t0: /* x1 */ js.UndefOr[Double], t1: /* y1 */ js.UndefOr[Double], t2: /* x2 */ js.UndefOr[Double], t3: /* y2 */ js.UndefOr[Double], t4: /* radiusX */ js.UndefOr[Double], t5: /* radiusY */ js.UndefOr[Double], t6: /* rotation */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      
      inline def setArcToUndefined: Self = StObject.set(x, "arcTo", js.undefined)
      
      inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
      
      inline def setBeginPath(value: Callback): Self = StObject.set(x, "beginPath", value.toJsFn)
      
      inline def setBeginPathUndefined: Self = StObject.set(x, "beginPath", js.undefined)
      
      inline def setBezierCurveTo(
        value: (/* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* x2 */ js.UndefOr[Double], /* y2 */ js.UndefOr[Double], /* x3 */ js.UndefOr[Double], /* y3 */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "bezierCurveTo", js.Any.fromFunction6((t0: /* x1 */ js.UndefOr[Double], t1: /* y1 */ js.UndefOr[Double], t2: /* x2 */ js.UndefOr[Double], t3: /* y2 */ js.UndefOr[Double], t4: /* x3 */ js.UndefOr[Double], t5: /* y3 */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setBezierCurveToUndefined: Self = StObject.set(x, "bezierCurveTo", js.undefined)
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setClosePath(value: Callback): Self = StObject.set(x, "closePath", value.toJsFn)
      
      inline def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
      
      inline def setCreateLinearGradient(
        value: (/* x0 */ js.UndefOr[Double], /* y0 */ js.UndefOr[Double], /* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double]) => IGradient
      ): Self = StObject.set(x, "createLinearGradient", js.Any.fromFunction4(value))
      
      inline def setCreateLinearGradientUndefined: Self = StObject.set(x, "createLinearGradient", js.undefined)
      
      inline def setCreateRadialGradient(
        value: (/* x0 */ js.UndefOr[Double], /* y0 */ js.UndefOr[Double], /* r0 */ js.UndefOr[Double], /* x1 */ js.UndefOr[Double], /* y1 */ js.UndefOr[Double], /* r1 */ js.UndefOr[Double]) => IGradient
      ): Self = StObject.set(x, "createRadialGradient", js.Any.fromFunction6(value))
      
      inline def setCreateRadialGradientUndefined: Self = StObject.set(x, "createRadialGradient", js.undefined)
      
      inline def setDrawImage(
        value: (/* image */ js.UndefOr[HTMLElement], /* sx */ js.UndefOr[Double], /* sy */ js.UndefOr[Double], /* sw */ js.UndefOr[Double], /* sh */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double], /* dw */ js.UndefOr[Double], /* dh */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "drawImage", js.Any.fromFunction9((t0: /* image */ js.UndefOr[HTMLElement], t1: /* sx */ js.UndefOr[Double], t2: /* sy */ js.UndefOr[Double], t3: /* sw */ js.UndefOr[Double], t4: /* sh */ js.UndefOr[Double], t5: /* dx */ js.UndefOr[Double], t6: /* dy */ js.UndefOr[Double], t7: /* dw */ js.UndefOr[Double], t8: /* dh */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()))
      
      inline def setDrawImageUndefined: Self = StObject.set(x, "drawImage", js.undefined)
      
      inline def setEllipse(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* radiusX */ js.UndefOr[Double], /* radiusY */ js.UndefOr[Double], /* rotation */ js.UndefOr[Double], /* startAngle */ js.UndefOr[Double], /* endAngle */ js.UndefOr[Double], /* anticlockwise */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "ellipse", js.Any.fromFunction8((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double], t2: /* radiusX */ js.UndefOr[Double], t3: /* radiusY */ js.UndefOr[Double], t4: /* rotation */ js.UndefOr[Double], t5: /* startAngle */ js.UndefOr[Double], t6: /* endAngle */ js.UndefOr[Double], t7: /* anticlockwise */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
      
      inline def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
      
      inline def setFill(value: Callback): Self = StObject.set(x, "fill", value.toJsFn)
      
      inline def setFillRect(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "fillRect", js.Any.fromFunction4((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double], t2: /* width */ js.UndefOr[Double], t3: /* height */ js.UndefOr[Double]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setFillRectUndefined: Self = StObject.set(x, "fillRect", js.undefined)
      
      inline def setFillStroke(value: (/* attr */ js.UndefOr[Any], /* transformFillStroke */ js.UndefOr[Boolean]) => Callback): Self = StObject.set(x, "fillStroke", js.Any.fromFunction2((t0: /* attr */ js.UndefOr[Any], t1: /* transformFillStroke */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
      
      inline def setFillStrokeUndefined: Self = StObject.set(x, "fillStroke", js.undefined)
      
      inline def setFillText(
        value: (/* text */ js.UndefOr[String], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "fillText", js.Any.fromFunction3((t0: /* text */ js.UndefOr[String], t1: /* x */ js.UndefOr[Double], t2: /* y */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
      
      inline def setFillTextUndefined: Self = StObject.set(x, "fillText", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setLineTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "lineTo", js.Any.fromFunction2((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
      
      inline def setLineToUndefined: Self = StObject.set(x, "lineTo", js.undefined)
      
      inline def setMoveTo(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "moveTo", js.Any.fromFunction2((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
      
      inline def setMoveToUndefined: Self = StObject.set(x, "moveTo", js.undefined)
      
      inline def setRect(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "rect", js.Any.fromFunction4((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double], t2: /* width */ js.UndefOr[Double], t3: /* height */ js.UndefOr[Double]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
      
      inline def setRestore(value: Callback): Self = StObject.set(x, "restore", value.toJsFn)
      
      inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
      
      inline def setSave(value: Callback): Self = StObject.set(x, "save", value.toJsFn)
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setSetTransform(
        value: (/* xx */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "setTransform", js.Any.fromFunction6((t0: /* xx */ js.UndefOr[Double], t1: /* yx */ js.UndefOr[Double], t2: /* xy */ js.UndefOr[Double], t3: /* yy */ js.UndefOr[Double], t4: /* dx */ js.UndefOr[Double], t5: /* dy */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setSetTransformUndefined: Self = StObject.set(x, "setTransform", js.undefined)
      
      inline def setStroke(value: Callback): Self = StObject.set(x, "stroke", value.toJsFn)
      
      inline def setStrokeRect(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* width */ js.UndefOr[Double], /* height */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "strokeRect", js.Any.fromFunction4((t0: /* x */ js.UndefOr[Double], t1: /* y */ js.UndefOr[Double], t2: /* width */ js.UndefOr[Double], t3: /* height */ js.UndefOr[Double]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setStrokeRectUndefined: Self = StObject.set(x, "strokeRect", js.undefined)
      
      inline def setStrokeText(
        value: (/* text */ js.UndefOr[String], /* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "strokeText", js.Any.fromFunction3((t0: /* text */ js.UndefOr[String], t1: /* x */ js.UndefOr[Double], t2: /* y */ js.UndefOr[Double]) => (value(t0, t1, t2)).runNow()))
      
      inline def setStrokeTextUndefined: Self = StObject.set(x, "strokeText", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setTransform(
        value: (/* xx */ js.UndefOr[Double], /* yx */ js.UndefOr[Double], /* xy */ js.UndefOr[Double], /* yy */ js.UndefOr[Double], /* dx */ js.UndefOr[Double], /* dy */ js.UndefOr[Double]) => Callback
      ): Self = StObject.set(x, "transform", js.Any.fromFunction6((t0: /* xx */ js.UndefOr[Double], t1: /* yx */ js.UndefOr[Double], t2: /* xy */ js.UndefOr[Double], t3: /* yy */ js.UndefOr[Double], t4: /* dx */ js.UndefOr[Double], t5: /* dy */ js.UndefOr[Double]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  object svgcontext {
    
    trait IGradient
      extends StObject
         with IBase {
      
      /** [Method] Adds a color stop with the given color to the gradient at the given offset
        * @param offset Number
        * @param color String
        */
      var addColorStop: js.UndefOr[
            js.Function2[/* offset */ js.UndefOr[Double], /* color */ js.UndefOr[String], Unit]
          ] = js.undefined
    }
    object IGradient {
      
      inline def apply(): IGradient = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IGradient]
      }
      
      extension [Self <: IGradient](x: Self) {
        
        inline def setAddColorStop(value: (/* offset */ js.UndefOr[Double], /* color */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2((t0: /* offset */ js.UndefOr[Double], t1: /* color */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
        
        inline def setAddColorStopUndefined: Self = StObject.set(x, "addColorStop", js.undefined)
      }
    }
  }
}
