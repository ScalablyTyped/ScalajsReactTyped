package typingsJapgolly.tsNode.anon

import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI2.NodeImportAssertions
import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportAssertions extends StObject {
  
  var format: js.UndefOr[NodeLoaderHooksFormat | Null] = js.undefined
  
  var importAssertions: js.UndefOr[NodeImportAssertions] = js.undefined
}
object ImportAssertions {
  
  inline def apply(): ImportAssertions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportAssertions]
  }
  
  extension [Self <: ImportAssertions](x: Self) {
    
    inline def setFormat(value: NodeLoaderHooksFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setImportAssertions(value: NodeImportAssertions): Self = StObject.set(x, "importAssertions", value.asInstanceOf[js.Any])
    
    inline def setImportAssertionsUndefined: Self = StObject.set(x, "importAssertions", js.undefined)
  }
}
