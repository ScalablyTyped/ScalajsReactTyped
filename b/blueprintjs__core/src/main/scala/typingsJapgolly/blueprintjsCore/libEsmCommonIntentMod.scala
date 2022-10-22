package typingsJapgolly.blueprintjsCore

import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.danger
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.none
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.primary
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.success
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonIntentMod {
  
  /* Inlined {  NONE :'none',   PRIMARY :'primary',   SUCCESS :'success',   WARNING :'warning',   DANGER :'danger'}[keyof {  NONE :'none',   PRIMARY :'primary',   SUCCESS :'success',   WARNING :'warning',   DANGER :'danger'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.none
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.primary
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.danger
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.warning
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.success
  */
  trait Intent extends StObject
  object Intent {
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent.DANGER")
    @js.native
    def DANGER: danger = js.native
    inline def DANGER_=(x: danger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DANGER")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent.NONE")
    @js.native
    def NONE: none = js.native
    inline def NONE_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent.PRIMARY")
    @js.native
    def PRIMARY: primary = js.native
    inline def PRIMARY_=(x: primary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent.SUCCESS")
    @js.native
    def SUCCESS: success = js.native
    inline def SUCCESS_=(x: success): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/common/intent", "Intent.WARNING")
    @js.native
    def WARNING: warning = js.native
    inline def WARNING_=(x: warning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
}
