package typingsJapgolly.reactMosaicComponent

import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactMosaicComponent.libButtonsMosaicButtonMod.MosaicButtonProps
import typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicWindowContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonsExpandButtonMod {
  
  @JSImport("react-mosaic-component/lib/buttons/ExpandButton", "ExpandButton")
  @js.native
  open class ExpandButton protected ()
    extends PureComponent[MosaicButtonProps, js.Object, Any] {
    def this(props: MosaicButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MosaicButtonProps, context: Any) = this()
    
    @JSName("context")
    var context_ExpandButton: MosaicWindowContext = js.native
    
    /* private */ var createExpand: Any = js.native
  }
  /* static members */
  object ExpandButton {
    
    @JSImport("react-mosaic-component/lib/buttons/ExpandButton", "ExpandButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-mosaic-component/lib/buttons/ExpandButton", "ExpandButton.contextType")
    @js.native
    def contextType: Context[MosaicWindowContext] = js.native
    inline def contextType_=(x: Context[MosaicWindowContext]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
}
