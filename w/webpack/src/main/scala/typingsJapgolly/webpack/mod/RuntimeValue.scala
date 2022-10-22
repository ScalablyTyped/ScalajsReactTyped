package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import typingsJapgolly.webpack.anon.Key
import typingsJapgolly.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeValue extends StObject {
  
  def exec(parser: JavascriptParser, valueCacheVersions: Map[String, String | Set[String]], key: String): CodeValuePrimitive
  
  val fileDependencies: js.UndefOr[`true` | js.Array[String]] = js.undefined
  
  def fn(arg0: Key): CodeValuePrimitive
  
  def getCacheVersion(): js.UndefOr[String]
  
  var options: `true` | RuntimeValueOptions
}
object RuntimeValue {
  
  inline def apply(
    exec: (JavascriptParser, Map[String, String | Set[String]], String) => CodeValuePrimitive,
    fn: Key => CodeValuePrimitive,
    getCacheVersion: CallbackTo[js.UndefOr[String]],
    options: `true` | RuntimeValueOptions
  ): RuntimeValue = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction3(exec), fn = js.Any.fromFunction1(fn), getCacheVersion = getCacheVersion.toJsFn, options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeValue]
  }
  
  extension [Self <: RuntimeValue](x: Self) {
    
    inline def setExec(value: (JavascriptParser, Map[String, String | Set[String]], String) => CodeValuePrimitive): Self = StObject.set(x, "exec", js.Any.fromFunction3(value))
    
    inline def setFileDependencies(value: `true` | js.Array[String]): Self = StObject.set(x, "fileDependencies", value.asInstanceOf[js.Any])
    
    inline def setFileDependenciesUndefined: Self = StObject.set(x, "fileDependencies", js.undefined)
    
    inline def setFileDependenciesVarargs(value: String*): Self = StObject.set(x, "fileDependencies", js.Array(value*))
    
    inline def setFn(value: Key => CodeValuePrimitive): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
    
    inline def setGetCacheVersion(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getCacheVersion", value.toJsFn)
    
    inline def setOptions(value: `true` | RuntimeValueOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
