package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Attribute
import typingsJapgolly.ckeditorCkeditor5Engine.anon.AttributesClassesName
import typingsJapgolly.ckeditorCkeditor5Engine.anon.ElementMatch
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewMatcherMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/matcher", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Matcher {
    def this(pattern: MatcherPattern*) = this()
    
    /* CompleteClass */
    override def add(pattern: MatcherPattern*): Unit = js.native
    
    /* CompleteClass */
    override def getElementName(): String | Null = js.native
    
    /* CompleteClass */
    override def `match`(element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default*): Match | Null = js.native
    
    /* CompleteClass */
    override def matchAll(element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default*): js.Array[ElementMatch] | Null = js.native
  }
  
  trait Matcher extends StObject {
    
    def add(pattern: MatcherPattern*): Unit
    
    def getElementName(): String | Null
    
    def `match`(element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default*): Match | Null
    
    def matchAll(element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default*): js.Array[ElementMatch] | Null
  }
  object Matcher {
    
    inline def apply(
      add: /* repeated */ MatcherPattern => Callback,
      getElementName: CallbackTo[String | Null],
      `match`: /* repeated */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default => Match | Null,
      matchAll: /* repeated */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default => js.Array[ElementMatch] | Null
    ): Matcher = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: /* repeated */ MatcherPattern) => add(t0).runNow()), getElementName = getElementName.toJsFn, matchAll = js.Any.fromFunction1(matchAll))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Matcher]
    }
    
    extension [Self <: Matcher](x: Self) {
      
      inline def setAdd(value: /* repeated */ MatcherPattern => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: /* repeated */ MatcherPattern) => value(t0).runNow()))
      
      inline def setGetElementName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getElementName", value.toJsFn)
      
      inline def setMatch(
        value: /* repeated */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default => Match | Null
      ): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setMatchAll(
        value: /* repeated */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default => js.Array[ElementMatch] | Null
      ): Self = StObject.set(x, "matchAll", js.Any.fromFunction1(value))
    }
  }
  
  type MatcherPattern = (js.Function1[
    /* element */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default, 
    Unit | Null | Attribute
  ]) | String | js.RegExp | AttributesClassesName
}
