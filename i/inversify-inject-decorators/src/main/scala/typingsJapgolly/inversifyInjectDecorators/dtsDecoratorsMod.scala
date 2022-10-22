package typingsJapgolly.inversifyInjectDecorators

import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Abstract
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Container
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Newable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsDecoratorsMod {
  
  @JSImport("inversify-inject-decorators/dts/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makePropertyInjectDecorator(container: Container, doCache: Boolean): js.Function1[
    /* serviceIdentifier */ String | js.Symbol | Newable[Any] | Abstract[Any], 
    js.Function2[/* proto */ Any, /* key */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropertyInjectDecorator")(container.asInstanceOf[js.Any], doCache.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* serviceIdentifier */ String | js.Symbol | Newable[Any] | Abstract[Any], 
    js.Function2[/* proto */ Any, /* key */ String, Unit]
  ]]
  
  inline def makePropertyInjectNamedDecorator(container: Container, doCache: Boolean): js.Function2[
    /* serviceIdentifier */ String | js.Symbol | Newable[Any] | Abstract[Any], 
    /* named */ String, 
    js.Function2[/* proto */ Any, /* key */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropertyInjectNamedDecorator")(container.asInstanceOf[js.Any], doCache.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* serviceIdentifier */ String | js.Symbol | Newable[Any] | Abstract[Any], 
    /* named */ String, 
    js.Function2[/* proto */ Any, /* key */ String, Unit]
  ]]
  
  inline def makePropertyInjectTaggedDecorator(container: Container, doCache: Boolean): js.Function3[
    /* serviceIdentifier */ String | js.Symbol | Newable[Any] | Abstract[Any], 
    /* key */ String, 
    /* value */ Any, 
    js.Function2[/* proto */ Any, /* propertyName */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropertyInjectTaggedDecorator")(container.asInstanceOf[js.Any], doCache.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* serviceIdentifier */ String | js.Symbol | Newable[Any] | Abstract[Any], 
    /* key */ String, 
    /* value */ Any, 
    js.Function2[/* proto */ Any, /* propertyName */ String, Unit]
  ]]
  
  inline def makePropertyMultiInjectDecorator(container: Container, doCache: Boolean): js.Function1[
    /* serviceIdentifier */ String | js.Symbol | Newable[Any] | Abstract[Any], 
    js.Function2[/* proto */ Any, /* key */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makePropertyMultiInjectDecorator")(container.asInstanceOf[js.Any], doCache.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* serviceIdentifier */ String | js.Symbol | Newable[Any] | Abstract[Any], 
    js.Function2[/* proto */ Any, /* key */ String, Unit]
  ]]
}
