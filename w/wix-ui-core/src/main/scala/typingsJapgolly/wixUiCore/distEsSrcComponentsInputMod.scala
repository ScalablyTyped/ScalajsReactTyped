package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.distEsSrcComponentsInputInputMod.InputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsInputMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/input", "Input")
  @js.native
  open class Input protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsInputInputMod.Input {
    def this(props: InputProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InputProps, context: Any) = this()
  }
  /* static members */
  object Input {
    
    @JSImport("wix-ui-core/dist/es/src/components/input", "Input")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/input", "Input.defaultProps")
    @js.native
    def defaultProps: InputProps = js.native
    inline def defaultProps_=(x: InputProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/input", "Input.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
