package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qa {
  
  /** Dumps the content into a string. This is an internal interface and should not be used outside of Libreoffice source code */
  trait XDumper
    extends StObject
       with XInterface {
    
    /**
      * dump the content into a string
      * @since LibreOffice 3.6
      */
    def dump(): String
  }
  object XDumper {
    
    inline def apply(acquire: Callback, dump: CallbackTo[String], queryInterface: `type` => Any, release: Callback): XDumper = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, dump = dump.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XDumper]
    }
    
    extension [Self <: XDumper](x: Self) {
      
      inline def setDump(value: CallbackTo[String]): Self = StObject.set(x, "dump", value.toJsFn)
    }
  }
}
