package typingsJapgolly.chalkAnimation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chalk-animation", "glitch")
  @js.native
  val glitch: AnimationFn = js.native
  
  @JSImport("chalk-animation", "karaoke")
  @js.native
  val karaoke: AnimationFn = js.native
  
  @JSImport("chalk-animation", "neon")
  @js.native
  val neon: AnimationFn = js.native
  
  @JSImport("chalk-animation", "pulse")
  @js.native
  val pulse: AnimationFn = js.native
  
  @JSImport("chalk-animation", "radar")
  @js.native
  val radar: AnimationFn = js.native
  
  @JSImport("chalk-animation", "rainbow")
  @js.native
  val rainbow: AnimationFn = js.native
  
  trait Animation extends StObject {
    
    var f: Double
    
    def frame(): String
    
    var init: Boolean
    
    var lines: Double
    
    def render(): Unit
    
    def replace(text: String): Unit
    
    def start(): Unit
    
    def stop(): Unit
    
    var stopped: Boolean
    
    var text: js.Array[String]
  }
  object Animation {
    
    inline def apply(
      f: Double,
      frame: CallbackTo[String],
      init: Boolean,
      lines: Double,
      render: Callback,
      replace: String => Callback,
      start: Callback,
      stop: Callback,
      stopped: Boolean,
      text: js.Array[String]
    ): Animation = {
      val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], frame = frame.toJsFn, init = init.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], render = render.toJsFn, replace = js.Any.fromFunction1((t0: String) => replace(t0).runNow()), start = start.toJsFn, stop = stop.toJsFn, stopped = stopped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation]
    }
    
    extension [Self <: Animation](x: Self) {
      
      inline def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFrame(value: CallbackTo[String]): Self = StObject.set(x, "frame", value.toJsFn)
      
      inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
      
      inline def setReplace(value: String => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
      
      inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    }
  }
  
  type AnimationFn = js.Function2[/* text */ String, /* speed */ js.UndefOr[Double], Animation]
}
