package typingsJapgolly.select2.mod

import typingsJapgolly.select2.anon.Require
import typingsJapgolly.select2.anon.Reset
import typingsJapgolly.select2.mod.global.JQuery
import typingsJapgolly.select2.select2Strings.close
import typingsJapgolly.select2.select2Strings.data
import typingsJapgolly.select2.select2Strings.destroy
import typingsJapgolly.select2.select2Strings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select2Plugin[TElement] extends StObject {
  
  def apply(): JQuery[TElement] = js.native
  /**
    * Closes the dropdown
    */
  def apply(method: close): JQuery[TElement] = js.native
  /**
    * Get the data object of the current selection
    */
  def apply(method: data): js.Array[OptionData] = js.native
  /**
    * Reverts changes to DOM done by Select2. Any selection done via Select2 will be preserved.
    */
  def apply(method: destroy): JQuery[TElement] = js.native
  /**
    * Opens the dropdown
    */
  def apply(method: open): JQuery[TElement] = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[Result, RemoteResult](options: Options[Result, RemoteResult]): JQuery[TElement] = js.native
  
  var amd: Require = js.native
  
  var defaults: Reset = js.native
}
