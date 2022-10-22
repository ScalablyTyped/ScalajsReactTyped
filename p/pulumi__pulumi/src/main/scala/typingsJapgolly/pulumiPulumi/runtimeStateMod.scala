package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.runtimeStackMod.Stack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeStateMod {
  
  object global {
    
    @JSGlobal("globalStore")
    @js.native
    def globalStore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Store */ Any = js.native
    inline def globalStore_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Store */ Any
    ): Unit = js.Dynamic.global.updateDynamic("globalStore")(x.asInstanceOf[js.Any])
    
    @JSGlobal("stackResource")
    @js.native
    def stackResource: js.UndefOr[Stack] = js.native
    inline def stackResource_=(x: js.UndefOr[Stack]): Unit = js.Dynamic.global.updateDynamic("stackResource")(x.asInstanceOf[js.Any])
  }
}
