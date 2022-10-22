package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods to create new DataPilot fields where some or all items of this DataPilot field are grouped in some way.
  * @see DataPilotField
  */
trait XDataPilotFieldGrouping
  extends StObject
     with XInterface {
  
  /**
    * Groups the members of this field by dates, according to the passed settings.
    *
    * If this field is already grouped by dates, a new DataPilot field will be created and returned. If this field is not grouped at all, the date grouping
    * is performed inside of this field (no new field will be created). There must not be any other grouping (by member names or by numeric ranges),
    * otherwise an exception is thrown.
    * @param aInfo contains the information how to group the items of the field. The members of this struct have to fulfill the following requirements:If the
    * @returns the new created field if there is one created. `NULL` is returned, if date grouping is performed inside this field (i.e. this field was not group
    * @see DataPilotField
    * @throws com::sun::star::lang::IllegalArgumentException if the passed struct does not contain valid settings as described, or if this field is already gro
    */
  def createDateGroup(aInfo: DataPilotFieldGroupInfo): XDataPilotField
  
  /**
    * Creates a new DataPilot field which contains a group containing the given DataPilot field items (members).
    *
    * It is possible to create multiple groups by calling this method several times at the same DataPilot field. On subsequent calls, the DataPilot field
    * created at the first call is used to insert the new groups.
    *
    * The collection of groups can be accessed via the {@link DataPilotField.GroupInfo} property. The returned struct contains the sequence of groups in its
    * member {@link DataPilotFieldGroupInfo.Groups} .
    * @param aItems a sequence containing the names of the items (members) which will be part of the new group. Must be names of items contained in the curren
    * @returns the new created field if there is one created on the first call of this method. `NULL` is returned on subsequent calls.
    * @see DataPilotField
    * @see DataPilotFieldGroupInfo
    */
  def createNameGroup(aItems: SeqEquiv[String]): XDataPilotField
}
object XDataPilotFieldGrouping {
  
  inline def apply(
    acquire: Callback,
    createDateGroup: DataPilotFieldGroupInfo => XDataPilotField,
    createNameGroup: SeqEquiv[String] => XDataPilotField,
    queryInterface: `type` => Any,
    release: Callback
  ): XDataPilotFieldGrouping = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createDateGroup = js.Any.fromFunction1(createDateGroup), createNameGroup = js.Any.fromFunction1(createNameGroup), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDataPilotFieldGrouping]
  }
  
  extension [Self <: XDataPilotFieldGrouping](x: Self) {
    
    inline def setCreateDateGroup(value: DataPilotFieldGroupInfo => XDataPilotField): Self = StObject.set(x, "createDateGroup", js.Any.fromFunction1(value))
    
    inline def setCreateNameGroup(value: SeqEquiv[String] => XDataPilotField): Self = StObject.set(x, "createNameGroup", js.Any.fromFunction1(value))
  }
}
