package typingsJapgolly.licenseWebpackPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.licenseWebpackPlugin.distLicenseIdentifiedModuleMod.LicenseIdentifiedModule
import typingsJapgolly.licenseWebpackPlugin.distWebpackChunkMod.WebpackChunk
import typingsJapgolly.licenseWebpackPlugin.distWebpackCompilationMod.WebpackCompilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetManagerMod {
  
  trait AssetManager extends StObject {
    
    def writeAllLicenses(modules: js.Array[LicenseIdentifiedModule], compilation: WebpackCompilation): Unit
    
    def writeChunkBanners(modules: js.Array[LicenseIdentifiedModule], compilation: WebpackCompilation, chunk: WebpackChunk): Unit
    
    def writeChunkLicenses(modules: js.Array[LicenseIdentifiedModule], compilation: WebpackCompilation, chunk: WebpackChunk): Unit
  }
  object AssetManager {
    
    inline def apply(
      writeAllLicenses: (js.Array[LicenseIdentifiedModule], WebpackCompilation) => Callback,
      writeChunkBanners: (js.Array[LicenseIdentifiedModule], WebpackCompilation, WebpackChunk) => Callback,
      writeChunkLicenses: (js.Array[LicenseIdentifiedModule], WebpackCompilation, WebpackChunk) => Callback
    ): AssetManager = {
      val __obj = js.Dynamic.literal(writeAllLicenses = js.Any.fromFunction2((t0: js.Array[LicenseIdentifiedModule], t1: WebpackCompilation) => (writeAllLicenses(t0, t1)).runNow()), writeChunkBanners = js.Any.fromFunction3((t0: js.Array[LicenseIdentifiedModule], t1: WebpackCompilation, t2: WebpackChunk) => (writeChunkBanners(t0, t1, t2)).runNow()), writeChunkLicenses = js.Any.fromFunction3((t0: js.Array[LicenseIdentifiedModule], t1: WebpackCompilation, t2: WebpackChunk) => (writeChunkLicenses(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[AssetManager]
    }
    
    extension [Self <: AssetManager](x: Self) {
      
      inline def setWriteAllLicenses(value: (js.Array[LicenseIdentifiedModule], WebpackCompilation) => Callback): Self = StObject.set(x, "writeAllLicenses", js.Any.fromFunction2((t0: js.Array[LicenseIdentifiedModule], t1: WebpackCompilation) => (value(t0, t1)).runNow()))
      
      inline def setWriteChunkBanners(value: (js.Array[LicenseIdentifiedModule], WebpackCompilation, WebpackChunk) => Callback): Self = StObject.set(x, "writeChunkBanners", js.Any.fromFunction3((t0: js.Array[LicenseIdentifiedModule], t1: WebpackCompilation, t2: WebpackChunk) => (value(t0, t1, t2)).runNow()))
      
      inline def setWriteChunkLicenses(value: (js.Array[LicenseIdentifiedModule], WebpackCompilation, WebpackChunk) => Callback): Self = StObject.set(x, "writeChunkLicenses", js.Any.fromFunction3((t0: js.Array[LicenseIdentifiedModule], t1: WebpackCompilation, t2: WebpackChunk) => (value(t0, t1, t2)).runNow()))
    }
  }
}
