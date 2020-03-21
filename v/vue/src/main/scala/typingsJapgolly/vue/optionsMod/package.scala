package typingsJapgolly.vue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
  type Accessors[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: (): T[K] | vue.vue/types/options.ComputedOptions<T[K]>}
    */ typingsJapgolly.vue.vueStrings.Accessors with js.Any
  type ArrayPropsDefinition[T] = js.Array[java.lang.String]
  type AsyncComponent[Data, Methods, Computed, Props] = (typingsJapgolly.vue.optionsMod.AsyncComponentPromise[Data, Methods, Computed, Props]) | (typingsJapgolly.vue.optionsMod.AsyncComponentFactory[Data, Methods, Computed, Props])
  type AsyncComponentFactory[Data, Methods, Computed, Props] = js.Function0[typingsJapgolly.vue.AnonComponent[Data, Methods, Computed, Props]]
  type AsyncComponentPromise[Data, Methods, Computed, Props] = js.Function2[
    /* resolve */ js.Function1[
      /* component */ typingsJapgolly.vue.optionsMod.Component[Data, Methods, Computed, Props], 
      scala.Unit
    ], 
    /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
    (js.Promise[
      (typingsJapgolly.vue.optionsMod.Component[
        typingsJapgolly.vue.optionsMod.DefaultData[scala.Nothing], 
        typingsJapgolly.vue.optionsMod.DefaultMethods[scala.Nothing], 
        typingsJapgolly.vue.optionsMod.DefaultComputed, 
        typingsJapgolly.vue.optionsMod.DefaultProps
      ]) | typingsJapgolly.vue.optionsMod.EsModuleComponent
    ]) | scala.Unit
  ]
  type Component[Data, Methods, Computed, Props] = typingsJapgolly.vue.vueMod.VueConstructor[typingsJapgolly.vue.vueMod.Vue] | (typingsJapgolly.vue.optionsMod.FunctionalComponentOptions[Props, typingsJapgolly.vue.optionsMod.PropsDefinition[Props]]) | (typingsJapgolly.vue.optionsMod.ComponentOptions[scala.Nothing, Data, Methods, Computed, Props, typingsJapgolly.vue.optionsMod.DefaultProps])
  type DataDef[Data, Props, V] = Data | (js.ThisFunction0[/* this */ Props with V, Data])
  type DefaultComputed = org.scalablytyped.runtime.StringDictionary[js.Any]
  type DefaultData[V] = js.Object | (js.ThisFunction0[/* this */ V, js.Object])
  type DefaultMethods[V] = org.scalablytyped.runtime.StringDictionary[js.ThisFunction1[/* this */ V, /* repeated */ js.Any, js.Any]]
  type DefaultProps = typingsJapgolly.std.Record[java.lang.String, js.Any]
  type DirectiveFunction = js.Function4[
    /* el */ org.scalajs.dom.raw.HTMLElement, 
    /* binding */ typingsJapgolly.vue.optionsMod.DirectiveBinding, 
    /* vnode */ typingsJapgolly.vue.vnodeMod.VNode, 
    /* oldVnode */ typingsJapgolly.vue.vnodeMod.VNode, 
    scala.Unit
  ]
  type InjectKey = java.lang.String | js.Symbol
  type InjectOptions = (org.scalablytyped.runtime.StringDictionary[typingsJapgolly.vue.optionsMod.InjectKey | typingsJapgolly.vue.AnonDefault]) | js.Array[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - js.Function0[T]
    - typingsJapgolly.vue.AnonInstantiable[T]
    - typingsJapgolly.vue.AnonInstantiableFunction
  */
  type Prop[T] = typingsJapgolly.vue.optionsMod._Prop[T] | js.Function0[T]
  type PropType[T] = typingsJapgolly.vue.optionsMod.Prop[T] | js.Array[typingsJapgolly.vue.optionsMod.Prop[T]]
  type PropValidator[T] = typingsJapgolly.vue.optionsMod.PropOptions[T] | typingsJapgolly.vue.optionsMod.PropType[T]
  type PropsDefinition[T] = typingsJapgolly.vue.optionsMod.ArrayPropsDefinition[T] | typingsJapgolly.vue.optionsMod.RecordPropsDefinition[T]
  type RecordPropsDefinition[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: vue.vue/types/options.PropValidator<T[K]>}
    */ typingsJapgolly.vue.vueStrings.RecordPropsDefinition with T
  type ThisTypedComponentOptionsWithArrayProps[V /* <: typingsJapgolly.vue.vueMod.Vue */, Data, Methods, Computed, PropNames /* <: java.lang.String */] = js.Object with (typingsJapgolly.vue.optionsMod.ComponentOptions[
    V, 
    typingsJapgolly.vue.optionsMod.DataDef[Data, typingsJapgolly.std.Record[PropNames, _], V], 
    Methods, 
    Computed, 
    js.Array[PropNames], 
    typingsJapgolly.std.Record[PropNames, _]
  ]) with (typingsJapgolly.std.ThisType[
    typingsJapgolly.vue.vueMod.CombinedVueInstance[V, Data, Methods, Computed, typingsJapgolly.std.Record[PropNames, _]]
  ])
  type ThisTypedComponentOptionsWithRecordProps[V /* <: typingsJapgolly.vue.vueMod.Vue */, Data, Methods, Computed, Props] = js.Object with (typingsJapgolly.vue.optionsMod.ComponentOptions[
    V, 
    typingsJapgolly.vue.optionsMod.DataDef[Data, Props, V], 
    Methods, 
    Computed, 
    typingsJapgolly.vue.optionsMod.RecordPropsDefinition[Props], 
    Props
  ]) with (typingsJapgolly.std.ThisType[
    typingsJapgolly.vue.vueMod.CombinedVueInstance[V, Data, Methods, Computed, Props]
  ])
  type WatchHandler[T] = js.Function2[/* val */ T, /* oldVal */ T, scala.Unit]
}
