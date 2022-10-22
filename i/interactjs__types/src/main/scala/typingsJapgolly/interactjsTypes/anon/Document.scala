package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreScopeMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document[T /* <: typingsJapgolly.interactjsTypes.coreTypesMod.Target */] extends StObject {
  
  var document: js.UndefOr[org.scalajs.dom.Document] = js.undefined
  
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  
  var rect: js.UndefOr[typingsJapgolly.interactjsTypes.coreTypesMod.Rect] = js.undefined
  
  var target: js.UndefOr[T] = js.undefined
}
object Document {
  
  inline def apply[T /* <: typingsJapgolly.interactjsTypes.coreTypesMod.Target */](): Document[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Document[T]]
  }
  
  extension [Self <: Document[?], T /* <: typingsJapgolly.interactjsTypes.coreTypesMod.Target */](x: Self & Document[T]) {
    
    inline def setDocument(value: org.scalajs.dom.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setRect(value: typingsJapgolly.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    inline def setTarget(value: T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
