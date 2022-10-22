package typingsJapgolly.hellosignEmbedded.mod

import typingsJapgolly.hellosignEmbedded.mod.HelloSign.ClassNames
import typingsJapgolly.hellosignEmbedded.mod.HelloSign.Events
import typingsJapgolly.hellosignEmbedded.mod.HelloSign.Locales
import typingsJapgolly.hellosignEmbedded.mod.HelloSign.Messages
import typingsJapgolly.hellosignEmbedded.mod.HelloSign.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hellosign-embedded", JSImport.Default)
@js.native
open class default ()
  extends typingsJapgolly.hellosignEmbedded.mod.HelloSign.HelloSign {
  def this(opts: Options) = this()
}
object default {
  
  @JSImport("hellosign-embedded", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("hellosign-embedded", "default.classNames")
  @js.native
  def classNames: ClassNames = js.native
  inline def classNames_=(x: ClassNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "default.events")
  @js.native
  def events: Events = js.native
  inline def events_=(x: Events): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "default.locales")
  @js.native
  def locales: Locales = js.native
  inline def locales_=(x: Locales): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locales")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "default.messages")
  @js.native
  def messages: Messages = js.native
  inline def messages_=(x: Messages): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("hellosign-embedded", "default.version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
