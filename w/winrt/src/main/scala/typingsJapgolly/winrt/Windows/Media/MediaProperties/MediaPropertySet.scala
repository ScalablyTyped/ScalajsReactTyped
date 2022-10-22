package typingsJapgolly.winrt.Windows.Media.MediaProperties

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPropertySet
  extends StObject
     with IMap[String, Any]
object MediaPropertySet {
  
  inline def apply(
    clear: Callback,
    first: CallbackTo[IIterator[IKeyValuePair[String, Any]]],
    getView: CallbackTo[IMapView[String, Any]],
    hasKey: String => Boolean,
    insert: (String, Any) => Boolean,
    lookup: String => Any,
    remove: String => Callback,
    size: Double
  ): MediaPropertySet = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, first = first.toJsFn, getView = getView.toJsFn, hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPropertySet]
  }
}
