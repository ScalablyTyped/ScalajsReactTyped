package typingsJapgolly.inversify

import typingsJapgolly.inversify.libAnnotationDecoratorUtilsMod.DecoratorTarget
import typingsJapgolly.inversify.libAnnotationLazyServiceIdentifierMod.ServiceIdentifierOrFunc
import typingsJapgolly.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationInjectBaseMod {
  
  @JSImport("inversify/lib/annotation/inject_base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def injectBase(metadataKey: String): js.Function1[
    /* serviceIdentifier */ ServiceIdentifierOrFunc[Any], 
    js.Function3[
      /* target */ DecoratorTarget[Any], 
      /* targetKey */ js.UndefOr[String | js.Symbol], 
      /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("injectBase")(metadataKey.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* serviceIdentifier */ ServiceIdentifierOrFunc[Any], 
    js.Function3[
      /* target */ DecoratorTarget[Any], 
      /* targetKey */ js.UndefOr[String | js.Symbol], 
      /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
      Unit
    ]
  ]]
}
