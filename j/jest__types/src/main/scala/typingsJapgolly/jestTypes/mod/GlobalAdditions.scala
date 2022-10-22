package typingsJapgolly.jestTypes.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.istanbulLibCoverage.mod.CoverageMapData
import typingsJapgolly.jestTypes.anon.ItBaseconcurrentItConcurr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalAdditions
  extends StObject
     with TestFrameworkGlobals {
  
  var __coverage__ : CoverageMapData
}
object GlobalAdditions {
  
  inline def apply(
    __coverage__ : CoverageMapData,
    afterAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Callback,
    afterEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Callback,
    beforeAll: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Callback,
    beforeEach: (/* fn */ HookFn, /* timeout */ js.UndefOr[Double]) => Callback,
    describe: Describe,
    fdescribe: DescribeBase,
    fit: ItBaseconcurrentItConcurr,
    it: ItConcurrent,
    test: ItConcurrent,
    xdescribe: DescribeBase,
    xit: ItBase,
    xtest: ItBase
  ): GlobalAdditions = {
    val __obj = js.Dynamic.literal(__coverage__ = __coverage__.asInstanceOf[js.Any], afterAll = js.Any.fromFunction2((t0: /* fn */ HookFn, t1: /* timeout */ js.UndefOr[Double]) => (afterAll(t0, t1)).runNow()), afterEach = js.Any.fromFunction2((t0: /* fn */ HookFn, t1: /* timeout */ js.UndefOr[Double]) => (afterEach(t0, t1)).runNow()), beforeAll = js.Any.fromFunction2((t0: /* fn */ HookFn, t1: /* timeout */ js.UndefOr[Double]) => (beforeAll(t0, t1)).runNow()), beforeEach = js.Any.fromFunction2((t0: /* fn */ HookFn, t1: /* timeout */ js.UndefOr[Double]) => (beforeEach(t0, t1)).runNow()), describe = describe.asInstanceOf[js.Any], fdescribe = fdescribe.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], xdescribe = xdescribe.asInstanceOf[js.Any], xit = xit.asInstanceOf[js.Any], xtest = xtest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalAdditions]
  }
  
  extension [Self <: GlobalAdditions](x: Self) {
    
    inline def set__coverage__(value: CoverageMapData): Self = StObject.set(x, "__coverage__", value.asInstanceOf[js.Any])
  }
}
