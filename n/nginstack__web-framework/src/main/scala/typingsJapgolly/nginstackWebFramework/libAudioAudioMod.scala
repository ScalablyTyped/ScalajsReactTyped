package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAudioAudioMod {
  
  inline def apply(process: Process): Unit = ^.asInstanceOf[js.Dynamic].apply(process.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/audio/Audio", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Audio {
    def this(process: Process) = this()
    
    /* private */ /* CompleteClass */
    var _createId: Any = js.native
    
    /* private */ /* CompleteClass */
    var _formatAudioVariable: Any = js.native
    
    /* CompleteClass */
    var autoplay: Boolean = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var loop: Boolean = js.native
    
    /* CompleteClass */
    override def play(): Unit = js.native
    
    /* CompleteClass */
    var preload: String = js.native
    
    /* CompleteClass */
    var process: typingsJapgolly.nginstackWebFramework.libProcessProcessMod.^ = js.native
    
    /* CompleteClass */
    var sources: js.Array[Any] = js.native
    
    /* CompleteClass */
    var visible: Boolean = js.native
    
    /* CompleteClass */
    override def write(): Unit = js.native
  }
  @JSImport("@nginstack/web-framework/lib/audio/Audio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Audio extends StObject {
    
    /* private */ var _createId: Any
    
    /* private */ var _formatAudioVariable: Any
    
    var autoplay: Boolean
    
    var id: String
    
    var loop: Boolean
    
    def play(): Unit
    
    var preload: String
    
    var process: typingsJapgolly.nginstackWebFramework.libProcessProcessMod.^
    
    var sources: js.Array[Any]
    
    var visible: Boolean
    
    def write(): Unit
  }
  object Audio {
    
    inline def apply(
      _createId: Any,
      _formatAudioVariable: Any,
      autoplay: Boolean,
      id: String,
      loop: Boolean,
      play: Callback,
      preload: String,
      process: typingsJapgolly.nginstackWebFramework.libProcessProcessMod.^,
      sources: js.Array[Any],
      visible: Boolean,
      write: Callback
    ): Audio = {
      val __obj = js.Dynamic.literal(_createId = _createId.asInstanceOf[js.Any], _formatAudioVariable = _formatAudioVariable.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], play = play.toJsFn, preload = preload.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], write = write.toJsFn)
      __obj.asInstanceOf[Audio]
    }
    
    extension [Self <: Audio](x: Self) {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
      
      inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: typingsJapgolly.nginstackWebFramework.libProcessProcessMod.^): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
      
      inline def setSources(value: js.Array[Any]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: Any*): Self = StObject.set(x, "sources", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Callback): Self = StObject.set(x, "write", value.toJsFn)
      
      inline def set_createId(value: Any): Self = StObject.set(x, "_createId", value.asInstanceOf[js.Any])
      
      inline def set_formatAudioVariable(value: Any): Self = StObject.set(x, "_formatAudioVariable", value.asInstanceOf[js.Any])
    }
  }
  
  type Process = typingsJapgolly.nginstackWebFramework.libProcessProcessMod.^
}
