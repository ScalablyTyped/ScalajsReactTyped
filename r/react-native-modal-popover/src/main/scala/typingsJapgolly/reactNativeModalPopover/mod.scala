package typingsJapgolly.reactNativeModalPopover

import typingsJapgolly.reactNativeModalPopover.anon.ArrowSize
import typingsJapgolly.reactNativeModalPopover.anon.Children
import typingsJapgolly.reactNativeModalPopover.anon.OnPopoverDisplayed
import typingsJapgolly.reactNativeModalPopover.anon.PartialPopoverProps
import typingsJapgolly.reactNativeModalPopover.libPopoverControllerMod.Props
import typingsJapgolly.reactNativeModalPopover.libPopoverMod.PopoverProps
import typingsJapgolly.reactNativeModalPopover.libUsePopoverMod.UsePopoverHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-modal-popover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-modal-popover", JSImport.Default)
  @js.native
  open class default protected ()
    extends typingsJapgolly.reactNativeModalPopover.libPopoverMod.Popover {
    def this(props: PopoverProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-modal-popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover", "default.defaultProps")
    @js.native
    def defaultProps: PartialPopoverProps = js.native
    inline def defaultProps_=(x: PartialPopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal-popover", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal-popover", "default.propTypes")
    @js.native
    def propTypes: ArrowSize = js.native
    inline def propTypes_=(x: ArrowSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-modal-popover", "Popover")
  @js.native
  open class Popover protected ()
    extends typingsJapgolly.reactNativeModalPopover.libPopoverMod.Popover {
    def this(props: PopoverProps) = this()
  }
  /* static members */
  object Popover {
    
    @JSImport("react-native-modal-popover", "Popover")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover", "Popover.defaultProps")
    @js.native
    def defaultProps: PartialPopoverProps = js.native
    inline def defaultProps_=(x: PartialPopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal-popover", "Popover.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-modal-popover", "Popover.propTypes")
    @js.native
    def propTypes: ArrowSize = js.native
    inline def propTypes_=(x: ArrowSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-modal-popover", "PopoverController")
  @js.native
  open class PopoverController protected ()
    extends typingsJapgolly.reactNativeModalPopover.libPopoverControllerMod.PopoverController {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object PopoverController {
    
    @JSImport("react-native-modal-popover", "PopoverController")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover", "PopoverController.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-modal-popover", "PopoverTouchable")
  @js.native
  open class PopoverTouchable protected ()
    extends typingsJapgolly.reactNativeModalPopover.libPopoverTouchableMod.PopoverTouchable {
    def this(props: typingsJapgolly.reactNativeModalPopover.libPopoverTouchableMod.Props) = this()
  }
  /* static members */
  object PopoverTouchable {
    
    @JSImport("react-native-modal-popover", "PopoverTouchable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-modal-popover", "PopoverTouchable.propTypes")
    @js.native
    def propTypes: OnPopoverDisplayed = js.native
    inline def propTypes_=(x: OnPopoverDisplayed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def usePopover(): UsePopoverHook = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopover")().asInstanceOf[UsePopoverHook]
  inline def usePopover(calculateStatusBar: Boolean): UsePopoverHook = ^.asInstanceOf[js.Dynamic].applyDynamic("usePopover")(calculateStatusBar.asInstanceOf[js.Any]).asInstanceOf[UsePopoverHook]
}
