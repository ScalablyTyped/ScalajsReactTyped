package typingsJapgolly.three

import typingsJapgolly.three.srcThreeMod.Data3DTexture
import typingsJapgolly.three.srcThreeMod.DataTexture
import typingsJapgolly.three.srcThreeMod.WebGLRenderTarget
import typingsJapgolly.three.srcThreeMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmExportersKtx2exporterMod {
  
  @JSImport("three/examples/jsm/exporters/KTX2Exporter", "KTX2Exporter")
  @js.native
  open class KTX2Exporter () extends StObject {
    
    def parse(arg1: Data3DTexture): js.typedarray.Uint8Array = js.native
    def parse(arg1: Data3DTexture, arg2: WebGLRenderTarget): js.typedarray.Uint8Array = js.native
    def parse(arg1: DataTexture): js.typedarray.Uint8Array = js.native
    def parse(arg1: DataTexture, arg2: WebGLRenderTarget): js.typedarray.Uint8Array = js.native
    def parse(arg1: WebGLRenderer): js.typedarray.Uint8Array = js.native
    def parse(arg1: WebGLRenderer, arg2: WebGLRenderTarget): js.typedarray.Uint8Array = js.native
  }
}
