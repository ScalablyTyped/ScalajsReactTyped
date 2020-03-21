package typingsJapgolly.electron.mod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "TouchBar")
@js.native
class TouchBar protected ()
  extends typingsJapgolly.electron.Electron.TouchBar {
  // Docs: http://electronjs.org/docs/api/touch-bar
  def this(options: TouchBarConstructorOptions) = this()
}

/* static members */
@JSImport("electron", "TouchBar")
@js.native
object TouchBar extends js.Object {
  var TouchBarButton: Instantiable1[
    /* options */ TouchBarButtonConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarButton
  ] = js.native
  var TouchBarColorPicker: Instantiable1[
    /* options */ TouchBarColorPickerConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarColorPicker
  ] = js.native
  var TouchBarGroup: Instantiable1[
    /* options */ TouchBarGroupConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarGroup
  ] = js.native
  var TouchBarLabel: Instantiable1[
    /* options */ TouchBarLabelConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarLabel
  ] = js.native
  var TouchBarPopover: Instantiable1[
    /* options */ TouchBarPopoverConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarPopover
  ] = js.native
  var TouchBarScrubber: Instantiable1[
    /* options */ TouchBarScrubberConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarScrubber
  ] = js.native
  var TouchBarSegmentedControl: Instantiable1[
    /* options */ TouchBarSegmentedControlConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarSegmentedControl
  ] = js.native
  var TouchBarSlider: Instantiable1[
    /* options */ TouchBarSliderConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarSlider
  ] = js.native
  var TouchBarSpacer: Instantiable1[
    /* options */ TouchBarSpacerConstructorOptions, 
    typingsJapgolly.electron.Electron.TouchBarSpacer
  ] = js.native
}

