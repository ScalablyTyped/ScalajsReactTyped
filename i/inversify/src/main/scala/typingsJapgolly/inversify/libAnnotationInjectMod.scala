package typingsJapgolly.inversify

import typingsJapgolly.inversify.libAnnotationDecoratorUtilsMod.DecoratorTarget
import typingsJapgolly.inversify.libAnnotationLazyServiceIdentifierMod.ServiceIdentifierOrFunc
import typingsJapgolly.std.TypedPropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationInjectMod {
  
  @JSImport("inversify/lib/annotation/inject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inject[T](serviceIdentifier: ServiceIdentifierOrFunc[T]): js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* target */ DecoratorTarget[Any], 
    /* targetKey */ js.UndefOr[String | js.Symbol], 
    /* indexOrPropertyDescriptor */ js.UndefOr[Double | TypedPropertyDescriptor[Any]], 
    Unit
  ]]
}
