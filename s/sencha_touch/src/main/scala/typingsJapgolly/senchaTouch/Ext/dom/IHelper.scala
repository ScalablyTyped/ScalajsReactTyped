package typingsJapgolly.senchaTouch.Ext.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.senchaTouch.Ext.Array
import typingsJapgolly.senchaTouch.Ext.ITemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelper extends js.Object {
  /** [Method] Creates new DOM element s and appends them to el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  var append: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Applies a style specification to an element
  		* @param el String/HTMLElement The element to apply styles to
  		* @param styles String/Object/Function A style specification string e.g. 'width:100px', or object in the form {width:'100px'}, or a function which returns such a specification.
  		*/
  var applyStyles: js.UndefOr[js.Function2[/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Creates a new Ext Template from the DOM object spec
  		* @param o Object The DOM object spec (and children)
  		* @returns Ext.Template The new template
  		*/
  var createTemplate: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], ITemplate]] = js.undefined
  /** [Method] Converts the styles from the given object to text
  		* @param styles Object The object describing the styles.
  		* @param buffer String[] The output buffer.
  		* @returns String/String[] If buffer is passed, it is returned. Otherwise the style string is returned.
  		*/
  var generateStyles: js.UndefOr[js.Function2[/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[Array], _]] = js.undefined
  /** [Method] Creates new DOM element s and inserts them after el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object The DOM object spec (and children)
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  var insertAfter: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Creates new DOM element s and inserts them before el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  var insertBefore: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Creates new DOM element s and inserts them as the first child of el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  var insertFirst: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Inserts an HTML fragment into the DOM
  		* @param where String Where to insert the html in relation to el - beforeBegin, afterBegin, beforeEnd, afterEnd. For example take the following HTML: &lt;div&gt;Contents&lt;/div&gt; Using different where values inserts element to the following places:  beforeBegin: &lt;HERE&gt;&lt;div&gt;Contents&lt;/div&gt; afterBegin: &lt;div&gt;&lt;HERE&gt;Contents&lt;/div&gt; beforeEnd: &lt;div&gt;Contents&lt;HERE&gt;&lt;/div&gt; afterEnd: &lt;div&gt;Contents&lt;/div&gt;&lt;HERE&gt;
  		* @param el HTMLElement/TextNode The context element
  		* @param html String The HTML fragment
  		* @returns HTMLElement The new node
  		*/
  var insertHtml: js.UndefOr[
    js.Function3[
      /* where */ js.UndefOr[String], 
      /* el */ js.UndefOr[js.Any], 
      /* html */ js.UndefOr[String], 
      HTMLElement
    ]
  ] = js.undefined
  /** [Method] Returns the markup for the passed Element s config
  		* @param spec Object The DOM object spec (and children).
  		* @returns String
  		*/
  var markup: js.UndefOr[js.Function1[/* spec */ js.UndefOr[js.Any], String]] = js.undefined
  /** [Method] Creates new DOM element s and overwrites the contents of el with them
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @param returnElement Boolean true to return a Ext.Element
  		* @returns HTMLElement/Ext.Element The new node
  		*/
  var overwrite: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
}

object IHelper {
  @scala.inline
  def apply(
    append: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    applyStyles: (/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any]) => Callback = null,
    createTemplate: /* o */ js.UndefOr[js.Any] => CallbackTo[ITemplate] = null,
    generateStyles: (/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[Array]) => CallbackTo[js.Any] = null,
    insertAfter: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertBefore: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertFirst: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null,
    insertHtml: (/* where */ js.UndefOr[String], /* el */ js.UndefOr[js.Any], /* html */ js.UndefOr[String]) => CallbackTo[HTMLElement] = null,
    markup: /* spec */ js.UndefOr[js.Any] => CallbackTo[String] = null,
    overwrite: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => CallbackTo[js.Any] = null
  ): IHelper = {
    val __obj = js.Dynamic.literal()
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* o */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => append(t0, t1, t2).runNow()))
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(js.Any.fromFunction2((t0: /* el */ js.UndefOr[js.Any], t1: /* styles */ js.UndefOr[js.Any]) => applyStyles(t0, t1).runNow()))
    if (createTemplate != null) __obj.updateDynamic("createTemplate")(js.Any.fromFunction1((t0: /* o */ js.UndefOr[js.Any]) => createTemplate(t0).runNow()))
    if (generateStyles != null) __obj.updateDynamic("generateStyles")(js.Any.fromFunction2((t0: /* styles */ js.UndefOr[js.Any], t1: /* buffer */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.Array]) => generateStyles(t0, t1).runNow()))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* o */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => insertAfter(t0, t1, t2).runNow()))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* o */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => insertBefore(t0, t1, t2).runNow()))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* o */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => insertFirst(t0, t1, t2).runNow()))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction3((t0: /* where */ js.UndefOr[java.lang.String], t1: /* el */ js.UndefOr[js.Any], t2: /* html */ js.UndefOr[java.lang.String]) => insertHtml(t0, t1, t2).runNow()))
    if (markup != null) __obj.updateDynamic("markup")(js.Any.fromFunction1((t0: /* spec */ js.UndefOr[js.Any]) => markup(t0).runNow()))
    if (overwrite != null) __obj.updateDynamic("overwrite")(js.Any.fromFunction3((t0: /* el */ js.UndefOr[js.Any], t1: /* o */ js.UndefOr[js.Any], t2: /* returnElement */ js.UndefOr[scala.Boolean]) => overwrite(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IHelper]
  }
}

