package typingsJapgolly.koPlus

import typingsJapgolly.knockout.KnockoutObservable
import typingsJapgolly.koPlus.KoPlus.Command
import typingsJapgolly.koPlus.KoPlus.CommandOptions
import typingsJapgolly.koPlus.KoPlus.Editable
import typingsJapgolly.koPlus.KoPlus.EditableArray
import typingsJapgolly.koPlus.KoPlus.EditableArrayStatic
import typingsJapgolly.koPlus.KoPlus.EditableStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Extensions to KO to provide a command, editable and sortable patterns
  * - available at http://www.nuget.org/packages/ko.plus/
  *
  * (requires TypeScript version 1.4 or higher)
  *
  * Version 1.0 - initial commit
  *
  * Version 1.1 - fixed bug - makeEditable is now a function on .editable
  *               also refactored how the Editable classes inherit to simplify
  *
  * Version 1.2 - amended callback on commmand.fail() method - accepts response,
  *               status and message values
  * 
  * Version 1.3 - added module declaration so it be used with node, requirejs etc.
  *               removed jquery reference as it is not required
  * 
  */
//
// Add methods to the 'ko' Knockout object
//
@js.native
trait KnockoutStatic extends js.Object {
  @JSName("editableArray")
  var editableArray_Original: EditableArrayStatic = js.native
  @JSName("editable")
  var editable_Original: EditableStatic = js.native
  // create a command - two overloads
  def command(param: js.Function): Command = js.native
  def command(param: CommandOptions): Command = js.native
  def editable[T](): KnockoutObservable[T | Null] = js.native
  def editable[T](value: T): KnockoutObservable[T] = js.native
  def editableArray[T](): EditableArray[T] = js.native
  def editableArray[T](value: js.Array[T]): EditableArray[T] = js.native
  @JSName("editableArray")
  def editableArray_T_KnockoutObservableArray[T](): typingsJapgolly.knockout.KnockoutObservableArray[T] = js.native
  @JSName("editableArray")
  def editableArray_T_KnockoutObservableArray[T](value: js.Array[T]): typingsJapgolly.knockout.KnockoutObservableArray[T] = js.native
  @JSName("editable")
  def editable_T_Editable[T](): Editable[T] = js.native
  @JSName("editable")
  def editable_T_Editable[T](value: T): Editable[T] = js.native
}

