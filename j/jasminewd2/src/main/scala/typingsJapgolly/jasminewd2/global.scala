package typingsJapgolly.jasminewd2

import typingsJapgolly.jasmine.DoneFn
import typingsJapgolly.jasminewd2.jasmine.AsyncCustomMatcherFactories
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def afterAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.Dynamic.global.applyDynamic("afterAll")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("afterAll")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def afterEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.Dynamic.global.applyDynamic("afterEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("afterEach")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.Dynamic.global.applyDynamic("beforeAll")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("beforeAll")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.Dynamic.global.applyDynamic("beforeEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("beforeEach")(action.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fit(expectation: String): Unit = js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = (js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fit(expectation: String, assertion: Unit, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("fit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def it(expectation: String): Unit = js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def it(expectation: String, assertion: Unit, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("it")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object jasmine {
    
    @JSGlobal("jasmine")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addMatchers(matchers: AsyncCustomMatcherFactories): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMatchers")(matchers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def xit(expectation: String): Unit = js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = (js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = (js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def xit(expectation: String, assertion: Unit, timeout: Double): Unit = (js.Dynamic.global.applyDynamic("xit")(expectation.asInstanceOf[js.Any], assertion.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
