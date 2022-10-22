package typingsJapgolly.babelCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginPass
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var cwd: String
  
  var file: BabelFile
  
  var filename: js.UndefOr[String] = js.undefined
  
  def get(key: Any): Any
  
  var key: String
  
  var opts: js.Object
  
  def set(key: Any, value: Any): Unit
}
object PluginPass {
  
  inline def apply(
    cwd: String,
    file: BabelFile,
    get: Any => Any,
    key: String,
    opts: js.Object,
    set: (Any, Any) => Callback
  ): PluginPass = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], set = js.Any.fromFunction2((t0: Any, t1: Any) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[PluginPass]
  }
  
  extension [Self <: PluginPass](x: Self) {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setFile(value: BabelFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOpts(value: js.Object): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (Any, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
  }
}
