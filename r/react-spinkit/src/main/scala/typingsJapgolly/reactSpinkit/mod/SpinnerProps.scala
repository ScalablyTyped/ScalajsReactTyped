package typingsJapgolly.reactSpinkit.mod

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-beat`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-clip-rotate-multiple`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-clip-rotate-pulse`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-clip-rotate`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-grid-beat`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-grid-pulse`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-pulse-rise`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-pulse-sync`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-scale-multiple`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-scale-ripple-multiple`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-scale-ripple`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-spin-fade-loader`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-triangle-path`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-zig-zag-deflect`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`ball-zig-zag`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`chasing-dots`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`cube-grid`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`double-bounce`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`folding-cube`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`line-scale-party`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`line-scale-pulse-out-rapid`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`line-scale-pulse-out`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`line-scale`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`line-spin-fade-loader`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`rotating-plane`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`three-bounce`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`triangle-skew-spin`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.`wandering-cubes`
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.circle
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.full
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.half
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.none
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.pacman
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.pulse
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.quarter
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.wave
import typingsJapgolly.reactSpinkit.reactSpinkitStrings.wordpress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  /**
    * Component className.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Programmatically set the color of the spinners (does not work
    * for circle or folding-cube); this can either be a hex value or a color word
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Set the time before the spinner fades in
    */
  var fadeIn: js.UndefOr[full | half | quarter | none] = js.undefined
  /**
    * Specify spinner to use.
    */
  var name: js.UndefOr[
    `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman
  ] = js.undefined
  /**
    * Change the default "spinner" className.
    */
  var overrideSpinnerClassName: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    fadeIn: full | half | quarter | none = null,
    name: `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman = null,
    overrideSpinnerClassName: String = null,
    style: CSSProperties = null
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fadeIn != null) __obj.updateDynamic("fadeIn")(fadeIn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overrideSpinnerClassName != null) __obj.updateDynamic("overrideSpinnerClassName")(overrideSpinnerClassName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
}

