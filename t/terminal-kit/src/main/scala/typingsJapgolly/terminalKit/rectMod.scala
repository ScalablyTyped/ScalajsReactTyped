package typingsJapgolly.terminalKit

import japgolly.scalajs.react.Callback
import typingsJapgolly.terminalKit.anon.DstRect
import typingsJapgolly.terminalKit.terminalMod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectMod {
  
  @JSImport("terminal-kit/Rect", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Rect {
    def this(options: AbsoluteOptions) = this()
    def this(options: Rect) = this()
    def this(options: Region) = this()
    def this(options: typingsJapgolly.terminalKit.screenBufferMod.^) = this()
    def this(options: Terminal) = this()
    def this(options: typingsJapgolly.terminalKit.textBufferMod.^) = this()
    def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
    
    /* CompleteClass */
    override def clip(dstRect: Rect, offsetX: Double, offsetY: Double, dstClipping: Boolean): Unit = js.native
    
    /* CompleteClass */
    override val height: Double = js.native
    
    /* CompleteClass */
    override val isNull: Boolean = js.native
    
    /* CompleteClass */
    override def set(obj: Region): Unit = js.native
    
    /* CompleteClass */
    override val width: Double = js.native
    
    /* CompleteClass */
    override val xmax: Double = js.native
    
    /* CompleteClass */
    override val xmin: Double = js.native
    
    /* CompleteClass */
    override val ymax: Double = js.native
    
    /* CompleteClass */
    override val ymin: Double = js.native
  }
  @JSImport("terminal-kit/Rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def wrappingRect(params: DstRect): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wrappingRect")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait AbsoluteOptions
    extends StObject
       with Options {
    
    var height: Double
    
    var width: Double
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object AbsoluteOptions {
    
    inline def apply(height: Double, width: Double): AbsoluteOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbsoluteOptions]
    }
    
    extension [Self <: AbsoluteOptions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.terminalKit.rectMod.AbsoluteOptions
    - typingsJapgolly.terminalKit.rectMod.Region
  */
  trait Options extends StObject
  object Options {
    
    inline def AbsoluteOptions(height: Double, width: Double): typingsJapgolly.terminalKit.rectMod.AbsoluteOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.terminalKit.rectMod.AbsoluteOptions]
    }
    
    inline def Region(xmax: Double, xmin: Double, ymax: Double, ymin: Double): typingsJapgolly.terminalKit.rectMod.Region = {
      val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.terminalKit.rectMod.Region]
    }
  }
  
  trait Rect extends StObject {
    
    def clip(dstRect: Rect, offsetX: Double, offsetY: Double, dstClipping: Boolean): Unit
    
    val height: Double
    
    val isNull: Boolean
    
    def set(obj: Region): Unit
    
    val width: Double
    
    val xmax: Double
    
    val xmin: Double
    
    val ymax: Double
    
    val ymin: Double
  }
  object Rect {
    
    inline def apply(
      clip: (Rect, Double, Double, Boolean) => Callback,
      height: Double,
      isNull: Boolean,
      set: Region => Callback,
      width: Double,
      xmax: Double,
      xmin: Double,
      ymax: Double,
      ymin: Double
    ): Rect = {
      val __obj = js.Dynamic.literal(clip = js.Any.fromFunction4((t0: Rect, t1: Double, t2: Double, t3: Boolean) => (clip(t0, t1, t2, t3)).runNow()), height = height.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any], set = js.Any.fromFunction1((t0: Region) => set(t0).runNow()), width = width.asInstanceOf[js.Any], xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setClip(value: (Rect, Double, Double, Boolean) => Callback): Self = StObject.set(x, "clip", js.Any.fromFunction4((t0: Rect, t1: Double, t2: Double, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsNull(value: Boolean): Self = StObject.set(x, "isNull", value.asInstanceOf[js.Any])
      
      inline def setSet(value: Region => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Region) => value(t0).runNow()))
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
      
      inline def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
      
      inline def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
      
      inline def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Region
    extends StObject
       with Options {
    
    var xmax: Double
    
    var xmin: Double
    
    var ymax: Double
    
    var ymin: Double
  }
  object Region {
    
    inline def apply(xmax: Double, xmin: Double, ymax: Double, ymin: Double): Region = {
      val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region]
    }
    
    extension [Self <: Region](x: Self) {
      
      inline def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
      
      inline def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
      
      inline def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
      
      inline def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
    }
  }
}
