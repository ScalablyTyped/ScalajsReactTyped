package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.NamedNodeMap
import typingsJapgolly.aureliaBinding.mod.bindingMode
import typingsJapgolly.aureliaTemplating.aureliaTemplatingStrings.attribute
import typingsJapgolly.aureliaTemplating.aureliaTemplatingStrings.bindingBehavior
import typingsJapgolly.aureliaTemplating.aureliaTemplatingStrings.element
import typingsJapgolly.aureliaTemplating.aureliaTemplatingStrings.fromView
import typingsJapgolly.aureliaTemplating.aureliaTemplatingStrings.oneTime
import typingsJapgolly.aureliaTemplating.aureliaTemplatingStrings.oneWay
import typingsJapgolly.aureliaTemplating.aureliaTemplatingStrings.toView
import typingsJapgolly.aureliaTemplating.aureliaTemplatingStrings.twoWay
import typingsJapgolly.aureliaTemplating.aureliaTemplatingStrings.valueConverter
import typingsJapgolly.std.ShadowRootInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticResourceConfig extends js.Object {
  /**
    * List of bindable properties of this custom element / custom attribute, by name or full config object
    */
  var bindables: js.UndefOr[String | js.Array[IBindablePropertyConfig]] = js.undefined
  /**
    * Flag a custom element as containerless. Which will remove their render target
    */
  var containerless: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to set default binding mode of default custom attribute view model "value" property
    */
  var defaultBindingMode: js.UndefOr[bindingMode | oneTime | oneWay | twoWay | fromView | toView] = js.undefined
  /**
    * Flags a custom attribute has dynamic options
    */
  var hasDynamicOptions: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of this resource. Reccommended to explicitly set to works better with minifier
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Custom processing of the attributes on an element before the framework inspects them.
    */
  var processAttributes: js.UndefOr[
    js.Function5[
      /* viewCompiler */ ViewCompiler, 
      /* resources */ ViewResources_, 
      /* node */ Element, 
      /* attributes */ NamedNodeMap, 
      /* elementInstruction */ BehaviorInstruction, 
      Unit
    ]
  ] = js.undefined
  /**
    * Enables custom processing of the content that is places inside the custom element by its consumer.
    * Pass a boolean to direct the template compiler to not process
    * the content placed inside this element. Alternatively, pass a function which
    * can provide custom processing of the content. This function should then return
    * a boolean indicating whether the compiler should also process the content.
    */
  var processContent: js.UndefOr[
    js.Function4[
      /* viewCompiler */ ViewCompiler, 
      /* resources */ ViewResources_, 
      /* node */ Element, 
      /* instruction */ BehaviorInstruction, 
      Boolean
    ]
  ] = js.undefined
  /**
    * Options that will be used if the element is flagged with usesShadowDOM
    */
  var shadowDOMOptions: js.UndefOr[ShadowRootInit] = js.undefined
  /**
    * Used to tell if a custom attribute is a template controller
    */
  var templateController: js.UndefOr[Boolean] = js.undefined
  /**
    * Resource type of this class, omit equals to custom element
    */
  var `type`: js.UndefOr[
    element | attribute | valueConverter | bindingBehavior | typingsJapgolly.aureliaTemplating.aureliaTemplatingStrings.viewEngineHooks
  ] = js.undefined
  /**
    * Flag if this custom element uses native shadow dom instead of emulation
    */
  var usesShadowDOM: js.UndefOr[Boolean] = js.undefined
}

object IStaticResourceConfig {
  @scala.inline
  def apply(
    bindables: String | js.Array[IBindablePropertyConfig] = null,
    containerless: js.UndefOr[Boolean] = js.undefined,
    defaultBindingMode: bindingMode | oneTime | oneWay | twoWay | fromView | toView = null,
    hasDynamicOptions: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    processAttributes: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources_, /* node */ Element, /* attributes */ NamedNodeMap, /* elementInstruction */ BehaviorInstruction) => Callback = null,
    processContent: (/* viewCompiler */ ViewCompiler, /* resources */ ViewResources_, /* node */ Element, /* instruction */ BehaviorInstruction) => CallbackTo[Boolean] = null,
    shadowDOMOptions: ShadowRootInit = null,
    templateController: js.UndefOr[Boolean] = js.undefined,
    `type`: element | attribute | valueConverter | bindingBehavior | typingsJapgolly.aureliaTemplating.aureliaTemplatingStrings.viewEngineHooks = null,
    usesShadowDOM: js.UndefOr[Boolean] = js.undefined
  ): IStaticResourceConfig = {
    val __obj = js.Dynamic.literal()
    if (bindables != null) __obj.updateDynamic("bindables")(bindables.asInstanceOf[js.Any])
    if (!js.isUndefined(containerless)) __obj.updateDynamic("containerless")(containerless.asInstanceOf[js.Any])
    if (defaultBindingMode != null) __obj.updateDynamic("defaultBindingMode")(defaultBindingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDynamicOptions)) __obj.updateDynamic("hasDynamicOptions")(hasDynamicOptions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (processAttributes != null) __obj.updateDynamic("processAttributes")(js.Any.fromFunction5((t0: /* viewCompiler */ typingsJapgolly.aureliaTemplating.mod.ViewCompiler, t1: /* resources */ typingsJapgolly.aureliaTemplating.mod.ViewResources_, t2: /* node */ org.scalajs.dom.raw.Element, t3: /* attributes */ org.scalajs.dom.raw.NamedNodeMap, t4: /* elementInstruction */ typingsJapgolly.aureliaTemplating.mod.BehaviorInstruction) => processAttributes(t0, t1, t2, t3, t4).runNow()))
    if (processContent != null) __obj.updateDynamic("processContent")(js.Any.fromFunction4((t0: /* viewCompiler */ typingsJapgolly.aureliaTemplating.mod.ViewCompiler, t1: /* resources */ typingsJapgolly.aureliaTemplating.mod.ViewResources_, t2: /* node */ org.scalajs.dom.raw.Element, t3: /* instruction */ typingsJapgolly.aureliaTemplating.mod.BehaviorInstruction) => processContent(t0, t1, t2, t3).runNow()))
    if (shadowDOMOptions != null) __obj.updateDynamic("shadowDOMOptions")(shadowDOMOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(templateController)) __obj.updateDynamic("templateController")(templateController.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(usesShadowDOM)) __obj.updateDynamic("usesShadowDOM")(usesShadowDOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticResourceConfig]
  }
}

