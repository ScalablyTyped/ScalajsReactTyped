package typingsJapgolly.emberComponent.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : CoreView.extend(ViewMixin, ActionSupport, ClassNamesSupport) * / any */ trait Component extends js.Object {
  // properties
  /**
    * The WAI-ARIA role of the control represented by this view. For example, a button may have a
    * role of type 'button', or a pane may have a role of type 'alertdialog'. This property is
    * used by assistive software to help visually challenged users navigate rich web applications.
    */
  var ariaRole: String
  /**
    * The HTML id of the component's element in the DOM. You can provide this value yourself but
    * it must be unique (just as in HTML):
    *
    * If not manually set a default value will be provided by the framework. Once rendered an
    * element's elementId is considered immutable and you should never change it. If you need
    * to compute a dynamic value for the elementId, you should do this when the component or
    * element is being instantiated:
    */
  var elementId: String
  /**
    * If false, the view will appear hidden in DOM.
    */
  var isVisible: Boolean
  /**
    * A component may contain a layout. A layout is a regular template but supersedes the template
    * property during rendering. It is the responsibility of the layout template to retrieve the
    * template property from the component (or alternatively, call Handlebars.helpers.yield,
    * {{yield}}) to render it in the correct location. This is useful for a component that has a
    * shared wrapper, but which delegates the rendering of the contents of the wrapper to the
    * template property on a subclass.
    */
  var layout: TemplateFactory | String
  // events
  /**
    * Called when the attributes passed into the component have been updated. Called both during the
    * initial render of a container and during a rerender. Can be used in place of an observer; code
    * placed here will be executed every time any attribute updates.
    */
  def didReceiveAttrs(): Unit
  /**
    * Called after a component has been rendered, both on initial render and in subsequent rerenders.
    */
  def didRender(): Unit
  /**
    * Called when the component has updated and rerendered itself. Called only during a rerender,
    * not during an initial render.
    */
  def didUpdate(): Unit
  /**
    * Called when the attributes passed into the component have been changed. Called only during a
    * rerender, not during an initial render.
    */
  def didUpdateAttrs(): Unit
  // methods
  def readDOMAttr(name: String): String
  /**
    * Called before a component has been rendered, both on initial render and in subsequent rerenders.
    */
  def willRender(): Unit
  /**
    * Called when the component is about to update and rerender itself. Called only during a rerender,
    * not during an initial render.
    */
  def willUpdate(): Unit
}

object Component {
  @scala.inline
  def apply(
    ariaRole: String,
    didReceiveAttrs: Callback,
    didRender: Callback,
    didUpdate: Callback,
    didUpdateAttrs: Callback,
    elementId: String,
    isVisible: Boolean,
    layout: TemplateFactory | String,
    readDOMAttr: String => CallbackTo[String],
    willRender: Callback,
    willUpdate: Callback
  ): Component = {
    val __obj = js.Dynamic.literal(ariaRole = ariaRole.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.updateDynamic("didReceiveAttrs")(didReceiveAttrs.toJsFn)
    __obj.updateDynamic("didRender")(didRender.toJsFn)
    __obj.updateDynamic("didUpdate")(didUpdate.toJsFn)
    __obj.updateDynamic("didUpdateAttrs")(didUpdateAttrs.toJsFn)
    __obj.updateDynamic("readDOMAttr")(js.Any.fromFunction1((t0: java.lang.String) => readDOMAttr(t0).runNow()))
    __obj.updateDynamic("willRender")(willRender.toJsFn)
    __obj.updateDynamic("willUpdate")(willUpdate.toJsFn)
    __obj.asInstanceOf[Component]
  }
}

