package typingsJapgolly.winrt.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStorageFolder2 extends StObject {
  
  def tryGetItemAsync(name: String): IAsyncOperation[IStorageItem]
}
object IStorageFolder2 {
  
  inline def apply(tryGetItemAsync: String => IAsyncOperation[IStorageItem]): IStorageFolder2 = {
    val __obj = js.Dynamic.literal(tryGetItemAsync = js.Any.fromFunction1(tryGetItemAsync))
    __obj.asInstanceOf[IStorageFolder2]
  }
  
  extension [Self <: IStorageFolder2](x: Self) {
    
    inline def setTryGetItemAsync(value: String => IAsyncOperation[IStorageItem]): Self = StObject.set(x, "tryGetItemAsync", js.Any.fromFunction1(value))
  }
}
