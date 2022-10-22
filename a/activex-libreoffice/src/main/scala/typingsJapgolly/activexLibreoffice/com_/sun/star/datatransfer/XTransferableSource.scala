package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The transferable source interface.
  * @see com.sun.star.datatransfer.XTransferable
  */
trait XTransferableSource
  extends StObject
     with XInterface {
  
  /** @returns A human presentable description of the source that created the transferable object. */
  val DataSourceDescription: String
  
  /** @returns A human presentable description of the source that created the transferable object. */
  def getDataSourceDescription(): String
}
object XTransferableSource {
  
  inline def apply(
    DataSourceDescription: String,
    acquire: Callback,
    getDataSourceDescription: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XTransferableSource = {
    val __obj = js.Dynamic.literal(DataSourceDescription = DataSourceDescription.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDataSourceDescription = getDataSourceDescription.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTransferableSource]
  }
  
  extension [Self <: XTransferableSource](x: Self) {
    
    inline def setDataSourceDescription(value: String): Self = StObject.set(x, "DataSourceDescription", value.asInstanceOf[js.Any])
    
    inline def setGetDataSourceDescription(value: CallbackTo[String]): Self = StObject.set(x, "getDataSourceDescription", value.toJsFn)
  }
}
