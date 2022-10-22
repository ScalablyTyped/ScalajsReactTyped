package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreScopeMod.Scope
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionProps
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drag
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drop
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.gesture
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallInteractableActionScope extends StObject {
  
  def apply(
    interactable: InteractableAllowFrom,
    action: ActionProps[drag | drop | gesture | resize],
    scope: Scope
  ): js.Promise[InteractableAllowFrom] = js.native
}
