package typingsJapgolly.parseMockdb

import typingsJapgolly.parseMockdb.ParseMockDB.HookType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMockdbStrings {
  
  @js.native
  sealed trait beforeDelete
    extends StObject
       with HookType
  inline def beforeDelete: beforeDelete = "beforeDelete".asInstanceOf[beforeDelete]
  
  @js.native
  sealed trait beforeSave
    extends StObject
       with HookType
  inline def beforeSave: beforeSave = "beforeSave".asInstanceOf[beforeSave]
}
