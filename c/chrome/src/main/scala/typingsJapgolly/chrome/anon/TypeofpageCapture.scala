package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Blob
import typingsJapgolly.chrome.chrome.pageCapture.SaveDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpageCapture extends StObject {
  
  def saveAsMHTML(details: SaveDetails, callback: js.Function1[/* mhtmlData */ js.UndefOr[Blob], Unit]): Unit
}
object TypeofpageCapture {
  
  inline def apply(saveAsMHTML: (SaveDetails, js.Function1[/* mhtmlData */ js.UndefOr[Blob], Unit]) => Callback): TypeofpageCapture = {
    val __obj = js.Dynamic.literal(saveAsMHTML = js.Any.fromFunction2((t0: SaveDetails, t1: js.Function1[/* mhtmlData */ js.UndefOr[Blob], Unit]) => (saveAsMHTML(t0, t1)).runNow()))
    __obj.asInstanceOf[TypeofpageCapture]
  }
  
  extension [Self <: TypeofpageCapture](x: Self) {
    
    inline def setSaveAsMHTML(value: (SaveDetails, js.Function1[/* mhtmlData */ js.UndefOr[Blob], Unit]) => Callback): Self = StObject.set(x, "saveAsMHTML", js.Any.fromFunction2((t0: SaveDetails, t1: js.Function1[/* mhtmlData */ js.UndefOr[Blob], Unit]) => (value(t0, t1)).runNow()))
  }
}
