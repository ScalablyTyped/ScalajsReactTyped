package typingsJapgolly.webpack

import typingsJapgolly.webpack.webpack.Context
import typingsJapgolly.webpack.webpack.Hot
import typingsJapgolly.webpack.webpackStrings.`lazy-once`
import typingsJapgolly.webpack.webpackStrings.`lazy`
import typingsJapgolly.webpack.webpackStrings.eager
import typingsJapgolly.webpack.webpackStrings.sync
import typingsJapgolly.webpack.webpackStrings.weak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeJS {
  
  trait Module extends StObject {
    
    var hot: Hot
  }
  object Module {
    
    inline def apply(hot: Hot): Module = {
      val __obj = js.Dynamic.literal(hot = hot.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setHot(value: Hot): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Require extends StObject {
    
    def context(request: String): Context = js.native
    def context(request: String, includeSubdirectories: Boolean): Context = js.native
    def context(request: String, includeSubdirectories: Boolean, filter: js.RegExp): Context = js.native
    def context(
      request: String,
      includeSubdirectories: Boolean,
      filter: js.RegExp,
      mode: sync | eager | weak | `lazy` | `lazy-once`
    ): Context = js.native
    def context(
      request: String,
      includeSubdirectories: Boolean,
      filter: Unit,
      mode: sync | eager | weak | `lazy` | `lazy-once`
    ): Context = js.native
    def context(request: String, includeSubdirectories: Unit, filter: js.RegExp): Context = js.native
    def context(
      request: String,
      includeSubdirectories: Unit,
      filter: js.RegExp,
      mode: sync | eager | weak | `lazy` | `lazy-once`
    ): Context = js.native
    def context(
      request: String,
      includeSubdirectories: Unit,
      filter: Unit,
      mode: sync | eager | weak | `lazy` | `lazy-once`
    ): Context = js.native
    
    def ensure(
      dependencies: js.Array[String],
      callback: js.Function1[/* require */ js.Function1[/* module */ String, Unit], Unit]
    ): Unit = js.native
    def ensure(
      dependencies: js.Array[String],
      callback: js.Function1[/* require */ js.Function1[/* module */ String, Unit], Unit],
      errorCallback: js.Function1[/* error */ js.Error, Unit]
    ): Unit = js.native
    def ensure(
      dependencies: js.Array[String],
      callback: js.Function1[/* require */ js.Function1[/* module */ String, Unit], Unit],
      errorCallback: js.Function1[/* error */ js.Error, Unit],
      chunkName: String
    ): Unit = js.native
    def ensure(
      dependencies: js.Array[String],
      callback: js.Function1[/* require */ js.Function1[/* module */ String, Unit], Unit],
      errorCallback: Unit,
      chunkName: String
    ): Unit = js.native
    
    def include(dependency: String): Unit = js.native
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
    
    def resolveWeak(dependency: String): Unit = js.native
  }
}
