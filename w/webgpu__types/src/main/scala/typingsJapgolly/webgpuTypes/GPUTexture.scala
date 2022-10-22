package typingsJapgolly.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPUTexture
  extends StObject
     with GPUObjectBase {
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typingsJapgolly.webgpuTypes.webgpuTypesStrings.GPUTexture = js.native
  
  /**
    * Creates a {@link GPUTextureView}.
    * @param descriptor - Description of the {@link GPUTextureView} to create.
    */
  def createView(): GPUTextureView = js.native
  def createView(descriptor: GPUTextureViewDescriptor): GPUTextureView = js.native
  
  /**
    * The depth or layer count of this {@link GPUTexture}.
    */
  val depthOrArrayLayers: GPUIntegerCoordinate = js.native
  
  /**
    * Destroys the {@link GPUTexture}.
    */
  def destroy(): Unit = js.native
  
  /**
    * The dimension of the set of texel for each of this {@link GPUTexture}'s subresources.
    */
  val dimension: GPUTextureDimension = js.native
  
  /**
    * The format of this {@link GPUTexture}.
    */
  val format: GPUTextureFormat = js.native
  
  /**
    * The height of this {@link GPUTexture}.
    */
  val height: GPUIntegerCoordinate = js.native
  
  /**
    * The number of mip levels of this {@link GPUTexture}.
    */
  val mipLevelCount: GPUIntegerCoordinate = js.native
  
  /**
    * The number of sample count of this {@link GPUTexture}.
    */
  val sampleCount: GPUSize32 = js.native
  
  /**
    * The allowed usages for this {@link GPUTexture}.
    */
  val usage: GPUTextureUsageFlags = js.native
  
  /**
    * The width of this {@link GPUTexture}.
    */
  val width: GPUIntegerCoordinate = js.native
}
