package typingsJapgolly.googleAppsScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColumnType extends StObject
/**
  * An enumeration of the valid data types for columns in a DataTable.
  */
@JSGlobal("GoogleAppsScript.Charts.ColumnType")
@js.native
object ColumnType extends StObject {
  
  @js.native
  sealed trait DATE
    extends StObject
       with ColumnType
  
  @js.native
  sealed trait NUMBER
    extends StObject
       with ColumnType
  
  @js.native
  sealed trait STRING
    extends StObject
       with ColumnType
}
