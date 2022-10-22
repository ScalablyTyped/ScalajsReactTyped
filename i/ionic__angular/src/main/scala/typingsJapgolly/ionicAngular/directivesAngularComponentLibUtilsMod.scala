package typingsJapgolly.ionicAngular

import typingsJapgolly.ionicAngular.anon.DefineCustomElementFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesAngularComponentLibUtilsMod {
  
  @JSImport("@ionic/angular/directives/angular-component-lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ProxyCmp(opts: DefineCustomElementFn): js.Function1[/* cls */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ProxyCmp")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* cls */ Any, Any]]
  
  inline def defineCustomElement(tagName: String, customElement: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineCustomElement")(tagName.asInstanceOf[js.Any], customElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def proxyInputs(Cmp: Any, inputs: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyInputs")(Cmp.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def proxyMethods(Cmp: Any, methods: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyMethods")(Cmp.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def proxyOutputs(instance: Any, el: Any, events: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("proxyOutputs")(instance.asInstanceOf[js.Any], el.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
