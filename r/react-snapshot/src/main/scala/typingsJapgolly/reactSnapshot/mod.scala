package typingsJapgolly.reactSnapshot

import japgolly.scalajs.react.facade.React.Component
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-snapshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def render(rootComponent: Component[js.Object, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootComponent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def render(rootComponent: Component[js.Object, js.Object], domElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootComponent.asInstanceOf[js.Any], domElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def render(rootComponent: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootComponent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def render(rootComponent: Element, domElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(rootComponent.asInstanceOf[js.Any], domElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
