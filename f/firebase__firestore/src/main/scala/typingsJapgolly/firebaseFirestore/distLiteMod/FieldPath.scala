package typingsJapgolly.firebaseFirestore.distLiteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite", "FieldPath")
@js.native
open class FieldPath protected () extends StObject {
  /**
    * Creates a `FieldPath` from the provided field names. If more than one field
    * name is provided, the path will point to a nested field in a document.
    *
    * @param fieldNames - A list of field names.
    */
  def this(fieldNames: String*) = this()
  
  /**
    * Returns true if this `FieldPath` is equal to the provided one.
    *
    * @param other - The `FieldPath` to compare against.
    * @returns true if this `FieldPath` is equal to the provided one.
    */
  def isEqual(other: FieldPath): Boolean = js.native
}
