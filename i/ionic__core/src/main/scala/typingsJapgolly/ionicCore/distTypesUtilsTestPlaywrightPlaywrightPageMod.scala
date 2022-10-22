package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPlaywrightDeclarationsMod.E2EPage
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPlaywrightDeclarationsMod.E2ESkip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightPlaywrightPageMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/playwright-page", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extendPageFixture(
    page: E2EPage,
    testInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestInfo */ Any
  ): js.Promise[E2EPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendPageFixture")(page.asInstanceOf[js.Any], testInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[E2EPage]]
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/playwright-page", "test")
  @js.native
  val test: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_test.TestType<PlaywrightTestArgs & PlaywrightTestOptions & CustomFixtures, PlaywrightWorkerArgs & PlaywrightWorkerOptions> */ Any = js.native
  
  trait CustomFixtures extends StObject {
    
    var page: E2EPage
    
    var skip: E2ESkip
  }
  object CustomFixtures {
    
    inline def apply(page: E2EPage, skip: E2ESkip): CustomFixtures = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomFixtures]
    }
    
    extension [Self <: CustomFixtures](x: Self) {
      
      inline def setPage(value: E2EPage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: E2ESkip): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
}
