package typingsJapgolly.babylonjs.BABYLON

import typingsJapgolly.babylonjs.anon.FragmentCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUShaderProcessorWGSL
  extends StObject
     with WebGPUShaderProcessor {
  
  /* protected */ var _attributeNamesWGSL: js.Array[String] = js.native
  
  /* protected */ var _attributesDeclWGSL: js.Array[String] = js.native
  
  /* protected */ var _attributesWGSL: js.Array[String] = js.native
  
  /* private */ var _processCustomBuffers: Any = js.native
  
  /* private */ var _processSamplers: Any = js.native
  
  /* private */ var _processStridedUniformArrays: Any = js.native
  
  /* protected */ var _stridedUniformArrays: js.Array[String] = js.native
  
  /* protected */ var _varyingNamesWGSL: js.Array[String] = js.native
  
  /* protected */ var _varyingsDeclWGSL: js.Array[String] = js.native
  
  /* protected */ var _varyingsWGSL: js.Array[String] = js.native
  
  @JSName("attributeProcessor")
  def attributeProcessor_MWebGPUShaderProcessorWGSL(attribute: String, preProcessors: org.scalablytyped.runtime.StringDictionary[String]): String = js.native
  
  @JSName("finalizeShaders")
  def finalizeShaders_MWebGPUShaderProcessorWGSL(vertexCode: String, fragmentCode: String): FragmentCode = js.native
  
  @JSName("initializeShaders")
  def initializeShaders_MWebGPUShaderProcessorWGSL(processingContext: Nullable[ShaderProcessingContext]): Unit = js.native
  
  @JSName("noPrecision")
  var noPrecision_WebGPUShaderProcessorWGSL: Boolean = js.native
  
  @JSName("postProcessor")
  def postProcessor_MWebGPUShaderProcessorWGSL(code: String): String = js.native
  
  @JSName("preProcessShaderCode")
  def preProcessShaderCode_MWebGPUShaderProcessorWGSL(code: String): String = js.native
  
  @JSName("textureProcessor")
  def textureProcessor_MWebGPUShaderProcessorWGSL(
    texture: String,
    isFragment: Boolean,
    preProcessors: org.scalablytyped.runtime.StringDictionary[String]
  ): String = js.native
  
  @JSName("textureRegexp")
  var textureRegexp_WebGPUShaderProcessorWGSL: js.RegExp = js.native
  
  @JSName("uniformProcessor")
  def uniformProcessor_MWebGPUShaderProcessorWGSL(
    uniform: String,
    isFragment: Boolean,
    preProcessors: org.scalablytyped.runtime.StringDictionary[String]
  ): String = js.native
  
  @JSName("uniformRegexp")
  var uniformRegexp_WebGPUShaderProcessorWGSL: js.RegExp = js.native
  
  @JSName("varyingProcessor")
  def varyingProcessor_MWebGPUShaderProcessorWGSL(
    varying: String,
    isFragment: Boolean,
    preProcessors: org.scalablytyped.runtime.StringDictionary[String]
  ): String = js.native
}
