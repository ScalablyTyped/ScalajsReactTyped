package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XTitle
  extends StObject
     with XInterface {
  
  var Text: SafeArray[XFormattedString]
  
  def getText(): SafeArray[XFormattedString]
  
  def setText(Strings: SeqEquiv[XFormattedString]): Unit
}
object XTitle {
  
  inline def apply(
    Text: SafeArray[XFormattedString],
    acquire: Callback,
    getText: CallbackTo[SafeArray[XFormattedString]],
    queryInterface: `type` => Any,
    release: Callback,
    setText: SeqEquiv[XFormattedString] => Callback
  ): XTitle = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any], acquire = acquire.toJsFn, getText = getText.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setText = js.Any.fromFunction1((t0: SeqEquiv[XFormattedString]) => setText(t0).runNow()))
    __obj.asInstanceOf[XTitle]
  }
  
  extension [Self <: XTitle](x: Self) {
    
    inline def setGetText(value: CallbackTo[SafeArray[XFormattedString]]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setSetText(value: SeqEquiv[XFormattedString] => Callback): Self = StObject.set(x, "setText", js.Any.fromFunction1((t0: SeqEquiv[XFormattedString]) => value(t0).runNow()))
    
    inline def setText(value: SafeArray[XFormattedString]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
