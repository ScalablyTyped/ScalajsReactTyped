package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.DriverPropertyInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XDriver
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends the service {@link com.sun.star.sdbc.Driver} by beans for data definition.
  *
  * This service is optional for each driver. Its purpose is to define a common way for database definition, as the DDL differs between most DBMS.
  *
  * Definition and deletion of database catalogs can't be defined in a common manner for DBMS, but it should be possible to hide much of the complexity of
  * creation and deletion of catalogs. Each driver could provide methods to cover these tasks.
  */
trait Driver
  extends StObject
     with XDriver
     with XDataDefinitionSupplier
     with XCreateCatalog
     with XDropCatalog
object Driver {
  
  inline def apply(
    MajorVersion: Double,
    MinorVersion: Double,
    acceptsURL: String => Boolean,
    acquire: Callback,
    connect: (String, SeqEquiv[PropertyValue]) => XConnection,
    createCatalog: SeqEquiv[PropertyValue] => Callback,
    dropCatalog: (String, SeqEquiv[PropertyValue]) => Callback,
    getDataDefinitionByConnection: XConnection => XTablesSupplier,
    getDataDefinitionByURL: (String, SeqEquiv[PropertyValue]) => XTablesSupplier,
    getMajorVersion: CallbackTo[Double],
    getMinorVersion: CallbackTo[Double],
    getPropertyInfo: (String, SeqEquiv[PropertyValue]) => SafeArray[DriverPropertyInfo],
    queryInterface: `type` => Any,
    release: Callback
  ): Driver = {
    val __obj = js.Dynamic.literal(MajorVersion = MajorVersion.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], acceptsURL = js.Any.fromFunction1(acceptsURL), acquire = acquire.toJsFn, connect = js.Any.fromFunction2(connect), createCatalog = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => createCatalog(t0).runNow()), dropCatalog = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (dropCatalog(t0, t1)).runNow()), getDataDefinitionByConnection = js.Any.fromFunction1(getDataDefinitionByConnection), getDataDefinitionByURL = js.Any.fromFunction2(getDataDefinitionByURL), getMajorVersion = getMajorVersion.toJsFn, getMinorVersion = getMinorVersion.toJsFn, getPropertyInfo = js.Any.fromFunction2(getPropertyInfo), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[Driver]
  }
}
