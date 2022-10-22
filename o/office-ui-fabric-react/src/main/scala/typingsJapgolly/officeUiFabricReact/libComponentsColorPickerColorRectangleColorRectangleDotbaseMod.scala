package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.officeUiFabricReact.anon.PartialIColorRectanglePro
import typingsJapgolly.officeUiFabricReact.anon.ReadonlyIColorRectanglePr
import typingsJapgolly.officeUiFabricReact.anon.ReadonlyIColorRectangleSt
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorRectangleColorRectangleDottypesMod.IColorRectangle
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorRectangleColorRectangleDottypesMod.IColorRectangleProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesColorInterfacesMod.IColor
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsColorPickerColorRectangleColorRectangleDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase")
  @js.native
  open class ColorRectangleBase protected ()
    extends Component[IColorRectangleProps, IColorRectangleState, Any]
       with IColorRectangle {
    def this(props: IColorRectangleProps) = this()
    
    /* private */ var _descriptionId: Any = js.native
    
    /* private */ var _disposables: Any = js.native
    
    /* private */ var _disposeListeners: Any = js.native
    
    /* private */ var _isAdjustingSaturation: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onMouseDown: Any = js.native
    
    /* private */ var _onMouseMove: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _updateColor: Any = js.native
    
    /** Currently selected color. */
    /* CompleteClass */
    var color: IColor = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MColorRectangleBase(prevProps: ReadonlyIColorRectanglePr, prevState: ReadonlyIColorRectangleSt): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MColorRectangleBase(): Unit = js.native
  }
  /* static members */
  object ColorRectangleBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorRectanglePro = js.native
    inline def defaultProps_=(x: PartialIColorRectanglePro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def getNewColor(ev: ReactMouseEventFrom[Element], prevColor: IColor, root: HTMLElement): js.UndefOr[IColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getNewColor")(ev.asInstanceOf[js.Any], prevColor.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[IColor]]
  inline def getNewColor(ev: MouseEvent, prevColor: IColor, root: HTMLElement): js.UndefOr[IColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("_getNewColor")(ev.asInstanceOf[js.Any], prevColor.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[IColor]]
  
  trait IColorRectangleState extends StObject {
    
    var color: IColor
  }
  object IColorRectangleState {
    
    inline def apply(color: IColor): IColorRectangleState = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorRectangleState]
    }
    
    extension [Self <: IColorRectangleState](x: Self) {
      
      inline def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
}
