package typingsJapgolly.three

import org.scalajs.dom.SVGElement
import typingsJapgolly.three.anon.Render
import typingsJapgolly.three.anon.Width
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcThreeMod.Camera
import typingsJapgolly.three.srcThreeMod.Color
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.srcThreeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmRenderersSvgrendererMod {
  
  @JSImport("three/examples/jsm/renderers/SVGRenderer", "SVGObject")
  @js.native
  open class SVGObject protected () extends Object3D[Event] {
    def this(node: SVGElement) = this()
    
    var node: SVGElement = js.native
  }
  
  @JSImport("three/examples/jsm/renderers/SVGRenderer", "SVGRenderer")
  @js.native
  open class SVGRenderer () extends StObject {
    
    var autoClear: Boolean = js.native
    
    def clear(): Unit = js.native
    
    var domElement: SVGElement = js.native
    
    def getSize(): Width = js.native
    
    var info: Render = js.native
    
    var overdraw: Double = js.native
    
    def render(scene: Scene, camera: Camera): Unit = js.native
    
    def setClearColor(color: Color, alpha: Double): Unit = js.native
    
    def setPixelRatio(): Unit = js.native
    
    def setPrecision(precision: Double): Unit = js.native
    
    def setQuality(quality: String): Unit = js.native
    
    def setSize(width: Double, height: Double): Unit = js.native
    
    var sortElements: Boolean = js.native
    
    var sortObjects: Boolean = js.native
  }
}
