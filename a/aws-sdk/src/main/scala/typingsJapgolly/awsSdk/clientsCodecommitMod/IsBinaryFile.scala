package typingsJapgolly.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsBinaryFile extends StObject {
  
  /**
    * The binary or non-binary status of a file in the base of a merge or pull request.
    */
  var base: js.UndefOr[CapitalBoolean] = js.undefined
  
  /**
    * The binary or non-binary status of a file in the destination of a merge or pull request.
    */
  var destination: js.UndefOr[CapitalBoolean] = js.undefined
  
  /**
    * The binary or non-binary status of file in the source of a merge or pull request.
    */
  var source: js.UndefOr[CapitalBoolean] = js.undefined
}
object IsBinaryFile {
  
  inline def apply(): IsBinaryFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsBinaryFile]
  }
  
  extension [Self <: IsBinaryFile](x: Self) {
    
    inline def setBase(value: CapitalBoolean): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setDestination(value: CapitalBoolean): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setSource(value: CapitalBoolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
