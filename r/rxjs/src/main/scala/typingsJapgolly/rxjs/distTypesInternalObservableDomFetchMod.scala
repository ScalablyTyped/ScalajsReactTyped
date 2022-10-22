package typingsJapgolly.rxjs

import org.scalajs.dom.Request
import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import typingsJapgolly.rxjs.anon.Selector
import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableDomFetchMod {
  
  @JSImport("rxjs/dist/types/internal/observable/dom/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromFetch(input: String): Observable[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[Response]]
  inline def fromFetch(input: String, init: RequestInit): Observable[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Observable[Response]]
  inline def fromFetch(input: Request): Observable[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[Response]]
  inline def fromFetch(input: Request, init: RequestInit): Observable[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Observable[Response]]
  
  inline def fromFetch_T[T](input: String, init: RequestInit & Selector[T]): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromFetch_T[T](input: Request, init: RequestInit & Selector[T]): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
