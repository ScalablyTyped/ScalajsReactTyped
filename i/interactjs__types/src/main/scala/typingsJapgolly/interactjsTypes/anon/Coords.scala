package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.coreScopeMod.Scope
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionProps
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerEventType
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drag
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drop
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.gesture
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.resize
import typingsJapgolly.interactjsTypes.utilsPointerUtilsMod.MockCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coords[T /* <: typingsJapgolly.interactjsTypes.coreTypesMod.Target */] extends StObject {
  
  var coords: MockCoords = js.native
  
  def down(): Unit = js.native
  
  var event: Buttons & typingsJapgolly.interactjsTypes.coreTypesMod.PointerType & PointerEventType = js.native
  
  var interact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_InteractStatic.InteractStatic */ Any = js.native
  
  var interactable: InteractableDevTools = js.native
  
  var interaction: typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction[
    /* keyof @interactjs/types.@interactjs/core/types.ActionMap */ drag | drop | gesture | resize
  ] = js.native
  
  def move(): Unit = js.native
  def move(force: Boolean): Unit = js.native
  
  var scope: Scope = js.native
  
  @JSName("start")
  def start_drag(action: ActionProps[drag]): Boolean = js.native
  @JSName("start")
  def start_drop(action: ActionProps[drop]): Boolean = js.native
  @JSName("start")
  def start_gesture(action: ActionProps[gesture]): Boolean = js.native
  @JSName("start")
  def start_resize(action: ActionProps[resize]): Boolean = js.native
  
  def stop(): Unit = js.native
  
  var target: T = js.native
  
  def up(): Unit = js.native
}
