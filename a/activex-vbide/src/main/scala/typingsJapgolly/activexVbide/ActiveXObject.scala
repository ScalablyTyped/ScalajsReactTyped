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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: CommandBarEvents,
    event: Click,
    argNames: js.Tuple3[CommandBarControl, handled, CancelDefault],
    handler: js.ThisFunction1[/* this */ CommandBarEvents, /* parameter */ AnonCancelDefault, Unit]
  ): Unit = js.native
  def on(
    obj: ReferencesEvents,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ ReferencesEvents, /* parameter */ AnonReference, Unit]
  ): Unit = js.native
  def on(
    obj: ReferencesEvents,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ ReferencesEvents, /* parameter */ AnonReference, Unit]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemAdded,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ AnonReference, Unit]
  ): Unit = js.native
  def on(
    obj: References,
    event: ItemRemoved,
    argNames: js.Array[Reference],
    handler: js.ThisFunction1[/* this */ References, /* parameter */ AnonReference, Unit]
  ): Unit = js.native
}

