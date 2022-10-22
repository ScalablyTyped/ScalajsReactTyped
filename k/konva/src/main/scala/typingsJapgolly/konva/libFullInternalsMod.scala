package typingsJapgolly.konva

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.konva.anon.Assign
import typingsJapgolly.konva.anon.BackEaseIn
import typingsJapgolly.konva.anon.Blur
import typingsJapgolly.konva.anon.Drag
import typingsJapgolly.konva.anon.TypeofAnimation
import typingsJapgolly.konva.anon.TypeofImage
import typingsJapgolly.konva.anon.TypeofNode
import typingsJapgolly.konva.anon.TypeofPath
import typingsJapgolly.konva.anon.TypeofTween
import typingsJapgolly.konva.libCanvasMod.ICanvasConfig
import typingsJapgolly.konva.libLayerMod.LayerConfig
import typingsJapgolly.konva.libNodeMod.NodeConfig
import typingsJapgolly.konva.libShapeMod.ShapeConfig
import typingsJapgolly.konva.libShapesImageMod.ImageConfig
import typingsJapgolly.konva.libShapesLineMod.LineConfig
import typingsJapgolly.konva.libShapesPathMod.PathConfig
import typingsJapgolly.konva.libShapesTextMod.TextConfig
import typingsJapgolly.konva.libShapesTextPathMod.TextPathConfig
import typingsJapgolly.konva.libShapesTransformerMod.TransformerConfig
import typingsJapgolly.konva.libStageMod.StageConfig
import typingsJapgolly.konva.libTweenMod.TweenConfig
import typingsJapgolly.konva.libTypesMod.AnimationFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFullInternalsMod {
  
  object Konva {
    
    @JSImport("konva/lib/_FullInternals", "Konva")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Animation")
    @js.native
    open class Animation protected ()
      extends typingsJapgolly.konva.libAnimationMod.Animation {
      def this(func: AnimationFn) = this()
      def this(func: AnimationFn, layers: Any) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Animation")
    @js.native
    def Animation: TypeofAnimation = js.native
    inline def Animation_=(x: TypeofAnimation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Animation")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Arc")
    @js.native
    open class Arc ()
      extends typingsJapgolly.konva.libShapesArcMod.Arc
    @JSImport("konva/lib/_FullInternals", "Konva.Arc")
    @js.native
    def Arc: Instantiable0[typingsJapgolly.konva.libShapesArcMod.Arc] = js.native
    inline def Arc_=(x: Instantiable0[typingsJapgolly.konva.libShapesArcMod.Arc]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arc")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Arrow")
    @js.native
    open class Arrow ()
      extends typingsJapgolly.konva.libShapesArrowMod.Arrow
    @JSImport("konva/lib/_FullInternals", "Konva.Arrow")
    @js.native
    def Arrow: Instantiable0[typingsJapgolly.konva.libShapesArrowMod.Arrow] = js.native
    inline def Arrow_=(x: Instantiable0[typingsJapgolly.konva.libShapesArrowMod.Arrow]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Arrow")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Canvas")
    @js.native
    open class Canvas protected ()
      extends typingsJapgolly.konva.libCanvasMod.Canvas {
      def this(config: ICanvasConfig) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Canvas")
    @js.native
    def Canvas: Instantiable1[/* config */ ICanvasConfig, typingsJapgolly.konva.libCanvasMod.Canvas] = js.native
    inline def Canvas_=(x: Instantiable1[/* config */ ICanvasConfig, typingsJapgolly.konva.libCanvasMod.Canvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Canvas")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Circle")
    @js.native
    open class Circle ()
      extends typingsJapgolly.konva.libShapesCircleMod.Circle
    @JSImport("konva/lib/_FullInternals", "Konva.Circle")
    @js.native
    def Circle: Instantiable0[typingsJapgolly.konva.libShapesCircleMod.Circle] = js.native
    inline def Circle_=(x: Instantiable0[typingsJapgolly.konva.libShapesCircleMod.Circle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Container")
    @js.native
    open class Container[ChildType /* <: typingsJapgolly.konva.libNodeMod.Node[NodeConfig] */] ()
      extends typingsJapgolly.konva.libContainerMod.Container[ChildType]
    @JSImport("konva/lib/_FullInternals", "Konva.Container")
    @js.native
    def Container: Instantiable0[
        typingsJapgolly.konva.libContainerMod.Container[typingsJapgolly.konva.libNodeMod.Node[NodeConfig]]
      ] = js.native
    inline def Container_=(
      x: Instantiable0[
          typingsJapgolly.konva.libContainerMod.Container[typingsJapgolly.konva.libNodeMod.Node[NodeConfig]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Context")
    @js.native
    open class Context protected ()
      extends typingsJapgolly.konva.libContextMod.Context {
      def this(canvas: typingsJapgolly.konva.libCanvasMod.Canvas) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Context")
    @js.native
    def Context: Instantiable1[
        /* canvas */ typingsJapgolly.konva.libCanvasMod.Canvas, 
        typingsJapgolly.konva.libContextMod.Context
      ] = js.native
    inline def Context_=(
      x: Instantiable1[
          /* canvas */ typingsJapgolly.konva.libCanvasMod.Canvas, 
          typingsJapgolly.konva.libContextMod.Context
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.DD")
    @js.native
    def DD: Drag = js.native
    inline def DD_=(x: Drag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DD")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.Easings")
    @js.native
    def Easings: BackEaseIn = js.native
    inline def Easings_=(x: BackEaseIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Easings")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Ellipse")
    @js.native
    open class Ellipse ()
      extends typingsJapgolly.konva.libShapesEllipseMod.Ellipse
    @JSImport("konva/lib/_FullInternals", "Konva.Ellipse")
    @js.native
    def Ellipse: Instantiable0[typingsJapgolly.konva.libShapesEllipseMod.Ellipse] = js.native
    inline def Ellipse_=(x: Instantiable0[typingsJapgolly.konva.libShapesEllipseMod.Ellipse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.FastLayer")
    @js.native
    open class FastLayer protected ()
      extends typingsJapgolly.konva.libFastLayerMod.FastLayer {
      def this(attrs: Any) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.FastLayer")
    @js.native
    def FastLayer: Instantiable1[/* attrs */ Any, typingsJapgolly.konva.libFastLayerMod.FastLayer] = js.native
    inline def FastLayer_=(x: Instantiable1[/* attrs */ Any, typingsJapgolly.konva.libFastLayerMod.FastLayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FastLayer")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.Filters")
    @js.native
    def Filters: Blur = js.native
    inline def Filters_=(x: Blur): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Filters")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Group")
    @js.native
    open class Group ()
      extends typingsJapgolly.konva.libGroupMod.Group
    @JSImport("konva/lib/_FullInternals", "Konva.Group")
    @js.native
    def Group: Instantiable0[typingsJapgolly.konva.libGroupMod.Group] = js.native
    inline def Group_=(x: Instantiable0[typingsJapgolly.konva.libGroupMod.Group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Image")
    @js.native
    open class Image protected ()
      extends typingsJapgolly.konva.libShapesImageMod.Image {
      def this(attrs: ImageConfig) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Image")
    @js.native
    def Image: TypeofImage = js.native
    inline def Image_=(x: TypeofImage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Label")
    @js.native
    open class Label ()
      extends typingsJapgolly.konva.libShapesLabelMod.Label {
      def this(config: Any) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Label")
    @js.native
    def Label: Instantiable1[/* config */ js.UndefOr[Any], typingsJapgolly.konva.libShapesLabelMod.Label] = js.native
    inline def Label_=(x: Instantiable1[/* config */ js.UndefOr[Any], typingsJapgolly.konva.libShapesLabelMod.Label]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Layer")
    @js.native
    open class Layer ()
      extends typingsJapgolly.konva.libLayerMod.Layer {
      def this(config: LayerConfig) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Layer")
    @js.native
    def Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typingsJapgolly.konva.libLayerMod.Layer] = js.native
    inline def Layer_=(x: Instantiable1[/* config */ js.UndefOr[LayerConfig], typingsJapgolly.konva.libLayerMod.Layer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Line")
    @js.native
    open class Line[Config /* <: LineConfig */] ()
      extends typingsJapgolly.konva.libShapesLineMod.Line[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Line")
    @js.native
    def Line: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
        typingsJapgolly.konva.libShapesLineMod.Line[LineConfig]
      ] = js.native
    inline def Line_=(
      x: Instantiable1[
          /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
          typingsJapgolly.konva.libShapesLineMod.Line[LineConfig]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Node")
    @js.native
    open class Node[Config /* <: NodeConfig */] ()
      extends typingsJapgolly.konva.libNodeMod.Node[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Node")
    @js.native
    def Node: TypeofNode = js.native
    inline def Node_=(x: TypeofNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Path")
    @js.native
    open class Path ()
      extends typingsJapgolly.konva.libShapesPathMod.Path {
      def this(config: PathConfig) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Path")
    @js.native
    def Path: TypeofPath = js.native
    inline def Path_=(x: TypeofPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Rect")
    @js.native
    open class Rect ()
      extends typingsJapgolly.konva.libShapesRectMod.Rect
    @JSImport("konva/lib/_FullInternals", "Konva.Rect")
    @js.native
    def Rect: Instantiable0[typingsJapgolly.konva.libShapesRectMod.Rect] = js.native
    inline def Rect_=(x: Instantiable0[typingsJapgolly.konva.libShapesRectMod.Rect]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rect")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.RegularPolygon")
    @js.native
    open class RegularPolygon ()
      extends typingsJapgolly.konva.libShapesRegularPolygonMod.RegularPolygon
    @JSImport("konva/lib/_FullInternals", "Konva.RegularPolygon")
    @js.native
    def RegularPolygon: Instantiable0[typingsJapgolly.konva.libShapesRegularPolygonMod.RegularPolygon] = js.native
    inline def RegularPolygon_=(x: Instantiable0[typingsJapgolly.konva.libShapesRegularPolygonMod.RegularPolygon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegularPolygon")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Ring")
    @js.native
    open class Ring ()
      extends typingsJapgolly.konva.libShapesRingMod.Ring
    @JSImport("konva/lib/_FullInternals", "Konva.Ring")
    @js.native
    def Ring: Instantiable0[typingsJapgolly.konva.libShapesRingMod.Ring] = js.native
    inline def Ring_=(x: Instantiable0[typingsJapgolly.konva.libShapesRingMod.Ring]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ring")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Shape")
    @js.native
    open class Shape[Config /* <: ShapeConfig */] ()
      extends typingsJapgolly.konva.libShapeMod.Shape[Config] {
      def this(config: /* import warning: RewrittenClass.unapply cls was tparam Config */ Any) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Shape")
    @js.native
    def Shape: Instantiable1[
        /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
        typingsJapgolly.konva.libShapeMod.Shape[ShapeConfig]
      ] = js.native
    inline def Shape_=(
      x: Instantiable1[
          /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ Any], 
          typingsJapgolly.konva.libShapeMod.Shape[ShapeConfig]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Shape")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Sprite")
    @js.native
    open class Sprite protected ()
      extends typingsJapgolly.konva.libShapesSpriteMod.Sprite {
      def this(config: Any) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Sprite")
    @js.native
    def Sprite: Instantiable1[/* config */ Any, typingsJapgolly.konva.libShapesSpriteMod.Sprite] = js.native
    inline def Sprite_=(x: Instantiable1[/* config */ Any, typingsJapgolly.konva.libShapesSpriteMod.Sprite]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sprite")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Stage")
    @js.native
    open class Stage protected ()
      extends typingsJapgolly.konva.libStageMod.Stage {
      def this(config: StageConfig) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Stage")
    @js.native
    def Stage: Instantiable1[/* config */ StageConfig, typingsJapgolly.konva.libStageMod.Stage] = js.native
    inline def Stage_=(x: Instantiable1[/* config */ StageConfig, typingsJapgolly.konva.libStageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Star")
    @js.native
    open class Star ()
      extends typingsJapgolly.konva.libShapesStarMod.Star
    @JSImport("konva/lib/_FullInternals", "Konva.Star")
    @js.native
    def Star: Instantiable0[typingsJapgolly.konva.libShapesStarMod.Star] = js.native
    inline def Star_=(x: Instantiable0[typingsJapgolly.konva.libShapesStarMod.Star]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Star")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Tag")
    @js.native
    open class Tag ()
      extends typingsJapgolly.konva.libShapesLabelMod.Tag
    @JSImport("konva/lib/_FullInternals", "Konva.Tag")
    @js.native
    def Tag: Instantiable0[typingsJapgolly.konva.libShapesLabelMod.Tag] = js.native
    inline def Tag_=(x: Instantiable0[typingsJapgolly.konva.libShapesLabelMod.Tag]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tag")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Text")
    @js.native
    open class Text ()
      extends typingsJapgolly.konva.libShapesTextMod.Text {
      def this(config: TextConfig) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Text")
    @js.native
    def Text: Instantiable1[/* config */ js.UndefOr[TextConfig], typingsJapgolly.konva.libShapesTextMod.Text] = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.TextPath")
    @js.native
    open class TextPath ()
      extends typingsJapgolly.konva.libShapesTextPathMod.TextPath {
      def this(config: TextPathConfig) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.TextPath")
    @js.native
    def TextPath: Instantiable1[
        /* config */ js.UndefOr[TextPathConfig], 
        typingsJapgolly.konva.libShapesTextPathMod.TextPath
      ] = js.native
    inline def TextPath_=(
      x: Instantiable1[
          /* config */ js.UndefOr[TextPathConfig], 
          typingsJapgolly.konva.libShapesTextPathMod.TextPath
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextPath")(x.asInstanceOf[js.Any])
    
    inline def Text_=(x: Instantiable1[/* config */ js.UndefOr[TextConfig], typingsJapgolly.konva.libShapesTextMod.Text]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Transform")
    @js.native
    open class Transform ()
      extends typingsJapgolly.konva.libUtilMod.Transform {
      def this(m: js.Array[Double]) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Transform")
    @js.native
    def Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typingsJapgolly.konva.libUtilMod.Transform] = js.native
    inline def Transform_=(x: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typingsJapgolly.konva.libUtilMod.Transform]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transform")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Transformer")
    @js.native
    open class Transformer ()
      extends typingsJapgolly.konva.libShapesTransformerMod.Transformer {
      def this(config: TransformerConfig) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Transformer")
    @js.native
    def Transformer: Instantiable1[
        /* config */ js.UndefOr[TransformerConfig], 
        typingsJapgolly.konva.libShapesTransformerMod.Transformer
      ] = js.native
    inline def Transformer_=(
      x: Instantiable1[
          /* config */ js.UndefOr[TransformerConfig], 
          typingsJapgolly.konva.libShapesTransformerMod.Transformer
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Transformer")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Tween")
    @js.native
    open class Tween protected ()
      extends typingsJapgolly.konva.libTweenMod.Tween {
      def this(config: TweenConfig) = this()
    }
    @JSImport("konva/lib/_FullInternals", "Konva.Tween")
    @js.native
    def Tween: TypeofTween = js.native
    inline def Tween_=(x: TypeofTween): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tween")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.Util")
    @js.native
    def Util: Assign = js.native
    inline def Util_=(x: Assign): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Util")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("konva/lib/_FullInternals", "Konva.Wedge")
    @js.native
    open class Wedge ()
      extends typingsJapgolly.konva.libShapesWedgeMod.Wedge
    @JSImport("konva/lib/_FullInternals", "Konva.Wedge")
    @js.native
    def Wedge: Instantiable0[typingsJapgolly.konva.libShapesWedgeMod.Wedge] = js.native
    inline def Wedge_=(x: Instantiable0[typingsJapgolly.konva.libShapesWedgeMod.Wedge]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Wedge")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.angleDeg")
    @js.native
    def angleDeg: Boolean = js.native
    inline def angleDeg_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("angleDeg")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.autoDrawEnabled")
    @js.native
    def autoDrawEnabled: Boolean = js.native
    inline def autoDrawEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoDrawEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.capturePointerEventsEnabled")
    @js.native
    def capturePointerEventsEnabled: Boolean = js.native
    inline def capturePointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capturePointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.dblClickWindow")
    @js.native
    def dblClickWindow: Double = js.native
    inline def dblClickWindow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.document")
    @js.native
    def document: Any = js.native
    inline def document_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("document")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.dragButtons")
    @js.native
    def dragButtons: js.Array[Double] = js.native
    inline def dragButtons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragButtons")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.dragDistance")
    @js.native
    def dragDistance: Double = js.native
    inline def dragDistance_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDistance")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.enableTrace")
    @js.native
    def enableTrace: Boolean = js.native
    inline def enableTrace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enableTrace")(x.asInstanceOf[js.Any])
    
    inline def getAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("konva/lib/_FullInternals", "Konva._global")
    @js.native
    def global: Any = js.native
    
    inline def global_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_global")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.hitOnDragEnabled")
    @js.native
    def hitOnDragEnabled: Boolean = js.native
    inline def hitOnDragEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hitOnDragEnabled")(x.asInstanceOf[js.Any])
    
    inline def injectGlobal(Konva: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_injectGlobal")(Konva.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("konva/lib/_FullInternals", "Konva.isBrowser")
    @js.native
    def isBrowser: Boolean = js.native
    inline def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
    
    inline def isDragReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragReady")().asInstanceOf[Boolean]
    
    inline def isDragging(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isDragging")().asInstanceOf[Any]
    
    @JSImport("konva/lib/_FullInternals", "Konva.isUnminified")
    @js.native
    def isUnminified: Boolean = js.native
    inline def isUnminified_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isUnminified")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva._mouseDblClickPointerId")
    @js.native
    def mouseDblClickPointerId: Any = js.native
    
    inline def mouseDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva._mouseInDblClickWindow")
    @js.native
    def mouseInDblClickWindow: Boolean = js.native
    
    inline def mouseInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva._mouseListenClick")
    @js.native
    def mouseListenClick: Boolean = js.native
    
    inline def mouseListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mouseListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.pixelRatio")
    @js.native
    def pixelRatio: Double = js.native
    inline def pixelRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva._pointerDblClickPointerId")
    @js.native
    def pointerDblClickPointerId: Any = js.native
    
    inline def pointerDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.pointerEventsEnabled")
    @js.native
    def pointerEventsEnabled: Boolean = js.native
    inline def pointerEventsEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointerEventsEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva._pointerInDblClickWindow")
    @js.native
    def pointerInDblClickWindow: Boolean = js.native
    
    inline def pointerInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva._pointerListenClick")
    @js.native
    def pointerListenClick: Boolean = js.native
    
    inline def pointerListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pointerListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.showWarnings")
    @js.native
    def showWarnings: Boolean = js.native
    inline def showWarnings_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showWarnings")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.stages")
    @js.native
    def stages: js.Array[typingsJapgolly.konva.libStageMod.Stage] = js.native
    inline def stages_=(x: js.Array[typingsJapgolly.konva.libStageMod.Stage]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stages")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva._touchDblClickPointerId")
    @js.native
    def touchDblClickPointerId: Any = js.native
    
    inline def touchDblClickPointerId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchDblClickPointerId")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva._touchInDblClickWindow")
    @js.native
    def touchInDblClickWindow: Boolean = js.native
    
    inline def touchInDblClickWindow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchInDblClickWindow")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva._touchListenClick")
    @js.native
    def touchListenClick: Boolean = js.native
    
    inline def touchListenClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_touchListenClick")(x.asInstanceOf[js.Any])
    
    @JSImport("konva/lib/_FullInternals", "Konva.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
