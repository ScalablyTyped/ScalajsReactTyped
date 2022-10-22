package typingsJapgolly.angularScenario

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularScenario {
  
  type BindingFunction = js.Function1[/* bracketBindingExpression */ String, Future]
  
  @js.native
  trait Browser extends StObject {
    
    def location(): testLocation = js.native
    
    def navigateTo(urlDescription: String, urlFunction: js.Function0[String]): Unit = js.native
    def navigateTo(url: String): Unit = js.native
    
    def reload(): Unit = js.native
    
    def window(): testWindow = js.native
  }
  
  type CustomMatchers = Matchers
  
  @js.native
  trait Element extends StObject {
    
    def attr(key: Any): Future = js.native
    def attr(key: Any, value: Any): Unit = js.native
    
    def click(): Any = js.native
    
    def count(): Future = js.native
    
    def css(key: Any): Future = js.native
    def css(key: Any, value: Any): Unit = js.native
    
    def dblclick(): Any = js.native
    
    def height(): Future = js.native
    def height(value: Any): Unit = js.native
    
    def html(): Future = js.native
    def html(value: Any): Unit = js.native
    
    def innerHeight(): Future = js.native
    def innerHeight(value: Any): Unit = js.native
    
    def innerWidth(): Future = js.native
    def innerWidth(value: Any): Unit = js.native
    
    def mousedown(): Any = js.native
    
    def mouseover(): Any = js.native
    
    def mouseup(): Any = js.native
    
    def offset(): Future = js.native
    def offset(value: Any): Unit = js.native
    
    def outerHeight(): Future = js.native
    def outerHeight(value: Any): Unit = js.native
    
    def outerWidth(): Future = js.native
    def outerWidth(value: Any): Unit = js.native
    
    def position(): Future = js.native
    def position(value: Any): Unit = js.native
    
    def prop(key: Any): Future = js.native
    def prop(key: Any, value: Any): Unit = js.native
    
    def query(
      callback: js.Function2[
          /* selectedDOMElements */ JQuery, 
          /* callbackWhenDone */ js.Function2[/* objNull */ Any, /* futureValue */ Any, Any], 
          Any
        ]
    ): Any = js.native
    
    def scrollLeft(): Future = js.native
    def scrollLeft(value: Any): Unit = js.native
    
    def scrollTop(): Future = js.native
    def scrollTop(value: Any): Unit = js.native
    
    def text(): Future = js.native
    def text(value: Any): Unit = js.native
    
    def `val`(): Future = js.native
    def `val`(value: Any): Unit = js.native
    
    def width(): Future = js.native
    def width(value: Any): Unit = js.native
  }
  
  trait Expect
    extends StObject
       with Matchers {
    
    def not(): CustomMatchers
  }
  object Expect {
    
    inline def apply(
      not: CallbackTo[CustomMatchers],
      toBe: Any => Callback,
      toBeDefined: Callback,
      toBeFalsy: Callback,
      toBeGreaterThan: Any => Callback,
      toBeLessThan: Any => Callback,
      toBeNull: Callback,
      toBeTruthy: Callback,
      toContain: Any => Callback,
      toEqual: Any => Callback,
      toMatch: Any => Callback
    ): Expect = {
      val __obj = js.Dynamic.literal(not = not.toJsFn, toBe = js.Any.fromFunction1((t0: Any) => toBe(t0).runNow()), toBeDefined = toBeDefined.toJsFn, toBeFalsy = toBeFalsy.toJsFn, toBeGreaterThan = js.Any.fromFunction1((t0: Any) => toBeGreaterThan(t0).runNow()), toBeLessThan = js.Any.fromFunction1((t0: Any) => toBeLessThan(t0).runNow()), toBeNull = toBeNull.toJsFn, toBeTruthy = toBeTruthy.toJsFn, toContain = js.Any.fromFunction1((t0: Any) => toContain(t0).runNow()), toEqual = js.Any.fromFunction1((t0: Any) => toEqual(t0).runNow()), toMatch = js.Any.fromFunction1((t0: Any) => toMatch(t0).runNow()))
      __obj.asInstanceOf[Expect]
    }
    
    extension [Self <: Expect](x: Self) {
      
      inline def setNot(value: CallbackTo[CustomMatchers]): Self = StObject.set(x, "not", value.toJsFn)
    }
  }
  
  trait Future extends StObject
  
  trait Input extends StObject {
    
    def check(): Any
    
    def enter(value: Any): Any
    
    def select(radioButtonValue: Any): Any
    
    def `val`(): Future
  }
  object Input {
    
    inline def apply(check: CallbackTo[Any], enter: Any => Any, select: Any => Any, `val`: CallbackTo[Future]): Input = {
      val __obj = js.Dynamic.literal(check = check.toJsFn, enter = js.Any.fromFunction1(enter), select = js.Any.fromFunction1(select))
      __obj.updateDynamic("val")(`val`.toJsFn)
      __obj.asInstanceOf[Input]
    }
    
    extension [Self <: Input](x: Self) {
      
      inline def setCheck(value: CallbackTo[Any]): Self = StObject.set(x, "check", value.toJsFn)
      
      inline def setEnter(value: Any => Any): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
      
      inline def setSelect(value: Any => Any): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setVal(value: CallbackTo[Future]): Self = StObject.set(x, "val", value.toJsFn)
    }
  }
  
  trait Matchers extends StObject {
    
    def toBe(value: Any): Unit
    
    def toBeDefined(): Unit
    
    def toBeFalsy(): Unit
    
    def toBeGreaterThan(value: Any): Unit
    
    def toBeLessThan(value: Any): Unit
    
    def toBeNull(): Unit
    
    def toBeTruthy(): Unit
    
    def toContain(value: Any): Unit
    
    def toEqual(value: Any): Unit
    
    def toMatch(regularExpression: Any): Unit
  }
  object Matchers {
    
    inline def apply(
      toBe: Any => Callback,
      toBeDefined: Callback,
      toBeFalsy: Callback,
      toBeGreaterThan: Any => Callback,
      toBeLessThan: Any => Callback,
      toBeNull: Callback,
      toBeTruthy: Callback,
      toContain: Any => Callback,
      toEqual: Any => Callback,
      toMatch: Any => Callback
    ): Matchers = {
      val __obj = js.Dynamic.literal(toBe = js.Any.fromFunction1((t0: Any) => toBe(t0).runNow()), toBeDefined = toBeDefined.toJsFn, toBeFalsy = toBeFalsy.toJsFn, toBeGreaterThan = js.Any.fromFunction1((t0: Any) => toBeGreaterThan(t0).runNow()), toBeLessThan = js.Any.fromFunction1((t0: Any) => toBeLessThan(t0).runNow()), toBeNull = toBeNull.toJsFn, toBeTruthy = toBeTruthy.toJsFn, toContain = js.Any.fromFunction1((t0: Any) => toContain(t0).runNow()), toEqual = js.Any.fromFunction1((t0: Any) => toEqual(t0).runNow()), toMatch = js.Any.fromFunction1((t0: Any) => toMatch(t0).runNow()))
      __obj.asInstanceOf[Matchers]
    }
    
    extension [Self <: Matchers](x: Self) {
      
      inline def setToBe(value: Any => Callback): Self = StObject.set(x, "toBe", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setToBeDefined(value: Callback): Self = StObject.set(x, "toBeDefined", value.toJsFn)
      
      inline def setToBeFalsy(value: Callback): Self = StObject.set(x, "toBeFalsy", value.toJsFn)
      
      inline def setToBeGreaterThan(value: Any => Callback): Self = StObject.set(x, "toBeGreaterThan", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setToBeLessThan(value: Any => Callback): Self = StObject.set(x, "toBeLessThan", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setToBeNull(value: Callback): Self = StObject.set(x, "toBeNull", value.toJsFn)
      
      inline def setToBeTruthy(value: Callback): Self = StObject.set(x, "toBeTruthy", value.toJsFn)
      
      inline def setToContain(value: Any => Callback): Self = StObject.set(x, "toContain", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setToEqual(value: Any => Callback): Self = StObject.set(x, "toEqual", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setToMatch(value: Any => Callback): Self = StObject.set(x, "toMatch", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  type PauseFunction = js.Function0[Any]
  
  trait Repeater extends StObject {
    
    def column(ngBindingExpression: String): Future
    
    def count(): Future
    
    def row(index: Double): Future
  }
  object Repeater {
    
    inline def apply(column: String => Future, count: CallbackTo[Future], row: Double => Future): Repeater = {
      val __obj = js.Dynamic.literal(column = js.Any.fromFunction1(column), count = count.toJsFn, row = js.Any.fromFunction1(row))
      __obj.asInstanceOf[Repeater]
    }
    
    extension [Self <: Repeater](x: Self) {
      
      inline def setColumn(value: String => Future): Self = StObject.set(x, "column", js.Any.fromFunction1(value))
      
      inline def setCount(value: CallbackTo[Future]): Self = StObject.set(x, "count", value.toJsFn)
      
      inline def setRow(value: Double => Future): Self = StObject.set(x, "row", js.Any.fromFunction1(value))
    }
  }
  
  type RunFunction = js.Function1[/* functionToRun */ Any, Any]
  
  type RunFunctionWithDescription = js.Function2[/* description */ String, /* functionToRun */ Any, Any]
  
  @js.native
  trait Select extends StObject {
    
    def option(listOfValues: Any*): Any = js.native
    def option(value: Any): Any = js.native
  }
  
  type SleepFunction = js.Function1[/* seconds */ Double, Any]
  
  type UsingFunction = js.Function2[/* selector */ String, /* selectorDescription */ js.UndefOr[String], Unit]
  
  trait testLocation extends StObject {
    
    def hash(): Future
    
    def path(): Future
    
    def search(): Future
    
    def url(): Future
  }
  object testLocation {
    
    inline def apply(
      hash: CallbackTo[Future],
      path: CallbackTo[Future],
      search: CallbackTo[Future],
      url: CallbackTo[Future]
    ): testLocation = {
      val __obj = js.Dynamic.literal(hash = hash.toJsFn, path = path.toJsFn, search = search.toJsFn, url = url.toJsFn)
      __obj.asInstanceOf[testLocation]
    }
    
    extension [Self <: testLocation](x: Self) {
      
      inline def setHash(value: CallbackTo[Future]): Self = StObject.set(x, "hash", value.toJsFn)
      
      inline def setPath(value: CallbackTo[Future]): Self = StObject.set(x, "path", value.toJsFn)
      
      inline def setSearch(value: CallbackTo[Future]): Self = StObject.set(x, "search", value.toJsFn)
      
      inline def setUrl(value: CallbackTo[Future]): Self = StObject.set(x, "url", value.toJsFn)
    }
  }
  
  trait testWindow extends StObject {
    
    def hash(): Future
    
    def href(): Future
    
    def path(): Future
    
    def search(): Future
  }
  object testWindow {
    
    inline def apply(
      hash: CallbackTo[Future],
      href: CallbackTo[Future],
      path: CallbackTo[Future],
      search: CallbackTo[Future]
    ): testWindow = {
      val __obj = js.Dynamic.literal(hash = hash.toJsFn, href = href.toJsFn, path = path.toJsFn, search = search.toJsFn)
      __obj.asInstanceOf[testWindow]
    }
    
    extension [Self <: testWindow](x: Self) {
      
      inline def setHash(value: CallbackTo[Future]): Self = StObject.set(x, "hash", value.toJsFn)
      
      inline def setHref(value: CallbackTo[Future]): Self = StObject.set(x, "href", value.toJsFn)
      
      inline def setPath(value: CallbackTo[Future]): Self = StObject.set(x, "path", value.toJsFn)
      
      inline def setSearch(value: CallbackTo[Future]): Self = StObject.set(x, "search", value.toJsFn)
    }
  }
}
