package typingsJapgolly.brokenLinkChecker

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Complete extends StObject {
    
    var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var html: js.UndefOr[js.Function2[/* tree */ Any, /* robots */ Any, Unit]] = js.undefined
    
    var junk: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
    
    var link: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
  }
  object Complete {
    
    inline def apply(): Complete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Complete]
    }
    
    extension [Self <: Complete](x: Self) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setHtml(value: (/* tree */ Any, /* robots */ Any) => Callback): Self = StObject.set(x, "html", js.Any.fromFunction2((t0: /* tree */ Any, t1: /* robots */ Any) => (value(t0, t1)).runNow()))
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setJunk(value: /* result */ Any => Callback): Self = StObject.set(x, "junk", js.Any.fromFunction1((t0: /* result */ Any) => value(t0).runNow()))
      
      inline def setJunkUndefined: Self = StObject.set(x, "junk", js.undefined)
      
      inline def setLink(value: /* result */ Any => Callback): Self = StObject.set(x, "link", js.Any.fromFunction1((t0: /* result */ Any) => value(t0).runNow()))
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    }
  }
  
  trait End extends StObject {
    
    var end: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var html: js.UndefOr[js.Function2[/* tree */ Any, /* robots */ Any, Unit]] = js.undefined
    
    var junk: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
    
    var link: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
    
    var page: js.UndefOr[js.Function3[/* error */ Any, /* pageUrl */ Any, /* customData */ Any, Unit]] = js.undefined
  }
  object End {
    
    inline def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setHtml(value: (/* tree */ Any, /* robots */ Any) => Callback): Self = StObject.set(x, "html", js.Any.fromFunction2((t0: /* tree */ Any, t1: /* robots */ Any) => (value(t0, t1)).runNow()))
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setJunk(value: /* result */ Any => Callback): Self = StObject.set(x, "junk", js.Any.fromFunction1((t0: /* result */ Any) => value(t0).runNow()))
      
      inline def setJunkUndefined: Self = StObject.set(x, "junk", js.undefined)
      
      inline def setLink(value: /* result */ Any => Callback): Self = StObject.set(x, "link", js.Any.fromFunction1((t0: /* result */ Any) => value(t0).runNow()))
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setPage(value: (/* error */ Any, /* pageUrl */ Any, /* customData */ Any) => Callback): Self = StObject.set(x, "page", js.Any.fromFunction3((t0: /* error */ Any, t1: /* pageUrl */ Any, t2: /* customData */ Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    }
  }
  
  trait Html extends StObject {
    
    var end: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var html: js.UndefOr[js.Function2[/* tree */ Any, /* robots */ Any, Unit]] = js.undefined
    
    var junk: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
    
    var link: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
    
    var page: js.UndefOr[js.Function3[/* error */ Any, /* pageUrl */ Any, /* customData */ Any, Unit]] = js.undefined
    
    var robots: js.UndefOr[js.Function2[/* robots */ Any, /* customData */ Any, Unit]] = js.undefined
    
    var site: js.UndefOr[js.Function3[/* error */ Any, /* siteUrl */ Any, /* customData */ Any, Unit]] = js.undefined
  }
  object Html {
    
    inline def apply(): Html = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Html]
    }
    
    extension [Self <: Html](x: Self) {
      
      inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setHtml(value: (/* tree */ Any, /* robots */ Any) => Callback): Self = StObject.set(x, "html", js.Any.fromFunction2((t0: /* tree */ Any, t1: /* robots */ Any) => (value(t0, t1)).runNow()))
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setJunk(value: /* result */ Any => Callback): Self = StObject.set(x, "junk", js.Any.fromFunction1((t0: /* result */ Any) => value(t0).runNow()))
      
      inline def setJunkUndefined: Self = StObject.set(x, "junk", js.undefined)
      
      inline def setLink(value: /* result */ Any => Callback): Self = StObject.set(x, "link", js.Any.fromFunction1((t0: /* result */ Any) => value(t0).runNow()))
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setPage(value: (/* error */ Any, /* pageUrl */ Any, /* customData */ Any) => Callback): Self = StObject.set(x, "page", js.Any.fromFunction3((t0: /* error */ Any, t1: /* pageUrl */ Any, t2: /* customData */ Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setRobots(value: (/* robots */ Any, /* customData */ Any) => Callback): Self = StObject.set(x, "robots", js.Any.fromFunction2((t0: /* robots */ Any, t1: /* customData */ Any) => (value(t0, t1)).runNow()))
      
      inline def setRobotsUndefined: Self = StObject.set(x, "robots", js.undefined)
      
      inline def setSite(value: (/* error */ Any, /* siteUrl */ Any, /* customData */ Any) => Callback): Self = StObject.set(x, "site", js.Any.fromFunction3((t0: /* error */ Any, t1: /* siteUrl */ Any, t2: /* customData */ Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    }
  }
  
  trait Link extends StObject {
    
    var end: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var link: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
  }
  object Link {
    
    inline def apply(): Link = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setLink(value: /* result */ Any => Callback): Self = StObject.set(x, "link", js.Any.fromFunction1((t0: /* result */ Any) => value(t0).runNow()))
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    }
  }
}
