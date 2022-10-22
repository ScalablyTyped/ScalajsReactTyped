package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object views {
  
  trait XAbstractView
    extends StObject
       with XInterface {
    
    val Document: XDocumentView
    
    def getDocument(): XDocumentView
  }
  object XAbstractView {
    
    inline def apply(
      Document: XDocumentView,
      acquire: Callback,
      getDocument: CallbackTo[XDocumentView],
      queryInterface: `type` => Any,
      release: Callback
    ): XAbstractView = {
      val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDocument = getDocument.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XAbstractView]
    }
    
    extension [Self <: XAbstractView](x: Self) {
      
      inline def setDocument(value: XDocumentView): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
      
      inline def setGetDocument(value: CallbackTo[XDocumentView]): Self = StObject.set(x, "getDocument", value.toJsFn)
    }
  }
  
  trait XDocumentView
    extends StObject
       with XInterface {
    
    val DefaultView: XAbstractView
    
    def getDefaultView(): XAbstractView
  }
  object XDocumentView {
    
    inline def apply(
      DefaultView: XAbstractView,
      acquire: Callback,
      getDefaultView: CallbackTo[XAbstractView],
      queryInterface: `type` => Any,
      release: Callback
    ): XDocumentView = {
      val __obj = js.Dynamic.literal(DefaultView = DefaultView.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDefaultView = getDefaultView.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XDocumentView]
    }
    
    extension [Self <: XDocumentView](x: Self) {
      
      inline def setDefaultView(value: XAbstractView): Self = StObject.set(x, "DefaultView", value.asInstanceOf[js.Any])
      
      inline def setGetDefaultView(value: CallbackTo[XAbstractView]): Self = StObject.set(x, "getDefaultView", value.toJsFn)
    }
  }
}
