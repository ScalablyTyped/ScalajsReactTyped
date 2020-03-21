package typingsJapgolly.vue.optionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Record
import typingsJapgolly.vue.AnonEvent
import typingsJapgolly.vue.vnodeMod.VNode
import typingsJapgolly.vue.vueMod.CreateElement
import typingsJapgolly.vue.vueMod.Vue
import typingsJapgolly.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[V /* <: Vue */, Data, Methods, Computed, PropsDef, Props] extends js.Object {
  var activated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeCreate: js.UndefOr[js.ThisFunction0[/* this */ V, Unit]] = js.undefined
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeMount: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  var comments: js.UndefOr[Boolean] = js.undefined
  var components: js.UndefOr[StringDictionary[(Component[_, _, _, _]) | (AsyncComponent[_, _, _, _])]] = js.undefined
  var computed: js.UndefOr[Accessors[Computed]] = js.undefined
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  var data: js.UndefOr[Data] = js.undefined
  var deactivated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var delimiters: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var destroyed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var directives: js.UndefOr[StringDictionary[DirectiveFunction | DirectiveOptions]] = js.undefined
  var el: js.UndefOr[Element | String] = js.undefined
  var errorCaptured: js.UndefOr[
    js.Function3[/* err */ js.Error, /* vm */ Vue, /* info */ String, Boolean | Unit]
  ] = js.undefined
  // TODO: support properly inferred 'extends'
  var `extends`: js.UndefOr[
    (ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]) | VueConstructor[Vue]
  ] = js.undefined
  var filters: js.UndefOr[StringDictionary[js.Function]] = js.undefined
  var inheritAttrs: js.UndefOr[Boolean] = js.undefined
  var inject: js.UndefOr[InjectOptions] = js.undefined
  var methods: js.UndefOr[Methods] = js.undefined
  var mixins: js.UndefOr[
    js.Array[
      (ComponentOptions[
        Vue, 
        DefaultData[Vue], 
        DefaultMethods[Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps], 
        DefaultProps
      ]) | VueConstructor[Vue]
    ]
  ] = js.undefined
  var model: js.UndefOr[AnonEvent] = js.undefined
  var mounted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[Vue] = js.undefined
  var props: js.UndefOr[PropsDef] = js.undefined
  var propsData: js.UndefOr[js.Object] = js.undefined
  var provide: js.UndefOr[js.Object | js.Function0[js.Object]] = js.undefined
  // hack is for functional component type inference, should not be used in user code
  var render: js.UndefOr[
    js.Function2[/* createElement */ CreateElement, /* hack */ RenderContext[Props], VNode]
  ] = js.undefined
  var renderError: js.UndefOr[js.Function2[/* createElement */ CreateElement, /* err */ js.Error, VNode]] = js.undefined
  var serverPrefetch: js.UndefOr[js.ThisFunction0[/* this */ V, js.Promise[Unit]]] = js.undefined
  var staticRenderFns: js.UndefOr[js.Array[js.Function1[/* createElement */ CreateElement, VNode]]] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var transitions: js.UndefOr[StringDictionary[js.Object]] = js.undefined
  var updated: js.UndefOr[js.Function0[Unit]] = js.undefined
  var watch: js.UndefOr[Record[String, WatchOptionsWithHandler[_] | WatchHandler[_] | String]] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[V /* <: Vue */, Data, Methods, Computed, PropsDef, Props](
    activated: js.UndefOr[Callback] = js.undefined,
    beforeCreate: js.ThisFunction0[/* this */ V, Unit] = null,
    beforeDestroy: js.UndefOr[Callback] = js.undefined,
    beforeMount: js.UndefOr[Callback] = js.undefined,
    beforeUpdate: js.UndefOr[Callback] = js.undefined,
    comments: js.UndefOr[Boolean] = js.undefined,
    components: StringDictionary[(Component[_, _, _, _]) | (AsyncComponent[_, _, _, _])] = null,
    computed: Accessors[Computed] = null,
    created: js.UndefOr[Callback] = js.undefined,
    data: Data = null,
    deactivated: js.UndefOr[Callback] = js.undefined,
    delimiters: js.Tuple2[String, String] = null,
    destroyed: js.UndefOr[Callback] = js.undefined,
    directives: StringDictionary[DirectiveFunction | DirectiveOptions] = null,
    el: Element | String = null,
    errorCaptured: (/* err */ js.Error, /* vm */ Vue, /* info */ String) => CallbackTo[Boolean | Unit] = null,
    `extends`: (ComponentOptions[
      Vue, 
      DefaultData[Vue], 
      DefaultMethods[Vue], 
      DefaultComputed, 
      PropsDefinition[DefaultProps], 
      DefaultProps
    ]) | VueConstructor[Vue] = null,
    filters: StringDictionary[js.Function] = null,
    inheritAttrs: js.UndefOr[Boolean] = js.undefined,
    inject: InjectOptions = null,
    methods: Methods = null,
    mixins: js.Array[
      (ComponentOptions[
        Vue, 
        DefaultData[Vue], 
        DefaultMethods[Vue], 
        DefaultComputed, 
        PropsDefinition[DefaultProps], 
        DefaultProps
      ]) | VueConstructor[Vue]
    ] = null,
    model: AnonEvent = null,
    mounted: js.UndefOr[Callback] = js.undefined,
    name: String = null,
    parent: Vue = null,
    props: PropsDef = null,
    propsData: js.Object = null,
    provide: js.Object | js.Function0[js.Object] = null,
    render: (/* createElement */ CreateElement, /* hack */ RenderContext[Props]) => CallbackTo[VNode] = null,
    renderError: (/* createElement */ CreateElement, /* err */ js.Error) => CallbackTo[VNode] = null,
    serverPrefetch: js.ThisFunction0[/* this */ V, js.Promise[Unit]] = null,
    staticRenderFns: js.Array[js.Function1[/* createElement */ CreateElement, VNode]] = null,
    template: String = null,
    transitions: StringDictionary[js.Object] = null,
    updated: js.UndefOr[Callback] = js.undefined,
    watch: Record[String, WatchOptionsWithHandler[_] | WatchHandler[_] | String] = null
  ): ComponentOptions[V, Data, Methods, Computed, PropsDef, Props] = {
    val __obj = js.Dynamic.literal()
    activated.foreach(p => __obj.updateDynamic("activated")(p.toJsFn))
    if (beforeCreate != null) __obj.updateDynamic("beforeCreate")(beforeCreate.asInstanceOf[js.Any])
    beforeDestroy.foreach(p => __obj.updateDynamic("beforeDestroy")(p.toJsFn))
    beforeMount.foreach(p => __obj.updateDynamic("beforeMount")(p.toJsFn))
    beforeUpdate.foreach(p => __obj.updateDynamic("beforeUpdate")(p.toJsFn))
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (computed != null) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    created.foreach(p => __obj.updateDynamic("created")(p.toJsFn))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    deactivated.foreach(p => __obj.updateDynamic("deactivated")(p.toJsFn))
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    destroyed.foreach(p => __obj.updateDynamic("destroyed")(p.toJsFn))
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (errorCaptured != null) __obj.updateDynamic("errorCaptured")(js.Any.fromFunction3((t0: /* err */ js.Error, t1: /* vm */ typingsJapgolly.vue.vueMod.Vue, t2: /* info */ java.lang.String) => errorCaptured(t0, t1, t2).runNow()))
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritAttrs)) __obj.updateDynamic("inheritAttrs")(inheritAttrs.asInstanceOf[js.Any])
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    mounted.foreach(p => __obj.updateDynamic("mounted")(p.toJsFn))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (propsData != null) __obj.updateDynamic("propsData")(propsData.asInstanceOf[js.Any])
    if (provide != null) __obj.updateDynamic("provide")(provide.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2((t0: /* createElement */ typingsJapgolly.vue.vueMod.CreateElement, t1: /* hack */ typingsJapgolly.vue.optionsMod.RenderContext[Props]) => render(t0, t1).runNow()))
    if (renderError != null) __obj.updateDynamic("renderError")(js.Any.fromFunction2((t0: /* createElement */ typingsJapgolly.vue.vueMod.CreateElement, t1: /* err */ js.Error) => renderError(t0, t1).runNow()))
    if (serverPrefetch != null) __obj.updateDynamic("serverPrefetch")(serverPrefetch.asInstanceOf[js.Any])
    if (staticRenderFns != null) __obj.updateDynamic("staticRenderFns")(staticRenderFns.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (transitions != null) __obj.updateDynamic("transitions")(transitions.asInstanceOf[js.Any])
    updated.foreach(p => __obj.updateDynamic("updated")(p.toJsFn))
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions[V, Data, Methods, Computed, PropsDef, Props]]
  }
}

