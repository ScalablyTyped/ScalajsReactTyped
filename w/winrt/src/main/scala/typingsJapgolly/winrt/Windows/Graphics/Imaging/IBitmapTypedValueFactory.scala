package typingsJapgolly.winrt.Windows.Graphics.Imaging

import typingsJapgolly.winrt.Windows.Foundation.PropertyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapTypedValueFactory extends StObject {
  
  def create(value: Any, `type`: PropertyType): BitmapTypedValue
}
object IBitmapTypedValueFactory {
  
  inline def apply(create: (Any, PropertyType) => BitmapTypedValue): IBitmapTypedValueFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[IBitmapTypedValueFactory]
  }
  
  extension [Self <: IBitmapTypedValueFactory](x: Self) {
    
    inline def setCreate(value: (Any, PropertyType) => BitmapTypedValue): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
  }
}
