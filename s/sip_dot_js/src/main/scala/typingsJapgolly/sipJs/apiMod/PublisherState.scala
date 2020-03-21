package typingsJapgolly.sipJs.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "PublisherState")
@js.native
object PublisherState extends js.Object {
  /* "Initial" */ val Initial: typingsJapgolly.sipJs.publisherStateMod.PublisherState.Initial with String = js.native
  /* "Published" */ val Published: typingsJapgolly.sipJs.publisherStateMod.PublisherState.Published with String = js.native
  /* "Terminated" */ val Terminated: typingsJapgolly.sipJs.publisherStateMod.PublisherState.Terminated with String = js.native
  /* "Unpublished" */ val Unpublished: typingsJapgolly.sipJs.publisherStateMod.PublisherState.Unpublished with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.sipJs.publisherStateMod.PublisherState with String] = js.native
}

