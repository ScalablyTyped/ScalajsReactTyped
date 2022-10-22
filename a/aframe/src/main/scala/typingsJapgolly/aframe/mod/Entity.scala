package typingsJapgolly.aframe.mod

import org.scalajs.dom.Event
import typingsJapgolly.aframe.aframeStrings.`child-attached`
import typingsJapgolly.aframe.aframeStrings.`child-detached`
import typingsJapgolly.aframe.aframeStrings.componentchanged
import typingsJapgolly.aframe.aframeStrings.componentinitialized
import typingsJapgolly.aframe.aframeStrings.componentremoved
import typingsJapgolly.aframe.aframeStrings.loaded
import typingsJapgolly.aframe.aframeStrings.pause
import typingsJapgolly.aframe.aframeStrings.play
import typingsJapgolly.aframe.aframeStrings.position
import typingsJapgolly.aframe.aframeStrings.rotation
import typingsJapgolly.aframe.aframeStrings.scale
import typingsJapgolly.aframe.aframeStrings.schemachanged
import typingsJapgolly.aframe.aframeStrings.stateadded
import typingsJapgolly.aframe.aframeStrings.stateremoved
import typingsJapgolly.aframe.anon.ComponentName
import typingsJapgolly.aframe.anon.Data
import typingsJapgolly.aframe.anon.El
import typingsJapgolly.aframe.anon.Id
import typingsJapgolly.aframe.anon.Name
import typingsJapgolly.aframe.anon.State
import typingsJapgolly.std.EventListener
import typingsJapgolly.three.mod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity[C]
  extends StObject
     with ANode {
  
  // addEventListener specific usages
  @JSName("addEventListener")
  def addEventListener_childattached(`type`: `child-attached`, listener: js.Function1[/* event */ Event & DetailEvent[El], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_childattached(
    `type`: `child-attached`,
    listener: js.Function1[/* event */ Event & DetailEvent[El], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_childdetached(`type`: `child-detached`, listener: js.Function1[/* event */ Event & DetailEvent[El], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_childdetached(
    `type`: `child-detached`,
    listener: js.Function1[/* event */ Event & DetailEvent[El], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentchanged(`type`: componentchanged, listener: js.Function1[/* event */ Event & DetailEvent[Id], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentchanged(
    `type`: componentchanged,
    listener: js.Function1[/* event */ Event & DetailEvent[Id], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentinitialized(`type`: componentinitialized, listener: js.Function1[/* event */ Event & DetailEvent[Data], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentinitialized(
    `type`: componentinitialized,
    listener: js.Function1[/* event */ Event & DetailEvent[Data], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentremoved(`type`: componentremoved, listener: js.Function1[/* event */ Event & DetailEvent[Name], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_componentremoved(
    `type`: componentremoved,
    listener: js.Function1[/* event */ Event & DetailEvent[Name], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loaded(`type`: loaded, listener: js.Function1[/* event */ Event & EventListener, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loaded(
    `type`: loaded,
    listener: js.Function1[/* event */ Event & EventListener, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.Function1[/* event */ Event & EventListener, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.Function1[/* event */ Event & EventListener, Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.Function1[/* event */ Event & EventListener, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_play(`type`: play, listener: js.Function1[/* event */ Event & EventListener, Unit], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_schemachanged(
    `type`: schemachanged,
    listener: js.Function1[/* event */ Event & DetailEvent[ComponentName], Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_schemachanged(
    `type`: schemachanged,
    listener: js.Function1[/* event */ Event & DetailEvent[ComponentName], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateadded(`type`: stateadded, listener: js.Function1[/* event */ Event & DetailEvent[State], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateadded(
    `type`: stateadded,
    listener: js.Function1[/* event */ Event & DetailEvent[State], Unit],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateremoved(`type`: stateremoved, listener: js.Function1[/* event */ Event & DetailEvent[State], Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_stateremoved(
    `type`: stateremoved,
    listener: js.Function1[/* event */ Event & DetailEvent[State], Unit],
    useCapture: Boolean
  ): Unit = js.native
  
  def addState(name: String): Unit = js.native
  
  var components: C & DefaultComponents = js.native
  
  def destroy(): Unit = js.native
  
  def flushToDOM(): Unit = js.native
  def flushToDOM(recursive: Boolean): Unit = js.native
  
  def getAttribute(`type`: position | rotation | scale): Coordinate = js.native
  
  /**
    * @deprecated since 0.4.0
    */
  def getComputedAttribute(attr: String): Component[Any, System[Any]] = js.native
  
  def getDOMAttribute(attr: String): Any = js.native
  
  def getObject3D(`type`: String): Object3D[typingsJapgolly.three.srcCoreEventDispatcherMod.Event] = js.native
  
  def getOrCreateObject3D(`type`: String, construct: Any): Object3D[typingsJapgolly.three.srcCoreEventDispatcherMod.Event] = js.native
  
  def is(stateName: String): Boolean = js.native
  
  var isPlaying: Boolean = js.native
  
  var object3D: Object3D[typingsJapgolly.three.srcCoreEventDispatcherMod.Event] = js.native
  
  var object3DMap: ObjectMap[Object3D[typingsJapgolly.three.srcCoreEventDispatcherMod.Event]] = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def removeAttribute(attr: String, property: String): Unit = js.native
  
  def removeObject3D(`type`: String): Unit = js.native
  
  def removeState(stateName: String): Unit = js.native
  
  var sceneEl: js.UndefOr[Scene] = js.native
  
  def setAttribute(attr: String, property: String, componentAttrValue: Any): Unit = js.native
  def setAttribute(`type`: position | rotation | scale, value: Coordinate): Unit = js.native
  
  def setObject3D(`type`: String, obj: Object3D[typingsJapgolly.three.srcCoreEventDispatcherMod.Event]): Unit = js.native
}
