package typingsJapgolly.muibox

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("muibox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DialogProvider(_underscore: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DialogProvider")(_underscore.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useDialog(): Dialog = ^.asInstanceOf[js.Dynamic].applyDynamic("useDialog")().asInstanceOf[Dialog]
  
  inline def withDialog(): js.Function1[/* WrappedComponent */ Any, js.Function1[/* props */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDialog")().asInstanceOf[js.Function1[/* WrappedComponent */ Any, js.Function1[/* props */ Any, Any]]]
  
  trait AlertOptions extends StObject {
    
    var message: js.UndefOr[String | Node] = js.undefined
    
    var ok: js.UndefOr[DialogButtonOptions] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object AlertOptions {
    
    inline def apply(): AlertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertOptions]
    }
    
    extension [Self <: AlertOptions](x: Self) {
      
      inline def setMessage(value: String | Node): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "message", js.Array(value*))
      
      inline def setMessageVdomElement(value: VdomElement): Self = StObject.set(x, "message", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOk(value: DialogButtonOptions): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ConfirmOptions
    extends StObject
       with AlertOptions {
    
    var cancel: js.UndefOr[DialogButtonOptions] = js.undefined
  }
  object ConfirmOptions {
    
    inline def apply(): ConfirmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmOptions]
    }
    
    extension [Self <: ConfirmOptions](x: Self) {
      
      inline def setCancel(value: DialogButtonOptions): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    }
  }
  
  @js.native
  trait Dialog extends StObject {
    
    def alert(options: String): js.Promise[Unit] = js.native
    def alert(options: AlertOptions): js.Promise[Unit] = js.native
    
    def confirm(options: String): js.Promise[Unit] = js.native
    def confirm(options: ConfirmOptions): js.Promise[Unit] = js.native
    
    def prompt(options: String): js.Promise[String] = js.native
    def prompt(options: PromptOptions): js.Promise[String] = js.native
  }
  
  trait DialogButtonOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var endIcon: js.UndefOr[Node] = js.undefined
    
    var startIcon: js.UndefOr[Node] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
  }
  object DialogButtonOptions {
    
    inline def apply(): DialogButtonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogButtonOptions]
    }
    
    extension [Self <: DialogButtonOptions](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEndIcon(value: VdomNode): Self = StObject.set(x, "endIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEndIconNull: Self = StObject.set(x, "endIcon", null)
      
      inline def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
      
      inline def setEndIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endIcon", js.Array(value*))
      
      inline def setEndIconVdomElement(value: VdomElement): Self = StObject.set(x, "endIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStartIcon(value: VdomNode): Self = StObject.set(x, "startIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStartIconNull: Self = StObject.set(x, "startIcon", null)
      
      inline def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
      
      inline def setStartIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "startIcon", js.Array(value*))
      
      inline def setStartIconVdomElement(value: VdomElement): Self = StObject.set(x, "startIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  trait PromptOptions
    extends StObject
       with ConfirmOptions {
    
    var defaultValue: js.UndefOr[String | Double] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object PromptOptions {
    
    inline def apply(): PromptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PromptOptions]
    }
    
    extension [Self <: PromptOptions](x: Self) {
      
      inline def setDefaultValue(value: String | Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
}
