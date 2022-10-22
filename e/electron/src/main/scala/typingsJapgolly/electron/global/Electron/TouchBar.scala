package typingsJapgolly.electron.global.Electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.electron.Electron.TouchBarButtonConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarColorPickerConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarGroupConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarLabelConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarPopoverConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarScrubberConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarSegmentedControlConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarSliderConstructorOptions
import typingsJapgolly.electron.Electron.TouchBarSpacerConstructorOptions
import typingsJapgolly.electron.electronStrings.left
import typingsJapgolly.electron.electronStrings.overlay
import typingsJapgolly.electron.electronStrings.right
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.TouchBar")
@js.native
open class TouchBar protected ()
  extends StObject
     with typingsJapgolly.electron.Electron.TouchBar {
  // Docs: https://electronjs.org/docs/api/touch-bar
  /**
    * TouchBar
    */
  def this(options: TouchBarConstructorOptions) = this()
  
  /**
    * A `TouchBarItem` that will replace the "esc" button on the touch bar when set.
    * Setting to `null` restores the default "esc" button. Changing this value
    * immediately updates the escape item in the touch bar.
    */
  /* CompleteClass */
  var escapeItem: typingsJapgolly.electron.Electron.TouchBarButton | typingsJapgolly.electron.Electron.TouchBarColorPicker | typingsJapgolly.electron.Electron.TouchBarGroup | typingsJapgolly.electron.Electron.TouchBarLabel | typingsJapgolly.electron.Electron.TouchBarPopover | typingsJapgolly.electron.Electron.TouchBarScrubber | typingsJapgolly.electron.Electron.TouchBarSegmentedControl | typingsJapgolly.electron.Electron.TouchBarSlider | typingsJapgolly.electron.Electron.TouchBarSpacer | Null = js.native
}
object TouchBar {
  
  @JSGlobal("Electron.TouchBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Electron.TouchBar.TouchBarButton")
  @js.native
  open class TouchBarButton protected ()
    extends StObject
       with typingsJapgolly.electron.Electron.TouchBarButton {
    // Docs: https://electronjs.org/docs/api/touch-bar-button
    /**
      * TouchBarButton
      */
    def this(options: TouchBarButtonConstructorOptions) = this()
    
    /**
      * A `string` representing the description of the button to be read by a screen
      * reader. Will only be read by screen readers if no label is set.
      */
    /* CompleteClass */
    var accessibilityLabel: String = js.native
    
    /**
      * A `string` hex code representing the button's current background color. Changing
      * this value immediately updates the button in the touch bar.
      */
    /* CompleteClass */
    var backgroundColor: String = js.native
    
    /**
      * A `boolean` representing whether the button is in an enabled state.
      */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
      * A `NativeImage` representing the button's current icon. Changing this value
      * immediately updates the button in the touch bar.
      */
    /* CompleteClass */
    var icon: typingsJapgolly.electron.Electron.NativeImage_ = js.native
    
    /**
      * A `string` - Can be `left`, `right` or `overlay`.  Defaults to `overlay`.
      */
    /* CompleteClass */
    var iconPosition: left | right | overlay = js.native
    
    /**
      * A `string` representing the button's current text. Changing this value
      * immediately updates the button in the touch bar.
      */
    /* CompleteClass */
    var label: String = js.native
  }
  /**
    * A `typeof TouchBarButton` reference to the `TouchBarButton` class.
    */
  /* static member */
  /* was `typeof TouchBarButton` */
  @JSGlobal("Electron.TouchBar.TouchBarButton")
  @js.native
  def TouchBarButton: Instantiable1[
    /* options */ TouchBarButtonConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarButton
  ] = js.native
  inline def TouchBarButton_=(
    x: Instantiable1[
      /* options */ TouchBarButtonConstructorOptions, 
      typingsJapgolly.electron.Electron.TouchBarButton
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarButton")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Electron.TouchBar.TouchBarColorPicker")
  @js.native
  open class TouchBarColorPicker protected ()
    extends typingsJapgolly.electron.Electron.TouchBarColorPicker {
    // Docs: https://electronjs.org/docs/api/touch-bar-color-picker
    /**
      * TouchBarColorPicker
      */
    def this(options: TouchBarColorPickerConstructorOptions) = this()
  }
  /**
    * A `typeof TouchBarColorPicker` reference to the `TouchBarColorPicker` class.
    */
  /* static member */
  /* was `typeof TouchBarColorPicker` */
  @JSGlobal("Electron.TouchBar.TouchBarColorPicker")
  @js.native
  def TouchBarColorPicker: Instantiable1[
    /* options */ TouchBarColorPickerConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarColorPicker
  ] = js.native
  inline def TouchBarColorPicker_=(
    x: Instantiable1[
      /* options */ TouchBarColorPickerConstructorOptions, 
      typingsJapgolly.electron.Electron.TouchBarColorPicker
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarColorPicker")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Electron.TouchBar.TouchBarGroup")
  @js.native
  open class TouchBarGroup protected () extends EventEmitter {
    // Docs: https://electronjs.org/docs/api/touch-bar-group
    /**
      * TouchBarGroup
      */
    def this(options: TouchBarGroupConstructorOptions) = this()
  }
  /**
    * A `typeof TouchBarGroup` reference to the `TouchBarGroup` class.
    */
  /* static member */
  /* was `typeof TouchBarGroup` */
  @JSGlobal("Electron.TouchBar.TouchBarGroup")
  @js.native
  def TouchBarGroup: Instantiable1[
    /* options */ TouchBarGroupConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarGroup
  ] = js.native
  inline def TouchBarGroup_=(
    x: Instantiable1[
      /* options */ TouchBarGroupConstructorOptions, 
      typingsJapgolly.electron.Electron.TouchBarGroup
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarGroup")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Electron.TouchBar.TouchBarLabel")
  @js.native
  open class TouchBarLabel protected ()
    extends typingsJapgolly.electron.Electron.TouchBarLabel {
    // Docs: https://electronjs.org/docs/api/touch-bar-label
    /**
      * TouchBarLabel
      */
    def this(options: TouchBarLabelConstructorOptions) = this()
  }
  /**
    * A `typeof TouchBarLabel` reference to the `TouchBarLabel` class.
    */
  /* static member */
  /* was `typeof TouchBarLabel` */
  @JSGlobal("Electron.TouchBar.TouchBarLabel")
  @js.native
  def TouchBarLabel: Instantiable1[
    /* options */ TouchBarLabelConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarLabel
  ] = js.native
  inline def TouchBarLabel_=(
    x: Instantiable1[
      /* options */ TouchBarLabelConstructorOptions, 
      typingsJapgolly.electron.Electron.TouchBarLabel
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarLabel")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Electron.TouchBar.TouchBarOtherItemsProxy")
  @js.native
  // Docs: https://electronjs.org/docs/api/touch-bar-other-items-proxy
  /**
    * TouchBarOtherItemsProxy
    */
  open class TouchBarOtherItemsProxy () extends EventEmitter
  /**
    * A `typeof TouchBarOtherItemsProxy` reference to the `TouchBarOtherItemsProxy`
    * class.
    */
  /* static member */
  /* was `typeof TouchBarOtherItemsProxy` */
  @JSGlobal("Electron.TouchBar.TouchBarOtherItemsProxy")
  @js.native
  def TouchBarOtherItemsProxy: Instantiable0[typingsJapgolly.electron.Electron.TouchBarOtherItemsProxy] = js.native
  inline def TouchBarOtherItemsProxy_=(x: Instantiable0[typingsJapgolly.electron.Electron.TouchBarOtherItemsProxy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarOtherItemsProxy")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Electron.TouchBar.TouchBarPopover")
  @js.native
  open class TouchBarPopover protected ()
    extends typingsJapgolly.electron.Electron.TouchBarPopover {
    // Docs: https://electronjs.org/docs/api/touch-bar-popover
    /**
      * TouchBarPopover
      */
    def this(options: TouchBarPopoverConstructorOptions) = this()
  }
  /**
    * A `typeof TouchBarPopover` reference to the `TouchBarPopover` class.
    */
  /* static member */
  /* was `typeof TouchBarPopover` */
  @JSGlobal("Electron.TouchBar.TouchBarPopover")
  @js.native
  def TouchBarPopover: Instantiable1[
    /* options */ TouchBarPopoverConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarPopover
  ] = js.native
  inline def TouchBarPopover_=(
    x: Instantiable1[
      /* options */ TouchBarPopoverConstructorOptions, 
      typingsJapgolly.electron.Electron.TouchBarPopover
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarPopover")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Electron.TouchBar.TouchBarScrubber")
  @js.native
  open class TouchBarScrubber protected ()
    extends typingsJapgolly.electron.Electron.TouchBarScrubber {
    // Docs: https://electronjs.org/docs/api/touch-bar-scrubber
    /**
      * TouchBarScrubber
      */
    def this(options: TouchBarScrubberConstructorOptions) = this()
  }
  /**
    * A `typeof TouchBarScrubber` reference to the `TouchBarScrubber` class.
    */
  /* static member */
  /* was `typeof TouchBarScrubber` */
  @JSGlobal("Electron.TouchBar.TouchBarScrubber")
  @js.native
  def TouchBarScrubber: Instantiable1[
    /* options */ TouchBarScrubberConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarScrubber
  ] = js.native
  inline def TouchBarScrubber_=(
    x: Instantiable1[
      /* options */ TouchBarScrubberConstructorOptions, 
      typingsJapgolly.electron.Electron.TouchBarScrubber
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarScrubber")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Electron.TouchBar.TouchBarSegmentedControl")
  @js.native
  open class TouchBarSegmentedControl protected ()
    extends typingsJapgolly.electron.Electron.TouchBarSegmentedControl {
    // Docs: https://electronjs.org/docs/api/touch-bar-segmented-control
    /**
      * TouchBarSegmentedControl
      */
    def this(options: TouchBarSegmentedControlConstructorOptions) = this()
  }
  /**
    * A `typeof TouchBarSegmentedControl` reference to the `TouchBarSegmentedControl`
    * class.
    */
  /* static member */
  /* was `typeof TouchBarSegmentedControl` */
  @JSGlobal("Electron.TouchBar.TouchBarSegmentedControl")
  @js.native
  def TouchBarSegmentedControl: Instantiable1[
    /* options */ TouchBarSegmentedControlConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarSegmentedControl
  ] = js.native
  inline def TouchBarSegmentedControl_=(
    x: Instantiable1[
      /* options */ TouchBarSegmentedControlConstructorOptions, 
      typingsJapgolly.electron.Electron.TouchBarSegmentedControl
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarSegmentedControl")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Electron.TouchBar.TouchBarSlider")
  @js.native
  open class TouchBarSlider protected ()
    extends typingsJapgolly.electron.Electron.TouchBarSlider {
    // Docs: https://electronjs.org/docs/api/touch-bar-slider
    /**
      * TouchBarSlider
      */
    def this(options: TouchBarSliderConstructorOptions) = this()
  }
  /**
    * A `typeof TouchBarSlider` reference to the `TouchBarSlider` class.
    */
  /* static member */
  /* was `typeof TouchBarSlider` */
  @JSGlobal("Electron.TouchBar.TouchBarSlider")
  @js.native
  def TouchBarSlider: Instantiable1[
    /* options */ TouchBarSliderConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarSlider
  ] = js.native
  inline def TouchBarSlider_=(
    x: Instantiable1[
      /* options */ TouchBarSliderConstructorOptions, 
      typingsJapgolly.electron.Electron.TouchBarSlider
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarSlider")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Electron.TouchBar.TouchBarSpacer")
  @js.native
  open class TouchBarSpacer protected ()
    extends typingsJapgolly.electron.Electron.TouchBarSpacer {
    // Docs: https://electronjs.org/docs/api/touch-bar-spacer
    /**
      * TouchBarSpacer
      */
    def this(options: TouchBarSpacerConstructorOptions) = this()
  }
  /**
    * A `typeof TouchBarSpacer` reference to the `TouchBarSpacer` class.
    */
  /* static member */
  /* was `typeof TouchBarSpacer` */
  @JSGlobal("Electron.TouchBar.TouchBarSpacer")
  @js.native
  def TouchBarSpacer: Instantiable1[
    /* options */ TouchBarSpacerConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarSpacer
  ] = js.native
  inline def TouchBarSpacer_=(
    x: Instantiable1[
      /* options */ TouchBarSpacerConstructorOptions, 
      typingsJapgolly.electron.Electron.TouchBarSpacer
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TouchBarSpacer")(x.asInstanceOf[js.Any])
}
