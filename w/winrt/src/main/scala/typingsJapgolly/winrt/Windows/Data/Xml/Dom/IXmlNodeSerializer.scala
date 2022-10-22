package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlNodeSerializer extends StObject {
  
  def getXml(): String
  
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
