package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to register Out-Parameters for stored procedures.
  *
  * SDBC provides a stored procedure SQL escape that allows stored procedures to be called in a standard way for all RDBMSs. This escape syntax has one
  * form that includes a result parameter and one that does not. If used, the result parameter must be registered as an OUT parameter. The other
  * parameters can be used for input, output, or both. Parameters are referred to sequentially, by number. The first parameter is 1.
  */
trait XOutParameters
  extends StObject
     with XInterface {
  
  /**
    * registers the OUT parameter in ordinal position `parameterIndex` to the SDBC type `sqlType` . All OUT parameters must be registered before a stored
    * procedure is executed.
    *
    * The SDBC type specified by `sqlType` for an OUT parameter determines the type that must be used in the `get` method to read the value of that
    * parameter. This version of {@link com.sun.star.sdbc.XOutParameters.registerOutParameter()} should be used when the parameter is of SDBC type {@link
    * com.sun.star.sdbc.DataType.NUMERIC} or {@link com.sun.star.sdbc.DataType.DECIMAL} .
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param sqlType the type of the column to register
    * @param scale the scale of the type
    * @throws SQLException if a database access error occurs.
    */
  def registerNumericOutParameter(parameterIndex: Double, sqlType: Double, scale: Double): Unit
  
  /**
    * registers the designated output parameter. This version of the method {@link com.sun.star.sdbc.XOutParameters.registerOutParameter()} should be used
    * for a user-named or REF output parameter. Examples of user-named types include: STRUCT, DISTINCT, OBJECT, and named array types.
    *
    * Before executing a stored procedure call, you must explicitly call {@link com.sun.star.sdbc.XOutParameters.registerOutParameter()} to register the
    * type from {@link com.sun.star.sdbc.DataType} for each OUT parameter. ;  For a user-named parameter the fully-qualified SQL type name of the parameter
    * should also be given, while a REF parameter requires that the fully-qualified type name of the referenced type be given. An SDBC driver that does not
    * need the type code and type name information may ignore it. To be portable, however, applications should always provide these values for user-named
    * and REF parameters.
    *
    * Although it is intended for user-named and REF parameters, this method may be used to register a parameter of any SDBC type. If the parameter does not
    * have a user-named or REF type, the typeName parameter is ignored.
    *
    * **Note:** When reading the value of an out parameter, you must use the `getXXX` method whose type XXX corresponds to the parameter's registered SQL
    * type.
    * @param parameterIndex the first parameter is 1, the second is 2, ...
    * @param sqlType the type of the column to register
    * @param typeName the name of the type
    * @throws SQLException if a database access error occurs.
    */
  def registerOutParameter(parameterIndex: Double, sqlType: Double, typeName: String): Unit
}
object XOutParameters {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    registerNumericOutParameter: (Double, Double, Double) => Callback,
    registerOutParameter: (Double, Double, String) => Callback,
    release: Callback
  ): XOutParameters = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), registerNumericOutParameter = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (registerNumericOutParameter(t0, t1, t2)).runNow()), registerOutParameter = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (registerOutParameter(t0, t1, t2)).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XOutParameters]
  }
  
  extension [Self <: XOutParameters](x: Self) {
    
    inline def setRegisterNumericOutParameter(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "registerNumericOutParameter", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setRegisterOutParameter(value: (Double, Double, String) => Callback): Self = StObject.set(x, "registerOutParameter", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
  }
}
