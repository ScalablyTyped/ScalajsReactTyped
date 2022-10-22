package typingsJapgolly.mochaPhantomjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  def mochaPhantomJS(): MochaPhantomJsWindowOptions
}
object Window {
  
  inline def apply(mochaPhantomJS: CallbackTo[MochaPhantomJsWindowOptions]): Window = {
    val __obj = js.Dynamic.literal(mochaPhantomJS = mochaPhantomJS.toJsFn)
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setMochaPhantomJS(value: CallbackTo[MochaPhantomJsWindowOptions]): Self = StObject.set(x, "mochaPhantomJS", value.toJsFn)
  }
}
