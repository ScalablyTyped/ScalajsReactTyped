package typingsJapgolly.winrt.Windows.Graphics.Imaging

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapProperties
  extends StObject
     with IBitmapPropertiesView {
  
  def setPropertiesAsync(propertiesToSet: IIterable[IKeyValuePair[String, BitmapTypedValue]]): IAsyncAction
}
object IBitmapProperties {
  
  inline def apply(
    getPropertiesAsync: IIterable[String] => IAsyncOperation[BitmapPropertySet],
    setPropertiesAsync: IIterable[IKeyValuePair[String, BitmapTypedValue]] => IAsyncAction
  ): IBitmapProperties = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync), setPropertiesAsync = js.Any.fromFunction1(setPropertiesAsync))
    __obj.asInstanceOf[IBitmapProperties]
  }
  
  extension [Self <: IBitmapProperties](x: Self) {
    
    inline def setSetPropertiesAsync(value: IIterable[IKeyValuePair[String, BitmapTypedValue]] => IAsyncAction): Self = StObject.set(x, "setPropertiesAsync", js.Any.fromFunction1(value))
  }
}
