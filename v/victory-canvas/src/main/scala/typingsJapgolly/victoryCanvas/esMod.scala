package typingsJapgolly.victoryCanvas

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.victoryCanvas.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("victory-canvas/es", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-canvas/es", "CanvasBar")
  @js.native
  open class CanvasBar protected () extends Component[CanvasBarProps, Any, Any] {
    def this(props: CanvasBarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CanvasBarProps, context: Any) = this()
  }
  
  @JSImport("victory-canvas/es", "CanvasCurve")
  @js.native
  open class CanvasCurve protected ()
    extends Component[CanvasCurveProps, js.Object, Any] {
    def this(props: CanvasCurveProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CanvasCurveProps, context: Any) = this()
  }
  
  @JSImport("victory-canvas/es", "CanvasGroup")
  @js.native
  open class CanvasGroup protected () extends Component[CanvasGroupProps, Any, Any] {
    def this(props: CanvasGroupProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CanvasGroupProps, context: Any) = this()
  }
  
  @JSImport("victory-canvas/es", "CanvasPoint")
  @js.native
  open class CanvasPoint protected ()
    extends Component[CanvasPointProps, js.Object, Any] {
    def this(props: CanvasPointProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CanvasPointProps, context: Any) = this()
  }
  
  inline def useCanvasContext(): CanvasContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useCanvasContext")().asInstanceOf[CanvasContextValue]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonPrimitiveProps * / any */ trait CanvasBarProps extends StObject {
    
    var alignment: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryBarAlignmentType */ Any
      ] = js.undefined
    
    var barOffset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var barRatio: js.UndefOr[Double] = js.undefined
    
    var barWidth: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var cornerRadius: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any) | Bottom
      ] = js.undefined
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var getPath: js.UndefOr[js.Function] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var y0: js.UndefOr[Double] = js.undefined
  }
  object CanvasBarProps {
    
    inline def apply(): CanvasBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasBarProps]
    }
    
    extension [Self <: CanvasBarProps](x: Self) {
      
      inline def setAlignment(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryBarAlignmentType */ Any
      ): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBarOffset(value: js.Array[Double]): Self = StObject.set(x, "barOffset", value.asInstanceOf[js.Any])
      
      inline def setBarOffsetUndefined: Self = StObject.set(x, "barOffset", js.undefined)
      
      inline def setBarOffsetVarargs(value: Double*): Self = StObject.set(x, "barOffset", js.Array(value*))
      
      inline def setBarRatio(value: Double): Self = StObject.set(x, "barRatio", value.asInstanceOf[js.Any])
      
      inline def setBarRatioUndefined: Self = StObject.set(x, "barRatio", js.undefined)
      
      inline def setBarWidth(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      inline def setCornerRadius(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any) | Bottom
      ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setGetPath(value: js.Function): Self = StObject.set(x, "getPath", value.asInstanceOf[js.Any])
      
      inline def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait CanvasContextValue extends StObject {
    
    var canvasRef: RefHandle[HTMLCanvasElement]
    
    def clear(ctx: CanvasRenderingContext2D): Unit
    
    def clip(ctx: CanvasRenderingContext2D): Unit
  }
  object CanvasContextValue {
    
    inline def apply(
      canvasRef: RefHandle[HTMLCanvasElement],
      clear: CanvasRenderingContext2D => Callback,
      clip: CanvasRenderingContext2D => Callback
    ): CanvasContextValue = {
      val __obj = js.Dynamic.literal(canvasRef = canvasRef.asInstanceOf[js.Any], clear = js.Any.fromFunction1((t0: CanvasRenderingContext2D) => clear(t0).runNow()), clip = js.Any.fromFunction1((t0: CanvasRenderingContext2D) => clip(t0).runNow()))
      __obj.asInstanceOf[CanvasContextValue]
    }
    
    extension [Self <: CanvasContextValue](x: Self) {
      
      inline def setCanvasRef(value: RefHandle[HTMLCanvasElement]): Self = StObject.set(x, "canvasRef", value.asInstanceOf[js.Any])
      
      inline def setClear(value: CanvasRenderingContext2D => Callback): Self = StObject.set(x, "clear", js.Any.fromFunction1((t0: CanvasRenderingContext2D) => value(t0).runNow()))
      
      inline def setClip(value: CanvasRenderingContext2D => Callback): Self = StObject.set(x, "clip", js.Any.fromFunction1((t0: CanvasRenderingContext2D) => value(t0).runNow()))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonPrimitiveProps * / any */ trait CanvasCurveProps extends StObject {
    
    var ariaLabel: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrCallback */ Any
      ] = js.undefined
    
    var interpolation: js.UndefOr[String | js.Function] = js.undefined
    
    var openCurve: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
  }
  object CanvasCurveProps {
    
    inline def apply(): CanvasCurveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasCurveProps]
    }
    
    extension [Self <: CanvasCurveProps](x: Self) {
      
      inline def setAriaLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrCallback */ Any
      ): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setInterpolation(value: String | js.Function): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      inline def setOpenCurve(value: Boolean): Self = StObject.set(x, "openCurve", value.asInstanceOf[js.Any])
      
      inline def setOpenCurveUndefined: Self = StObject.set(x, "openCurve", js.undefined)
      
      inline def setTabIndex(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  trait CanvasGroupProps extends StObject {
    
    var children: js.UndefOr[Node | js.Array[Node]] = js.undefined
    
    var clipWidth: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaddingProps */ Any
      ] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object CanvasGroupProps {
    
    inline def apply(): CanvasGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasGroupProps]
    }
    
    extension [Self <: CanvasGroupProps](x: Self) {
      
      inline def setChildren(value: Node | js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClipWidth(value: Double): Self = StObject.set(x, "clipWidth", value.asInstanceOf[js.Any])
      
      inline def setClipWidthUndefined: Self = StObject.set(x, "clipWidth", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPadding(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaddingProps */ Any
      ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonPrimitiveProps * / any */ trait CanvasPointProps extends StObject {
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var getPath: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* size */ Double, String]] = js.undefined
    
    var size: js.UndefOr[Double | js.Function] = js.undefined
    
    var symbol: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScatterSymbolType */ Any) | js.Function
      ] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object CanvasPointProps {
    
    inline def apply(): CanvasPointProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CanvasPointProps]
    }
    
    extension [Self <: CanvasPointProps](x: Self) {
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setGetPath(value: (/* x */ Double, /* y */ Double, /* size */ Double) => String): Self = StObject.set(x, "getPath", js.Any.fromFunction3(value))
      
      inline def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
      
      inline def setSize(value: Double | js.Function): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSymbol(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScatterSymbolType */ Any) | js.Function
      ): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
