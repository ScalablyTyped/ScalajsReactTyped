package typingsJapgolly.contentstackUtils

import japgolly.scalajs.react.Callback
import typingsJapgolly.contentstackUtils.distTypesModelsMetadataModelMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesExtensionsMod {
  
  object global {
    
    trait String extends StObject {
      
      def forEachEmbeddedItem(callbackfn: js.Function2[/* embededObjectTag */ java.lang.String, /* object */ Metadata, Unit]): Unit
    }
    object String {
      
      inline def apply(
        forEachEmbeddedItem: js.Function2[/* embededObjectTag */ java.lang.String, /* object */ Metadata, Unit] => Callback
      ): String = {
        val __obj = js.Dynamic.literal(forEachEmbeddedItem = js.Any.fromFunction1((t0: js.Function2[/* embededObjectTag */ java.lang.String, /* object */ Metadata, Unit]) => forEachEmbeddedItem(t0).runNow()))
        __obj.asInstanceOf[String]
      }
      
      extension [Self <: String](x: Self) {
        
        inline def setForEachEmbeddedItem(
          value: js.Function2[/* embededObjectTag */ java.lang.String, /* object */ Metadata, Unit] => Callback
        ): Self = StObject.set(x, "forEachEmbeddedItem", js.Any.fromFunction1((t0: js.Function2[/* embededObjectTag */ java.lang.String, /* object */ Metadata, Unit]) => value(t0).runNow()))
      }
    }
  }
}
