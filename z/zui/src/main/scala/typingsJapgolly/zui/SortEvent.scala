package typingsJapgolly.zui

import typingsJapgolly.std.Event
import typingsJapgolly.zui.anon.Index
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * sortable
  */
@js.native
trait SortEvent
  extends StObject
     with Event {
  
  var element: JQuery | js.Object = js.native
  
  var list: js.Array[JQuery | js.Object] = js.native
  
  var sorter: Index = js.native
}
