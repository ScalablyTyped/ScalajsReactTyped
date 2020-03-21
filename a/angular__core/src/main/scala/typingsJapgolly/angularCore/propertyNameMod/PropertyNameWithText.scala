package typingsJapgolly.angularCore.propertyNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Type that describes a property name with an obtainable text. */
/* Inlined std.Exclude<typescript.typescript.PropertyName, typescript.typescript.ComputedPropertyName> */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCore.angularCoreStrings.isInJSDocNamespace
  - typingsJapgolly.angularCore.angularCoreStrings.escapedText
  - typingsJapgolly.angularCore.angularCoreStrings.text
  - typingsJapgolly.angularCore.angularCoreStrings.originalKeywordKind
*/
trait PropertyNameWithText extends js.Object

object PropertyNameWithText {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def escapedText: typingsJapgolly.angularCore.angularCoreStrings.escapedText = this.cast("escapedText")
  @scala.inline
  def isInJSDocNamespace: typingsJapgolly.angularCore.angularCoreStrings.isInJSDocNamespace = this.cast("isInJSDocNamespace")
  @scala.inline
  def originalKeywordKind: typingsJapgolly.angularCore.angularCoreStrings.originalKeywordKind = this.cast("originalKeywordKind")
  @scala.inline
  def text: typingsJapgolly.angularCore.angularCoreStrings.text = this.cast("text")
}

