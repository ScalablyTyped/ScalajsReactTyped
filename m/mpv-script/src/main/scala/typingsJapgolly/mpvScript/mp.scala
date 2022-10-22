package typingsJapgolly.mpvScript

import japgolly.scalajs.react.Callback
import typingsJapgolly.mpvScript.mpvScriptStrings.down
import typingsJapgolly.mpvScript.mpvScriptStrings.press
import typingsJapgolly.mpvScript.mpvScriptStrings.repeat
import typingsJapgolly.mpvScript.mpvScriptStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mp {
  
  trait AddKeyBindingFlags extends StObject {
    
    var complex: js.UndefOr[Boolean] = js.undefined
    
    var event: js.UndefOr[down | repeat | up | press] = js.undefined
    
    var is_mouse: js.UndefOr[Boolean] = js.undefined
    
    var key_name: js.UndefOr[String] = js.undefined
    
    var key_text: js.UndefOr[String] = js.undefined
    
    var repeatable: js.UndefOr[Boolean] = js.undefined
  }
  object AddKeyBindingFlags {
    
    inline def apply(): AddKeyBindingFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddKeyBindingFlags]
    }
    
    extension [Self <: AddKeyBindingFlags](x: Self) {
      
      inline def setComplex(value: Boolean): Self = StObject.set(x, "complex", value.asInstanceOf[js.Any])
      
      inline def setComplexUndefined: Self = StObject.set(x, "complex", js.undefined)
      
      inline def setEvent(value: down | repeat | up | press): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setIs_mouse(value: Boolean): Self = StObject.set(x, "is_mouse", value.asInstanceOf[js.Any])
      
      inline def setIs_mouseUndefined: Self = StObject.set(x, "is_mouse", js.undefined)
      
      inline def setKey_name(value: String): Self = StObject.set(x, "key_name", value.asInstanceOf[js.Any])
      
      inline def setKey_nameUndefined: Self = StObject.set(x, "key_name", js.undefined)
      
      inline def setKey_text(value: String): Self = StObject.set(x, "key_text", value.asInstanceOf[js.Any])
      
      inline def setKey_textUndefined: Self = StObject.set(x, "key_text", js.undefined)
      
      inline def setRepeatable(value: Boolean): Self = StObject.set(x, "repeatable", value.asInstanceOf[js.Any])
      
      inline def setRepeatableUndefined: Self = StObject.set(x, "repeatable", js.undefined)
    }
  }
  
  trait FileInfo extends StObject {
    
    var atime: Double
    
    var ctime: Double
    
    var is_dir: Boolean
    
    var is_file: Boolean
    
    var mode: Double
    
    var mtime: Double
    
    var size: Double
  }
  object FileInfo {
    
    inline def apply(
      atime: Double,
      ctime: Double,
      is_dir: Boolean,
      is_file: Boolean,
      mode: Double,
      mtime: Double,
      size: Double
    ): FileInfo = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], is_dir = is_dir.asInstanceOf[js.Any], is_file = is_file.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    extension [Self <: FileInfo](x: Self) {
      
      inline def setAtime(value: Double): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setIs_dir(value: Boolean): Self = StObject.set(x, "is_dir", value.asInstanceOf[js.Any])
      
      inline def setIs_file(value: Boolean): Self = StObject.set(x, "is_file", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mpvScript.mpvScriptStrings.fatal
    - typingsJapgolly.mpvScript.mpvScriptStrings.error
    - typingsJapgolly.mpvScript.mpvScriptStrings.warn
    - typingsJapgolly.mpvScript.mpvScriptStrings.info
    - typingsJapgolly.mpvScript.mpvScriptStrings.v
    - typingsJapgolly.mpvScript.mpvScriptStrings.debug
    - typingsJapgolly.mpvScript.mpvScriptStrings.trace
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typingsJapgolly.mpvScript.mpvScriptStrings.debug = "debug".asInstanceOf[typingsJapgolly.mpvScript.mpvScriptStrings.debug]
    
    inline def error: typingsJapgolly.mpvScript.mpvScriptStrings.error = "error".asInstanceOf[typingsJapgolly.mpvScript.mpvScriptStrings.error]
    
    inline def fatal: typingsJapgolly.mpvScript.mpvScriptStrings.fatal = "fatal".asInstanceOf[typingsJapgolly.mpvScript.mpvScriptStrings.fatal]
    
    inline def info: typingsJapgolly.mpvScript.mpvScriptStrings.info = "info".asInstanceOf[typingsJapgolly.mpvScript.mpvScriptStrings.info]
    
    inline def trace: typingsJapgolly.mpvScript.mpvScriptStrings.trace = "trace".asInstanceOf[typingsJapgolly.mpvScript.mpvScriptStrings.trace]
    
    inline def v: typingsJapgolly.mpvScript.mpvScriptStrings.v = "v".asInstanceOf[typingsJapgolly.mpvScript.mpvScriptStrings.v]
    
    inline def warn: typingsJapgolly.mpvScript.mpvScriptStrings.warn = "warn".asInstanceOf[typingsJapgolly.mpvScript.mpvScriptStrings.warn]
  }
  
  trait OSDOverlay extends StObject {
    
    var data: String
    
    def remove(): Unit
    
    var res_x: Double
    
    var res_y: Double
    
    def update(): Unit
    
    var z: Double
  }
  object OSDOverlay {
    
    inline def apply(data: String, remove: Callback, res_x: Double, res_y: Double, update: Callback, z: Double): OSDOverlay = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remove = remove.toJsFn, res_x = res_x.asInstanceOf[js.Any], res_y = res_y.asInstanceOf[js.Any], update = update.toJsFn, z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[OSDOverlay]
    }
    
    extension [Self <: OSDOverlay](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def setRes_x(value: Double): Self = StObject.set(x, "res_x", value.asInstanceOf[js.Any])
      
      inline def setRes_y(value: Double): Self = StObject.set(x, "res_y", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  trait OSDSize extends StObject {
    
    var aspect: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object OSDSize {
    
    inline def apply(): OSDSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OSDSize]
    }
    
    extension [Self <: OSDSize](x: Self) {
      
      inline def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
