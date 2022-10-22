package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.ComponentPath
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.componentPath
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonIsConformantMod {
  
  @JSImport("office-ui-fabric-react/lib/common/isConformant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isConformant_componentPath(
    testInfo: (Omit[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IsConformantOptions */ Any, 
      componentPath
    ]) & ComponentPath
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isConformant")(testInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
