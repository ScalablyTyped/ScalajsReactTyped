package typingsJapgolly.sipJs.libCoreMod

import typingsJapgolly.sipJs.libCoreMessagesBodyMod.Body
import typingsJapgolly.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "OutgoingRequestMessage")
@js.native
open class OutgoingRequestMessage protected ()
  extends typingsJapgolly.sipJs.libCoreMessagesMod.OutgoingRequestMessage {
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.libGrammarMod.URI,
    fromURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    toURI: typingsJapgolly.sipJs.libGrammarMod.URI
  ) = this()
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.libGrammarMod.URI,
    fromURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    toURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    options: OutgoingRequestMessageOptions
  ) = this()
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.libGrammarMod.URI,
    fromURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    toURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    options: Unit,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.libGrammarMod.URI,
    fromURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    toURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.libGrammarMod.URI,
    fromURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    toURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    options: Unit,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.libGrammarMod.URI,
    fromURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    toURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    options: Unit,
    extraHeaders: Unit,
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.libGrammarMod.URI,
    fromURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    toURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typingsJapgolly.sipJs.libGrammarMod.URI,
    fromURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    toURI: typingsJapgolly.sipJs.libGrammarMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: Unit,
    body: Body
  ) = this()
}
/* static members */
object OutgoingRequestMessage {
  
  @JSImport("sip.js/lib/core", "OutgoingRequestMessage")
  @js.native
  val ^ : js.Any = js.native
  
  /** Get a copy of the default options. */
  @JSImport("sip.js/lib/core", "OutgoingRequestMessage.getDefaultOptions")
  @js.native
  def getDefaultOptions: Any = js.native
  inline def getDefaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultOptions")(x.asInstanceOf[js.Any])
  
  @JSImport("sip.js/lib/core", "OutgoingRequestMessage.makeNameAddrHeader")
  @js.native
  def makeNameAddrHeader: Any = js.native
  inline def makeNameAddrHeader_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeNameAddrHeader")(x.asInstanceOf[js.Any])
}
