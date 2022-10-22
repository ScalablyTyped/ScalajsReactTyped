package typingsJapgolly.pgPromise.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.pgPromise.typescriptPgSubsetMod.IClient
import typingsJapgolly.pgPromise.typescriptPgSubsetMod.IConnectionParameters
import typingsJapgolly.pgPromise.typescriptPgSubsetMod.IDefaults
import typingsJapgolly.pgPromise.typescriptPgSubsetMod.ITypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofpg extends StObject {
  
  val Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient]
  
  val defaults: IDefaults
  
  val types: ITypes
}
object Typeofpg {
  
  inline def apply(
    Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient],
    defaults: IDefaults,
    types: ITypes
  ): Typeofpg = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpg]
  }
  
  extension [Self <: Typeofpg](x: Self) {
    
    inline def setClient(value: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: IDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: ITypes): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
