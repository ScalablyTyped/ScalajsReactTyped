package typingsJapgolly.addMatchers

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.addMatchers.anon.Expect
import typingsJapgolly.addMatchers.distMod.CustomMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJestMod {
  
  @JSImport("add-matchers/dist/jest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getJestAdapter(scope: Expect): js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.CustomMatcher */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJestAdapter")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.CustomMatcher */ Any
    ]
  ]]
  
  type JestMatcherAdapter = js.Function2[
    /* name */ String, 
    /* matcher */ CustomMatcher, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.CustomMatcher */ Any
  ]
}
