package typingsJapgolly.activexLibreoffice.com_.sun.star.bridge

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Uik
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the interface for creating bridges to other object models.
  *
  * Because bridges sometimes can not be generated in an address space, the implementation needs to check the address space of the caller by comparing the
  * machine and process ID against its own. These IDs are provided by the UNO runtime.
  *
  * All objects, whether they are part of the UNO object model or not, are carried in an `any` . The representation of this object is heavily
  * model-dependent and has to be specified in the following list:
  *
  * **UNO:  **: The any carries normal UNO types, which can be any base type, struct, sequence, enum, or interface.;
  *
  * **OLE:  **: The any carries an `unsigned long` (on 32-bit systems) or an `unsigned hyper` (on 64-bit systems), which is interpreted as a variant
  * pointer. The any does not control the lifetime of the represented variant. That implies that the caller has the responsibility of freeing the OLE
  * resources represented by the any value.;
  *
  * **JAVA:  **: not yet specified.;
  *
  * **CORBA:  **: not yet specified.
  *
  *
  *
  * Any implementation can supply its own bridges to other object models by implementing this interface and returning the bridge when the method is called
  * with itself as the first parameter.
  * @deprecated Deprecated
  * @see com.sun.star.bridge.OleBridgeSupplier
  */
trait XBridgeSupplier
  extends StObject
     with XInterface {
  
  /** creates a bridge to provide an object of one object model with another. */
  def createBridge(
    modelDepObject: Any,
    MachineId: Uik,
    ProcessId: Double,
    sourceModelType: Double,
    destModelType: Double
  ): Any
}
object XBridgeSupplier {
  
  inline def apply(
    acquire: Callback,
    createBridge: (Any, Uik, Double, Double, Double) => Any,
    queryInterface: `type` => Any,
    release: Callback
  ): XBridgeSupplier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createBridge = js.Any.fromFunction5(createBridge), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XBridgeSupplier]
  }
  
  extension [Self <: XBridgeSupplier](x: Self) {
    
    inline def setCreateBridge(value: (Any, Uik, Double, Double, Double) => Any): Self = StObject.set(x, "createBridge", js.Any.fromFunction5(value))
  }
}
