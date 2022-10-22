package typingsJapgolly.three

import typingsJapgolly.three.anon.Images
import typingsJapgolly.three.examplesJsmNodesCoreConstantsMod.AnyJson
import typingsJapgolly.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import typingsJapgolly.three.examplesJsmNodesCoreConstantsMod.NodeUpdateTypeOption
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeMod {
  
  /* note: abstract class */ @JSImport("three/examples/jsm/nodes/core/Node", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Node {
    def this(nodeType: NodeTypeOption) = this()
  }
  
  @js.native
  trait Node extends StObject {
    
    def analyze(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): Unit = js.native
    
    def build(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): String = js.native
    def build(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default, output: String): String = js.native
    
    def construct(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): Node | Null = js.native
    
    def deserialize(json: AnyJson): Unit = js.native
    
    def generate(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): String = js.native
    def generate(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default, output: String): String = js.native
    
    def getCacheKey(): String = js.native
    
    def getChildren(): js.Array[Node] = js.native
    
    def getConstructHash(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): String = js.native
    
    def getHash(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): String = js.native
    
    def getNodeType(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): NodeTypeOption | Null = js.native
    def getNodeType(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default, output: String): NodeTypeOption | Null = js.native
    
    def getReference(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): Node = js.native
    
    def getUpdateType(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): NodeUpdateTypeOption = js.native
    
    var id: Double = js.native
    
    var isNode: `true` = js.native
    
    var nodeType: NodeTypeOption | Null = js.native
    
    def serialize(json: AnyJson): Unit = js.native
    
    def toJSON(): AnyJson = js.native
    def toJSON(meta: String): AnyJson = js.native
    def toJSON(meta: Images): AnyJson = js.native
    
    var `type`: String = js.native
    
    /** This method must be overriden when {@link updateType} !== 'none' */
    def update(frame: typingsJapgolly.three.examplesJsmNodesCoreNodeFrameMod.default): Unit = js.native
    
    var updateType: NodeUpdateTypeOption = js.native
    
    var uuid: String = js.native
  }
}
