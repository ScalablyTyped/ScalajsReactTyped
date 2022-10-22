package typingsJapgolly.interactjsTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocEvents extends StObject {
  
  var docEvents: js.Array[Listener] = js.native
  
  var list: js.Array[typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[ActionName]] = js.native
  
  var listeners: StringDictionary[typingsJapgolly.interactjsTypes.coreTypesMod.Listener] = js.native
  
  def `new`(options: Any): typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[drag] = js.native
  
  var pointerMoveTolerance: Double = js.native
}
