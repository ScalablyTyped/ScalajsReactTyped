package typingsJapgolly.openlayers.mod.olx.format

import org.scalajs.dom.Node
import typingsJapgolly.openlayers.mod.Feature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPXOptions extends StObject {
  
  var readExtensions: js.UndefOr[js.Function2[/* feature */ Feature, /* node */ Node, Any]] = js.undefined
}
object GPXOptions {
  
  inline def apply(): GPXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPXOptions]
  }
  
  extension [Self <: GPXOptions](x: Self) {
    
    inline def setReadExtensions(value: (/* feature */ Feature, /* node */ Node) => Any): Self = StObject.set(x, "readExtensions", js.Any.fromFunction2(value))
    
    inline def setReadExtensionsUndefined: Self = StObject.set(x, "readExtensions", js.undefined)
  }
}
