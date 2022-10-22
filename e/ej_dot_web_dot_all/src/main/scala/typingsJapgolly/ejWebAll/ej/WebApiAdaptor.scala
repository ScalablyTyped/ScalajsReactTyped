package typingsJapgolly.ejWebAll.ej

import typingsJapgolly.ejWebAll.anon.Accept
import typingsJapgolly.ejWebAll.anon.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiAdaptor
  extends StObject
     with ODataAdaptor {
  
  def insert(dm: DataManager, data: Any): DataType = js.native
  
  def remove(dm: DataManager, value: Any): DataType = js.native
  def remove(dm: DataManager, value: Any, keyField: String): DataType = js.native
  def remove(dm: DataManager, value: Any, keyField: String, tableName: String): DataType = js.native
  def remove(dm: DataManager, value: Any, keyField: Unit, tableName: String): DataType = js.native
  
  def update(dm: DataManager, value: Any): Accept = js.native
  def update(dm: DataManager, value: Any, keyField: String): Accept = js.native
  def update(dm: DataManager, value: Any, keyField: String, tableName: String): Accept = js.native
  def update(dm: DataManager, value: Any, keyField: Unit, tableName: String): Accept = js.native
}
