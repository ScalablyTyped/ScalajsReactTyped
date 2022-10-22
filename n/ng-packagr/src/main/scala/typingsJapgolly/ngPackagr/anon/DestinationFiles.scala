package typingsJapgolly.ngPackagr.anon

import typingsJapgolly.angularCompilerCli.srcPerformCompileMod.ParsedConfiguration
import typingsJapgolly.ngPackagr.libNgPackageEntryPointEntryPointMod.NgEntryPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationFiles extends StObject {
  
  var destinationFiles: typingsJapgolly.ngPackagr.libNgPackageEntryPointEntryPointMod.DestinationFiles
  
  var entryPoint: NgEntryPoint
  
  var tsConfig: js.UndefOr[ParsedConfiguration] = js.undefined
}
object DestinationFiles {
  
  inline def apply(
    destinationFiles: typingsJapgolly.ngPackagr.libNgPackageEntryPointEntryPointMod.DestinationFiles,
    entryPoint: NgEntryPoint
  ): DestinationFiles = {
    val __obj = js.Dynamic.literal(destinationFiles = destinationFiles.asInstanceOf[js.Any], entryPoint = entryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationFiles]
  }
  
  extension [Self <: DestinationFiles](x: Self) {
    
    inline def setDestinationFiles(value: typingsJapgolly.ngPackagr.libNgPackageEntryPointEntryPointMod.DestinationFiles): Self = StObject.set(x, "destinationFiles", value.asInstanceOf[js.Any])
    
    inline def setEntryPoint(value: NgEntryPoint): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setTsConfig(value: ParsedConfiguration): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
    
    inline def setTsConfigUndefined: Self = StObject.set(x, "tsConfig", js.undefined)
  }
}
