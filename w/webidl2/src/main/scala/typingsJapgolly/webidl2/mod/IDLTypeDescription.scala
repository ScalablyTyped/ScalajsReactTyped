package typingsJapgolly.webidl2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDLTypeDescription extends js.Object {
  /** String indicating the generic type (e.g. "Promise", "sequence"). null otherwise. */
  var generic: String | Null
  /**
    * In most cases, this will just be a string with the type name.
    * If the type is a union, then this contains an array of the types it unites.
    * If it is a generic type, it contains the IDL type description for the type in the sequence,
    * the eventual value of the promise, etc.
    */
  var idlType: String | js.Array[IDLTypeDescription]
  /** Boolean indicating whether this is nullable or not. */
  var nullable: Boolean
  /** Boolean indicating if it is a sequence. Same as generic === "sequence" */
  var sequence: Boolean
  /** String indicating where this type is used. Can be null if not applicable. */
  var `type`: String | Null
  /** Boolean indicating whether this is a union type or not. */
  var union: Boolean
}

object IDLTypeDescription {
  @scala.inline
  def apply(
    idlType: String | js.Array[IDLTypeDescription],
    nullable: Boolean,
    sequence: Boolean,
    union: Boolean,
    generic: String = null,
    `type`: String = null
  ): IDLTypeDescription = {
    val __obj = js.Dynamic.literal(idlType = idlType.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any])
    if (generic != null) __obj.updateDynamic("generic")(generic.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDLTypeDescription]
  }
}

