package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KTXTextureLoader
  extends StObject
     with IInternalTextureLoader {
  
  def loadCubeData(
    data: js.Array[js.typedarray.ArrayBufferView],
    texture: InternalTexture,
    createPolynomials: Boolean,
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]]
  ): Unit = js.native
  /**
    * Uploads the cube texture data to the WebGL texture. It has already been bound.
    * @param data contains the texture data
    * @param texture defines the BabylonJS internal texture
    * @param createPolynomials will be true if polynomials have been requested
    * @param onLoad defines the callback to trigger once the texture is ready
    */
  def loadCubeData(
    data: js.typedarray.ArrayBufferView,
    texture: InternalTexture,
    createPolynomials: Boolean,
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]]
  ): Unit = js.native
}
