package typingsJapgolly.datatablesNetSelect

import typingsJapgolly.datatablesNetSelect.DataTables.Api
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.api
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.multi
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.os
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Style extends StObject {
    
    /*
      * Get the current selection style applied to the table
      */
    def style(): String = js.native
    /*
      * Set the table's selection style
      */
    def style(s: api | single | multi | os): Api = js.native
  }
}
