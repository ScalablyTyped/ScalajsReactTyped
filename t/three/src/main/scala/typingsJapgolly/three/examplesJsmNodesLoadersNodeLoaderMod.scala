package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.examplesJsmNodesCoreConstantsMod.AnyJson
import typingsJapgolly.three.examplesJsmNodesNodesMod.Node
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import typingsJapgolly.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLoadersNodeLoaderMod {
  
  @JSImport("three/examples/jsm/nodes/loaders/NodeLoader", JSImport.Default)
  @js.native
  open class default () extends NodeLoader {
    def this(manager: LoadingManager) = this()
  }
  
  @js.native
  trait NodeLoader extends Loader {
    
    def load(url: String, onLoad: js.Function1[/* gltf */ NodeLoaderResult, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* gltf */ NodeLoaderResult, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* gltf */ NodeLoaderResult, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* gltf */ NodeLoaderResult, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(json: AnyJson): Node = js.native
    
    def parseNodes(json: AnyJson): NodeLoaderResult = js.native
    
    def setTextures(textures: StringDictionary[Texture]): this.type = js.native
  }
  
  type NodeLoaderResult = StringDictionary[Node]
}
