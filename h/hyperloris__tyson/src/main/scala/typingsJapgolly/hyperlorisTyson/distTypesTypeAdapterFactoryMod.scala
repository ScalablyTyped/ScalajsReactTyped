package typingsJapgolly.hyperlorisTyson

import typingsJapgolly.hyperlorisTyson.distTypesReflectTypeTokenMod.TypeToken
import typingsJapgolly.hyperlorisTyson.distTypesTypeAdapterMod.TypeAdapter
import typingsJapgolly.hyperlorisTyson.mod.Tyson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypeAdapterFactoryMod {
  
  trait TypeAdapterFactory extends StObject {
    
    def create[T](tyson: Tyson, typeToken: TypeToken[T]): js.UndefOr[TypeAdapter[T]]
  }
  object TypeAdapterFactory {
    
    inline def apply(create: (Tyson, TypeToken[Any]) => js.UndefOr[TypeAdapter[Any]]): TypeAdapterFactory = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
      __obj.asInstanceOf[TypeAdapterFactory]
    }
    
    extension [Self <: TypeAdapterFactory](x: Self) {
      
      inline def setCreate(value: (Tyson, TypeToken[Any]) => js.UndefOr[TypeAdapter[Any]]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    }
  }
}
