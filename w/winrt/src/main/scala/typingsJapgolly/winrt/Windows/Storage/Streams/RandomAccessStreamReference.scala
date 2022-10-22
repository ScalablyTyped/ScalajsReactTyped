package typingsJapgolly.winrt.Windows.Storage.Streams

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RandomAccessStreamReference
  extends StObject
     with IRandomAccessStreamReference
object RandomAccessStreamReference {
  
  inline def apply(openReadAsync: CallbackTo[IAsyncOperation[IRandomAccessStreamWithContentType]]): RandomAccessStreamReference = {
    val __obj = js.Dynamic.literal(openReadAsync = openReadAsync.toJsFn)
    __obj.asInstanceOf[RandomAccessStreamReference]
  }
}
