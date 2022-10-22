package typingsJapgolly.highlightJs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.highlightJs.anon.Block
import typingsJapgolly.highlightJs.anon.BlockLanguage
import typingsJapgolly.highlightJs.anon.El
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HLJSPlugin extends StObject {
  
  @JSName("after:highlight")
  var afterColonhighlight: js.UndefOr[js.Function1[/* result */ HighlightResult, Unit]] = js.undefined
  
  // TODO: Old API, remove with v12
  @JSName("after:highlightBlock")
  var afterColonhighlightBlock: js.UndefOr[js.Function1[/* data */ Block, Unit]] = js.undefined
  
  @JSName("after:highlightElement")
  var afterColonhighlightElement: js.UndefOr[js.Function1[/* data */ El, Unit]] = js.undefined
  
  @JSName("before:highlight")
  var beforeColonhighlight: js.UndefOr[js.Function1[/* context */ BeforeHighlightContext, Unit]] = js.undefined
  
  @JSName("before:highlightBlock")
  var beforeColonhighlightBlock: js.UndefOr[js.Function1[/* data */ BlockLanguage, Unit]] = js.undefined
  
  @JSName("before:highlightElement")
  var beforeColonhighlightElement: js.UndefOr[js.Function1[/* data */ typingsJapgolly.highlightJs.anon.Language, Unit]] = js.undefined
}
object HLJSPlugin {
  
  inline def apply(): HLJSPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HLJSPlugin]
  }
  
  extension [Self <: HLJSPlugin](x: Self) {
    
    inline def setAfterColonhighlight(value: /* result */ HighlightResult => Callback): Self = StObject.set(x, "after:highlight", js.Any.fromFunction1((t0: /* result */ HighlightResult) => value(t0).runNow()))
    
    inline def setAfterColonhighlightBlock(value: /* data */ Block => Callback): Self = StObject.set(x, "after:highlightBlock", js.Any.fromFunction1((t0: /* data */ Block) => value(t0).runNow()))
    
    inline def setAfterColonhighlightBlockUndefined: Self = StObject.set(x, "after:highlightBlock", js.undefined)
    
    inline def setAfterColonhighlightElement(value: /* data */ El => Callback): Self = StObject.set(x, "after:highlightElement", js.Any.fromFunction1((t0: /* data */ El) => value(t0).runNow()))
    
    inline def setAfterColonhighlightElementUndefined: Self = StObject.set(x, "after:highlightElement", js.undefined)
    
    inline def setAfterColonhighlightUndefined: Self = StObject.set(x, "after:highlight", js.undefined)
    
    inline def setBeforeColonhighlight(value: /* context */ BeforeHighlightContext => Callback): Self = StObject.set(x, "before:highlight", js.Any.fromFunction1((t0: /* context */ BeforeHighlightContext) => value(t0).runNow()))
    
    inline def setBeforeColonhighlightBlock(value: /* data */ BlockLanguage => Callback): Self = StObject.set(x, "before:highlightBlock", js.Any.fromFunction1((t0: /* data */ BlockLanguage) => value(t0).runNow()))
    
    inline def setBeforeColonhighlightBlockUndefined: Self = StObject.set(x, "before:highlightBlock", js.undefined)
    
    inline def setBeforeColonhighlightElement(value: /* data */ typingsJapgolly.highlightJs.anon.Language => Callback): Self = StObject.set(x, "before:highlightElement", js.Any.fromFunction1((t0: /* data */ typingsJapgolly.highlightJs.anon.Language) => value(t0).runNow()))
    
    inline def setBeforeColonhighlightElementUndefined: Self = StObject.set(x, "before:highlightElement", js.undefined)
    
    inline def setBeforeColonhighlightUndefined: Self = StObject.set(x, "before:highlight", js.undefined)
  }
}
