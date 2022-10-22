package typingsJapgolly.reactMdAutocomplete

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactMdAutocomplete.typesTypesMod.AutoCompleteData
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionEnterHandler
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionExitHandler
import typingsJapgolly.reactMdUtils.typesSearchUtilsMod.GetItemValue_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @react-md/autocomplete.@react-md/autocomplete/types/types.FilterFunctionOptions<{}> */
  trait FilterFunctionOptions extends StObject {
    
    /**
      * A function that will get a string value from each item. The default
      * implementation will:
      *
      * - return a number as a string
      * - return a string as itself
      * - return the result of item() if it is a function (this will also be used
      *   if the `valueKey` on an object is a function).
      * - return item[valueKey] if it's an object (this uses typeof item === "object")
      * - return the empty string for all other data types
      */
    var getItemValue: js.UndefOr[GetItemValue_[AutoCompleteData]] = js.undefined
    
    /**
      * Boolean if all the whitespace should be ignored in the query string and for
      * each item.
      */
    var ignoreWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the filter should also exclude all items that do not start with
      * the query string. The default behavior is to return all matches that
      * contain the query string anywhere.
      */
    var startsWith: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the query string and each item should have the leading and
      * trailing spaces removed.
      */
    var trim: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key to use to get a value string if the item is an object.
      */
    var valueKey: js.UndefOr[String] = js.undefined
  }
  object FilterFunctionOptions {
    
    inline def apply(): FilterFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterFunctionOptions]
    }
    
    extension [Self <: FilterFunctionOptions](x: Self) {
      
      inline def setGetItemValue(value: (AutoCompleteData, /* valueKey */ String) => String): Self = StObject.set(x, "getItemValue", js.Any.fromFunction2(value))
      
      inline def setGetItemValueUndefined: Self = StObject.set(x, "getItemValue", js.undefined)
      
      inline def setIgnoreWhitespace(value: Boolean): Self = StObject.set(x, "ignoreWhitespace", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWhitespaceUndefined: Self = StObject.set(x, "ignoreWhitespace", js.undefined)
      
      inline def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      inline def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      inline def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
    }
  }
  
  /* Inlined std.Required<@react-md/transition.@react-md/transition.FixedPositioningTransitionCallbacks> */
  trait RequiredFixedPositioningT extends StObject {
    
    var onEnter: TransitionEnterHandler
    
    var onEntered: TransitionEnterHandler
    
    var onEntering: TransitionEnterHandler
    
    var onExited: TransitionExitHandler
  }
  object RequiredFixedPositioningT {
    
    inline def apply(
      onEnter: /* appearing */ Boolean => Callback,
      onEntered: /* appearing */ Boolean => Callback,
      onEntering: /* appearing */ Boolean => Callback,
      onExited: Callback
    ): RequiredFixedPositioningT = {
      val __obj = js.Dynamic.literal(onEnter = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEnter(t0).runNow()), onEntered = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEntered(t0).runNow()), onEntering = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEntering(t0).runNow()), onExited = onExited.toJsFn)
      __obj.asInstanceOf[RequiredFixedPositioningT]
    }
    
    extension [Self <: RequiredFixedPositioningT](x: Self) {
      
      inline def setOnEnter(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEnter", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def setOnEntered(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntered", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def setOnEntering(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntering", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def setOnExited(value: Callback): Self = StObject.set(x, "onExited", value.toJsFn)
    }
  }
}
