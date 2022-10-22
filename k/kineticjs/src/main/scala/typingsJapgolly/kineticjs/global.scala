package typingsJapgolly.kineticjs

import typingsJapgolly.kineticjs.Kinetic.CircleConfig
import typingsJapgolly.kineticjs.Kinetic.IAnimation
import typingsJapgolly.kineticjs.Kinetic.ICircle
import typingsJapgolly.kineticjs.Kinetic.ICollection
import typingsJapgolly.kineticjs.Kinetic.IContainer
import typingsJapgolly.kineticjs.Kinetic.IEllipse
import typingsJapgolly.kineticjs.Kinetic.IImage
import typingsJapgolly.kineticjs.Kinetic.ILayer
import typingsJapgolly.kineticjs.Kinetic.ILine
import typingsJapgolly.kineticjs.Kinetic.INode
import typingsJapgolly.kineticjs.Kinetic.IPath
import typingsJapgolly.kineticjs.Kinetic.IRect
import typingsJapgolly.kineticjs.Kinetic.IRegularPolygon
import typingsJapgolly.kineticjs.Kinetic.IShape
import typingsJapgolly.kineticjs.Kinetic.ISprite
import typingsJapgolly.kineticjs.Kinetic.IStage
import typingsJapgolly.kineticjs.Kinetic.IStar
import typingsJapgolly.kineticjs.Kinetic.IText
import typingsJapgolly.kineticjs.Kinetic.ITextPath
import typingsJapgolly.kineticjs.Kinetic.ImageConfig
import typingsJapgolly.kineticjs.Kinetic.LayerConfig
import typingsJapgolly.kineticjs.Kinetic.LineConfig
import typingsJapgolly.kineticjs.Kinetic.ObjectOptionsConfig
import typingsJapgolly.kineticjs.Kinetic.PathConfig
import typingsJapgolly.kineticjs.Kinetic.RectConfig
import typingsJapgolly.kineticjs.Kinetic.RegularPolygonConfig
import typingsJapgolly.kineticjs.Kinetic.SpriteConfig
import typingsJapgolly.kineticjs.Kinetic.StageConfig
import typingsJapgolly.kineticjs.Kinetic.StarConfig
import typingsJapgolly.kineticjs.Kinetic.TextConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Kinetic {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Animation")
    @js.native
    open class Animation protected ()
      extends StObject
         with IAnimation {
      def this(args: Any*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Circle")
    @js.native
    open class Circle protected ()
      extends StObject
         with ICircle {
      def this(config: CircleConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Collection")
    @js.native
    open class Collection ()
      extends StObject
         with ICollection {
      
      /* CompleteClass */
      @JSName("apply")
      override def apply(method: js.Function, `val`: Any): Any = js.native
      
      /* CompleteClass */
      override def each(func: js.Function0[Any]): Any = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Container")
    @js.native
    open class Container protected ()
      extends StObject
         with IContainer {
      def this(config: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Ellipse")
    @js.native
    open class Ellipse protected ()
      extends StObject
         with IEllipse {
      def this(config: CircleConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Group")
    @js.native
    open class Group ()
      extends StObject
         with IContainer {
      def this(config: ObjectOptionsConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Image")
    @js.native
    open class Image ()
      extends StObject
         with IImage {
      def this(config: ImageConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Layer")
    @js.native
    open class Layer ()
      extends StObject
         with ILayer {
      def this(config: LayerConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Line")
    @js.native
    open class Line protected ()
      extends StObject
         with ILine {
      def this(config: LineConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Node")
    @js.native
    open class Node protected ()
      extends StObject
         with INode {
      def this(config: ObjectOptionsConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Path")
    @js.native
    open class Path protected ()
      extends StObject
         with IPath {
      def this(config: PathConfig) = this()
    }
    object Path {
      
      @JSGlobal("Kinetic.Path")
      @js.native
      val ^ : js.Any = js.native
      
      inline def parsePathData(data: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathData")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Rect")
    @js.native
    open class Rect protected ()
      extends StObject
         with IRect {
      def this(config: RectConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.RegularPolygon")
    @js.native
    open class RegularPolygon protected ()
      extends StObject
         with IRegularPolygon {
      def this(config: RegularPolygonConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Shape")
    @js.native
    open class Shape protected ()
      extends StObject
         with IShape {
      def this(config: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Sprite")
    @js.native
    open class Sprite protected ()
      extends StObject
         with ISprite {
      def this(config: SpriteConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Stage")
    @js.native
    open class Stage protected ()
      extends StObject
         with IStage {
      def this(config: StageConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Star")
    @js.native
    open class Star protected ()
      extends StObject
         with IStar {
      def this(config: StarConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.Text")
    @js.native
    open class Text protected ()
      extends StObject
         with IText {
      def this(config: TextConfig) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Kinetic.TextPath")
    @js.native
    open class TextPath protected ()
      extends StObject
         with ITextPath {
      def this(config: Any) = this()
    }
  }
}
