package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsMixin
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsWithArrayProps
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsWithObjectProps
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsWithoutProps
import typingsJapgolly.vueRuntimeCore.mod.ComponentPropsOptions
import typingsJapgolly.vueRuntimeCore.mod.ComputedOptions
import typingsJapgolly.vueRuntimeCore.mod.Data
import typingsJapgolly.vueRuntimeCore.mod.EmitsOptions
import typingsJapgolly.vueRuntimeCore.mod.EmitsToProps
import typingsJapgolly.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typingsJapgolly.vueRuntimeCore.mod.ExtractPropTypes
import typingsJapgolly.vueRuntimeCore.mod.MethodOptions
import typingsJapgolly.vueRuntimeCore.mod.RenderFunction
import typingsJapgolly.vueRuntimeCore.mod.SetupContext
import typingsJapgolly.vueRuntimeDom.anon.Styles
import typingsJapgolly.vueRuntimeDom.mod.VueElementConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdefineSSRCustomElem extends StObject {
  
  def apply(options: typingsJapgolly.vueRuntimeDom.anon.Instantiable): VueElementConstructor[js.Object] = js.native
  def apply[Props, RawBindings](
    setup: js.Function2[
      /* props */ Props, 
      /* ctx */ SetupContext[EmitsOptions], 
      RawBindings | RenderFunction
    ]
  ): VueElementConstructor[Props] = js.native
  def apply[PropsOptions /* <: ComponentPropsOptions[Data] */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
    options: (ComponentOptionsWithObjectProps[
      PropsOptions, 
      RawBindings, 
      D, 
      C, 
      M, 
      Mixin, 
      Extends, 
      E, 
      EE, 
      ExtractPropTypes[PropsOptions] & EmitsToProps[E], 
      ExtractDefaultPropTypes[PropsOptions]
    ]) & Styles
  ): VueElementConstructor[ExtractPropTypes[PropsOptions]] = js.native
  def apply[PropNames /* <: String */, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
    options: (ComponentOptionsWithArrayProps[
      PropNames, 
      RawBindings, 
      D, 
      C, 
      M, 
      Mixin, 
      Extends, 
      E, 
      EE, 
      (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in PropNames ]:? any} */ js.Any) & EmitsToProps[E]
    ]) & Styles
  ): VueElementConstructor[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in PropNames ]: any} */ js.Any
  ] = js.native
  def apply[Props, RawBindings, D, C /* <: ComputedOptions */, M /* <: MethodOptions */, Mixin /* <: ComponentOptionsMixin */, Extends /* <: ComponentOptionsMixin */, E /* <: EmitsOptions */, EE /* <: String */](
    options: (ComponentOptionsWithoutProps[Props, RawBindings, D, C, M, Mixin, Extends, E, EE, Props & EmitsToProps[E]]) & Styles
  ): VueElementConstructor[Props] = js.native
}
