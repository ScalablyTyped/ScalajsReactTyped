package typingsJapgolly.activexMsxml2.MSXML2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SAX Attributes 6.0 */
trait SAXAttributes60 extends StObject {
  
  /* private */ @JSName("MSXML2.SAXAttributes60_typekey")
  var MSXML2DotSAXAttributes60_typekey: SAXAttributes60
  
  /** Add an attribute to the end of the list. */
  def addAttribute(strURI: String, strLocalName: String, strQName: String, strType: String, strValue: String): Unit
  
  /** Add an attribute, whose value is equal to the indexed attribute in the input attributes object, to the end of the list. */
  def addAttributeFromIndex(varAtts: Any, nIndex: Double): Unit
  
  /** Clear the attribute list for reuse. */
  def clear(): Unit
  
  /** Remove an attribute from the list. */
  def removeAttribute(nIndex: Double): Unit
  
  /** Set an attribute in the list. */
  def setAttribute(
    nIndex: Double,
    strURI: String,
    strLocalName: String,
    strQName: String,
    strType: String,
    strValue: String
  ): Unit
  
  /** Copy an entire Attributes object. */
  def setAttributes(varAtts: Any): Unit
  
  /** Set the local name of a specific attribute. */
  def setLocalName(nIndex: Double, strLocalName: String): Unit
  
  /** Set the qualified name of a specific attribute. */
  def setQName(nIndex: Double, strQName: String): Unit
  
  /** Set the type of a specific attribute. */
  def setType(nIndex: Double, strType: String): Unit
  
  /** Set the Namespace URI of a specific attribute. */
  def setURI(nIndex: Double, strURI: String): Unit
  
  /** Set the value of a specific attribute. */
  def setValue(nIndex: Double, strValue: String): Unit
}
object SAXAttributes60 {
  
  inline def apply(
    MSXML2DotSAXAttributes60_typekey: SAXAttributes60,
    addAttribute: (String, String, String, String, String) => Callback,
    addAttributeFromIndex: (Any, Double) => Callback,
    clear: Callback,
    removeAttribute: Double => Callback,
    setAttribute: (Double, String, String, String, String, String) => Callback,
    setAttributes: Any => Callback,
    setLocalName: (Double, String) => Callback,
    setQName: (Double, String) => Callback,
    setType: (Double, String) => Callback,
    setURI: (Double, String) => Callback,
    setValue: (Double, String) => Callback
  ): SAXAttributes60 = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: String) => (addAttribute(t0, t1, t2, t3, t4)).runNow()), addAttributeFromIndex = js.Any.fromFunction2((t0: Any, t1: Double) => (addAttributeFromIndex(t0, t1)).runNow()), clear = clear.toJsFn, removeAttribute = js.Any.fromFunction1((t0: Double) => removeAttribute(t0).runNow()), setAttribute = js.Any.fromFunction6((t0: Double, t1: String, t2: String, t3: String, t4: String, t5: String) => (setAttribute(t0, t1, t2, t3, t4, t5)).runNow()), setAttributes = js.Any.fromFunction1((t0: Any) => setAttributes(t0).runNow()), setLocalName = js.Any.fromFunction2((t0: Double, t1: String) => (setLocalName(t0, t1)).runNow()), setQName = js.Any.fromFunction2((t0: Double, t1: String) => (setQName(t0, t1)).runNow()), setType = js.Any.fromFunction2((t0: Double, t1: String) => (setType(t0, t1)).runNow()), setURI = js.Any.fromFunction2((t0: Double, t1: String) => (setURI(t0, t1)).runNow()), setValue = js.Any.fromFunction2((t0: Double, t1: String) => (setValue(t0, t1)).runNow()))
    __obj.updateDynamic("MSXML2.SAXAttributes60_typekey")(MSXML2DotSAXAttributes60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAXAttributes60]
  }
  
  extension [Self <: SAXAttributes60](x: Self) {
    
    inline def setAddAttribute(value: (String, String, String, String, String) => Callback): Self = StObject.set(x, "addAttribute", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setAddAttributeFromIndex(value: (Any, Double) => Callback): Self = StObject.set(x, "addAttributeFromIndex", js.Any.fromFunction2((t0: Any, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setMSXML2DotSAXAttributes60_typekey(value: SAXAttributes60): Self = StObject.set(x, "MSXML2.SAXAttributes60_typekey", value.asInstanceOf[js.Any])
    
    inline def setRemoveAttribute(value: Double => Callback): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetAttribute(value: (Double, String, String, String, String, String) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction6((t0: Double, t1: String, t2: String, t3: String, t4: String, t5: String) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setSetAttributes(value: Any => Callback): Self = StObject.set(x, "setAttributes", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetLocalName(value: (Double, String) => Callback): Self = StObject.set(x, "setLocalName", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetQName(value: (Double, String) => Callback): Self = StObject.set(x, "setQName", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetType(value: (Double, String) => Callback): Self = StObject.set(x, "setType", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetURI(value: (Double, String) => Callback): Self = StObject.set(x, "setURI", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetValue(value: (Double, String) => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
  }
}
