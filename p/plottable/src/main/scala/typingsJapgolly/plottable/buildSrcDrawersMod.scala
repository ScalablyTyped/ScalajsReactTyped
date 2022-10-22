package typingsJapgolly.plottable

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.d3Shape.mod.Area_
import typingsJapgolly.d3Shape.mod.Line_
import typingsJapgolly.plottable.buildSrcCoreDatasetMod.Dataset
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
import typingsJapgolly.plottable.buildSrcCoreInterfacesMod.IAccessor
import typingsJapgolly.plottable.buildSrcCoreSymbolFactoriesMod.SymbolFactory
import typingsJapgolly.plottable.buildSrcDrawersCanvasBufferMod.CanvasBuffer
import typingsJapgolly.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep
import typingsJapgolly.plottable.buildSrcDrawersCanvasDrawerMod.IFillStyle
import typingsJapgolly.plottable.buildSrcDrawersCanvasDrawerMod.IStrokeStyle
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDrawersMod {
  
  @JSImport("plottable/build/src/drawers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/drawers", "ArcOutlineSVGDrawer")
  @js.native
  open class ArcOutlineSVGDrawer ()
    extends typingsJapgolly.plottable.buildSrcDrawersArcOutlineDrawerMod.ArcOutlineSVGDrawer
  
  @JSImport("plottable/build/src/drawers", "ArcSVGDrawer")
  @js.native
  open class ArcSVGDrawer ()
    extends typingsJapgolly.plottable.buildSrcDrawersArcDrawerMod.ArcSVGDrawer
  
  @JSImport("plottable/build/src/drawers", "AreaSVGDrawer")
  @js.native
  open class AreaSVGDrawer ()
    extends typingsJapgolly.plottable.buildSrcDrawersAreaDrawerMod.AreaSVGDrawer
  
  @JSImport("plottable/build/src/drawers", "CanvasDrawer")
  @js.native
  open class CanvasDrawer protected ()
    extends typingsJapgolly.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawer {
    /**
      * @param _context The context for a canvas that this drawer will draw to.
      * @param _drawStep The draw step logic that actually draws.
      */
    def this(_context: CanvasRenderingContext2D, _drawStep: CanvasDrawStep) = this()
  }
  
  @JSImport("plottable/build/src/drawers", "ContextStyleAttrs")
  @js.native
  val ContextStyleAttrs: js.Array[String] = js.native
  
  @JSImport("plottable/build/src/drawers", "LineSVGDrawer")
  @js.native
  open class LineSVGDrawer ()
    extends typingsJapgolly.plottable.buildSrcDrawersLineDrawerMod.LineSVGDrawer
  
  @JSImport("plottable/build/src/drawers", "ProxyDrawer")
  @js.native
  open class ProxyDrawer protected ()
    extends typingsJapgolly.plottable.buildSrcDrawersDrawerMod.ProxyDrawer {
    /**
      * A Drawer draws svg elements based on the input Dataset.
      *
      * @constructor
      * @param _svgDrawerFactory A factory that will be invoked to create an SVGDrawer whenever useSVG is called
      * @param _canvasDrawStep The DrawStep to be fed into a new CanvasDrawer whenever useCanvas is called
      */
    def this(
      _svgDrawerFactory: js.Function0[typingsJapgolly.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer],
      _canvasDrawerFactory: js.Function1[
            /* ctx */ CanvasRenderingContext2D, 
            typingsJapgolly.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawer
          ]
    ) = this()
  }
  
  @JSImport("plottable/build/src/drawers", "RectangleCanvasDrawStep")
  @js.native
  val RectangleCanvasDrawStep: CanvasDrawStep = js.native
  
  @JSImport("plottable/build/src/drawers", "RectangleCanvasDrawer")
  @js.native
  open class RectangleCanvasDrawer protected ()
    extends typingsJapgolly.plottable.buildSrcDrawersRectangleDrawerMod.RectangleCanvasDrawer {
    def this(ctx: CanvasRenderingContext2D) = this()
  }
  
  @JSImport("plottable/build/src/drawers", "RectangleSVGDrawer")
  @js.native
  open class RectangleSVGDrawer ()
    extends typingsJapgolly.plottable.buildSrcDrawersRectangleDrawerMod.RectangleSVGDrawer {
    def this(_rootClassName: String) = this()
  }
  
  @JSImport("plottable/build/src/drawers", "SVGDrawer")
  @js.native
  open class SVGDrawer protected ()
    extends typingsJapgolly.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer {
    /**
      * @param svgElementName an HTML/SVG tag name to be created, one per datum.
      * @param className CSS classes to be applied to the drawn primitives.
      * @param applyDefaultAttributes
      */
    def this(svgElementName: String, className: String) = this()
  }
  
  @JSImport("plottable/build/src/drawers", "SegmentSVGDrawer")
  @js.native
  open class SegmentSVGDrawer ()
    extends typingsJapgolly.plottable.buildSrcDrawersSegmentDrawerMod.SegmentSVGDrawer
  
  @JSImport("plottable/build/src/drawers", "SymbolSVGDrawer")
  @js.native
  open class SymbolSVGDrawer ()
    extends typingsJapgolly.plottable.buildSrcDrawersSymbolDrawerMod.SymbolSVGDrawer
  
  inline def getStrokeDashArray(style: Record[String, Any]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeDashArray")(style.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getStrokeWidth(style: Record[String, Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getStrokeWidth")(style.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def makeAreaCanvasDrawStep(d3AreaFactory: js.Function0[Area_[Any]], d3LineFactory: js.Function0[Line_[Any]]): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAreaCanvasDrawStep")(d3AreaFactory.asInstanceOf[js.Any], d3LineFactory.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
  
  inline def makeLineCanvasDrawStep(d3LineFactory: js.Function0[Line_[Any]]): CanvasDrawStep = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLineCanvasDrawStep")(d3LineFactory.asInstanceOf[js.Any]).asInstanceOf[CanvasDrawStep]
  
  inline def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]]
  ): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbolCanvasDrawStep")(dataset.asInstanceOf[js.Any], symbolProjector.asInstanceOf[js.Any], sizeProjector.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
  inline def makeSymbolCanvasDrawStep(
    dataset: Dataset,
    symbolProjector: js.Function0[IAccessor[SymbolFactory]],
    sizeProjector: js.Function0[IAccessor[Double]],
    stepBuffer: CanvasBuffer
  ): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbolCanvasDrawStep")(dataset.asInstanceOf[js.Any], symbolProjector.asInstanceOf[js.Any], sizeProjector.asInstanceOf[js.Any], stepBuffer.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
  
  inline def renderArea(
    context: CanvasRenderingContext2D,
    d3Area: Area_[Any],
    data: js.Array[Any],
    style: IFillStyle & IStrokeStyle
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderArea")(context.asInstanceOf[js.Any], d3Area.asInstanceOf[js.Any], data.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderLine(context: CanvasRenderingContext2D, d3Line: Line_[Any], data: js.Array[Any], style: IStrokeStyle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLine")(context.asInstanceOf[js.Any], d3Line.asInstanceOf[js.Any], data.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderPathWithStyle(context: CanvasRenderingContext2D, style: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderPathWithStyle")(context.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveAttributes(projector: AttributeToAppliedProjector, attrKeys: js.Array[String], datum: Any, index: Double): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAttributes")(projector.asInstanceOf[js.Any], attrKeys.asInstanceOf[js.Any], datum.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def resolveAttributesSubsetWithStyles(projector: AttributeToAppliedProjector, extraKeys: js.Array[String], datum: Any, index: Double): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAttributesSubsetWithStyles")(projector.asInstanceOf[js.Any], extraKeys.asInstanceOf[js.Any], datum.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
}
