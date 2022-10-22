package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubject
import typingsJapgolly.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableDomWebSocketMod {
  
  @JSImport("rxjs/internal/observable/dom/webSocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def webSocket[T](urlConfigOrSource: String): WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[WebSocketSubject[T]]
  inline def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[WebSocketSubject[T]]
}
