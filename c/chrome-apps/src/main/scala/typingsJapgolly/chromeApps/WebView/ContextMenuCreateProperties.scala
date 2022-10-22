package typingsJapgolly.chromeApps.WebView

import japgolly.scalajs.react.Callback
import typingsJapgolly.chromeApps.anon.CHECKBOX
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chromeAppsStrings.NORMAL
import typingsJapgolly.chromeApps.chromeAppsStrings.RADIO
import typingsJapgolly.chromeApps.chromeAppsStrings.SEPARATOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuCreateProperties extends StObject {
  
  /**
    * The initial state of a checkbox or radio item:
    * true for selected and false for unselected.
    * Only one radio item can be selected at a time in a given group of radio items.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * List of contexts this menu item will appear in.
    * Defaults to ['page'] if not specified.
    */
  var contexts: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Lets you restrict the item to apply only to documents whose URL matches one of the given patterns. (This applies to frames as well.) For details on the format of a pattern, see <a href='match_patterns'>Match Patterns</a>.
    */
  var documentUrlPatterns: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Whether this context menu item is enabled or disabled. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another ID for this extension.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A function that will be called back when the menu item is clicked.
    */
  var onclick: js.UndefOr[js.Function1[/* info */ Any, Unit]] = js.undefined
  
  /**
    * The ID of a parent menu item; this makes the item a child of a previously added item.
    */
  var parentId: js.UndefOr[integer | String] = js.undefined
  
  /**
    * Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of anchor tags.
    */
  var targetUrlPatterns: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The text to be displayed in the item; this is -required- unless type is 'separator'.
    * When the context is 'selection', you can use %s within the string to show the selected text.
    * For example, if this parameter's value is 'Translate '%s' to Pig Latin' and the user selects
    * the word 'cool', the context menu item for the selection is 'Translate 'cool' to Pig Latin'.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The type of menu item. Defaults to 'normal' if not specified.
    */
  var `type`: js.UndefOr[
    ToStringLiteral[
      CHECKBOX, 
      /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsJapgolly.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
      /* import warning: importer.ImportType#apply Failed type conversion: keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} extends keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} ? std.Exclude<keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'}, 'normal' | 'checkbox' | 'radio' | 'separator'> : never */ js.Any
    ]
  ] = js.undefined
}
object ContextMenuCreateProperties {
  
  inline def apply(): ContextMenuCreateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuCreateProperties]
  }
  
  extension [Self <: ContextMenuCreateProperties](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setContexts(value: js.Array[Any]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: Any*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setDocumentUrlPatterns(value: js.Array[Any]): Self = StObject.set(x, "documentUrlPatterns", value.asInstanceOf[js.Any])
    
    inline def setDocumentUrlPatternsUndefined: Self = StObject.set(x, "documentUrlPatterns", js.undefined)
    
    inline def setDocumentUrlPatternsVarargs(value: Any*): Self = StObject.set(x, "documentUrlPatterns", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOnclick(value: /* info */ Any => Callback): Self = StObject.set(x, "onclick", js.Any.fromFunction1((t0: /* info */ Any) => value(t0).runNow()))
    
    inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    inline def setParentId(value: integer | String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    
    inline def setTargetUrlPatterns(value: js.Array[Any]): Self = StObject.set(x, "targetUrlPatterns", value.asInstanceOf[js.Any])
    
    inline def setTargetUrlPatternsUndefined: Self = StObject.set(x, "targetUrlPatterns", js.undefined)
    
    inline def setTargetUrlPatternsVarargs(value: Any*): Self = StObject.set(x, "targetUrlPatterns", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(
      value: ToStringLiteral[
          CHECKBOX, 
          /* keyof chrome-apps.anon.CHECKBOX */ NORMAL | typingsJapgolly.chromeApps.chromeAppsStrings.CHECKBOX | RADIO | SEPARATOR, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} extends keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'} ? std.Exclude<keyof {  NORMAL :'normal',   CHECKBOX :'checkbox',   RADIO :'radio',   SEPARATOR :'separator'}, 'normal' | 'checkbox' | 'radio' | 'separator'> : never */ js.Any
        ]
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
