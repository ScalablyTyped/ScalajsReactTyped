package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for the standard mapping for a SQL structured type.
  *
  * A `Struct` object contains a value for each attribute of the SQL structured type that it represents. By default, an instance of `Struct` is valid as
  * long as the application has a reference to it.
  */
trait XStruct
  extends StObject
     with XInterface {
  
  /**
    * retrieves the SQL type name of the SQL structured type that this `Struct` object represents.
    * @returns the name of the SQL type.
    * @throws SQLException if a database access error occurs.
    */
  val SQLTypeName: String
  
  /**
    * produces the ordered values of the attributes of the SQL structured type that this `Struct` object represents.
    *
    * This method uses the given type map for customizations of the type mappings. If there is no entry in the given type map that matches or the given type
    * map is `NULL` , the structured type that this `Struct` object represents, the driver uses the connection type mapping.
    * @param typeMap is a map object that contains mappings of SQL type names to services. If the `typeMap` is `NULL` , the type-map associated with the conne
    * @returns an array containing the ordered attribute values.
    * @throws SQLException if a database access error occurs.
    */
  def getAttributes(typeMap: XNameAccess): SafeArray[Any]
  
  /**
    * retrieves the SQL type name of the SQL structured type that this `Struct` object represents.
    * @returns the name of the SQL type.
    * @throws SQLException if a database access error occurs.
    */
  def getSQLTypeName(): String
}
object XStruct {
  
  inline def apply(
    SQLTypeName: String,
    acquire: Callback,
    getAttributes: XNameAccess => SafeArray[Any],
    getSQLTypeName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XStruct = {
    val __obj = js.Dynamic.literal(SQLTypeName = SQLTypeName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAttributes = js.Any.fromFunction1(getAttributes), getSQLTypeName = getSQLTypeName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStruct]
  }
  
  extension [Self <: XStruct](x: Self) {
    
    inline def setGetAttributes(value: XNameAccess => SafeArray[Any]): Self = StObject.set(x, "getAttributes", js.Any.fromFunction1(value))
    
    inline def setGetSQLTypeName(value: CallbackTo[String]): Self = StObject.set(x, "getSQLTypeName", value.toJsFn)
    
    inline def setSQLTypeName(value: String): Self = StObject.set(x, "SQLTypeName", value.asInstanceOf[js.Any])
  }
}
