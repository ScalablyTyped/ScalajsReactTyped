package typingsJapgolly.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreOptions extends StObject {
  
  var factory: js.UndefOr[
    typingsJapgolly.rdfjsTypes.dataModelMod.DataFactory[
      typingsJapgolly.rdfjsTypes.dataModelMod.Quad, 
      typingsJapgolly.rdfjsTypes.dataModelMod.Quad
    ]
  ] = js.undefined
}
object StoreOptions {
  
  inline def apply(): StoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreOptions]
  }
  
  extension [Self <: StoreOptions](x: Self) {
    
    inline def setFactory(
      value: typingsJapgolly.rdfjsTypes.dataModelMod.DataFactory[
          typingsJapgolly.rdfjsTypes.dataModelMod.Quad, 
          typingsJapgolly.rdfjsTypes.dataModelMod.Quad
        ]
    ): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
  }
}
