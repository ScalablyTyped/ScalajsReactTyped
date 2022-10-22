package typingsJapgolly.winrt.Windows.Graphics.Imaging

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitmapPropertySet
  extends StObject
     with IMap[String, BitmapTypedValue]
object BitmapPropertySet {
  
  inline def apply(
    clear: Callback,
    first: CallbackTo[IIterator[IKeyValuePair[String, BitmapTypedValue]]],
    getView: CallbackTo[IMapView[String, BitmapTypedValue]],
    hasKey: String => Boolean,
    insert: (String, BitmapTypedValue) => Boolean,
    lookup: String => BitmapTypedValue,
    remove: String => Callback,
    size: Double
  ): BitmapPropertySet = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, first = first.toJsFn, getView = getView.toJsFn, hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapPropertySet]
  }
}
