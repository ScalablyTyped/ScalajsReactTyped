package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsPickerColumnTestTestDotutilsMod {
  
  @JSImport("@ionic/core/dist/types/components/picker-column/test/test.utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testPickerColumn(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any,
    buttonSelector: String,
    description: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("testPickerColumn")(page.asInstanceOf[js.Any], buttonSelector.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
