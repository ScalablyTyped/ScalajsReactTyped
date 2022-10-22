package typingsJapgolly.nodeTimecodes

import typingsJapgolly.nodeTimecodes.anon.Framerate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-timecodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("node-timecodes", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-timecodes", "default.constants")
    @js.native
    def constants: Framerate = js.native
    inline def constants_=(x: Framerate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constants")(x.asInstanceOf[js.Any])
    
    @JSImport("node-timecodes", "default.fromSeconds")
    @js.native
    def fromSeconds: js.Function2[/* seconds */ Double, /* option */ js.UndefOr[TimecodeOptions], String] = js.native
    inline def fromSeconds(seconds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def fromSeconds(seconds: Double, option: TimecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def fromSeconds_=(x: js.Function2[/* seconds */ Double, /* option */ js.UndefOr[TimecodeOptions], String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromSeconds")(x.asInstanceOf[js.Any])
    
    @JSImport("node-timecodes", "default.toSeconds")
    @js.native
    def toSeconds: js.Function2[/* timecode */ String, /* frameRate */ js.UndefOr[Double], Double] = js.native
    inline def toSeconds(timecode: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(timecode.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def toSeconds(timecode: String, frameRate: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(timecode.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def toSeconds_=(x: js.Function2[/* timecode */ String, /* frameRate */ js.UndefOr[Double], Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toSeconds")(x.asInstanceOf[js.Any])
  }
  
  object constants {
    
    @JSImport("node-timecodes", "constants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-timecodes", "constants.framerate")
    @js.native
    def framerate: Double = js.native
    inline def framerate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("framerate")(x.asInstanceOf[js.Any])
  }
  
  inline def fromSeconds(seconds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromSeconds(seconds: Double, option: TimecodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSeconds")(seconds.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toSeconds(timecode: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(timecode.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def toSeconds(timecode: String, frameRate: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toSeconds")(timecode.asInstanceOf[js.Any], frameRate.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait TimecodeOptions extends StObject {
    
    var frameRate: js.UndefOr[Double] = js.undefined
    
    var ms: js.UndefOr[Boolean] = js.undefined
  }
  object TimecodeOptions {
    
    inline def apply(): TimecodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimecodeOptions]
    }
    
    extension [Self <: TimecodeOptions](x: Self) {
      
      inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
      
      inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
      
      inline def setMs(value: Boolean): Self = StObject.set(x, "ms", value.asInstanceOf[js.Any])
      
      inline def setMsUndefined: Self = StObject.set(x, "ms", js.undefined)
    }
  }
}
