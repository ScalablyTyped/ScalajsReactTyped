package typingsJapgolly.winrtUwp.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.resolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a source of timed text data. */
@js.native
trait TimedTextSource extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resolved(
    `type`: resolved,
    listener: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs]
  ): Unit = js.native
  
  /** Occurs when the TimedTextSource is resolved. */
  def onresolved(ev: TimedTextSourceResolveResultEventArgs & WinRTEvent[TimedTextSource]): Unit = js.native
  /** Occurs when the TimedTextSource is resolved. */
  @JSName("onresolved")
  var onresolved_Original: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resolved(
    `type`: resolved,
    listener: TypedEventHandler[TimedTextSource, TimedTextSourceResolveResultEventArgs]
  ): Unit = js.native
}
