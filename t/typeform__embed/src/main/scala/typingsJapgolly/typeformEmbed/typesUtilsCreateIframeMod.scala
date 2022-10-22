package typingsJapgolly.typeformEmbed

import org.scalajs.dom.MessageEvent
import typingsJapgolly.typeformEmbed.anon.EmbedId
import typingsJapgolly.typeformEmbed.typesBaseEmbedTypesMod.EmbedType
import typingsJapgolly.typeformEmbed.typesUtilsCreateIframeCreateIframeMod.CreateIframeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsCreateIframeMod {
  
  @JSImport("@typeform/embed/types/utils/create-iframe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCustomKeyboardListener(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomKeyboardListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createIframe(formId: String, `type`: EmbedType, options: CreateIframeOptions): EmbedId = (^.asInstanceOf[js.Dynamic].applyDynamic("createIframe")(formId.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EmbedId]
  
  inline def dispatchCustomKeyEventFromIframe(evt: MessageEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchCustomKeyEventFromIframe")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeCustomKeyboardListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCustomKeyboardListener")().asInstanceOf[Unit]
}
