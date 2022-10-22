package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notification of sax document events from a {@link XFastParser} .
  * @see XFastDocumentHandler
  */
trait XFastContextHandler
  extends StObject
     with XInterface {
  
  /** receives notification of character data. */
  def characters(aChars: String): Unit
  
  /**
    * receives notification of the beginning of a known child element.
    * @param Element contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} .;  If the element has a namespace th
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes from the element.
    */
  def createFastChildContext(Element: Double, Attribs: XFastAttributeList): XFastContextHandler
  
  /**
    * receives notification of the beginning of a unknown child element .
    * @param Namespace contains the namespace url (not the prefix!) of this element.
    * @param Name contains the elements local name.
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes the element.
    */
  def createUnknownChildContext(Namespace: String, Name: String, Attribs: XFastAttributeList): XFastContextHandler
  
  /**
    * receives notification of the end of an known element.
    * @see startFastElement
    */
  def endFastElement(Element: Double): Unit
  
  /**
    * receives notification of the end of an known element.
    * @see startUnknownElement
    */
  def endUnknownElement(Namespace: String, Name: String): Unit
  
  /**
    * receives notification of the beginning of an element .
    * @param Element contains the integer token from the {@link XFastTokenHandler} registered at the {@link XFastParser} . ;  If the element has a namespace t
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes from the element.
    */
  def startFastElement(Element: Double, Attribs: XFastAttributeList): Unit
  
  /**
    * receives notification of the beginning of an unknown element .
    * @param Namespace contains the namespace url (not the prefix!) of this element.
    * @param Name contains the elements local name.
    * @param Attribs Contains a {@link XFastAttributeList} to access the attributes from the element.
    */
  def startUnknownElement(Namespace: String, Name: String, Attribs: XFastAttributeList): Unit
}
object XFastContextHandler {
  
  inline def apply(
    acquire: Callback,
    characters: String => Callback,
    createFastChildContext: (Double, XFastAttributeList) => XFastContextHandler,
    createUnknownChildContext: (String, String, XFastAttributeList) => XFastContextHandler,
    endFastElement: Double => Callback,
    endUnknownElement: (String, String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    startFastElement: (Double, XFastAttributeList) => Callback,
    startUnknownElement: (String, String, XFastAttributeList) => Callback
  ): XFastContextHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, characters = js.Any.fromFunction1((t0: String) => characters(t0).runNow()), createFastChildContext = js.Any.fromFunction2(createFastChildContext), createUnknownChildContext = js.Any.fromFunction3(createUnknownChildContext), endFastElement = js.Any.fromFunction1((t0: Double) => endFastElement(t0).runNow()), endUnknownElement = js.Any.fromFunction2((t0: String, t1: String) => (endUnknownElement(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, startFastElement = js.Any.fromFunction2((t0: Double, t1: XFastAttributeList) => (startFastElement(t0, t1)).runNow()), startUnknownElement = js.Any.fromFunction3((t0: String, t1: String, t2: XFastAttributeList) => (startUnknownElement(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XFastContextHandler]
  }
  
  extension [Self <: XFastContextHandler](x: Self) {
    
    inline def setCharacters(value: String => Callback): Self = StObject.set(x, "characters", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setCreateFastChildContext(value: (Double, XFastAttributeList) => XFastContextHandler): Self = StObject.set(x, "createFastChildContext", js.Any.fromFunction2(value))
    
    inline def setCreateUnknownChildContext(value: (String, String, XFastAttributeList) => XFastContextHandler): Self = StObject.set(x, "createUnknownChildContext", js.Any.fromFunction3(value))
    
    inline def setEndFastElement(value: Double => Callback): Self = StObject.set(x, "endFastElement", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setEndUnknownElement(value: (String, String) => Callback): Self = StObject.set(x, "endUnknownElement", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setStartFastElement(value: (Double, XFastAttributeList) => Callback): Self = StObject.set(x, "startFastElement", js.Any.fromFunction2((t0: Double, t1: XFastAttributeList) => (value(t0, t1)).runNow()))
    
    inline def setStartUnknownElement(value: (String, String, XFastAttributeList) => Callback): Self = StObject.set(x, "startUnknownElement", js.Any.fromFunction3((t0: String, t1: String, t2: XFastAttributeList) => (value(t0, t1, t2)).runNow()))
  }
}
