package typingsJapgolly.reactDevtoolsInline.commonsMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseHookNamesModule extends StObject {
  
  var parseHookNames: ParseHookNames
  
  var parseSourceAndMetadata: ParseSourceAndMetadata
  
  def purgeCachedMetadata(): Unit
}
object ParseHookNamesModule {
  
  inline def apply(
    parseHookNames: (/* hooksTree */ js.Array[HooksNode], /* fetchFileWithCaching */ FetchFileWithCaching | Null) => js.Promise[HookNames | Null],
    parseSourceAndMetadata: (/* hooksList */ js.Array[HooksNode], /* locationKeyToHookSourceAndMetadata */ Map[String, HookSourceAndMetadata]) => js.Promise[HookNames | Null],
    purgeCachedMetadata: Callback
  ): ParseHookNamesModule = {
    val __obj = js.Dynamic.literal(parseHookNames = js.Any.fromFunction2(parseHookNames), parseSourceAndMetadata = js.Any.fromFunction2(parseSourceAndMetadata), purgeCachedMetadata = purgeCachedMetadata.toJsFn)
    __obj.asInstanceOf[ParseHookNamesModule]
  }
  
  extension [Self <: ParseHookNamesModule](x: Self) {
    
    inline def setParseHookNames(
      value: (/* hooksTree */ js.Array[HooksNode], /* fetchFileWithCaching */ FetchFileWithCaching | Null) => js.Promise[HookNames | Null]
    ): Self = StObject.set(x, "parseHookNames", js.Any.fromFunction2(value))
    
    inline def setParseSourceAndMetadata(
      value: (/* hooksList */ js.Array[HooksNode], /* locationKeyToHookSourceAndMetadata */ Map[String, HookSourceAndMetadata]) => js.Promise[HookNames | Null]
    ): Self = StObject.set(x, "parseSourceAndMetadata", js.Any.fromFunction2(value))
    
    inline def setPurgeCachedMetadata(value: Callback): Self = StObject.set(x, "purgeCachedMetadata", value.toJsFn)
  }
}
