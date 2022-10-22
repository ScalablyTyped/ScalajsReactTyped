package typingsJapgolly.addMatchers

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.addMatchers.anon.BeforeEach
import typingsJapgolly.addMatchers.distMod.CustomMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJasmineV2Mod {
  
  @JSImport("add-matchers/dist/jasmine-v2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getJasmineV2Adapter(scope: BeforeEach): js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.CustomMatcherFactory */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJasmineV2Adapter")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.CustomMatcherFactory */ Any
    ]
  ]]
  
  type JasmineV2MatcherAdapter = js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jasmine.CustomMatcherFactory */ Any
  ]
}
