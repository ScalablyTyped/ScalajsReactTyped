package typingsJapgolly.winrt.Windows.Graphics.Imaging

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapPropertiesView extends StObject {
  
  def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[BitmapPropertySet]
}
object IBitmapPropertiesView {
  
  inline def apply(getPropertiesAsync: IIterable[String] => IAsyncOperation[BitmapPropertySet]): IBitmapPropertiesView = {
    val __obj = js.Dynamic.literal(getPropertiesAsync = js.Any.fromFunction1(getPropertiesAsync))
    __obj.asInstanceOf[IBitmapPropertiesView]
  }
  
  extension [Self <: IBitmapPropertiesView](x: Self) {
    
    inline def setGetPropertiesAsync(value: IIterable[String] => IAsyncOperation[BitmapPropertySet]): Self = StObject.set(x, "getPropertiesAsync", js.Any.fromFunction1(value))
  }
}
