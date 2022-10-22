package typingsJapgolly.inversifyBindingDecorators

import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Container
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.ContainerModule
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typingsJapgolly.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideInWhenOnSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-binding-decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoProvide(container: Container, modules: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("autoProvide")(scala.List(container.asInstanceOf[js.Any]).`++`(modules.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def buildProviderModule(): ContainerModule = ^.asInstanceOf[js.Dynamic].applyDynamic("buildProviderModule")().asInstanceOf[ContainerModule]
  
  inline def fluentProvide(serviceIdentifier: ServiceIdentifier[Any]): ProvideInWhenOnSyntax[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fluentProvide")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[ProvideInWhenOnSyntax[Any]]
  
  inline def provide(serviceIdentifier: ServiceIdentifier[Any]): js.Function1[/* target */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("provide")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ Any, Any]]
  inline def provide(serviceIdentifier: ServiceIdentifier[Any], force: Boolean): js.Function1[/* target */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("provide")(serviceIdentifier.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ Any, Any]]
}
