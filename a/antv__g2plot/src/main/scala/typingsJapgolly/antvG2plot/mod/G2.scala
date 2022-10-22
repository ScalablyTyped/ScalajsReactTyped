package typingsJapgolly.antvG2plot.mod

import typingsJapgolly.antvCoord.anon.PartialOptions
import typingsJapgolly.antvG2.anon.PartialAreaCfg
import typingsJapgolly.antvG2.anon.PartialGeometryCfg
import typingsJapgolly.antvG2.anon.PartialIntervalCfg
import typingsJapgolly.antvG2.anon.PartialPathCfg
import typingsJapgolly.antvG2.anon.StartAngle
import typingsJapgolly.antvG2.anon.X
import typingsJapgolly.antvG2.anon.namestringvaluestringMark
import typingsJapgolly.antvG2.libAnimateAnimationMod.Animation
import typingsJapgolly.antvG2.libChartControllerBaseMod.ControllerCtor
import typingsJapgolly.antvG2.libChartViewMod.View
import typingsJapgolly.antvG2.libDependentsMod.Attribute
import typingsJapgolly.antvG2.libDependentsMod.IG
import typingsJapgolly.antvG2.libGeometryBaseMod.GeometryCfg
import typingsJapgolly.antvG2.libGeometryBaseMod.default
import typingsJapgolly.antvG2.libGeometryElementMod.ElementCfg
import typingsJapgolly.antvG2.libGeometryLabelBaseMod.GeometryLabelConstructor
import typingsJapgolly.antvG2.libGeometryLabelMod.GeometryLabelsLayoutFn
import typingsJapgolly.antvG2.libInteractionActionDataRangeFilterMod.EVENTS
import typingsJapgolly.antvG2.libInteractionActionRegisterMod.ActionConstructor
import typingsJapgolly.antvG2.libInteractionGrammarInteractionMod.InteractionSteps
import typingsJapgolly.antvG2.libInteractionInteractionMod.InteractionConstructor
import typingsJapgolly.antvG2.libInterfaceMod.FacetCfg
import typingsJapgolly.antvG2.libInterfaceMod.FacetCtor
import typingsJapgolly.antvG2.libInterfaceMod.FacetData
import typingsJapgolly.antvG2.libInterfaceMod.IInteractionContext
import typingsJapgolly.antvG2.libInterfaceMod.LooseObject
import typingsJapgolly.antvG2.libInterfaceMod.MappingDatum
import typingsJapgolly.antvG2.libInterfaceMod.MarkerCfg
import typingsJapgolly.antvG2.libInterfaceMod.Point
import typingsJapgolly.antvG2.libInterfaceMod.Position
import typingsJapgolly.antvG2.libInterfaceMod.RangePoint
import typingsJapgolly.antvG2.libInterfaceMod.RegisterShape
import typingsJapgolly.antvG2.libInterfaceMod.RegisterShapeFactory
import typingsJapgolly.antvG2.libInterfaceMod.Shape
import typingsJapgolly.antvG2.libInterfaceMod.ShapeFactory
import typingsJapgolly.antvG2.libInterfaceMod.ShapeInfo
import typingsJapgolly.antvG2.libInterfaceMod.ShapePoint
import typingsJapgolly.antvG2.libInterfaceMod.ShapeVertices
import typingsJapgolly.antvG2.libInterfaceMod.TooltipTitle
import typingsJapgolly.antvG2.libUtilLegendMod.ComponentLegendItem
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import typingsJapgolly.antvGBase.libInterfacesMod.IShape
import typingsJapgolly.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object G2 {
  
  @JSImport("@antv/g2plot", "G2")
  @js.native
  val ^ : js.Any = js.native
  
  /** range-filter 只用于：brush-filter, brush-x-filter, brush-y-filter */
  @JSImport("@antv/g2plot", "G2.BRUSH_FILTER_EVENTS")
  @js.native
  object BRUSH_FILTER_EVENTS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EVENTS & String] = js.native
    
    /* "brush-filter:afterfilter" */ val AFTER_FILTER: typingsJapgolly.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.AFTER_FILTER & String = js.native
    
    /* "brush-filter:afterreset" */ val AFTER_RESET: typingsJapgolly.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.AFTER_RESET & String = js.native
    
    /* "brush-filter:beforefilter" */ val BEFORE_FILTER: typingsJapgolly.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.BEFORE_FILTER & String = js.native
    
    /* "brush-filter:beforereset" */ val BEFORE_RESET: typingsJapgolly.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.BEFORE_RESET & String = js.native
    
    /* "brush-filter-processing" */ val FILTER: typingsJapgolly.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.FILTER & String = js.native
    
    /* "brush-filter-reset" */ val RESET: typingsJapgolly.antvG2.libInteractionActionDataRangeFilterMod.EVENTS.RESET & String = js.native
  }
  
  /* note: abstract class */ @JSImport("@antv/g2plot", "G2.ComponentController")
  @js.native
  open class ComponentController[O] protected ()
    extends typingsJapgolly.antvG2.mod.ComponentController[O] {
    def this(view: View) = this()
  }
  
  @JSImport("@antv/g2plot", "G2.Coordinate")
  @js.native
  /**
    * Create a new Coordinate Object.
    * @param options Custom options
    */
  open class Coordinate ()
    extends typingsJapgolly.antvG2.mod.Coordinate {
    def this(options: PartialOptions) = this()
  }
  
  @JSImport("@antv/g2plot", "G2.DIRECTION")
  @js.native
  object DIRECTION extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.antvG2.libConstantMod.DIRECTION & String] = js.native
    
    /* "bottom" */ val BOTTOM: typingsJapgolly.antvG2.libConstantMod.DIRECTION.BOTTOM & String = js.native
    
    /* "bottom-left" */ val BOTTOM_LEFT: typingsJapgolly.antvG2.libConstantMod.DIRECTION.BOTTOM_LEFT & String = js.native
    
    /* "bottom-right" */ val BOTTOM_RIGHT: typingsJapgolly.antvG2.libConstantMod.DIRECTION.BOTTOM_RIGHT & String = js.native
    
    /* "circle" */ val CIRCLE: typingsJapgolly.antvG2.libConstantMod.DIRECTION.CIRCLE & String = js.native
    
    /* "left" */ val LEFT: typingsJapgolly.antvG2.libConstantMod.DIRECTION.LEFT & String = js.native
    
    /* "left-bottom" */ val LEFT_BOTTOM: typingsJapgolly.antvG2.libConstantMod.DIRECTION.LEFT_BOTTOM & String = js.native
    
    /* "left-top" */ val LEFT_TOP: typingsJapgolly.antvG2.libConstantMod.DIRECTION.LEFT_TOP & String = js.native
    
    /* "none" */ val NONE: typingsJapgolly.antvG2.libConstantMod.DIRECTION.NONE & String = js.native
    
    /* "radius" */ val RADIUS: typingsJapgolly.antvG2.libConstantMod.DIRECTION.RADIUS & String = js.native
    
    /* "right" */ val RIGHT: typingsJapgolly.antvG2.libConstantMod.DIRECTION.RIGHT & String = js.native
    
    /* "right-bottom" */ val RIGHT_BOTTOM: typingsJapgolly.antvG2.libConstantMod.DIRECTION.RIGHT_BOTTOM & String = js.native
    
    /* "right-top" */ val RIGHT_TOP: typingsJapgolly.antvG2.libConstantMod.DIRECTION.RIGHT_TOP & String = js.native
    
    /* "top" */ val TOP: typingsJapgolly.antvG2.libConstantMod.DIRECTION.TOP & String = js.native
    
    /* "top-left" */ val TOP_LEFT: typingsJapgolly.antvG2.libConstantMod.DIRECTION.TOP_LEFT & String = js.native
    
    /* "top-right" */ val TOP_RIGHT: typingsJapgolly.antvG2.libConstantMod.DIRECTION.TOP_RIGHT & String = js.native
  }
  
  @JSImport("@antv/g2plot", "G2.ELEMENT_RANGE_HIGHLIGHT_EVENTS")
  @js.native
  object ELEMENT_RANGE_HIGHLIGHT_EVENTS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.antvG2.libInteractionActionElementRangeHighlightMod.EVENTS & String
      ] = js.native
    
    /* "element-range-highlight:afterclear" */ val AFTER_CLEAR: typingsJapgolly.antvG2.libInteractionActionElementRangeHighlightMod.EVENTS.AFTER_CLEAR & String = js.native
    
    /* "element-range-highlight:afterhighlight" */ val AFTER_HIGHLIGHT: typingsJapgolly.antvG2.libInteractionActionElementRangeHighlightMod.EVENTS.AFTER_HIGHLIGHT & String = js.native
    
    /* "element-range-highlight:beforeclear" */ val BEFORE_CLEAR: typingsJapgolly.antvG2.libInteractionActionElementRangeHighlightMod.EVENTS.BEFORE_CLEAR & String = js.native
    
    /* "element-range-highlight:beforehighlight" */ val BEFORE_HIGHLIGHT: typingsJapgolly.antvG2.libInteractionActionElementRangeHighlightMod.EVENTS.BEFORE_HIGHLIGHT & String = js.native
  }
  
  @JSImport("@antv/g2plot", "G2.Element")
  @js.native
  open class Element protected ()
    extends typingsJapgolly.antvG2.mod.Element {
    def this(cfg: ElementCfg) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g2plot", "G2.Facet")
  @js.native
  open class Facet[C /* <: FacetCfg[FacetData] */, F /* <: FacetData */] protected ()
    extends typingsJapgolly.antvG2.mod.Facet[C, F] {
    def this(view: View, cfg: C) = this()
  }
  
  @JSImport("@antv/g2plot", "G2.Geometry")
  @js.native
  open class Geometry[S /* <: ShapePoint */] protected ()
    extends typingsJapgolly.antvG2.mod.Geometry[S] {
    /**
      * 创建 Geometry 实例。
      * @param cfg
      */
    def this(cfg: GeometryCfg) = this()
  }
  
  @JSImport("@antv/g2plot", "G2.GeometryLabel")
  @js.native
  open class GeometryLabel protected ()
    extends typingsJapgolly.antvG2.mod.GeometryLabel {
    def this(geometry: default[ShapePoint]) = this()
  }
  
  /**
    * Action 的基类
    */
  /* note: abstract class */ @JSImport("@antv/g2plot", "G2.InteractionAction")
  @js.native
  open class InteractionAction[T] protected ()
    extends typingsJapgolly.antvG2.mod.InteractionAction[T] {
    def this(context: IInteractionContext) = this()
    def this(context: IInteractionContext, cfg: T) = this()
  }
  
  @JSImport("@antv/g2plot", "G2.LAYER")
  @js.native
  object LAYER extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.antvG2.libConstantMod.LAYER & String] = js.native
    
    /* "bg" */ val BG: typingsJapgolly.antvG2.libConstantMod.LAYER.BG & String = js.native
    
    /* "fore" */ val FORE: typingsJapgolly.antvG2.libConstantMod.LAYER.FORE & String = js.native
    
    /* "mid" */ val MID: typingsJapgolly.antvG2.libConstantMod.LAYER.MID & String = js.native
  }
  
  @JSImport("@antv/g2plot", "G2.TooltipController")
  @js.native
  open class TooltipController ()
    extends typingsJapgolly.antvG2.mod.TooltipController
  
  object Util {
    
    @JSImport("@antv/g2plot", "G2.Util")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot", "G2.Util.getAngle")
    @js.native
    def getAngle: js.Function2[
        /* shapeModel */ ShapeInfo, 
        /* coordinate */ typingsJapgolly.antvG2.libDependentsMod.Coordinate, 
        StartAngle
      ] = js.native
    inline def getAngle(shapeModel: ShapeInfo, coordinate: typingsJapgolly.antvG2.libDependentsMod.Coordinate): StartAngle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(shapeModel.asInstanceOf[js.Any], coordinate.asInstanceOf[js.Any])).asInstanceOf[StartAngle]
    inline def getAngle_=(
      x: js.Function2[
          /* shapeModel */ ShapeInfo, 
          /* coordinate */ typingsJapgolly.antvG2.libDependentsMod.Coordinate, 
          StartAngle
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot", "G2.Util.getDelegationObject")
    @js.native
    def getDelegationObject: js.Function1[/* context */ IInteractionContext, LooseObject] = js.native
    inline def getDelegationObject(context: IInteractionContext): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getDelegationObject")(context.asInstanceOf[js.Any]).asInstanceOf[LooseObject]
    inline def getDelegationObject_=(x: js.Function1[/* context */ IInteractionContext, LooseObject]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDelegationObject")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot", "G2.Util.getLegendItems")
    @js.native
    def getLegendItems: js.Function5[
        /* view */ View, 
        /* geometry */ default[ShapePoint], 
        /* attr */ Attribute, 
        /* themeMarker */ js.Object, 
        /* userMarker */ js.UndefOr[
          MarkerCfg | (js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg])
        ], 
        js.Array[ComponentLegendItem]
      ] = js.native
    inline def getLegendItems(view: View, geometry: default[ShapePoint], attr: Attribute, themeMarker: js.Object): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
    inline def getLegendItems(
      view: View,
      geometry: default[ShapePoint],
      attr: Attribute,
      themeMarker: js.Object,
      userMarker: js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg]
    ): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any], userMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
    inline def getLegendItems(
      view: View,
      geometry: default[ShapePoint],
      attr: Attribute,
      themeMarker: js.Object,
      userMarker: MarkerCfg
    ): js.Array[ComponentLegendItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLegendItems")(view.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], attr.asInstanceOf[js.Any], themeMarker.asInstanceOf[js.Any], userMarker.asInstanceOf[js.Any])).asInstanceOf[js.Array[ComponentLegendItem]]
    inline def getLegendItems_=(
      x: js.Function5[
          /* view */ View, 
          /* geometry */ default[ShapePoint], 
          /* attr */ Attribute, 
          /* themeMarker */ js.Object, 
          /* userMarker */ js.UndefOr[
            MarkerCfg | (js.Function3[/* name */ String, /* index */ Double, /* item */ namestringvaluestringMark, MarkerCfg])
          ], 
          js.Array[ComponentLegendItem]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLegendItems")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot", "G2.Util.getMappingValue")
    @js.native
    def getMappingValue: js.Function3[/* attr */ Attribute, /* value */ Any, /* def */ String, String] = js.native
    inline def getMappingValue(attr: Attribute, value: Any, `def`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMappingValue")(attr.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getMappingValue_=(x: js.Function3[/* attr */ Attribute, /* value */ Any, /* def */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMappingValue")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot", "G2.Util.getPath")
    @js.native
    def getPath: js.Function6[
        /* points */ js.Array[Point | RangePoint], 
        /* isInCircle */ Boolean, 
        /* isStack */ js.UndefOr[Boolean], 
        /* smooth */ js.UndefOr[Boolean], 
        /* constraint */ js.UndefOr[js.Array[Position]], 
        /* style */ js.UndefOr[ShapeAttrs], 
        Any
      ] = js.native
    inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean, isStack: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean, isStack: Boolean, smooth: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Boolean,
      constraint: js.Array[Position]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Boolean,
      constraint: js.Array[Position],
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Boolean,
      constraint: Unit,
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Unit,
      constraint: js.Array[Position]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Unit,
      constraint: js.Array[Position],
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Boolean,
      smooth: Unit,
      constraint: Unit,
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(points: js.Array[Point | RangePoint], isInCircle: Boolean, isStack: Unit, smooth: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Boolean,
      constraint: js.Array[Position]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Boolean,
      constraint: js.Array[Position],
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Boolean,
      constraint: Unit,
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Unit,
      constraint: js.Array[Position]
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Unit,
      constraint: js.Array[Position],
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getPath(
      points: js.Array[Point | RangePoint],
      isInCircle: Boolean,
      isStack: Unit,
      smooth: Unit,
      constraint: Unit,
      style: ShapeAttrs
    ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(points.asInstanceOf[js.Any], isInCircle.asInstanceOf[js.Any], isStack.asInstanceOf[js.Any], smooth.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("@antv/g2plot", "G2.Util.getPathPoints")
    @js.native
    def getPathPoints: js.Function3[
        /* points */ ShapeVertices, 
        /* connectNulls */ js.UndefOr[Boolean], 
        /* showSinglePoint */ js.UndefOr[Boolean], 
        js.Array[Any]
      ] = js.native
    inline def getPathPoints(points: ShapeVertices): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def getPathPoints(points: ShapeVertices, connectNulls: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getPathPoints(points: ShapeVertices, connectNulls: Boolean, showSinglePoint: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any], showSinglePoint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getPathPoints(points: ShapeVertices, connectNulls: Unit, showSinglePoint: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathPoints")(points.asInstanceOf[js.Any], connectNulls.asInstanceOf[js.Any], showSinglePoint.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getPathPoints_=(
      x: js.Function3[
          /* points */ ShapeVertices, 
          /* connectNulls */ js.UndefOr[Boolean], 
          /* showSinglePoint */ js.UndefOr[Boolean], 
          js.Array[Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPathPoints")(x.asInstanceOf[js.Any])
    
    inline def getPath_=(
      x: js.Function6[
          /* points */ js.Array[Point | RangePoint], 
          /* isInCircle */ Boolean, 
          /* isStack */ js.UndefOr[Boolean], 
          /* smooth */ js.UndefOr[Boolean], 
          /* constraint */ js.UndefOr[js.Array[Position]], 
          /* style */ js.UndefOr[ShapeAttrs], 
          Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPath")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot", "G2.Util.getSectorPath")
    @js.native
    def getSectorPath: js.Function6[
        /* centerX */ Double, 
        /* centerY */ Double, 
        /* radius */ Double, 
        /* startAngleInRadian */ Double, 
        /* endAngleInRadian */ Double, 
        /* innerRadius */ js.UndefOr[Double], 
        js.Array[js.Array[String | Double]]
      ] = js.native
    inline def getSectorPath(
      centerX: Double,
      centerY: Double,
      radius: Double,
      startAngleInRadian: Double,
      endAngleInRadian: Double
    ): js.Array[js.Array[String | Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSectorPath")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngleInRadian.asInstanceOf[js.Any], endAngleInRadian.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | Double]]]
    inline def getSectorPath(
      centerX: Double,
      centerY: Double,
      radius: Double,
      startAngleInRadian: Double,
      endAngleInRadian: Double,
      innerRadius: Double
    ): js.Array[js.Array[String | Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSectorPath")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], startAngleInRadian.asInstanceOf[js.Any], endAngleInRadian.asInstanceOf[js.Any], innerRadius.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | Double]]]
    inline def getSectorPath_=(
      x: js.Function6[
          /* centerX */ Double, 
          /* centerY */ Double, 
          /* radius */ Double, 
          /* startAngleInRadian */ Double, 
          /* endAngleInRadian */ Double, 
          /* innerRadius */ js.UndefOr[Double], 
          js.Array[js.Array[String | Double]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSectorPath")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot", "G2.Util.getTooltipItems")
    @js.native
    def getTooltipItems: js.Function4[
        /* data */ MappingDatum, 
        /* geometry */ default[ShapePoint], 
        /* title */ js.UndefOr[TooltipTitle], 
        /* showNil */ js.UndefOr[Boolean], 
        js.Array[Any]
      ] = js.native
    inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: Unit, showNil: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showNil.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: TooltipTitle): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getTooltipItems(data: MappingDatum, geometry: default[ShapePoint], title: TooltipTitle, showNil: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltipItems")(data.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], title.asInstanceOf[js.Any], showNil.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getTooltipItems_=(
      x: js.Function4[
          /* data */ MappingDatum, 
          /* geometry */ default[ShapePoint], 
          /* title */ js.UndefOr[TooltipTitle], 
          /* showNil */ js.UndefOr[Boolean], 
          js.Array[Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTooltipItems")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot", "G2.Util.polarToCartesian")
    @js.native
    def polarToCartesian: js.Function4[
        /* centerX */ Double, 
        /* centerY */ Double, 
        /* radius */ Double, 
        /* angleInRadian */ Double, 
        X
      ] = js.native
    inline def polarToCartesian(centerX: Double, centerY: Double, radius: Double, angleInRadian: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("polarToCartesian")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], angleInRadian.asInstanceOf[js.Any])).asInstanceOf[X]
    inline def polarToCartesian_=(
      x: js.Function4[
          /* centerX */ Double, 
          /* centerY */ Double, 
          /* radius */ Double, 
          /* angleInRadian */ Double, 
          X
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polarToCartesian")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot", "G2.Util.rotate")
    @js.native
    def rotate: js.Function2[/* element */ IGroup | IShape, /* rotateRadian */ Double, Unit] = js.native
    inline def rotate(element: IGroup, rotateRadian: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(element.asInstanceOf[js.Any], rotateRadian.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def rotate(element: IShape, rotateRadian: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(element.asInstanceOf[js.Any], rotateRadian.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def rotate_=(x: js.Function2[/* element */ IGroup | IShape, /* rotateRadian */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotate")(x.asInstanceOf[js.Any])
    
    inline def transform(m: js.Array[Double], actions: js.Array[js.Array[Any]]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(m.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    @JSImport("@antv/g2plot", "G2.Util.translate")
    @js.native
    def translate: js.Function3[/* element */ IGroup | IShape, /* x */ Double, /* y */ Double, Unit] = js.native
    inline def translate(element: IGroup, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def translate(element: IShape, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(element.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def translate_=(x: js.Function3[/* element */ IGroup | IShape, /* x */ Double, /* y */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translate")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot", "G2.Util.zoom")
    @js.native
    def zoom: js.Function2[/* element */ IGroup | IShape, /* ratio */ Double, Unit] = js.native
    inline def zoom(element: IGroup, ratio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoom")(element.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def zoom(element: IShape, ratio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("zoom")(element.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def zoom_=(x: js.Function2[/* element */ IGroup | IShape, /* ratio */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoom")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g2plot", "G2.VERSION")
  @js.native
  val VERSION: /* "4.2.8" */ String = js.native
  
  @JSImport("@antv/g2plot", "G2.VIEW_LIFE_CIRCLE")
  @js.native
  object VIEW_LIFE_CIRCLE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE & String] = js.native
    
    /* "afterchangedata" */ val AFTER_CHANGE_DATA: typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.AFTER_CHANGE_DATA & String = js.native
    
    /* "afterchangesize" */ val AFTER_CHANGE_SIZE: typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.AFTER_CHANGE_SIZE & String = js.native
    
    /* "afterclear" */ val AFTER_CLEAR: typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.AFTER_CLEAR & String = js.native
    
    /* "afterpaint" */ val AFTER_PAINT: typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.AFTER_PAINT & String = js.native
    
    /* "afterrender" */ val AFTER_RENDER: typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.AFTER_RENDER & String = js.native
    
    /* "beforechangedata" */ val BEFORE_CHANGE_DATA: typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_CHANGE_DATA & String = js.native
    
    /* "beforechangesize" */ val BEFORE_CHANGE_SIZE: typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_CHANGE_SIZE & String = js.native
    
    /* "beforeclear" */ val BEFORE_CLEAR: typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_CLEAR & String = js.native
    
    /* "beforedestroy" */ val BEFORE_DESTROY: typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_DESTROY & String = js.native
    
    /* "beforepaint" */ val BEFORE_PAINT: typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_PAINT & String = js.native
    
    /* "beforerender" */ val BEFORE_RENDER: typingsJapgolly.antvG2.libConstantMod.VIEW_LIFE_CIRCLE.BEFORE_RENDER & String = js.native
  }
  
  inline def getActionClass(actionName: String): ActionConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionClass")(actionName.asInstanceOf[js.Any]).asInstanceOf[ActionConstructor]
  
  inline def getAnimation(`type`: String): Animation = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimation")(`type`.asInstanceOf[js.Any]).asInstanceOf[Animation]
  
  inline def getEngine(name: String): IG = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngine")(name.asInstanceOf[js.Any]).asInstanceOf[IG]
  
  inline def getFacet(`type`: String): FacetCtor = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacet")(`type`.asInstanceOf[js.Any]).asInstanceOf[FacetCtor]
  
  inline def getGeometryLabel(`type`: String): GeometryLabelConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeometryLabel")(`type`.asInstanceOf[js.Any]).asInstanceOf[GeometryLabelConstructor]
  
  inline def getGeometryLabelLayout(`type`: String): GeometryLabelsLayoutFn = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeometryLabelLayout")(`type`.asInstanceOf[js.Any]).asInstanceOf[GeometryLabelsLayoutFn]
  
  inline def getInteraction(name: String): InteractionSteps | InteractionConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteraction")(name.asInstanceOf[js.Any]).asInstanceOf[InteractionSteps | InteractionConstructor]
  
  inline def getShapeFactory(factoryName: String): ShapeFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("getShapeFactory")(factoryName.asInstanceOf[js.Any]).asInstanceOf[ShapeFactory]
  
  inline def getTheme(): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")().asInstanceOf[LooseObject]
  inline def getTheme(theme: String): LooseObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[LooseObject]
  
  inline def registerAction(actionName: String, ActionClass: ActionConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerAction(actionName: String, ActionClass: ActionConstructor, cfg: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAction")(actionName.asInstanceOf[js.Any], ActionClass.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerAnimation(`type`: String, animation: Animation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAnimation")(`type`.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerComponentController(name: String, plugin: ControllerCtor[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponentController")(name.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerEngine(name: String, engine: IG): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerEngine")(name.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerFacet(`type`: String, ctor: FacetCtor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFacet")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerGeometry(name: String, Ctor: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometry")(name.asInstanceOf[js.Any], Ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerGeometryLabel(`type`: String, ctor: GeometryLabelConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometryLabel")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerGeometryLabelLayout(`type`: String, layoutFn: GeometryLabelsLayoutFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerGeometryLabelLayout")(`type`.asInstanceOf[js.Any], layoutFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerInteraction(name: String, interaction: InteractionSteps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInteraction")(name.asInstanceOf[js.Any], interaction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerInteraction(name: String, interaction: InteractionConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerInteraction")(name.asInstanceOf[js.Any], interaction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerShape(factoryName: String, shapeType: String, cfg: RegisterShape): Shape = (^.asInstanceOf[js.Dynamic].applyDynamic("registerShape")(factoryName.asInstanceOf[js.Any], shapeType.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[Shape]
  
  inline def registerShapeFactory(factoryName: String, cfg: RegisterShapeFactory): ShapeFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("registerShapeFactory")(factoryName.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[ShapeFactory]
  
  inline def registerTheme(theme: String, value: LooseObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(theme.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * 往 View 原型上添加的创建 Geometry 的方法
    *
    * Tips:
    * view module augmentation, detail: http://www.typescriptlang.org/docs/handbook/declaration-merging.html#module-augmentation
    */
  /* augmented module */
  object antvG2LibChartViewAugmentingMod {
    
    @js.native
    trait View extends StObject {
      
      /**
        * 创建 Area 几何标记。
        * @param [cfg] 传入 Area 构造函数的配置。
        * @returns area 返回 Area 实例。
        */
      def area(): typingsJapgolly.antvG2.libGeometryAreaMod.default = js.native
      def area(cfg: PartialAreaCfg): typingsJapgolly.antvG2.libGeometryAreaMod.default = js.native
      
      /**
        * 创建 Edge 几何标记。
        * @param [cfg] 传入 Edge 构造函数的配置。
        * @returns schema 返回 Edge 实例。
        */
      def edge(): typingsJapgolly.antvG2.libGeometryEdgeMod.default = js.native
      def edge(cfg: PartialGeometryCfg): typingsJapgolly.antvG2.libGeometryEdgeMod.default = js.native
      
      /**
        * 创建 Heatmap 几何标记。
        * @param [cfg] 传入 Heatmap 构造函数的配置。
        * @returns heatmap 返回 Heatmap 实例。
        */
      def heatmap(): typingsJapgolly.antvG2.libGeometryHeatmapMod.default = js.native
      def heatmap(cfg: PartialGeometryCfg): typingsJapgolly.antvG2.libGeometryHeatmapMod.default = js.native
      
      /**
        * 创建 Interval 几何标记。
        * @param [cfg] 传入 Interval 构造函数的配置。
        * @returns interval 返回 Interval 实例。
        */
      def interval(): typingsJapgolly.antvG2.libGeometryIntervalMod.default = js.native
      def interval(cfg: PartialIntervalCfg): typingsJapgolly.antvG2.libGeometryIntervalMod.default = js.native
      
      /**
        * 创建 Line 几何标记。
        * @param [cfg] 传入 Line 构造函数的配置。
        * @returns line 返回 Line 实例。
        */
      def line(): typingsJapgolly.antvG2.libGeometryLineMod.default = js.native
      def line(cfg: PartialPathCfg): typingsJapgolly.antvG2.libGeometryLineMod.default = js.native
      
      /**
        * 创建 Path 几何标记。
        * @param [cfg] 传入 Path 构造函数的配置。
        * @returns path 返回 Path 实例。
        */
      def path(): typingsJapgolly.antvG2.libGeometryPathMod.default = js.native
      def path(cfg: PartialPathCfg): typingsJapgolly.antvG2.libGeometryPathMod.default = js.native
      
      /**
        * 创建 Point 几何标记。
        * @param [cfg] 传入 Point 构造函数的配置。
        * @returns point 返回 Point 实例。
        */
      def point(): Point = js.native
      def point(cfg: PartialGeometryCfg): Point = js.native
      
      /**
        * 创建 Polygon 几何标记。
        * @param [cfg] 传入 Polygon 构造函数的配置。
        * @returns polygon 返回 Polygon 实例。
        */
      def polygon(): typingsJapgolly.antvG2.libGeometryPolygonMod.default = js.native
      def polygon(cfg: PartialGeometryCfg): typingsJapgolly.antvG2.libGeometryPolygonMod.default = js.native
      
      /**
        * 创建 Schema 几何标记。
        * @param [cfg] 传入 Schema 构造函数的配置。
        * @returns schema 返回 Schema 实例。
        */
      def schema(): typingsJapgolly.antvG2.libGeometrySchemaMod.default = js.native
      def schema(cfg: PartialGeometryCfg): typingsJapgolly.antvG2.libGeometrySchemaMod.default = js.native
      
      /**
        * 创建 Violin 几何标记。
        * @param [cfg] 传入 Violin 构造函数的配置。
        * @returns violin 返回 Violin 实例。
        */
      def violin(): typingsJapgolly.antvG2.libGeometryViolinMod.default = js.native
      def violin(cfg: PartialGeometryCfg): typingsJapgolly.antvG2.libGeometryViolinMod.default = js.native
    }
  }
}
