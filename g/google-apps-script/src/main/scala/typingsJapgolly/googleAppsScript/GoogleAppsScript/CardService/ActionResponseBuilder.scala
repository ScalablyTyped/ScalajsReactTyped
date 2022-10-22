package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for ActionResponse objects.
  */
trait ActionResponseBuilder extends StObject {
  
  def build(): ActionResponse
  
  def setNavigation(navigation: Navigation): ActionResponseBuilder
  
  def setNotification(notification: Notification): ActionResponseBuilder
  
  def setOpenLink(openLink: OpenLink): ActionResponseBuilder
  
  def setStateChanged(stateChanged: Boolean): ActionResponseBuilder
}
object ActionResponseBuilder {
  
  inline def apply(
    build: CallbackTo[ActionResponse],
    setNavigation: Navigation => ActionResponseBuilder,
    setNotification: Notification => ActionResponseBuilder,
    setOpenLink: OpenLink => ActionResponseBuilder,
    setStateChanged: Boolean => ActionResponseBuilder
  ): ActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, setNavigation = js.Any.fromFunction1(setNavigation), setNotification = js.Any.fromFunction1(setNotification), setOpenLink = js.Any.fromFunction1(setOpenLink), setStateChanged = js.Any.fromFunction1(setStateChanged))
    __obj.asInstanceOf[ActionResponseBuilder]
  }
  
  extension [Self <: ActionResponseBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[ActionResponse]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setSetNavigation(value: Navigation => ActionResponseBuilder): Self = StObject.set(x, "setNavigation", js.Any.fromFunction1(value))
    
    inline def setSetNotification(value: Notification => ActionResponseBuilder): Self = StObject.set(x, "setNotification", js.Any.fromFunction1(value))
    
    inline def setSetOpenLink(value: OpenLink => ActionResponseBuilder): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
    
    inline def setSetStateChanged(value: Boolean => ActionResponseBuilder): Self = StObject.set(x, "setStateChanged", js.Any.fromFunction1(value))
  }
}
