package typingsJapgolly.fluentuiReactFocus

import typingsJapgolly.fluentuiReactFocus.anon.ComponentPath
import typingsJapgolly.fluentuiReactFocus.fluentuiReactFocusStrings.componentPath
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonIsConformantMod {
  
  @JSImport("@fluentui/react-focus/lib/common/isConformant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isConformant_componentPath[TProps](
    testInfo: (Omit[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IsConformantOptions<TProps> */ Any, 
      componentPath
    ]) & ComponentPath
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isConformant")(testInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
