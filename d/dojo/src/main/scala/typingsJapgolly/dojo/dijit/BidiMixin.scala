package typingsJapgolly.dojo.dijit

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_BidiMixin.html
  *
  * When has("dojo-bidi") is true, _WidgetBase will mixin this class.   It enables support for the textdir
  * property to control text direction independently from the GUI direction.
  * There's a special need for displaying BIDI text in rtl direction
  * in ltr GUI, sometimes needed auto support.
  * In creation of widget, if it's want to activate this class,
  * the widget should define the "textDir".
  * 
  */
trait BidiMixin extends js.Object {
  /**
    * Bi-directional support, the main variable which is responsible for the direction of the text.
    * The text direction can be different than the GUI direction by using this parameter in creation
    * of a widget.
    * 
    * Allowed values:
    * 
    * "ltr"
    * "rtl"
    * "auto" - contextual the direction of a text defined by first strong letter.
    * By default is as the page direction.
    * 
    */
  var textDir: String
  /**
    * Set element.dir according to this.textDir, assuming this.textDir has a value.
    * If textDir is ltr or rtl returns the value.
    * If it's auto, calls to another function that responsible
    * for checking the value, and defining the direction.
    * 
    * @param element The text element to be set. Should have dir property.             
    * @param text               OptionalIf specified, and this.textDir is "auto", for calculating the right transformationOtherwise text read from element.             
    */
  def applyTextDir(element: HTMLElement, text: String): Unit
  /**
    * Wraps by UCC (Unicode control characters) option's text according to this.textDir
    * There's a dir problem with some HTML elements. For some elements (e.g. <option>, <select>)
    * defining the dir in different direction then the GUI orientation, won't display correctly.
    * FF 3.6 will change the alignment of the text in option - this doesn't follow the bidi standards (static text
    * should be aligned following GUI direction). IE8 and Opera11.10 completely ignore dir setting for <option>.
    * Therefore the only solution is to use UCC (Unicode  control characters) to display the text in correct orientation.
    * This function saves the original text value for later restoration if needed, for example if the textDir will change etc.
    * 
    * @param option The element (<option>) we wrapping the text for.             
    * @param text The text to be wrapped.             
    */
  def enforceTextDirWithUcc(option: js.Any, text: js.Any): String
  /**
    * Gets the right direction of text.
    * If textDir is ltr or rtl returns the value.
    * If it's auto, calls to another function that responsible
    * for checking the value, and defining the direction.
    * 
    * @param text             
    */
  def getTextDir(text: String): js.Any
  /**
    * Restores the text of origObj, if needed, after enforceTextDirWithUcc, e.g. set("textDir", textDir).
    * Sets the text of origObj to origObj.originalText, which is the original text, without the UCCs.
    * The function than removes the originalText from origObj!
    * 
    * @param origObj The element (<option>) to restore.             
    */
  def restoreOriginalText(origObj: js.Any): js.Any
}

object BidiMixin {
  @scala.inline
  def apply(
    applyTextDir: (HTMLElement, String) => Callback,
    enforceTextDirWithUcc: (js.Any, js.Any) => CallbackTo[String],
    getTextDir: String => CallbackTo[js.Any],
    restoreOriginalText: js.Any => CallbackTo[js.Any],
    textDir: String
  ): BidiMixin = {
    val __obj = js.Dynamic.literal(textDir = textDir.asInstanceOf[js.Any])
    __obj.updateDynamic("applyTextDir")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: java.lang.String) => applyTextDir(t0, t1).runNow()))
    __obj.updateDynamic("enforceTextDirWithUcc")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => enforceTextDirWithUcc(t0, t1).runNow()))
    __obj.updateDynamic("getTextDir")(js.Any.fromFunction1((t0: java.lang.String) => getTextDir(t0).runNow()))
    __obj.updateDynamic("restoreOriginalText")(js.Any.fromFunction1((t0: js.Any) => restoreOriginalText(t0).runNow()))
    __obj.asInstanceOf[BidiMixin]
  }
}

