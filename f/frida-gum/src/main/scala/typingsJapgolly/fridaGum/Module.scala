package typingsJapgolly.fridaGum

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  /**
    * Base address.
    */
  var base: NativePointer
  
  /**
    * Enumerates exports of module.
    */
  def enumerateExports(): js.Array[ModuleExportDetails]
  
  /**
    * Enumerates imports of module.
    */
  def enumerateImports(): js.Array[ModuleImportDetails]
  
  /**
    * Enumerates memory ranges of module with the `name` as seen in `Process#enumerateModules()`.
    *
    * @param protection Minimum protection of ranges to include.
    */
  def enumerateRanges(protection: PageProtection): js.Array[RangeDetails]
  
  /**
    * Enumerates symbols of module.
    */
  def enumerateSymbols(): js.Array[ModuleSymbolDetails]
  
  /**
    * Looks up the absolute address of the export named `exportName`.
    *
    * Returns null if the export doesn't exist.
    *
    * @param exportName Export name to find the address of.
    */
  def findExportByName(exportName: String): NativePointer | Null
  
  /**
    * Looks up the absolute address of the export named `exportName`.
    *
    * Throws an exception if the export doesn't exist.
    *
    * @param exportName Export name to find the address of.
    */
  def getExportByName(exportName: String): NativePointer
  
  /**
    * Canonical module name.
    */
  var name: String
  
  /**
    * Full filesystem path.
    */
  var path: String
  
  /**
    * Size in bytes.
    */
  var size: Double
}
object Module {
  
  inline def apply(
    base: NativePointer,
    enumerateExports: CallbackTo[js.Array[ModuleExportDetails]],
    enumerateImports: CallbackTo[js.Array[ModuleImportDetails]],
    enumerateRanges: PageProtection => js.Array[RangeDetails],
    enumerateSymbols: CallbackTo[js.Array[ModuleSymbolDetails]],
    findExportByName: String => NativePointer | Null,
    getExportByName: String => NativePointer,
    name: String,
    path: String,
    size: Double
  ): Module = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], enumerateExports = enumerateExports.toJsFn, enumerateImports = enumerateImports.toJsFn, enumerateRanges = js.Any.fromFunction1(enumerateRanges), enumerateSymbols = enumerateSymbols.toJsFn, findExportByName = js.Any.fromFunction1(findExportByName), getExportByName = js.Any.fromFunction1(getExportByName), name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  extension [Self <: Module](x: Self) {
    
    inline def setBase(value: NativePointer): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setEnumerateExports(value: CallbackTo[js.Array[ModuleExportDetails]]): Self = StObject.set(x, "enumerateExports", value.toJsFn)
    
    inline def setEnumerateImports(value: CallbackTo[js.Array[ModuleImportDetails]]): Self = StObject.set(x, "enumerateImports", value.toJsFn)
    
    inline def setEnumerateRanges(value: PageProtection => js.Array[RangeDetails]): Self = StObject.set(x, "enumerateRanges", js.Any.fromFunction1(value))
    
    inline def setEnumerateSymbols(value: CallbackTo[js.Array[ModuleSymbolDetails]]): Self = StObject.set(x, "enumerateSymbols", value.toJsFn)
    
    inline def setFindExportByName(value: String => NativePointer | Null): Self = StObject.set(x, "findExportByName", js.Any.fromFunction1(value))
    
    inline def setGetExportByName(value: String => NativePointer): Self = StObject.set(x, "getExportByName", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
