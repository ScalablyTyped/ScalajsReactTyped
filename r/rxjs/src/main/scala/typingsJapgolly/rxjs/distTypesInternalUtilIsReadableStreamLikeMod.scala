package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalTypesMod.ReadableStreamLike
import typingsJapgolly.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalUtilIsReadableStreamLikeMod {
  
  @JSImport("rxjs/dist/types/internal/util/isReadableStreamLike", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isReadableStreamLike[T](obj: Any): /* is rxjs.rxjs/dist/types/internal/types.ReadableStreamLike<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadableStreamLike")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs/dist/types/internal/types.ReadableStreamLike<T> */ Boolean]
  
  inline def readableStreamLikeToAsyncGenerator[T](readableStream: ReadableStreamLike[T]): AsyncGenerator[T, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readableStreamLikeToAsyncGenerator")(readableStream.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[T, Any, Any]]
}
