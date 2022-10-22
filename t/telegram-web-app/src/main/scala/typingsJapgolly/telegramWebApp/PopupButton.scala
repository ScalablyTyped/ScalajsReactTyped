package typingsJapgolly.telegramWebApp

import typingsJapgolly.telegramWebApp.telegramWebAppStrings.cancel
import typingsJapgolly.telegramWebApp.telegramWebAppStrings.close
import typingsJapgolly.telegramWebApp.telegramWebAppStrings.default
import typingsJapgolly.telegramWebApp.telegramWebAppStrings.destructive
import typingsJapgolly.telegramWebApp.telegramWebAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object describes the native popup button.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.telegramWebApp.anon.typedefaultdestructivetex
  - typingsJapgolly.telegramWebApp.anon.typeokclosecanceltextstri
*/
trait PopupButton extends StObject
object PopupButton {
  
  inline def typedefaultdestructivetex(
    text: String & js.UndefOr[String],
    `type`: (default | destructive) & (js.UndefOr[default | ok | close | cancel | destructive])
  ): typingsJapgolly.telegramWebApp.anon.typedefaultdestructivetex = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.telegramWebApp.anon.typedefaultdestructivetex]
  }
  
  inline def typeokclosecanceltextstri(`type`: (ok | close | cancel) & (js.UndefOr[default | ok | close | cancel | destructive])): typingsJapgolly.telegramWebApp.anon.typeokclosecanceltextstri = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.telegramWebApp.anon.typeokclosecanceltextstri]
  }
}
