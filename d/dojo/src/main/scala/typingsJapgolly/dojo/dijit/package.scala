package typingsJapgolly.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dijit {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/BackgroundIframe.html
    *
    * For IE/FF z-index shenanigans. id attribute is required.
    * new dijit.BackgroundIframe(node).
    * 
    * Makes a background iframe as a child of node, that fills
    * area (and position) of node
    * 
    * @param node     
    */
  type BackgroundIframe = js.Function1[/* node */ org.scalajs.dom.raw.HTMLElement, scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/_BidiSupport.html
    *
    * Deprecated module for enabling textdir support in the dijit widgets.   New code should just define
    * has("dojo-bidi") to return true, rather than manually requiring this module.
    * 
    */
  type BidiSupport = js.Function0[scala.Unit]
  type Calendar = typingsJapgolly.dojo.dijit.Calendar_
  type CalendarLite = typingsJapgolly.dojo.dijit.CalendarLite_
  type ColorPalette = typingsJapgolly.dojo.dijit.ColorPalette_
  type Dialog = typingsJapgolly.dojo.dijit.Dialog_
  type InlineEditBox = typingsJapgolly.dojo.dijit.InlineEditBox_
  type MenuBarItem = typingsJapgolly.dojo.dijit.MenuBarItem_
  type OnDijitClickMixin = typingsJapgolly.dojo.dijit.OnDijitClickMixin_
  type PaletteMixin = typingsJapgolly.dojo.dijit.PaletteMixin_
  type TemplatedMixin = typingsJapgolly.dojo.dijit.TemplatedMixin_
  type TimePicker = typingsJapgolly.dojo.dijit.TimePicker_
  type Tooltip = typingsJapgolly.dojo.dijit.Tooltip_
  type Tree_ = typingsJapgolly.dojo.dijit.Tree__
  type base = typingsJapgolly.dojo.dijit.base_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dijit/hccss.html
    *
    * Test if computer is in high contrast mode, and sets dijit_a11y flag on <body> if it is.
    * Deprecated, use dojo/hccss instead.
    * 
    */
  type hccss = js.Function0[scala.Unit]
  type main = typingsJapgolly.dojo.dijit.main_
  type place = typingsJapgolly.dojo.dijit.place_
  type registry = typingsJapgolly.dojo.dijit.registry_
}
