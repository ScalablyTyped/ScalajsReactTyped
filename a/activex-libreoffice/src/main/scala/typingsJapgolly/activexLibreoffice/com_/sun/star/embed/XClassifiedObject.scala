package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents common functionality for embedded objects */
trait XClassifiedObject
  extends StObject
     with XInterface {
  
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  val ClassID: SafeArray[Double]
  
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  val ClassName: String
  
  /**
    * retrieves class ID of the object.
    * @returns unique class ID of the object
    */
  def getClassID(): SafeArray[Double]
  
  /**
    * retrieves symbolic name for the object type to be used in UI.
    * @returns the symbolic name for the object
    */
  def getClassName(): String
  
  /**
    * sets the class ID and symbolic name to an object.
    * @param aClassID the new class ID
    * @param sClassName the new symbolic name
    * @throws com::sun::star::lang::NoSupportException in case changing of class information is not allowed
    */
  def setClassInfo(aClassID: SeqEquiv[Double], sClassName: String): Unit
}
object XClassifiedObject {
  
  inline def apply(
    ClassID: SafeArray[Double],
    ClassName: String,
    acquire: Callback,
    getClassID: CallbackTo[SafeArray[Double]],
    getClassName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setClassInfo: (SeqEquiv[Double], String) => Callback
  ): XClassifiedObject = {
    val __obj = js.Dynamic.literal(ClassID = ClassID.asInstanceOf[js.Any], ClassName = ClassName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getClassID = getClassID.toJsFn, getClassName = getClassName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setClassInfo = js.Any.fromFunction2((t0: SeqEquiv[Double], t1: String) => (setClassInfo(t0, t1)).runNow()))
    __obj.asInstanceOf[XClassifiedObject]
  }
  
  extension [Self <: XClassifiedObject](x: Self) {
    
    inline def setClassID(value: SafeArray[Double]): Self = StObject.set(x, "ClassID", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "ClassName", value.asInstanceOf[js.Any])
    
    inline def setGetClassID(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getClassID", value.toJsFn)
    
    inline def setGetClassName(value: CallbackTo[String]): Self = StObject.set(x, "getClassName", value.toJsFn)
    
    inline def setSetClassInfo(value: (SeqEquiv[Double], String) => Callback): Self = StObject.set(x, "setClassInfo", js.Any.fromFunction2((t0: SeqEquiv[Double], t1: String) => (value(t0, t1)).runNow()))
  }
}
