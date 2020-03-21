package typingsJapgolly.naja.mod

import typingsJapgolly.naja.najaStrings.abort
import typingsJapgolly.naja.najaStrings.before
import typingsJapgolly.naja.najaStrings.complete
import typingsJapgolly.naja.najaStrings.error
import typingsJapgolly.naja.najaStrings.init
import typingsJapgolly.naja.najaStrings.interaction
import typingsJapgolly.naja.najaStrings.load
import typingsJapgolly.naja.najaStrings.start
import typingsJapgolly.naja.najaStrings.success
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventTarget
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NajaEventTarget extends EventTarget {
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_before(`type`: before, listener: NajaEventListener[BeforeEvent[RequestData]]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_before(`type`: before, listener: NajaEventListener[BeforeEvent[RequestData]], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_before(
    `type`: before,
    listener: NajaEventListener[BeforeEvent[RequestData]],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_init(`type`: init, listener: NajaEventListener[InitEvent]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_init(`type`: init, listener: NajaEventListener[InitEvent], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_init(`type`: init, listener: NajaEventListener[InitEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_interaction(`type`: interaction, listener: NajaEventListener[InteractionEvent]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_interaction(`type`: interaction, listener: NajaEventListener[InteractionEvent], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_interaction(
    `type`: interaction,
    listener: NajaEventListener[InteractionEvent],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: NajaEventListener[Event_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: NajaEventListener[Event_], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: NajaEventListener[Event_], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: NajaEventListener[StartEvent]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: NajaEventListener[StartEvent], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: NajaEventListener[StartEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]], options: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_type[T /* <: Event_ */](
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_type[T /* <: Event_ */](
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_type[T /* <: Event_ */](
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: NajaEventListener[AbortEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_before(`type`: before, listener: NajaEventListener[BeforeEvent[RequestData]]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_before(`type`: before, listener: NajaEventListener[BeforeEvent[RequestData]], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_before(
    `type`: before,
    listener: NajaEventListener[BeforeEvent[RequestData]],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(`type`: complete, listener: NajaEventListener[CompleteEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: NajaEventListener[ErrorEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_init(`type`: init, listener: NajaEventListener[InitEvent]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_init(`type`: init, listener: NajaEventListener[InitEvent], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_init(`type`: init, listener: NajaEventListener[InitEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_interaction(`type`: interaction, listener: NajaEventListener[InteractionEvent]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_interaction(`type`: interaction, listener: NajaEventListener[InteractionEvent], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_interaction(
    `type`: interaction,
    listener: NajaEventListener[InteractionEvent],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(`type`: load, listener: NajaEventListener[Event_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(`type`: load, listener: NajaEventListener[Event_], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(`type`: load, listener: NajaEventListener[Event_], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: NajaEventListener[StartEvent]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: NajaEventListener[StartEvent], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: NajaEventListener[StartEvent], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]], options: Boolean): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_success(`type`: success, listener: NajaEventListener[SuccessEvent[_]], options: AddEventListenerOptions): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_type[T /* <: Event_ */](
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_type[T /* <: Event_ */](
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T],
    options: Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_type[T /* <: Event_ */](
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: T['type'] */ js.Any,
    listener: NajaEventListener[T],
    options: AddEventListenerOptions
  ): Unit = js.native
}

