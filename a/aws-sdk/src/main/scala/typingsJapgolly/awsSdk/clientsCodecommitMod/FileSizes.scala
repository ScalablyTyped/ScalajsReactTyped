package typingsJapgolly.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSizes extends StObject {
  
  /**
    * The size of a file in the base of a merge or pull request.
    */
  var base: js.UndefOr[FileSize] = js.undefined
  
  /**
    * The size of a file in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[FileSize] = js.undefined
  
  /**
    * The size of a file in the source of a merge or pull request.
    */
  var source: js.UndefOr[FileSize] = js.undefined
}
object FileSizes {
  
  inline def apply(): FileSizes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSizes]
  }
  
  extension [Self <: FileSizes](x: Self) {
    
    inline def setBase(value: FileSize): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setDestination(value: FileSize): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setSource(value: FileSize): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
