package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubjectConfig
import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object webSocketMod {
  
  @JSImport("rxjs/webSocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/webSocket", "WebSocketSubject")
  @js.native
  open class WebSocketSubject[T] protected ()
    extends typingsJapgolly.rxjs.distTypesWebSocketMod.WebSocketSubject[T] {
    def this(urlConfigOrSource: String) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T]) = this()
    def this(urlConfigOrSource: Observable[T]) = this()
    def this(urlConfigOrSource: String, destination: Observer[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T], destination: Observer[T]) = this()
    def this(urlConfigOrSource: Observable[T], destination: Observer[T]) = this()
  }
  
  inline def webSocket[T](urlConfigOrSource: String): typingsJapgolly.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubject[T]]
  inline def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typingsJapgolly.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubject[T]]
}
