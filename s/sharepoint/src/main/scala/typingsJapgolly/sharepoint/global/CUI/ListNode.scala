package typingsJapgolly.sharepoint.global.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CUI.ListNode")
@js.native
open class ListNode[T] protected ()
  extends StObject
     with typingsJapgolly.sharepoint.CUI.ListNode[T] {
  def this(
    data: T,
    prev: typingsJapgolly.sharepoint.CUI.ListNode[T],
    next: typingsJapgolly.sharepoint.CUI.ListNode[T]
  ) = this()
  
  /* CompleteClass */
  var data: T = js.native
  
  /* CompleteClass */
  var next: typingsJapgolly.sharepoint.CUI.ListNode[T] = js.native
  
  /* CompleteClass */
  var previous: typingsJapgolly.sharepoint.CUI.ListNode[T] = js.native
}
