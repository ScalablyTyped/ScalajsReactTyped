package typingsJapgolly.winrtUwp.global.Windows.Graphics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies pixel formats for use with Winrt Direct3D 11 interop surfaces. */
object DirectX {
  
  /** Provides Windows Runtime projections of Microsoft Direct3D APIs to enable Windows Runtime components to exchange Direct3D surfaces and devices. */
  object Direct3D11 {
    
    /** A Windows Runtime projection of the D3D11_BIND_FLAG enumeration. Identifies the ways in which a resource may be bound to the graphics pipeline. */
    @JSGlobal("Windows.Graphics.DirectX.Direct3D11.Direct3DBindings")
    @js.native
    object Direct3DBindings extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings & Double
          ] = js.native
      
      /* 2 */ val constantBuffer: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.constantBuffer & Double = js.native
      
      /* 8 */ val decoder: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.decoder & Double = js.native
      
      /* 6 */ val depthStencil: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.depthStencil & Double = js.native
      
      /* 1 */ val indexBuffer: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.indexBuffer & Double = js.native
      
      /* 5 */ val renderTarget: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.renderTarget & Double = js.native
      
      /* 3 */ val shaderResource: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.shaderResource & Double = js.native
      
      /* 4 */ val streamOutput: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.streamOutput & Double = js.native
      
      /* 7 */ val unorderedAccess: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.unorderedAccess & Double = js.native
      
      /* 0 */ val vertexBuffer: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.vertexBuffer & Double = js.native
      
      /* 9 */ val videoEncoder: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DBindings.videoEncoder & Double = js.native
    }
    
    /** A Windows Runtime projection of the D3D11_USAGE enumeration. Identifies expected resource use during rendering. The usage directly reflects whether a resource is accessible by the CPU and/or the graphics processing unit (GPU). */
    @JSGlobal("Windows.Graphics.DirectX.Direct3D11.Direct3DUsage")
    @js.native
    object Direct3DUsage extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DUsage & Double
          ] = js.native
      
      /* 0 */ val default: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DUsage.default & Double = js.native
      
      /* 2 */ val dynamic: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DUsage.dynamic & Double = js.native
      
      /* 1 */ val immutable: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DUsage.immutable & Double = js.native
      
      /* 3 */ val staging: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.Direct3D11.Direct3DUsage.staging & Double = js.native
    }
  }
  
  /** Identifies the alpha value, transparency behavior, of a surface. This is a managed version of the DXGI_APLAHA_MODE enumeration. */
  @JSGlobal("Windows.Graphics.DirectX.DirectXAlphaMode")
  @js.native
  object DirectXAlphaMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXAlphaMode & Double] = js.native
    
    /* 3 */ val ignore: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXAlphaMode.ignore & Double = js.native
    
    /* 1 */ val premultiplied: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXAlphaMode.premultiplied & Double = js.native
    
    /* 2 */ val straight: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXAlphaMode.straight & Double = js.native
    
    /* 0 */ val unspecified: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXAlphaMode.unspecified & Double = js.native
  }
  
  /** Specifies pixel formats, which includes fully-typed and type-less formats. This is a managed version of the DXGI_FORMAT enumeration. */
  @JSGlobal("Windows.Graphics.DirectX.DirectXPixelFormat")
  @js.native
  object DirectXPixelFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat & Double] = js.native
    
    /* 114 */ val a8P8: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.a8P8 & Double = js.native
    
    /* 65 */ val a8UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.a8UIntNormalized & Double = js.native
    
    /* 111 */ val ai44: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.ai44 & Double = js.native
    
    /* 100 */ val ayuv: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.ayuv & Double = js.native
    
    /* 115 */ val b4G4R4A4UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b4G4R4A4UIntNormalized & Double = js.native
    
    /* 86 */ val b5G5R5A1UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b5G5R5A1UIntNormalized & Double = js.native
    
    /* 85 */ val b5G6R5UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b5G6R5UIntNormalized & Double = js.native
    
    /* 90 */ val b8G8R8A8Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8A8Typeless & Double = js.native
    
    /* 87 */ val b8G8R8A8UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8A8UIntNormalized & Double = js.native
    
    /* 91 */ val b8G8R8A8UIntNormalizedSrgb: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8A8UIntNormalizedSrgb & Double = js.native
    
    /* 92 */ val b8G8R8X8Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8X8Typeless & Double = js.native
    
    /* 88 */ val b8G8R8X8UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8X8UIntNormalized & Double = js.native
    
    /* 93 */ val b8G8R8X8UIntNormalizedSrgb: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.b8G8R8X8UIntNormalizedSrgb & Double = js.native
    
    /* 70 */ val bc1Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc1Typeless & Double = js.native
    
    /* 71 */ val bc1UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc1UIntNormalized & Double = js.native
    
    /* 72 */ val bc1UIntNormalizedSrgb: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc1UIntNormalizedSrgb & Double = js.native
    
    /* 73 */ val bc2Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc2Typeless & Double = js.native
    
    /* 74 */ val bc2UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc2UIntNormalized & Double = js.native
    
    /* 75 */ val bc2UIntNormalizedSrgb: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc2UIntNormalizedSrgb & Double = js.native
    
    /* 76 */ val bc3Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc3Typeless & Double = js.native
    
    /* 77 */ val bc3UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc3UIntNormalized & Double = js.native
    
    /* 78 */ val bc3UIntNormalizedSrgb: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc3UIntNormalizedSrgb & Double = js.native
    
    /* 81 */ val bc4IntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc4IntNormalized & Double = js.native
    
    /* 79 */ val bc4Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc4Typeless & Double = js.native
    
    /* 80 */ val bc4UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc4UIntNormalized & Double = js.native
    
    /* 84 */ val bc5IntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc5IntNormalized & Double = js.native
    
    /* 82 */ val bc5Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc5Typeless & Double = js.native
    
    /* 83 */ val bc5UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc5UIntNormalized & Double = js.native
    
    /* 96 */ val bc6H16Float: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc6H16Float & Double = js.native
    
    /* 95 */ val bc6H16UnsignedFloat: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc6H16UnsignedFloat & Double = js.native
    
    /* 94 */ val bc6HTypeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc6HTypeless & Double = js.native
    
    /* 97 */ val bc7Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc7Typeless & Double = js.native
    
    /* 98 */ val bc7UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc7UIntNormalized & Double = js.native
    
    /* 99 */ val bc7UIntNormalizedSrgb: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.bc7UIntNormalizedSrgb & Double = js.native
    
    /* 55 */ val d16UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.d16UIntNormalized & Double = js.native
    
    /* 45 */ val d24UIntNormalizedS8UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.d24UIntNormalizedS8UInt & Double = js.native
    
    /* 40 */ val d32Float: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.d32Float & Double = js.native
    
    /* 20 */ val d32FloatS8X24UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.d32FloatS8X24UInt & Double = js.native
    
    /* 69 */ val g8R8G8B8UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.g8R8G8B8UIntNormalized & Double = js.native
    
    /* 112 */ val ia44: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.ia44 & Double = js.native
    
    /* 110 */ val nv11: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.nv11 & Double = js.native
    
    /* 103 */ val nv12: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.nv12 & Double = js.native
    
    /* 106 */ val opaque420: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.opaque420 & Double = js.native
    
    /* 104 */ val p010: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.p010 & Double = js.native
    
    /* 105 */ val p016: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.p016 & Double = js.native
    
    /* 116 */ val p208: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.p208 & Double = js.native
    
    /* 113 */ val p8: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.p8 & Double = js.native
    
    /* 23 */ val r10G10B10A2Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r10G10B10A2Typeless & Double = js.native
    
    /* 25 */ val r10G10B10A2UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r10G10B10A2UInt & Double = js.native
    
    /* 24 */ val r10G10B10A2UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r10G10B10A2UIntNormalized & Double = js.native
    
    /* 89 */ val r10G10B10XRBiasA2UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r10G10B10XRBiasA2UIntNormalized & Double = js.native
    
    /* 26 */ val r11G11B10Float: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r11G11B10Float & Double = js.native
    
    /* 54 */ val r16Float: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16Float & Double = js.native
    
    /* 10 */ val r16G16B16A16Float: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16Float & Double = js.native
    
    /* 14 */ val r16G16B16A16Int: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16Int & Double = js.native
    
    /* 13 */ val r16G16B16A16IntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16IntNormalized & Double = js.native
    
    /* 9 */ val r16G16B16A16Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16Typeless & Double = js.native
    
    /* 12 */ val r16G16B16A16UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16UInt & Double = js.native
    
    /* 11 */ val r16G16B16A16UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16B16A16UIntNormalized & Double = js.native
    
    /* 34 */ val r16G16Float: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16Float & Double = js.native
    
    /* 38 */ val r16G16Int: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16Int & Double = js.native
    
    /* 37 */ val r16G16IntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16IntNormalized & Double = js.native
    
    /* 33 */ val r16G16Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16Typeless & Double = js.native
    
    /* 36 */ val r16G16UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16UInt & Double = js.native
    
    /* 35 */ val r16G16UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16G16UIntNormalized & Double = js.native
    
    /* 59 */ val r16Int: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16Int & Double = js.native
    
    /* 58 */ val r16IntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16IntNormalized & Double = js.native
    
    /* 53 */ val r16Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16Typeless & Double = js.native
    
    /* 57 */ val r16UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16UInt & Double = js.native
    
    /* 56 */ val r16UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r16UIntNormalized & Double = js.native
    
    /* 66 */ val r1UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r1UIntNormalized & Double = js.native
    
    /* 44 */ val r24G8Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r24G8Typeless & Double = js.native
    
    /* 46 */ val r24UIntNormalizedX8Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r24UIntNormalizedX8Typeless & Double = js.native
    
    /* 41 */ val r32Float: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32Float & Double = js.native
    
    /* 21 */ val r32FloatX8X24Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32FloatX8X24Typeless & Double = js.native
    
    /* 2 */ val r32G32B32A32Float: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32A32Float & Double = js.native
    
    /* 4 */ val r32G32B32A32Int: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32A32Int & Double = js.native
    
    /* 1 */ val r32G32B32A32Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32A32Typeless & Double = js.native
    
    /* 3 */ val r32G32B32A32UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32A32UInt & Double = js.native
    
    /* 6 */ val r32G32B32Float: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32Float & Double = js.native
    
    /* 8 */ val r32G32B32Int: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32Int & Double = js.native
    
    /* 5 */ val r32G32B32Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32Typeless & Double = js.native
    
    /* 7 */ val r32G32B32UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32B32UInt & Double = js.native
    
    /* 16 */ val r32G32Float: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32Float & Double = js.native
    
    /* 18 */ val r32G32Int: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32Int & Double = js.native
    
    /* 15 */ val r32G32Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32Typeless & Double = js.native
    
    /* 17 */ val r32G32UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G32UInt & Double = js.native
    
    /* 19 */ val r32G8X24Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32G8X24Typeless & Double = js.native
    
    /* 43 */ val r32Int: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32Int & Double = js.native
    
    /* 39 */ val r32Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32Typeless & Double = js.native
    
    /* 42 */ val r32UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r32UInt & Double = js.native
    
    /* 32 */ val r8G8B8A8Int: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8Int & Double = js.native
    
    /* 31 */ val r8G8B8A8IntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8IntNormalized & Double = js.native
    
    /* 27 */ val r8G8B8A8Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8Typeless & Double = js.native
    
    /* 30 */ val r8G8B8A8UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8UInt & Double = js.native
    
    /* 28 */ val r8G8B8A8UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8UIntNormalized & Double = js.native
    
    /* 29 */ val r8G8B8A8UIntNormalizedSrgb: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8A8UIntNormalizedSrgb & Double = js.native
    
    /* 68 */ val r8G8B8G8UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8B8G8UIntNormalized & Double = js.native
    
    /* 52 */ val r8G8Int: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8Int & Double = js.native
    
    /* 51 */ val r8G8IntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8IntNormalized & Double = js.native
    
    /* 48 */ val r8G8Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8Typeless & Double = js.native
    
    /* 50 */ val r8G8UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8UInt & Double = js.native
    
    /* 49 */ val r8G8UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8G8UIntNormalized & Double = js.native
    
    /* 64 */ val r8Int: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8Int & Double = js.native
    
    /* 63 */ val r8IntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8IntNormalized & Double = js.native
    
    /* 60 */ val r8Typeless: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8Typeless & Double = js.native
    
    /* 62 */ val r8UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8UInt & Double = js.native
    
    /* 61 */ val r8UIntNormalized: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r8UIntNormalized & Double = js.native
    
    /* 67 */ val r9G9B9E5SharedExponent: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.r9G9B9E5SharedExponent & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.unknown & Double = js.native
    
    /* 117 */ val v208: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.v208 & Double = js.native
    
    /* 118 */ val v408: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.v408 & Double = js.native
    
    /* 47 */ val x24TypelessG8UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.x24TypelessG8UInt & Double = js.native
    
    /* 22 */ val x32TypelessG8X24UInt: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.x32TypelessG8X24UInt & Double = js.native
    
    /* 108 */ val y210: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.y210 & Double = js.native
    
    /* 109 */ val y216: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.y216 & Double = js.native
    
    /* 101 */ val y410: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.y410 & Double = js.native
    
    /* 102 */ val y416: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.y416 & Double = js.native
    
    /* 107 */ val yuy2: typingsJapgolly.winrtUwp.Windows.Graphics.DirectX.DirectXPixelFormat.yuy2 & Double = js.native
  }
}
