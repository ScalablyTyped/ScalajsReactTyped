package typingsJapgolly.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./system.js').ComponentSystem} ComponentSystem */
/** @typedef {import('../entity.js').Entity} Entity */
/**
  * Components are used to attach functionality on a {@link Entity}. Components can receive update
  * events each frame, and expose properties to the PlayCanvas Editor.
  *
  * @property {boolean} enabled Enables or disables the component.
  * @augments EventHandler
  */
@js.native
trait Component extends EventHandler {
  
  def buildAccessors(schema: Any): Unit = js.native
  
  /**
    * Access the component data directly. Usually you should access the data properties via the
    * individual properties as modifying this data directly will not fire 'set' events.
    *
    * @type {*}
    * @ignore
    */
  def data: Any = js.native
  
  def enabled: Boolean = js.native
  def enabled_=(arg: Boolean): Unit = js.native
  
  /**
    * The Entity that this Component is attached to.
    *
    * @type {Entity}
    * @ignore
    */
  var entity: Entity = js.native
  
  def onDisable(): Unit = js.native
  
  def onEnable(): Unit = js.native
  
  def onPostStateChange(): Unit = js.native
  
  def onSetEnabled(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  /**
    * The ComponentSystem used to create this Component.
    *
    * @type {ComponentSystem}
    * @ignore
    */
  var system: ComponentSystem = js.native
}
