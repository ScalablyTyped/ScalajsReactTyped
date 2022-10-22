package typingsJapgolly.downloadjs

import org.scalajs.dom.Blob
import org.scalajs.dom.File
import org.scalajs.dom.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: String): XMLHttpRequest | Boolean = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: String, filename: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: String, filename: String, mimeType: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: String, filename: Unit, mimeType: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: js.typedarray.Uint8Array): XMLHttpRequest | Boolean = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: js.typedarray.Uint8Array, filename: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: js.typedarray.Uint8Array, filename: String, mimeType: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: js.typedarray.Uint8Array, filename: Unit, mimeType: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: Blob): XMLHttpRequest | Boolean = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: Blob, filename: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: Blob, filename: String, mimeType: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: Blob, filename: Unit, mimeType: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: File): XMLHttpRequest | Boolean = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: File, filename: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: File, filename: String, mimeType: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  inline def apply(data: File, filename: Unit, mimeType: String): XMLHttpRequest | Boolean = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest | Boolean]
  
  @JSImport("downloadjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
