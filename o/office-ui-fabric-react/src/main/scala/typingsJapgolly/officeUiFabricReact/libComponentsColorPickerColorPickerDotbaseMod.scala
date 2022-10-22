package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.PartialIColorPickerProps
import typingsJapgolly.officeUiFabricReact.anon.ReadonlyIColorPickerProps
import typingsJapgolly.officeUiFabricReact.anon.ReadonlyIColorPickerState
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPicker
import typingsJapgolly.officeUiFabricReact.libComponentsColorPickerColorPickerDottypesMod.IColorPickerProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesColorInterfacesMod.IColor
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsColorPickerColorPickerDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase")
  @js.native
  open class ColorPickerBase protected ()
    extends Component[IColorPickerProps, IColorPickerState, Any]
       with IColorPicker {
    def this(props: IColorPickerProps) = this()
    
    /* private */ var _getDisplayValue: Any = js.native
    
    /** Callback for when the alpha/transparency slider changes */
    /* private */ var _onATChanged: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
    /* private */ var _onHChanged: Any = js.native
    
    /* private */ var _onSVChanged: Any = js.native
    
    /* private */ var _onTextChange: Any = js.native
    
    /** Strings besides red/green/blue/alpha/hex, with defaults for all values except the deprecated `hue` */
    /* private */ var _strings: Any = js.native
    
    /* private */ var _textChangeHandlers: Any = js.native
    
    /**
      * Strings displayed in the UI as text field labels (these are in a separate object for convenient
      * indexing by short color component name).
      */
    /* private */ var _textLabels: Any = js.native
    
    /**
      * Update the displayed color and call change handlers if appropriate.
      * @param ev - Event if call was triggered by an event (undefined if triggered by props change)
      * @param newColor - Updated color
      */
    /* private */ var _updateColor: Any = js.native
    
    /** The currently selected color. */
    /* CompleteClass */
    var color: IColor = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MColorPickerBase(prevProps: ReadonlyIColorPickerProps, prevState: ReadonlyIColorPickerState): Unit = js.native
  }
  /* static members */
  object ColorPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorPickerProps = js.native
    inline def defaultProps_=(x: PartialIColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined keyof std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/utilities/color/interfaces.IColor, 'r' | 'g' | 'b' | 'a' | 't' | 'hex'> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.g
    - typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.b
    - typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.a
    - typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.r
    - typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.hex
    - typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.t
  */
  trait ColorComponent extends StObject
  object ColorComponent {
    
    inline def a: typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.a = "a".asInstanceOf[typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.a]
    
    inline def b: typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.b = "b".asInstanceOf[typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.b]
    
    inline def g: typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.g = "g".asInstanceOf[typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.g]
    
    inline def hex: typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.hex = "hex".asInstanceOf[typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.hex]
    
    inline def r: typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.r = "r".asInstanceOf[typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.r]
    
    inline def t: typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.t = "t".asInstanceOf[typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.t]
  }
  
  trait IColorPickerState extends StObject {
    
    /** Most recently selected color */
    var color: IColor
    
    /** Color component currently being edited via a text field (if intermediate value is invalid) */
    var editingColor: js.UndefOr[typingsJapgolly.officeUiFabricReact.anon.Component] = js.undefined
  }
  object IColorPickerState {
    
    inline def apply(color: IColor): IColorPickerState = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorPickerState]
    }
    
    extension [Self <: IColorPickerState](x: Self) {
      
      inline def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setEditingColor(value: typingsJapgolly.officeUiFabricReact.anon.Component): Self = StObject.set(x, "editingColor", value.asInstanceOf[js.Any])
      
      inline def setEditingColorUndefined: Self = StObject.set(x, "editingColor", js.undefined)
    }
  }
}
