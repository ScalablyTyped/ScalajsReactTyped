package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmWebxrXrhandmeshmodelMod.XRHandMeshModel
import typingsJapgolly.three.examplesJsmWebxrXrhandprimitivemodelMod.XRHandPrimitiveModel
import typingsJapgolly.three.examplesJsmWebxrXrhandprimitivemodelMod.XRHandPrimitiveModelOptions
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcThreeMod.Group
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.threeStrings.boxes
import typingsJapgolly.three.threeStrings.mesh
import typingsJapgolly.three.threeStrings.spheres
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmWebxrXrhandmodelfactoryMod {
  
  @JSImport("three/examples/jsm/webxr/XRHandModelFactory", "XRHandModel")
  @js.native
  open class XRHandModel () extends Object3D[Event] {
    
    var motionController: XRHandPrimitiveModel | XRHandMeshModel = js.native
  }
  
  @JSImport("three/examples/jsm/webxr/XRHandModelFactory", "XRHandModelFactory")
  @js.native
  open class XRHandModelFactory () extends StObject {
    
    def createHandModel(controller: Group): XRHandModel = js.native
    def createHandModel(controller: Group, profile: spheres | boxes | mesh): XRHandModel = js.native
    def createHandModel(controller: Group, profile: spheres | boxes | mesh, options: XRHandPrimitiveModelOptions): XRHandModel = js.native
    def createHandModel(controller: Group, profile: Unit, options: XRHandPrimitiveModelOptions): XRHandModel = js.native
    
    var path: String = js.native
    
    def setPath(path: String): XRHandModelFactory = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.three.threeStrings.left
    - typingsJapgolly.three.threeStrings.right
  */
  trait XRHandModelHandedness extends StObject
  object XRHandModelHandedness {
    
    inline def left: typingsJapgolly.three.threeStrings.left = "left".asInstanceOf[typingsJapgolly.three.threeStrings.left]
    
    inline def right: typingsJapgolly.three.threeStrings.right = "right".asInstanceOf[typingsJapgolly.three.threeStrings.right]
  }
}
