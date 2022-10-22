package typingsJapgolly.addMatchers

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.addMatchers.distMod.CustomMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJasmineV1Mod {
  
  @JSImport("add-matchers/dist/jasmine-v1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getJasmineV1Adapter(
    scope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.Env */ Any
  ): js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[JasmineV1CustomMatcher]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJasmineV1Adapter")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[JasmineV1CustomMatcher]
  ]]
  
  @js.native
  trait JasmineV1CustomMatcher extends StObject {
    
    def apply(args: Any*): Boolean = js.native
  }
  
  type JasmineV1MatcherAdapter = js.Function2[/* name */ String, /* matcher */ CustomMatcher, JasmineV1CustomMatcher]
  
  type JasmineV1MatchersByName = StringDictionary[JasmineV1CustomMatcher]
}
