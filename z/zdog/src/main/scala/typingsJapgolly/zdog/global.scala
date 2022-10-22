package typingsJapgolly.zdog

import typingsJapgolly.zdog.mod.AnchorOptions
import typingsJapgolly.zdog.mod.BoxOptions
import typingsJapgolly.zdog.mod.ConeOptions
import typingsJapgolly.zdog.mod.CylinderOptions
import typingsJapgolly.zdog.mod.DraggerOptions
import typingsJapgolly.zdog.mod.EllipseOptions
import typingsJapgolly.zdog.mod.GroupOptions
import typingsJapgolly.zdog.mod.HemisphereOptions
import typingsJapgolly.zdog.mod.IllustrationOptions
import typingsJapgolly.zdog.mod.PolygonOptions
import typingsJapgolly.zdog.mod.RectOptions
import typingsJapgolly.zdog.mod.RoundedRectOptions
import typingsJapgolly.zdog.mod.ShapeOptions
import typingsJapgolly.zdog.mod.VectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Zdog {
    
    @JSGlobal("Zdog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Zdog.Anchor")
    @js.native
    open class Anchor ()
      extends typingsJapgolly.zdog.mod.Anchor {
      def this(options: AnchorOptions) = this()
    }
    
    @JSGlobal("Zdog.Box")
    @js.native
    open class Box ()
      extends typingsJapgolly.zdog.mod.Box {
      def this(options: BoxOptions) = this()
    }
    
    @JSGlobal("Zdog.Cone")
    @js.native
    open class Cone ()
      extends typingsJapgolly.zdog.mod.Cone {
      def this(options: ConeOptions) = this()
    }
    
    @JSGlobal("Zdog.Cylinder")
    @js.native
    open class Cylinder ()
      extends typingsJapgolly.zdog.mod.Cylinder {
      def this(options: CylinderOptions) = this()
    }
    
    @JSGlobal("Zdog.Dragger")
    @js.native
    open class Dragger ()
      extends typingsJapgolly.zdog.mod.Dragger {
      def this(options: DraggerOptions) = this()
    }
    
    @JSGlobal("Zdog.Ellipse")
    @js.native
    open class Ellipse ()
      extends typingsJapgolly.zdog.mod.Ellipse {
      def this(options: EllipseOptions) = this()
    }
    
    @JSGlobal("Zdog.Group")
    @js.native
    open class Group ()
      extends typingsJapgolly.zdog.mod.Group {
      def this(options: GroupOptions) = this()
    }
    
    @JSGlobal("Zdog.Hemisphere")
    @js.native
    open class Hemisphere ()
      extends typingsJapgolly.zdog.mod.Hemisphere {
      def this(options: HemisphereOptions) = this()
    }
    
    @JSGlobal("Zdog.Illustration")
    @js.native
    open class Illustration protected ()
      extends typingsJapgolly.zdog.mod.Illustration {
      def this(options: IllustrationOptions) = this()
    }
    
    @JSGlobal("Zdog.Polygon")
    @js.native
    open class Polygon ()
      extends typingsJapgolly.zdog.mod.Polygon {
      def this(options: PolygonOptions) = this()
    }
    
    @JSGlobal("Zdog.Rect")
    @js.native
    open class Rect ()
      extends typingsJapgolly.zdog.mod.Rect {
      def this(options: RectOptions) = this()
    }
    
    @JSGlobal("Zdog.RoundedRect")
    @js.native
    open class RoundedRect ()
      extends typingsJapgolly.zdog.mod.RoundedRect {
      def this(options: RoundedRectOptions) = this()
    }
    
    @JSGlobal("Zdog.Shape")
    @js.native
    open class Shape ()
      extends typingsJapgolly.zdog.mod.Shape {
      def this(options: ShapeOptions) = this()
    }
    
    @JSGlobal("Zdog.TAU")
    @js.native
    val TAU: Double = js.native
    
    @JSGlobal("Zdog.Vector")
    @js.native
    open class Vector ()
      extends typingsJapgolly.zdog.mod.Vector {
      def this(position: VectorOptions) = this()
    }
    
    inline def easeInOut(alpha: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(alpha.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def easeInOut(alpha: Double, power: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("easeInOut")(alpha.asInstanceOf[js.Any], power.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def extend[T](a: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def extend[T](a: T, b: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def lerp(a: Double, b: Double, alpha: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def modulo(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("modulo")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
