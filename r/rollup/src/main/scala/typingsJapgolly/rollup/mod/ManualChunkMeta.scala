package typingsJapgolly.rollup.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualChunkMeta extends StObject {
  
  def getModuleIds(): IterableIterator[String]
  
  def getModuleInfo(moduleId: String): ModuleInfo | Null
  @JSName("getModuleInfo")
  var getModuleInfo_Original: GetModuleInfo
}
object ManualChunkMeta {
  
  inline def apply(
    getModuleIds: CallbackTo[IterableIterator[String]],
    getModuleInfo: /* moduleId */ String => ModuleInfo | Null
  ): ManualChunkMeta = {
    val __obj = js.Dynamic.literal(getModuleIds = getModuleIds.toJsFn, getModuleInfo = js.Any.fromFunction1(getModuleInfo))
    __obj.asInstanceOf[ManualChunkMeta]
  }
  
  extension [Self <: ManualChunkMeta](x: Self) {
    
    inline def setGetModuleIds(value: CallbackTo[IterableIterator[String]]): Self = StObject.set(x, "getModuleIds", value.toJsFn)
    
    inline def setGetModuleInfo(value: /* moduleId */ String => ModuleInfo | Null): Self = StObject.set(x, "getModuleInfo", js.Any.fromFunction1(value))
  }
}
