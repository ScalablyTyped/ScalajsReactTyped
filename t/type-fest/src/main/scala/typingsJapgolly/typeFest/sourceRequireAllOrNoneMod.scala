package typingsJapgolly.typeFest

import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceRequireAllOrNoneMod {
  
  type RequireAllOrNone[ObjectType, KeysType /* <: /* keyof ObjectType */ String */] = ((Required[Pick[ObjectType, KeysType]]) & (Omit[ObjectType, KeysType])) | ((Partial[Record[KeysType, scala.Nothing]]) & (Omit[ObjectType, KeysType]))
}
