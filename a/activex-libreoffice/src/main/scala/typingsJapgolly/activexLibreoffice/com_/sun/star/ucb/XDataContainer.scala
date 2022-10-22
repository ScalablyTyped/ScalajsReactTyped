package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a container for (binary) data.
  *
  * A data container may contain data and/or other data containers. A typical container with children is a MIME message with attachments.
  * @author Kai Sommerfeld
  * @deprecated Deprecated
  * @version 1.0
  */
trait XDataContainer
  extends StObject
     with XIndexContainer {
  
  /**
    * returns the content type (MIME Type) of the data container.
    * @returns the content type
    */
  var ContentType: String
  
  /**
    * returns the data of the data container.
    * @returns the data
    */
  var Data: SafeArray[Double]
  
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  var DataURL: String
  
  /**
    * returns the content type (MIME Type) of the data container.
    * @returns the content type
    */
  def getContentType(): String
  
  /**
    * returns the data of the data container.
    * @returns the data
    */
  def getData(): SafeArray[Double]
  
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  def getDataURL(): String
  
  /**
    * sets the content type (MIME Type) of the data container.
    * @param aType the content type
    */
  def setContentType(aType: String): Unit
  
  /**
    * sets the data of the data container.
    * @param aData the data
    */
  def setData(aData: SeqEquiv[Double]): Unit
  
  /**
    * Deprecated. Do not use!
    * @deprecated Deprecated
    */
  def setDataURL(aURL: String): Unit
}
object XDataContainer {
  
  inline def apply(
    ContentType: String,
    Count: Double,
    Data: SafeArray[Double],
    DataURL: String,
    ElementType: `type`,
    acquire: Callback,
    getByIndex: Double => Any,
    getContentType: CallbackTo[String],
    getCount: CallbackTo[Double],
    getData: CallbackTo[SafeArray[Double]],
    getDataURL: CallbackTo[String],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    insertByIndex: (Double, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByIndex: Double => Callback,
    replaceByIndex: (Double, Any) => Callback,
    setContentType: String => Callback,
    setData: SeqEquiv[Double] => Callback,
    setDataURL: String => Callback
  ): XDataContainer = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DataURL = DataURL.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getContentType = getContentType.toJsFn, getCount = getCount.toJsFn, getData = getData.toJsFn, getDataURL = getDataURL.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, insertByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (insertByIndex(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()), replaceByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIndex(t0, t1)).runNow()), setContentType = js.Any.fromFunction1((t0: String) => setContentType(t0).runNow()), setData = js.Any.fromFunction1((t0: SeqEquiv[Double]) => setData(t0).runNow()), setDataURL = js.Any.fromFunction1((t0: String) => setDataURL(t0).runNow()))
    __obj.asInstanceOf[XDataContainer]
  }
  
  extension [Self <: XDataContainer](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setData(value: SafeArray[Double]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataURL(value: String): Self = StObject.set(x, "DataURL", value.asInstanceOf[js.Any])
    
    inline def setGetContentType(value: CallbackTo[String]): Self = StObject.set(x, "getContentType", value.toJsFn)
    
    inline def setGetData(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetDataURL(value: CallbackTo[String]): Self = StObject.set(x, "getDataURL", value.toJsFn)
    
    inline def setSetContentType(value: String => Callback): Self = StObject.set(x, "setContentType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetData(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "setData", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
    
    inline def setSetDataURL(value: String => Callback): Self = StObject.set(x, "setDataURL", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
