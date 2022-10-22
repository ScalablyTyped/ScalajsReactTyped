package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface describing old style basic dialog (SI controls) in binary data
  * @deprecated Deprecated
  */
trait XStarBasicDialogInfo
  extends StObject
     with XInterface {
  
  /** returns binary data describing the SIDialog in SBX stream format */
  val Data: SafeArray[Double]
  
  /** returns the name of the dialog */
  val Name: String
  
  /** returns binary data describing the SIDialog in SBX stream format */
  def getData(): SafeArray[Double]
  
  /** returns the name of the dialog */
  def getName(): String
}
object XStarBasicDialogInfo {
  
  inline def apply(
    Data: SafeArray[Double],
    Name: String,
    acquire: Callback,
    getData: CallbackTo[SafeArray[Double]],
    getName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XStarBasicDialogInfo = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, getData = getData.toJsFn, getName = getName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStarBasicDialogInfo]
  }
  
  extension [Self <: XStarBasicDialogInfo](x: Self) {
    
    inline def setData(value: SafeArray[Double]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setGetData(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
