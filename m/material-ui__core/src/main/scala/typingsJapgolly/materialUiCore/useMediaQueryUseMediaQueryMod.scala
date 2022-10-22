package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.materialUiCore.anon.Matches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMediaQueryUseMediaQueryMod {
  
  @JSImport("@material-ui/core/useMediaQuery/useMediaQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme](query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default[Theme](query: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default[Theme](query: js.Function1[/* theme */ Theme, String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default[Theme](query: js.Function1[/* theme */ Theme, String], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait MuiMediaQueryList extends StObject {
    
    def addListener(listener: MuiMediaQueryListListener): Unit
    
    var matches: Boolean
    
    def removeListener(listener: MuiMediaQueryListListener): Unit
  }
  object MuiMediaQueryList {
    
    inline def apply(
      addListener: MuiMediaQueryListListener => Callback,
      matches: Boolean,
      removeListener: MuiMediaQueryListListener => Callback
    ): MuiMediaQueryList = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1((t0: MuiMediaQueryListListener) => addListener(t0).runNow()), matches = matches.asInstanceOf[js.Any], removeListener = js.Any.fromFunction1((t0: MuiMediaQueryListListener) => removeListener(t0).runNow()))
      __obj.asInstanceOf[MuiMediaQueryList]
    }
    
    extension [Self <: MuiMediaQueryList](x: Self) {
      
      inline def setAddListener(value: MuiMediaQueryListListener => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: MuiMediaQueryListListener) => value(t0).runNow()))
      
      inline def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setRemoveListener(value: MuiMediaQueryListListener => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: MuiMediaQueryListListener) => value(t0).runNow()))
    }
  }
  
  trait MuiMediaQueryListEvent extends StObject {
    
    var matches: Boolean
  }
  object MuiMediaQueryListEvent {
    
    inline def apply(matches: Boolean): MuiMediaQueryListEvent = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[MuiMediaQueryListEvent]
    }
    
    extension [Self <: MuiMediaQueryListEvent](x: Self) {
      
      inline def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    }
  }
  
  type MuiMediaQueryListListener = js.Function1[/* event */ MuiMediaQueryListEvent, Unit]
  
  trait Options extends StObject {
    
    var defaultMatches: js.UndefOr[Boolean] = js.undefined
    
    var noSsr: js.UndefOr[Boolean] = js.undefined
    
    var ssrMatchMedia: js.UndefOr[js.Function1[/* query */ String, Matches]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefaultMatches(value: Boolean): Self = StObject.set(x, "defaultMatches", value.asInstanceOf[js.Any])
      
      inline def setDefaultMatchesUndefined: Self = StObject.set(x, "defaultMatches", js.undefined)
      
      inline def setNoSsr(value: Boolean): Self = StObject.set(x, "noSsr", value.asInstanceOf[js.Any])
      
      inline def setNoSsrUndefined: Self = StObject.set(x, "noSsr", js.undefined)
      
      inline def setSsrMatchMedia(value: /* query */ String => Matches): Self = StObject.set(x, "ssrMatchMedia", js.Any.fromFunction1(value))
      
      inline def setSsrMatchMediaUndefined: Self = StObject.set(x, "ssrMatchMedia", js.undefined)
    }
  }
}
