package typingsJapgolly.babylonjs.BABYLON

import typingsJapgolly.babylonjs.GPUBuffer
import typingsJapgolly.babylonjs.GPUBufferUsageFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUBufferManager extends StObject {
  
  /* private */ var _deferredReleaseBuffers: Any = js.native
  
  /* private */ var _device: Any = js.native
  
  /* private */ var _getHalfFloatAsFloatRGBAArrayBuffer: Any = js.native
  
  def createBuffer(viewOrSize: js.typedarray.ArrayBufferView, flags: GPUBufferUsageFlags): WebGPUDataBuffer = js.native
  def createBuffer(viewOrSize: Double, flags: GPUBufferUsageFlags): WebGPUDataBuffer = js.native
  
  def createRawBuffer(viewOrSize: js.typedarray.ArrayBufferView, flags: GPUBufferUsageFlags): GPUBuffer = js.native
  def createRawBuffer(viewOrSize: js.typedarray.ArrayBufferView, flags: GPUBufferUsageFlags, mappedAtCreation: Boolean): GPUBuffer = js.native
  def createRawBuffer(viewOrSize: Double, flags: GPUBufferUsageFlags): GPUBuffer = js.native
  def createRawBuffer(viewOrSize: Double, flags: GPUBufferUsageFlags, mappedAtCreation: Boolean): GPUBuffer = js.native
  
  def destroyDeferredBuffers(): Unit = js.native
  
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Double
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Double,
    buffer: Unit,
    destroyBuffer: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Double,
    buffer: Unit,
    destroyBuffer: Boolean,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Double,
    buffer: Unit,
    destroyBuffer: Unit,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Double,
    buffer: Nullable[js.typedarray.ArrayBufferView]
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Double,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Double,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Boolean,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Double,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Unit,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Unit,
    buffer: Unit,
    destroyBuffer: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Unit,
    buffer: Unit,
    destroyBuffer: Boolean,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Unit,
    buffer: Unit,
    destroyBuffer: Unit,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Unit,
    buffer: Nullable[js.typedarray.ArrayBufferView]
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Unit,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Unit,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Boolean,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Double,
    offset: Unit,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Unit,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Double
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Double,
    buffer: Unit,
    destroyBuffer: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Double,
    buffer: Unit,
    destroyBuffer: Boolean,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Double,
    buffer: Unit,
    destroyBuffer: Unit,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Double,
    buffer: Nullable[js.typedarray.ArrayBufferView]
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Double,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Double,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Boolean,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Double,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Unit,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Unit,
    buffer: Unit,
    destroyBuffer: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Unit,
    buffer: Unit,
    destroyBuffer: Boolean,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Unit,
    buffer: Unit,
    destroyBuffer: Unit,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Unit,
    buffer: Nullable[js.typedarray.ArrayBufferView]
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Unit,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Unit,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Boolean,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  def readDataFromBuffer(
    gpuBuffer: GPUBuffer,
    size: Double,
    width: Double,
    height: Double,
    bytesPerRow: Double,
    bytesPerRowAligned: Double,
    `type`: Unit,
    offset: Unit,
    buffer: Nullable[js.typedarray.ArrayBufferView],
    destroyBuffer: Unit,
    noDataConversion: Boolean
  ): js.Promise[js.typedarray.ArrayBufferView] = js.native
  
  def releaseBuffer(buffer: DataBuffer): Boolean = js.native
  def releaseBuffer(buffer: GPUBuffer): Boolean = js.native
  
  def setRawData(
    buffer: GPUBuffer,
    dstByteOffset: Double,
    src: js.typedarray.ArrayBufferView,
    srcByteOffset: Double,
    byteLength: Double
  ): Unit = js.native
  
  def setSubData(dataBuffer: WebGPUDataBuffer, dstByteOffset: Double, src: js.typedarray.ArrayBufferView): Unit = js.native
  def setSubData(
    dataBuffer: WebGPUDataBuffer,
    dstByteOffset: Double,
    src: js.typedarray.ArrayBufferView,
    srcByteOffset: Double
  ): Unit = js.native
  def setSubData(
    dataBuffer: WebGPUDataBuffer,
    dstByteOffset: Double,
    src: js.typedarray.ArrayBufferView,
    srcByteOffset: Double,
    byteLength: Double
  ): Unit = js.native
  def setSubData(
    dataBuffer: WebGPUDataBuffer,
    dstByteOffset: Double,
    src: js.typedarray.ArrayBufferView,
    srcByteOffset: Unit,
    byteLength: Double
  ): Unit = js.native
}
