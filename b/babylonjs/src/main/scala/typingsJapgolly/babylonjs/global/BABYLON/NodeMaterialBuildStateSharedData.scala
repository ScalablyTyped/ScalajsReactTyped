package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Immutable
import typingsJapgolly.babylonjs.anon.EmitVertex
import typingsJapgolly.babylonjs.anon.NeedAlphaBlending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NodeMaterialBuildStateSharedData")
@js.native
/** Creates a new shared data */
open class NodeMaterialBuildStateSharedData ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.NodeMaterialBuildStateSharedData {
  
  /**
    * Is vertex program allowed to be empty?
    */
  /* CompleteClass */
  var allowEmptyVertexProgram: Boolean = js.native
  
  /**
    * Gets the list of animated inputs
    */
  /* CompleteClass */
  var animatedInputs: js.Array[typingsJapgolly.babylonjs.BABYLON.InputBlock] = js.native
  
  /**
    * Bindable blocks (Blocks that need to set data to the effect)
    */
  /* CompleteClass */
  var bindableBlocks: js.Array[typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  
  /**
    * List of blocks that can block the isReady function for the material
    */
  /* CompleteClass */
  var blockingBlocks: js.Array[typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  
  /**
    * List of blocks that can provide a define update
    */
  /* CompleteClass */
  var blocksWithDefines: js.Array[typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  
  /**
    * List of blocks that can provide a compilation fallback
    */
  /* CompleteClass */
  var blocksWithFallbacks: js.Array[typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  
  /**
    * Build Id used to avoid multiple recompilations
    */
  /* CompleteClass */
  var buildId: Double = js.native
  
  /**
    * List of compilation checks
    */
  /* CompleteClass */
  var checks: EmitVertex = js.native
  
  /** List of emitted defines */
  /* CompleteClass */
  var defineNames: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  
  /**
    * List of blocks that can provide a dynamic list of uniforms
    */
  /* CompleteClass */
  var dynamicUniformBlocks: js.Array[typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  
  /** Should emit comments? */
  /* CompleteClass */
  var emitComments: Boolean = js.native
  
  /**
    * Emits console errors and exceptions if there is a failing check
    */
  /* CompleteClass */
  override def emitErrors(): Unit = js.native
  
  /**
    * Bindable blocks (Blocks that need to set data to the effect) that will always be called (by bindForSubMesh), contrary to bindableBlocks that won't be called if _mustRebind() returns false
    */
  /* CompleteClass */
  var forcedBindableBlocks: js.Array[typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  
  /**
    * List of the fragment output nodes
    */
  /* CompleteClass */
  var fragmentOutputNodes: Immutable[js.Array[typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlock]] = js.native
  
  /**
    * Gets the compilation hints emitted at compilation time
    */
  /* CompleteClass */
  var hints: NeedAlphaBlending = js.native
  
  /**
    * Input blocks
    */
  /* CompleteClass */
  var inputBlocks: js.Array[typingsJapgolly.babylonjs.BABYLON.InputBlock] = js.native
  
  /**
    * List of blocks that can provide a repeatable content
    */
  /* CompleteClass */
  var repeatableContentBlocks: js.Array[typingsJapgolly.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  
  /** Gets or sets the hosting scene */
  /* CompleteClass */
  var scene: typingsJapgolly.babylonjs.BABYLON.Scene = js.native
  
  /**
    * Gets the list of emitted varyings
    */
  /* CompleteClass */
  var temps: js.Array[String] = js.native
  
  /**
    * Input blocks
    */
  /* CompleteClass */
  var textureBlocks: js.Array[
    typingsJapgolly.babylonjs.BABYLON.ImageSourceBlock | typingsJapgolly.babylonjs.BABYLON.TextureBlock | typingsJapgolly.babylonjs.BABYLON.ReflectionTextureBaseBlock | typingsJapgolly.babylonjs.BABYLON.RefractionBlock | typingsJapgolly.babylonjs.BABYLON.CurrentScreenBlock | typingsJapgolly.babylonjs.BABYLON.ParticleTextureBlock
  ] = js.native
  
  /** List of emitted variables */
  /* CompleteClass */
  var variableNames: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  
  /**
    * Gets the varying declaration string
    */
  /* CompleteClass */
  var varyingDeclaration: String = js.native
  
  /**
    * Gets the list of emitted varyings
    */
  /* CompleteClass */
  var varyings: js.Array[String] = js.native
  
  /** Emit build activity */
  /* CompleteClass */
  var verbose: Boolean = js.native
}
