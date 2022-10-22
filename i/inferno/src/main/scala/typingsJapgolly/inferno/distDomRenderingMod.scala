package typingsJapgolly.inferno

import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.SVGAElement
import typingsJapgolly.inferno.distCoreTypesMod.Inferno.InfernoNode
import typingsJapgolly.inferno.distCoreTypesMod.VNode
import typingsJapgolly.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomRenderingMod {
  
  @JSImport("inferno/dist/DOM/rendering", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _Render(
    input: js.UndefOr[VNode | Null | InfernoNode],
    parentDOM: Element | SVGAElement | ShadowRoot | DocumentFragment | HTMLElement | Node | Null,
    callback: js.Function | Null,
    context: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__render")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createRenderer(): js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")().asInstanceOf[js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit]]
  inline def createRenderer(parentDOM: Any): js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderer")(parentDOM.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* lastInput */ Any, /* nextInput */ Any, /* callback */ Any, /* context */ Any, Unit]]
  
  inline def render(
    input: js.UndefOr[VNode | Null | InfernoNode],
    parentDOM: Element | SVGAElement | ShadowRoot | DocumentFragment | HTMLElement | Node | Null,
    callback: js.UndefOr[js.Function | Null],
    context: js.UndefOr[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
