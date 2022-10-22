package typingsJapgolly.snabbdom

import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import typingsJapgolly.snabbdom.anon.Fragments
import typingsJapgolly.snabbdom.anon.PartialModule
import typingsJapgolly.snabbdom.buildHtmldomapiMod.DOMAPI
import typingsJapgolly.snabbdom.buildVnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildInitMod {
  
  @JSImport("snabbdom/build/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(modules: js.Array[PartialModule]): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  inline def init(modules: js.Array[PartialModule], domApi: Unit, options: Options): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  inline def init(modules: js.Array[PartialModule], domApi: DOMAPI): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  inline def init(modules: js.Array[PartialModule], domApi: DOMAPI, options: Options): js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(modules.asInstanceOf[js.Any], domApi.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* oldVnode */ VNode_ | Element | DocumentFragment, /* vnode */ VNode_, VNode_]]
  
  trait Options extends StObject {
    
    var experimental: js.UndefOr[Fragments] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExperimental(value: Fragments): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    }
  }
}
