package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ImageButton with an image displayed on it.
  *
  *     var imageButton = CardService.newImageButton()
  *         .setAltText("An image button with an airplane icon.")
  *         .setIcon(CardService.Icon.AIRPLANE)
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://airplane.com"));
  */
trait ImageButton extends StObject {
  
  def setAltText(altText: String): ImageButton
  
  def setAuthorizationAction(action: AuthorizationAction): ImageButton
  
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): ImageButton
  
  def setIcon(icon: Icon): ImageButton
  
  def setIconUrl(url: String): ImageButton
  
  def setOnClickAction(action: Action): ImageButton
  
  def setOnClickOpenLinkAction(action: Action): ImageButton
  
  def setOpenLink(openLink: OpenLink): ImageButton
}
object ImageButton {
  
  inline def apply(
    setAltText: String => ImageButton,
    setAuthorizationAction: AuthorizationAction => ImageButton,
    setComposeAction: (Action, ComposedEmailType) => ImageButton,
    setIcon: Icon => ImageButton,
    setIconUrl: String => ImageButton,
    setOnClickAction: Action => ImageButton,
    setOnClickOpenLinkAction: Action => ImageButton,
    setOpenLink: OpenLink => ImageButton
  ): ImageButton = {
    val __obj = js.Dynamic.literal(setAltText = js.Any.fromFunction1(setAltText), setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setIcon = js.Any.fromFunction1(setIcon), setIconUrl = js.Any.fromFunction1(setIconUrl), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink))
    __obj.asInstanceOf[ImageButton]
  }
  
  extension [Self <: ImageButton](x: Self) {
    
    inline def setSetAltText(value: String => ImageButton): Self = StObject.set(x, "setAltText", js.Any.fromFunction1(value))
    
    inline def setSetAuthorizationAction(value: AuthorizationAction => ImageButton): Self = StObject.set(x, "setAuthorizationAction", js.Any.fromFunction1(value))
    
    inline def setSetComposeAction(value: (Action, ComposedEmailType) => ImageButton): Self = StObject.set(x, "setComposeAction", js.Any.fromFunction2(value))
    
    inline def setSetIcon(value: Icon => ImageButton): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    inline def setSetIconUrl(value: String => ImageButton): Self = StObject.set(x, "setIconUrl", js.Any.fromFunction1(value))
    
    inline def setSetOnClickAction(value: Action => ImageButton): Self = StObject.set(x, "setOnClickAction", js.Any.fromFunction1(value))
    
    inline def setSetOnClickOpenLinkAction(value: Action => ImageButton): Self = StObject.set(x, "setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    
    inline def setSetOpenLink(value: OpenLink => ImageButton): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
  }
}
