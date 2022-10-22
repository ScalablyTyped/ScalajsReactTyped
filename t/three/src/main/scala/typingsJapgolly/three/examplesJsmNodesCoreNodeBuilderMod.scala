package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.three.examplesJsmNodesCoreConstantsMod.AnyObject
import typingsJapgolly.three.examplesJsmNodesCoreConstantsMod.NodeShaderStageOption
import typingsJapgolly.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import typingsJapgolly.three.srcConstantsMod.TextureEncoding
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcRenderersWebGLRendererMod.Renderer
import typingsJapgolly.three.srcThreeMod.BufferGeometry
import typingsJapgolly.three.srcThreeMod.Material
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.srcThreeMod.Scene
import typingsJapgolly.three.srcThreeMod.Texture
import typingsJapgolly.three.srcThreeMod.WebGLRenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeBuilderMod {
  
  /* note: abstract class */ @JSImport("three/examples/jsm/nodes/core/NodeBuilder", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NodeBuilder
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.three.threeStrings.construct
    - typingsJapgolly.three.threeStrings.analyze
    - typingsJapgolly.three.threeStrings.generate
  */
  trait BuildStageOption extends StObject
  object BuildStageOption {
    
    inline def analyze: typingsJapgolly.three.threeStrings.analyze = "analyze".asInstanceOf[typingsJapgolly.three.threeStrings.analyze]
    
    inline def construct: typingsJapgolly.three.threeStrings.construct = "construct".asInstanceOf[typingsJapgolly.three.threeStrings.construct]
    
    inline def generate: typingsJapgolly.three.threeStrings.generate = "generate".asInstanceOf[typingsJapgolly.three.threeStrings.generate]
  }
  
  trait FlowData extends StObject {
    
    var code: String
  }
  object FlowData {
    
    inline def apply(code: String): FlowData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlowData]
    }
    
    extension [Self <: FlowData](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeBuilder extends StObject {
    
    def addFlow(
      shaderStage: NodeShaderStageOption,
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default
    ): typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    def addFlowCode(code: String): Unit = js.native
    
    def addNode(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default): Unit = js.native
    
    def addStack(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default): Unit = js.native
    
    def build(): this.type = js.native
    
    def buildCode(): Unit = js.native
    
    var buildStage: BuildStageOption | Null = js.native
    
    var computeShader: String = js.native
    
    def flowChildNode(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default): FlowData = js.native
    def flowChildNode(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default, output: String): FlowData = js.native
    
    def flowNode(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default): FlowData = js.native
    
    def flowNodeFromShaderStage(
      shaderStage: NodeShaderStageOption,
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default
    ): FlowData = js.native
    def flowNodeFromShaderStage(
      shaderStage: NodeShaderStageOption,
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      output: String
    ): FlowData = js.native
    def flowNodeFromShaderStage(
      shaderStage: NodeShaderStageOption,
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      output: String,
      propertyName: String
    ): FlowData = js.native
    def flowNodeFromShaderStage(
      shaderStage: NodeShaderStageOption,
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      output: Null,
      propertyName: String
    ): FlowData = js.native
    def flowNodeFromShaderStage(
      shaderStage: NodeShaderStageOption,
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      output: Unit,
      propertyName: String
    ): FlowData = js.native
    
    var fogNode: typingsJapgolly.three.examplesJsmNodesFogFogNodeMod.default = js.native
    
    def format(snippet: String, fromType: NodeTypeOption, toType: NodeTypeOption): String = js.native
    
    var fragmentShader: String = js.native
    
    def generateMethod(method: String): String = js.native
    
    var geometry: BufferGeometry = js.native
    
    def getAttribute(name: String, `type`: NodeTypeOption): typingsJapgolly.three.examplesJsmNodesCoreNodeAttributeMod.default = js.native
    
    def getAttributes(shaderStage: NodeShaderStageOption): String = js.native
    
    def getBuildStage(): BuildStageOption = js.native
    
    def getCodeFromNode(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default, `type`: NodeTypeOption): String = js.native
    def getCodeFromNode(
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      `type`: NodeTypeOption,
      shaderStage: NodeShaderStageOption
    ): String = js.native
    
    def getCodes(shaderStage: NodeShaderStageOption): String = js.native
    
    def getComponentType(`type`: NodeTypeOption): NodeTypeOption = js.native
    
    // @TODO: rename to .generateConst()
    def getConst(`type`: NodeTypeOption, value: Any): typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    def getContext(): NodeBuilderContext = js.native
    
    def getCubeTexture(textureProperty: String, uvSnippet: String): String = js.native
    
    def getCubeTextureLevel(textureProperty: String, uvSnippet: String, levelSnippet: String): String = js.native
    
    def getDataFromNode(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default): NodeData = js.native
    def getDataFromNode(
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      shaderStage: NodeShaderStageOption
    ): NodeData = js.native
    
    def getFlowData(
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      shaderStage: NodeShaderStageOption
    ): FlowData = js.native
    
    def getFrontFacing(): String = js.native
    
    def getHash(): String = js.native
    
    def getInstanceIndex(): String = js.native
    
    def getMethod(method: String): String = js.native
    
    def getNodeFromHash(hash: String): typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    def getNodeProperties(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default): AnyObject = js.native
    def getNodeProperties(
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      shaderStage: NodeShaderStageOption
    ): AnyObject = js.native
    
    def getPropertyName(
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      shaderStage: NodeShaderStageOption
    ): String = js.native
    
    def getShaderStage(): NodeShaderStageOption = js.native
    
    def getSignature(): String = js.native
    
    def getTexture(textureProperty: String, uvSnippet: String): String = js.native
    
    def getTextureEncodingFromMap(map: Any): TextureEncoding = js.native
    def getTextureEncodingFromMap(map: Texture): TextureEncoding = js.native
    def getTextureEncodingFromMap(map: WebGLRenderTarget): TextureEncoding = js.native
    
    def getTextureLevel(textureProperty: String, uvSnippet: String, levelSnippet: String): String = js.native
    
    def getType(`type`: NodeTypeOption): NodeTypeOption = js.native
    
    def getTypeFromLength(length: Double): NodeTypeOption = js.native
    
    def getTypeLength(`type`: NodeTypeOption): Double = js.native
    
    def getUniformFromNode(
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      shaderStage: NodeShaderStageOption,
      `type`: NodeTypeOption
    ): typingsJapgolly.three.examplesJsmNodesCoreNodeUniformMod.default = js.native
    
    def getUniforms(stage: NodeShaderStageOption): String = js.native
    
    def getVarFromNode(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default, `type`: NodeTypeOption): typingsJapgolly.three.examplesJsmNodesCoreNodeVarMod.default = js.native
    def getVarFromNode(
      node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      `type`: NodeTypeOption,
      shaderStage: NodeShaderStageOption
    ): typingsJapgolly.three.examplesJsmNodesCoreNodeVarMod.default = js.native
    
    def getVars(shaderStage: NodeShaderStageOption): String = js.native
    
    def getVaryFromNode(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default, `type`: NodeTypeOption): typingsJapgolly.three.examplesJsmNodesCoreNodeVaryMod.default = js.native
    
    def getVarys(shaderStage: NodeShaderStageOption): String = js.native
    
    def getVectorFromMatrix(`type`: NodeTypeOption): NodeTypeOption = js.native
    
    def getVectorType(`type`: NodeTypeOption): NodeTypeOption = js.native
    
    var hashNodes: StringDictionary[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] = js.native
    
    def isAvailable(name: String): Boolean = js.native
    
    def isMatrix(`type`: NodeTypeOption): Boolean = js.native
    
    def isReference(`type`: NodeTypeOption): Boolean = js.native
    
    def isShaderStage(shaderStage: NodeShaderStageOption): Boolean = js.native
    
    def isVector(`type`: NodeTypeOption): Boolean = js.native
    
    var lightsNode: typingsJapgolly.three.examplesJsmNodesLightingLightsNodeMod.default = js.native
    
    var material: Material = js.native
    
    def node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    var nodes: js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] = js.native
    
    var `object`: Object3D[Event] = js.native
    
    var parser: typingsJapgolly.three.examplesJsmNodesCoreNodeParserMod.default = js.native
    
    def removeStack(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default): Unit = js.native
    
    var renderer: Renderer = js.native
    
    var scene: Scene = js.native
    
    def setBuildStage(buildStage: BuildStageOption): Unit = js.native
    
    def setContext(context: NodeBuilderContext): Unit = js.native
    
    def setHashNode(node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default, hash: String): Unit = js.native
    
    def setShaderStage(shaderStage: NodeShaderStageOption): Unit = js.native
    
    var shaderStage: NodeShaderStageOption | Null = js.native
    
    var stack: js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] = js.native
    
    var updateNodes: js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] = js.native
    
    var vertexShader: String = js.native
  }
  
  type NodeBuilderContext = AnyObject
  
  trait NodeData extends StObject {
    
    var compute: AnyObject
    
    var fragment: AnyObject
    
    var vertex: AnyObject
  }
  object NodeData {
    
    inline def apply(compute: AnyObject, fragment: AnyObject, vertex: AnyObject): NodeData = {
      val __obj = js.Dynamic.literal(compute = compute.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeData]
    }
    
    extension [Self <: NodeData](x: Self) {
      
      inline def setCompute(value: AnyObject): Self = StObject.set(x, "compute", value.asInstanceOf[js.Any])
      
      inline def setFragment(value: AnyObject): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setVertex(value: AnyObject): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    }
  }
}
