package typingsJapgolly.uiSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object ui {
    
    object select {
      
      type IPasteFn = js.Function1[/* data */ String, Unit]
      
      trait IRepeatExpression extends StObject {
        
        var filters: String
        
        var itemName: String
        
        var keyName: String
        
        var modelMapper: String
        
        def repeatExpression(grouped: Boolean): String
        
        var source: String
        
        var trackByExp: String
      }
      object IRepeatExpression {
        
        inline def apply(
          filters: String,
          itemName: String,
          keyName: String,
          modelMapper: String,
          repeatExpression: Boolean => String,
          source: String,
          trackByExp: String
        ): IRepeatExpression = {
          val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], modelMapper = modelMapper.asInstanceOf[js.Any], repeatExpression = js.Any.fromFunction1(repeatExpression), source = source.asInstanceOf[js.Any], trackByExp = trackByExp.asInstanceOf[js.Any])
          __obj.asInstanceOf[IRepeatExpression]
        }
        
        extension [Self <: IRepeatExpression](x: Self) {
          
          inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
          
          inline def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
          
          inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
          
          inline def setModelMapper(value: String): Self = StObject.set(x, "modelMapper", value.asInstanceOf[js.Any])
          
          inline def setRepeatExpression(value: Boolean => String): Self = StObject.set(x, "repeatExpression", js.Any.fromFunction1(value))
          
          inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
          
          inline def setTrackByExp(value: String): Self = StObject.set(x, "trackByExp", value.asInstanceOf[js.Any])
        }
      }
      
      trait ISelectConfig extends StObject {
        
        var appendToBody: Boolean
        
        var backspaceReset: Boolean
        
        var closeOnSelect: Boolean
        
        var dropdownPosition: String
        
        def generateId(): Double
        
        var paste: js.UndefOr[IPasteFn] = js.undefined
        
        var placeholder: String
        
        var refreshDelay: Double
        
        var removeSelected: Boolean
        
        var resetSearchInput: Boolean
        
        var searchEnabled: Boolean
        
        var skipFocusser: Boolean
        
        var sortable: Boolean
        
        var spinnerClass: String
        
        var spinnerEnabled: Boolean
        
        var theme: String
      }
      object ISelectConfig {
        
        inline def apply(
          appendToBody: Boolean,
          backspaceReset: Boolean,
          closeOnSelect: Boolean,
          dropdownPosition: String,
          generateId: CallbackTo[Double],
          placeholder: String,
          refreshDelay: Double,
          removeSelected: Boolean,
          resetSearchInput: Boolean,
          searchEnabled: Boolean,
          skipFocusser: Boolean,
          sortable: Boolean,
          spinnerClass: String,
          spinnerEnabled: Boolean,
          theme: String
        ): ISelectConfig = {
          val __obj = js.Dynamic.literal(appendToBody = appendToBody.asInstanceOf[js.Any], backspaceReset = backspaceReset.asInstanceOf[js.Any], closeOnSelect = closeOnSelect.asInstanceOf[js.Any], dropdownPosition = dropdownPosition.asInstanceOf[js.Any], generateId = generateId.toJsFn, placeholder = placeholder.asInstanceOf[js.Any], refreshDelay = refreshDelay.asInstanceOf[js.Any], removeSelected = removeSelected.asInstanceOf[js.Any], resetSearchInput = resetSearchInput.asInstanceOf[js.Any], searchEnabled = searchEnabled.asInstanceOf[js.Any], skipFocusser = skipFocusser.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], spinnerClass = spinnerClass.asInstanceOf[js.Any], spinnerEnabled = spinnerEnabled.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
          __obj.asInstanceOf[ISelectConfig]
        }
        
        extension [Self <: ISelectConfig](x: Self) {
          
          inline def setAppendToBody(value: Boolean): Self = StObject.set(x, "appendToBody", value.asInstanceOf[js.Any])
          
          inline def setBackspaceReset(value: Boolean): Self = StObject.set(x, "backspaceReset", value.asInstanceOf[js.Any])
          
          inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
          
          inline def setDropdownPosition(value: String): Self = StObject.set(x, "dropdownPosition", value.asInstanceOf[js.Any])
          
          inline def setGenerateId(value: CallbackTo[Double]): Self = StObject.set(x, "generateId", value.toJsFn)
          
          inline def setPaste(value: /* data */ String => Callback): Self = StObject.set(x, "paste", js.Any.fromFunction1((t0: /* data */ String) => value(t0).runNow()))
          
          inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
          
          inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
          
          inline def setRefreshDelay(value: Double): Self = StObject.set(x, "refreshDelay", value.asInstanceOf[js.Any])
          
          inline def setRemoveSelected(value: Boolean): Self = StObject.set(x, "removeSelected", value.asInstanceOf[js.Any])
          
          inline def setResetSearchInput(value: Boolean): Self = StObject.set(x, "resetSearchInput", value.asInstanceOf[js.Any])
          
          inline def setSearchEnabled(value: Boolean): Self = StObject.set(x, "searchEnabled", value.asInstanceOf[js.Any])
          
          inline def setSkipFocusser(value: Boolean): Self = StObject.set(x, "skipFocusser", value.asInstanceOf[js.Any])
          
          inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
          
          inline def setSpinnerClass(value: String): Self = StObject.set(x, "spinnerClass", value.asInstanceOf[js.Any])
          
          inline def setSpinnerEnabled(value: Boolean): Self = StObject.set(x, "spinnerEnabled", value.asInstanceOf[js.Any])
          
          inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ISelectController extends StObject {
        
        var activeIndex: Double = js.native
        
        var clickTriggeredSelect: Boolean = js.native
        
        def close(): Unit = js.native
        def close(skipFocusser: Boolean): Unit = js.native
        
        var closeOnSelect: Boolean = js.native
        
        var disabled: Boolean = js.native
        
        var dropdownPosition: String = js.native
        
        var focus: Boolean = js.native
        
        def isEmpty(): Boolean = js.native
        
        var isGrouped: js.UndefOr[Boolean] = js.native
        
        def isLocked(): Boolean = js.native
        
        var itemProperty: js.UndefOr[String] = js.native
        
        var open: Boolean = js.native
        
        var parserResult: js.UndefOr[IRepeatExpression] = js.native
        
        var paste: js.UndefOr[IPasteFn] = js.native
        
        var placeholder: String = js.native
        
        var refreshDelay: Double = js.native
        
        var refreshing: Boolean = js.native
        
        var removeSelected: Boolean = js.native
        
        var resetSearchInput: Boolean = js.native
        
        var search: String = js.native
        
        var searchEnabled: Boolean = js.native
        
        def setFocus(): Unit = js.native
        
        def sizeSearchInput(): Unit = js.native
        
        var skipFocusser: Boolean = js.native
        
        var sortable: Boolean = js.native
        
        var spinnerClass: String = js.native
        
        var spinnerEnabled: Boolean = js.native
      }
    }
  }
}
