package typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates the methods needed to serialize a DOM tree or subtree to a string representation. */
trait IXmlNodeSerializer extends StObject {
  
  /**
    * Returns the XML representation of the node and all its descendants.
    * @return The XML representation of the node and all its descendants.
    */
  def getXml(): String
  
  /** Gets and sets the text from inside the XML. */
  var innerText: String
}
object IXmlNodeSerializer {
  
  inline def apply(getXml: CallbackTo[String], innerText: String): IXmlNodeSerializer = {
    val __obj = js.Dynamic.literal(getXml = getXml.toJsFn, innerText = innerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXmlNodeSerializer]
  }
  
  extension [Self <: IXmlNodeSerializer](x: Self) {
    
    inline def setGetXml(value: CallbackTo[String]): Self = StObject.set(x, "getXml", value.toJsFn)
    
    inline def setInnerText(value: String): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
  }
}
