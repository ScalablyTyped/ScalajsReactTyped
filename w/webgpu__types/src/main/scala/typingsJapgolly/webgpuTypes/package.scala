package typingsJapgolly.webgpuTypes

import typingsJapgolly.std.ReadonlySet
import typingsJapgolly.webgpuTypes.webgpuTypesStrings.`write-only`
import typingsJapgolly.webgpuTypes.webgpuTypesStrings.auto
import typingsJapgolly.webgpuTypes.webgpuTypesStrings.destroyed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type GPUAutoLayoutMode = auto

type GPUBufferDynamicOffset = Double

type GPUBufferUsageFlags = Double

/** @deprecated use GPUCanvasAlphaMode instead */
type GPUCanvasCompositingAlphaMode = GPUCanvasAlphaMode

type GPUColor = js.Iterable[Double] | GPUColorDict

type GPUColorWriteFlags = Double

type GPUCommandBufferDescriptor = GPUObjectDescriptorBase

type GPUCommandEncoderDescriptor = GPUObjectDescriptorBase

type GPUComputePassTimestampWrites = js.Iterable[GPUComputePassTimestampWrite]

type GPUDepthBias = Double

type GPUDeviceLostReason = destroyed

type GPUExtent3D = js.Iterable[GPUIntegerCoordinate] | GPUExtent3DDict

type GPUExtent3DStrict = js.Iterable[GPUIntegerCoordinate] | GPUExtent3DDictStrict

type GPUFlagsConstant = Double

type GPUIndex32 = Double

type GPUIntegerCoordinate = Double

type GPUMapModeFlags = Double

type GPUOrigin2D = js.Iterable[GPUIntegerCoordinate] | GPUOrigin2DDict

type GPUOrigin2DStrict = js.Iterable[GPUIntegerCoordinate] | GPUOrigin2DDictStrict

type GPUOrigin3D = js.Iterable[GPUIntegerCoordinate] | GPUOrigin3DDict

type GPUPipelineConstantValue = Double

type GPUQueueDescriptor = GPUObjectDescriptorBase

type GPURenderBundleDescriptor = GPUObjectDescriptorBase

type GPURenderPassTimestampWrites = js.Iterable[GPURenderPassTimestampWrite]

type GPUSampleMask = Double

type GPUShaderStageFlags = Double

type GPUSignedOffset32 = Double

type GPUSize32 = Double

type GPUSize64 = Double

type GPUStencilValue = Double

type GPUStorageTextureAccess = `write-only`

type GPUSupportedFeatures = ReadonlySet[String]

type GPUTextureUsageFlags = Double

type WorkerNavigator = NavigatorGPU
