package typingsJapgolly.activexVbide

import typingsJapgolly.activexVbide.VBIDE.CommandBarEvents
import typingsJapgolly.activexVbide.VBIDE.References
import typingsJapgolly.activexVbide.VBIDE.ReferencesEvents
import typingsJapgolly.activexVbide.activexVbideStrings.CancelDefault
import typingsJapgolly.activexVbide.activexVbideStrings.Click
import typingsJapgolly.activexVbide.activexVbideStrings.CommandBarControl
import typingsJapgolly.activexVbide.activexVbideStrings.ItemAdded
import typingsJapgolly.activexVbide.activexVbideStrings.ItemRemoved
import typingsJapgolly.activexVbide.activexVbideStrings.Reference
import typingsJapgolly.activexVbide.activexVbideStrings.handled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: CommandBarEvents,
    event: Click,
    argNames: js.Tuple3[CommandBarControl, handled, CancelDefault],
    handler: js.ThisFunction1[
      /* this */ CommandBarEvents, 
      /* parameter */ typingsJapgolly.activexVbide.anon.CancelDefault, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: ReferencesEvents,
    event: ItemAdded | ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[
      /* this */ ReferencesEvents, 
      /* parameter */ typingsJapgolly.activexVbide.anon.Reference, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemAdded | ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[
      /* this */ References, 
      /* parameter */ typingsJapgolly.activexVbide.anon.Reference, 
      Unit
    ]
  ): Unit = js.native
}
