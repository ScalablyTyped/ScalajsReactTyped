package typingsJapgolly.reactNativeWindows

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.close
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.error
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.message
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeWindows.SourceUri
  - typingsJapgolly.reactNativeWindows.Blob
  - js.typedarray.Int8Array
  - js.typedarray.Int16Array
  - js.typedarray.Int32Array
  - js.typedarray.Uint8Array
  - js.typedarray.Uint16Array
  - js.typedarray.Uint32Array
  - js.typedarray.Uint8ClampedArray
  - js.typedarray.Float32Array
  - js.typedarray.Float64Array
  - js.typedarray.DataView
  - js.typedarray.ArrayBuffer
  - typingsJapgolly.reactNativeWindows.FormData
  - java.lang.String
  - scala.Null
*/
type BodyInit = _BodyInit | js.typedarray.Int8Array | js.typedarray.Int16Array | js.typedarray.Int32Array | js.typedarray.Uint8Array | js.typedarray.Uint16Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array | js.typedarray.DataView | js.typedarray.ArrayBuffer | String | Null

type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]

type RequestInfo = Request | String

type WebsocketCloseEventListener = js.Function2[close, /* handler */ js.Function1[/* e */ WebSocketCloseEvent, Unit], Unit]

type WebsocketErrorEventListener = js.Function2[error, /* handler */ js.Function1[/* e */ WebSocketErrorEvent, Unit], Unit]

type WebsocketMessageEventListener = js.Function2[message, /* handler */ js.Function1[/* e */ WebSocketMessageEvent, Unit], Unit]

type WebsocketOpenEventListener = js.Function2[open, /* handler */ js.Function0[Unit], Unit]
