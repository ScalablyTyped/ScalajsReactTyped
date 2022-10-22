package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.three.examplesJsmNodesCoreConstantsMod.AnyJson
import typingsJapgolly.three.examplesJsmNodesLoadersNodeLoaderMod.NodeLoaderResult
import typingsJapgolly.three.srcThreeMod.Material
import typingsJapgolly.three.srcThreeMod.ObjectLoader
import typingsJapgolly.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesLoadersNodeObjectLoaderMod {
  
  @JSImport("three/examples/jsm/nodes/loaders/NodeObjectLoader", JSImport.Default)
  @js.native
  open class default () extends NodeObjectLoader
  
  @js.native
  trait NodeObjectLoader extends ObjectLoader {
    
    // tslint:disable-next-line:comment-format
    //@ts-expect-error
    def parseMaterials(json: AnyJson, textures: StringDictionary[Texture]): StringDictionary[Material] = js.native
    
    def parseNodes(json: AnyJson, textures: StringDictionary[Texture]): NodeLoaderResult = js.native
  }
}
