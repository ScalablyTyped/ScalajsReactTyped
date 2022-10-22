package typingsJapgolly.electronPrompt

import typingsJapgolly.electron.mod.BrowserWindow
import typingsJapgolly.electronPrompt.electronPromptStrings.input
import typingsJapgolly.electronPrompt.electronPromptStrings.select
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[String | Null]]
  inline def apply(options: Unit, parentBrowserWindow: BrowserWindow): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], parentBrowserWindow.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  inline def apply(options: Options): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  inline def apply(options: Options, parentBrowserWindow: BrowserWindow): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], parentBrowserWindow.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  
  @JSImport("electron-prompt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ButtonLabels extends StObject {
    
    var cancel: js.UndefOr[String] = js.undefined
    
    var ok: js.UndefOr[String] = js.undefined
  }
  object ButtonLabels {
    
    inline def apply(): ButtonLabels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonLabels]
    }
    
    extension [Self <: ButtonLabels](x: Self) {
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setOk(value: String): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Whether the window should always stay on top of other windows.
      * Defaults to `false`.
      */
    var alwaysOnTop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The text for the OK/cancel buttons. Properties are `ok` and `cancel`.
      * Defaults to `null`.
      */
    var buttonLabels: js.UndefOr[ButtonLabels | Null] = js.undefined
    
    /**
      * The local path of a CSS file to stylize the prompt window.
      * Defaults to `null`.
      */
    var customStylesheet: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The height of the prompt window. Defaults to `130`.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The path to an icon image to use in the title bar.
      * Defaults to `null` and uses electron's icon.
      */
    var icon: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The attributes of the input field, analagous to the HTML attributes:
      * `{type: 'text', required: true}` -> `<input type="text" required>`.
      * Used if the type is `input`.
      */
    var inputAttrs: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * The label which appears on the prompt for the input field.
      * Defaults to `Please input a value:`.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to show the menubar or not. Defaults to `false`.
      */
    var menuBarVisible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The minimum allowed height for the prompt window.
      * Same default value as `height`.
      */
    var minHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum allowed width for the prompt window.
      * Same default value as `width`.
      */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the prompt window can be resized or not
      * (also sets `useContentSize`). Defaults to `false`.
      */
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The items for the select dropdown if using the 'select' type in the
      * format 'value': 'display text', where the value is what will be given
      * to the then block and the display text is what the user will see.
      */
    var selectOptions: js.UndefOr[(Record[String, String]) | Null] = js.undefined
    
    /**
      * Whether to show the prompt window icon in taskbar. Defaults to true.
      */
    var skipTaskbar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The title of the prompt window. Defaults to 'Prompt'.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The type of input field, either `input` for a standard text input
      * field or `select` for a dropdown type input. Defaults to `input`.
      */
    var `type`: js.UndefOr[input | select] = js.undefined
    
    /**
      * Whether the label should be interpreted as HTML or not.
      * Defaults to `false`.
      */
    var useHtmlLabel: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default value for the input field. Defaults to `null`.
      */
    var value: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The width of the prompt window. Defaults to `370`.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
      
      inline def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
      
      inline def setButtonLabels(value: ButtonLabels): Self = StObject.set(x, "buttonLabels", value.asInstanceOf[js.Any])
      
      inline def setButtonLabelsNull: Self = StObject.set(x, "buttonLabels", null)
      
      inline def setButtonLabelsUndefined: Self = StObject.set(x, "buttonLabels", js.undefined)
      
      inline def setCustomStylesheet(value: String): Self = StObject.set(x, "customStylesheet", value.asInstanceOf[js.Any])
      
      inline def setCustomStylesheetNull: Self = StObject.set(x, "customStylesheet", null)
      
      inline def setCustomStylesheetUndefined: Self = StObject.set(x, "customStylesheet", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInputAttrs(value: Record[String, String]): Self = StObject.set(x, "inputAttrs", value.asInstanceOf[js.Any])
      
      inline def setInputAttrsUndefined: Self = StObject.set(x, "inputAttrs", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMenuBarVisible(value: Boolean): Self = StObject.set(x, "menuBarVisible", value.asInstanceOf[js.Any])
      
      inline def setMenuBarVisibleUndefined: Self = StObject.set(x, "menuBarVisible", js.undefined)
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setSelectOptions(value: Record[String, String]): Self = StObject.set(x, "selectOptions", value.asInstanceOf[js.Any])
      
      inline def setSelectOptionsNull: Self = StObject.set(x, "selectOptions", null)
      
      inline def setSelectOptionsUndefined: Self = StObject.set(x, "selectOptions", js.undefined)
      
      inline def setSkipTaskbar(value: Boolean): Self = StObject.set(x, "skipTaskbar", value.asInstanceOf[js.Any])
      
      inline def setSkipTaskbarUndefined: Self = StObject.set(x, "skipTaskbar", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: input | select): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseHtmlLabel(value: Boolean): Self = StObject.set(x, "useHtmlLabel", value.asInstanceOf[js.Any])
      
      inline def setUseHtmlLabelUndefined: Self = StObject.set(x, "useHtmlLabel", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
