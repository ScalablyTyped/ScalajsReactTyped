package typingsJapgolly.mssql.mod

import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRecordSet[T]
  extends StObject
     with Array[T] {
  
  var columns: IColumnMetadata = js.native
  
  def toTable(): Table = js.native
  def toTable(name: String): Table = js.native
}
