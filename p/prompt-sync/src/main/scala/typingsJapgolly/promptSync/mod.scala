package typingsJapgolly.promptSync

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * create -- sync function for reading user input from stdin
    * @param   {Object} config {
    *   sigint: {Boolean} exit on ^C
    *   eot: {Boolean} exit on ^D
    *   autocomplete: {StringArray} function({String})
    *   history: {String} a history control object (see `prompt-sync-history`)
    * }
    * @returns {Function} prompt function
    */
  inline def apply(): Prompt = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Prompt]
  inline def apply(config: Config): Prompt = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Prompt]
  
  @JSImport("prompt-sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AutoCompleteFunction = js.Function1[/* input */ String, js.Array[String]]
  
  trait Config extends StObject {
    
    var autocomplete: js.UndefOr[AutoCompleteFunction] = js.undefined
    
    var eot: js.UndefOr[Boolean] = js.undefined
    
    var history: js.UndefOr[History] = js.undefined
    
    var sigint: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAutocomplete(value: /* input */ String => js.Array[String]): Self = StObject.set(x, "autocomplete", js.Any.fromFunction1(value))
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setEot(value: Boolean): Self = StObject.set(x, "eot", value.asInstanceOf[js.Any])
      
      inline def setEotUndefined: Self = StObject.set(x, "eot", js.undefined)
      
      inline def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      inline def setSigint(value: Boolean): Self = StObject.set(x, "sigint", value.asInstanceOf[js.Any])
      
      inline def setSigintUndefined: Self = StObject.set(x, "sigint", js.undefined)
    }
  }
  
  trait History extends StObject {
    
    def atEnd(): Boolean
    
    def atPenultimate(): Boolean
    
    def atStart(): Boolean
    
    def next(): String
    
    def pastEnd(): Boolean
    
    def prev(): String
    
    def push(str: String): Unit
    
    def reset(): Unit
    
    def save(): Unit
  }
  object History {
    
    inline def apply(
      atEnd: CallbackTo[Boolean],
      atPenultimate: CallbackTo[Boolean],
      atStart: CallbackTo[Boolean],
      next: CallbackTo[String],
      pastEnd: CallbackTo[Boolean],
      prev: CallbackTo[String],
      push: String => Callback,
      reset: Callback,
      save: Callback
    ): History = {
      val __obj = js.Dynamic.literal(atEnd = atEnd.toJsFn, atPenultimate = atPenultimate.toJsFn, atStart = atStart.toJsFn, next = next.toJsFn, pastEnd = pastEnd.toJsFn, prev = prev.toJsFn, push = js.Any.fromFunction1((t0: String) => push(t0).runNow()), reset = reset.toJsFn, save = save.toJsFn)
      __obj.asInstanceOf[History]
    }
    
    extension [Self <: History](x: Self) {
      
      inline def setAtEnd(value: CallbackTo[Boolean]): Self = StObject.set(x, "atEnd", value.toJsFn)
      
      inline def setAtPenultimate(value: CallbackTo[Boolean]): Self = StObject.set(x, "atPenultimate", value.toJsFn)
      
      inline def setAtStart(value: CallbackTo[Boolean]): Self = StObject.set(x, "atStart", value.toJsFn)
      
      inline def setNext(value: CallbackTo[String]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setPastEnd(value: CallbackTo[Boolean]): Self = StObject.set(x, "pastEnd", value.toJsFn)
      
      inline def setPrev(value: CallbackTo[String]): Self = StObject.set(x, "prev", value.toJsFn)
      
      inline def setPush(value: String => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setSave(value: Callback): Self = StObject.set(x, "save", value.toJsFn)
    }
  }
  
  trait Option extends StObject {
    
    var ask: js.UndefOr[String] = js.undefined
    
    var autocomplete: js.UndefOr[AutoCompleteFunction] = js.undefined
    
    var echo: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Option {
    
    inline def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setAsk(value: String): Self = StObject.set(x, "ask", value.asInstanceOf[js.Any])
      
      inline def setAskUndefined: Self = StObject.set(x, "ask", js.undefined)
      
      inline def setAutocomplete(value: /* input */ String => js.Array[String]): Self = StObject.set(x, "autocomplete", js.Any.fromFunction1(value))
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setEcho(value: String): Self = StObject.set(x, "echo", value.asInstanceOf[js.Any])
      
      inline def setEchoUndefined: Self = StObject.set(x, "echo", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Prompt extends StObject {
    
    def apply(ask: String): String = js.native
    def apply(ask: String, opts: Option): String = js.native
    def apply(ask: String, value: String): String = js.native
    /**
      * prompt -- sync function for reading user input from stdin
      *  @param {String} ask opening question/statement to prompt for
      *  @param {String} value initial value for the prompt
      *  @param {Object} opts {
      *   echo: set to a character to be echoed, default is '*'. Use '' for no echo
      *   value: {String} initial value for the prompt
      *   ask: {String} opening question/statement to prompt for, does not override ask param
      *   autocomplete: {StringArray} function({String})
      * }
      *
      * @returns {string} Returns the string input or (if sigint === false)
      *                   null if user terminates with a ^C
      */
    def apply(ask: String, value: String, opts: Option): String = js.native
    def apply(opts: Option): String = js.native
    
    def hide(ask: String): String = js.native
  }
}
