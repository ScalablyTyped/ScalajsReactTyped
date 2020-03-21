package typingsJapgolly.dojo.dojox.html

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/html/styles.html
  *
  *
  */
trait styles_ extends js.Object {
  /**
    *
    */
  var entities: js.Object
  /**
    *
    */
  var `ext-dojo`: js.Object
  /**
    *
    */
  var metrics: js.Object
  /**
    * Getter/Setter
    * If passed a title, enables a that style sheet. All other
    * toggle-able style sheets are disabled.
    * If no argument is passed, returns currently enabled
    * style sheet.
    *
    * @param title               Optional
    */
  def activeStyleSheet(title: String): Unit
  /**
    * Disables the dynamic style sheet with the name passed in the
    * argument. If no arg is passed, defaults to the default style sheet.
    *
    * @param styleSheetName
    */
  def disableStyleSheet(styleSheetName: String): Unit
  /**
    * Enables the style sheet with the name passed in the
    * argument. Deafults to the default style sheet.
    *
    * @param styleSheetName
    */
  def enableStyleSheet(styleSheetName: String): Unit
  /**
    * Creates and returns a dynamically created style sheet
    * used for dynamic styles
    *
    * @param styleSheetName               OptionalThe name given the style sheet so that multiplestyle sheets can be created and referenced. Ifno argument is given, the name "default" is used.
    */
  def getDynamicStyleSheet(styleSheetName: String): js.Any
  /**
    * Returns the style sheet that was initially enabled
    * on document launch.
    * TODO, does not work.
    *
    */
  def getPreferredStyleSheet(): Unit
  /**
    * Returns a style sheet based on the argument.
    * Searches dynamic style sheets first. If no matches,
    * searches document style sheets.
    *
    * @param styleSheetName               OptionalA title or an href to a style sheet. Title can bean attribute in a tag, or a dynamic style sheetreference. Href can be the name of the file.If no argument, the assumed created dynamic stylesheet is used.
    */
  def getStyleSheet(styleSheetName: String): Unit
  /**
    * Collects all the style sheets referenced in the HTML page,
    * including any included via @import.
    *
    */
  def getStyleSheets(): js.Any
  /**
    * Searches HTML for style sheets that are "toggle-able" -
    * can be enabled and disabled. These would include sheets
    * with the title attribute, as well as the REL attribute.
    *
    */
  def getToggledStyleSheets(): js.Any
  /**
    * Creates a style and attaches it to a dynamically created stylesheet
    *
    * @param selector A fully qualified class name, as it would appear ina CSS dojo.doc. Start classes with periods, targetnodes with '#'. Large selectors can also be createdlike:"#myDiv.myClass span input"
    * @param declaration A single string that would make up a style block, notincluding the curly braces. Include semi-colons betweenstatements. Do not use JavaScript style declarationsin camel case, use as you would in a CSS dojo.doc:"color:#ffoooo;font-size:12px;margin-left:5px;"
    * @param styleSheetName               OptionalName of the dynamic style sheet this rule should beinserted into. If is not found by that name, it iscreated. If no name is passed, the name "default" isused.
    */
  def insertCssRule(selector: String, declaration: String, styleSheetName: String): String
  /**
    * Not implemented - it seems to have some merit for changing some complex
    * selectors. It's not much use for changing simple ones like "span".
    * For now, simply write a new rule which will cascade over the first.
    *
    * Modifies an existing cssRule
    *
    * @param selector
    * @param declaration
    * @param styleSheetName
    */
  def modifyCssRule(selector: js.Any, declaration: js.Any, styleSheetName: js.Any): Unit
  /**
    * Removes a cssRule base on the selector and declaration passed
    * The declaration is needed for cases of dupe selectors
    * Only removes DYNAMICALLY created cssRules. If you
    * created it with dh.insertCssRule, it can be removed.
    *
    * @param selector
    * @param declaration
    * @param styleSheetName
    */
  def removeCssRule(selector: String, declaration: String, styleSheetName: String): Unit
}

object styles_ {
  @scala.inline
  def apply(
    activeStyleSheet: String => Callback,
    disableStyleSheet: String => Callback,
    enableStyleSheet: String => Callback,
    entities: js.Object,
    `ext-dojo`: js.Object,
    getDynamicStyleSheet: String => CallbackTo[js.Any],
    getPreferredStyleSheet: Callback,
    getStyleSheet: String => Callback,
    getStyleSheets: CallbackTo[js.Any],
    getToggledStyleSheets: CallbackTo[js.Any],
    insertCssRule: (String, String, String) => CallbackTo[String],
    metrics: js.Object,
    modifyCssRule: (js.Any, js.Any, js.Any) => Callback,
    removeCssRule: (String, String, String) => Callback
  ): styles_ = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.updateDynamic("activeStyleSheet")(js.Any.fromFunction1((t0: java.lang.String) => activeStyleSheet(t0).runNow()))
    __obj.updateDynamic("disableStyleSheet")(js.Any.fromFunction1((t0: java.lang.String) => disableStyleSheet(t0).runNow()))
    __obj.updateDynamic("enableStyleSheet")(js.Any.fromFunction1((t0: java.lang.String) => enableStyleSheet(t0).runNow()))
    __obj.updateDynamic("ext-dojo")(`ext-dojo`.asInstanceOf[js.Any])
    __obj.updateDynamic("getDynamicStyleSheet")(js.Any.fromFunction1((t0: java.lang.String) => getDynamicStyleSheet(t0).runNow()))
    __obj.updateDynamic("getPreferredStyleSheet")(getPreferredStyleSheet.toJsFn)
    __obj.updateDynamic("getStyleSheet")(js.Any.fromFunction1((t0: java.lang.String) => getStyleSheet(t0).runNow()))
    __obj.updateDynamic("getStyleSheets")(getStyleSheets.toJsFn)
    __obj.updateDynamic("getToggledStyleSheets")(getToggledStyleSheets.toJsFn)
    __obj.updateDynamic("insertCssRule")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => insertCssRule(t0, t1, t2).runNow()))
    __obj.updateDynamic("modifyCssRule")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => modifyCssRule(t0, t1, t2).runNow()))
    __obj.updateDynamic("removeCssRule")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => removeCssRule(t0, t1, t2).runNow()))
    __obj.asInstanceOf[styles_]
  }
}

