package typingsJapgolly.winbox

import typingsJapgolly.winbox.mod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* Inlined winbox.winbox.WinBoxConstructor & {  new :(title : string, params : winbox.winbox.Params | undefined): winbox.winbox.WinBox | (params : winbox.winbox.Params): winbox.winbox.WinBox} */
  object WinBox {
    
    inline def apply(params: Params): typingsJapgolly.winbox.mod.WinBox = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winbox.mod.WinBox]
    inline def apply(title: String): typingsJapgolly.winbox.mod.WinBox = ^.asInstanceOf[js.Dynamic].apply(title.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winbox.mod.WinBox]
    inline def apply(title: String, params: Params): typingsJapgolly.winbox.mod.WinBox = (^.asInstanceOf[js.Dynamic].apply(title.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winbox.mod.WinBox]
    
    @JSGlobal("WinBox")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("WinBox")
    @js.native
    open class Class protected ()
      extends StObject
         with typingsJapgolly.winbox.mod.WinBox {
      def this(params: Params) = this()
      def this(title: String) = this()
      def this(title: String, params: Params) = this()
    }
    
    @JSGlobal("WinBox.new")
    @js.native
    val `new`: (js.Function2[
        /* title */ String, 
        /* params */ js.UndefOr[Params], 
        typingsJapgolly.winbox.mod.WinBox
      ]) | (js.Function1[/* params */ Params, typingsJapgolly.winbox.mod.WinBox]) = js.native
  }
}
