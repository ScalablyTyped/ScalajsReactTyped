package typingsJapgolly.momentMini.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeTimeSpec extends StObject {
  
  var M: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var MM: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var d: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var dd: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var future: js.UndefOr[RelativeTimeFuturePastVal] = js.undefined
  
  var h: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var hh: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var m: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var mm: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var past: js.UndefOr[RelativeTimeFuturePastVal] = js.undefined
  
  var s: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var ss: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var w: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var ww: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var y: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  
  var yy: js.UndefOr[RelativeTimeSpecVal] = js.undefined
}
object RelativeTimeSpec {
  
  inline def apply(): RelativeTimeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeSpec]
  }
  
  extension [Self <: RelativeTimeSpec](x: Self) {
    
    inline def setD(value: RelativeTimeSpecVal): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "d", js.Any.fromFunction4(value))
    
    inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    inline def setDd(value: RelativeTimeSpecVal): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
    
    inline def setDdFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "dd", js.Any.fromFunction4(value))
    
    inline def setDdUndefined: Self = StObject.set(x, "dd", js.undefined)
    
    inline def setFuture(value: RelativeTimeFuturePastVal): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
    
    inline def setFutureFunction1(value: /* relTime */ String => String): Self = StObject.set(x, "future", js.Any.fromFunction1(value))
    
    inline def setFutureUndefined: Self = StObject.set(x, "future", js.undefined)
    
    inline def setH(value: RelativeTimeSpecVal): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "h", js.Any.fromFunction4(value))
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setHh(value: RelativeTimeSpecVal): Self = StObject.set(x, "hh", value.asInstanceOf[js.Any])
    
    inline def setHhFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "hh", js.Any.fromFunction4(value))
    
    inline def setHhUndefined: Self = StObject.set(x, "hh", js.undefined)
    
    inline def setM(value: RelativeTimeSpecVal): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
    
    inline def setMFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "M", js.Any.fromFunction4(value))
    
    inline def setMM(value: RelativeTimeSpecVal): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
    
    inline def setMMFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "MM", js.Any.fromFunction4(value))
    
    inline def setMMUndefined: Self = StObject.set(x, "MM", js.undefined)
    
    inline def setMUndefined: Self = StObject.set(x, "M", js.undefined)
    
    inline def setPast(value: RelativeTimeFuturePastVal): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
    
    inline def setPastFunction1(value: /* relTime */ String => String): Self = StObject.set(x, "past", js.Any.fromFunction1(value))
    
    inline def setPastUndefined: Self = StObject.set(x, "past", js.undefined)
    
    inline def setS(value: RelativeTimeSpecVal): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "s", js.Any.fromFunction4(value))
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setSs(value: RelativeTimeSpecVal): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
    
    inline def setSsFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "ss", js.Any.fromFunction4(value))
    
    inline def setSsUndefined: Self = StObject.set(x, "ss", js.undefined)
    
    inline def setW(value: RelativeTimeSpecVal): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "w", js.Any.fromFunction4(value))
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setWw(value: RelativeTimeSpecVal): Self = StObject.set(x, "ww", value.asInstanceOf[js.Any])
    
    inline def setWwFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "ww", js.Any.fromFunction4(value))
    
    inline def setWwUndefined: Self = StObject.set(x, "ww", js.undefined)
    
    inline def setY(value: RelativeTimeSpecVal): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "y", js.Any.fromFunction4(value))
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYy(value: RelativeTimeSpecVal): Self = StObject.set(x, "yy", value.asInstanceOf[js.Any])
    
    inline def setYyFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "yy", js.Any.fromFunction4(value))
    
    inline def setYyUndefined: Self = StObject.set(x, "yy", js.undefined)
  }
}
