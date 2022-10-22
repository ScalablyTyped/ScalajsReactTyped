package typingsJapgolly.three

import org.scalajs.dom.HTMLElement
import typingsJapgolly.three.anon.LEFT_
import typingsJapgolly.three.anon.Left
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.EventDispatcher
import typingsJapgolly.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmControlsTrackballControlsMod {
  
  @JSImport("three/examples/jsm/controls/TrackballControls", "TrackballControls")
  @js.native
  open class TrackballControls protected () extends EventDispatcher[Event] {
    def this(`object`: Camera) = this()
    def this(`object`: Camera, domElement: HTMLElement) = this()
    
    def checkDistances(): Unit = js.native
    
    def dispose(): Unit = js.native
    
    var domElement: HTMLElement = js.native
    
    var dynamicDampingFactor: Double = js.native
    
    // API
    var enabled: Boolean = js.native
    
    def handleResize(): Unit = js.native
    
    var keys: js.Array[String] = js.native
    
    var maxDistance: Double = js.native
    
    var minDistance: Double = js.native
    
    var mouseButtons: LEFT_ = js.native
    
    var noPan: Boolean = js.native
    
    var noRoll: Boolean = js.native
    
    var noRotate: Boolean = js.native
    
    var noZoom: Boolean = js.native
    
    var `object`: Camera = js.native
    
    def panCamera(): Unit = js.native
    
    var panSpeed: Double = js.native
    
    var position0: Vector3 = js.native
    
    def reset(): Unit = js.native
    
    def rotateCamera(): Unit = js.native
    
    var rotateSpeed: Double = js.native
    
    var screen: Left = js.native
    
    var staticMoving: Boolean = js.native
    
    var target: Vector3 = js.native
    
    var target0: Vector3 = js.native
    
    var up0: Vector3 = js.native
    
    def update(): Unit = js.native
    
    def zoomCamera(): Unit = js.native
    
    var zoomSpeed: Double = js.native
  }
}
