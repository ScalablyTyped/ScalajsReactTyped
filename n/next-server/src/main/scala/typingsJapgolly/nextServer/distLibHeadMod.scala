package typingsJapgolly.nextServer

import typingsJapgolly.nextServer.anon.Children
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibHeadMod {
  
  @JSImport("next-server/dist/lib/head", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    /**
      * This component injects elements to `<head>` of your page.
      * To avoid duplicated `tags` in `<head>` you can use the `key` property, which will make sure every tag is only rendered once.
      */
    inline def apply(hasChildren: Children): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("next-server/dist/lib/head", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next-server/dist/lib/head", "default.rewind")
    @js.native
    def rewind: js.Function0[js.UndefOr[js.Array[japgolly.scalajs.react.facade.React.Element]]] = js.native
    inline def rewind_=(x: js.Function0[js.UndefOr[js.Array[japgolly.scalajs.react.facade.React.Element]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rewind")(x.asInstanceOf[js.Any])
  }
  
  inline def defaultHead(): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultHead")().asInstanceOf[js.Array[Element]]
  inline def defaultHead(inAmpMode: Boolean): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultHead")(inAmpMode.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
}
