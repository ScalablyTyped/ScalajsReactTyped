package typingsJapgolly.orbitUiReactComponents

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distFormSrcFieldsetMod.InnerFieldsetProps
import typingsJapgolly.orbitUiReactComponents.distFormSrcFormContextMod.FormContextType
import typingsJapgolly.orbitUiReactComponents.distFormSrcFormMod.InnerFormProps
import typingsJapgolly.orbitUiReactComponents.distFormSrcRowMod.InnerRowProps
import typingsJapgolly.orbitUiReactComponents.distFormSrcUseFormButtonMod.FormButtonProps
import typingsJapgolly.orbitUiReactComponents.distFormSrcUseFormFieldMod.FormFieldProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormSrcMod {
  
  @JSImport("@orbit-ui/react-components/dist/form/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/form/src", "Fieldset")
  @js.native
  val Fieldset: OrbitComponent[HTMLElement, InnerFieldsetProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/form/src", "Form")
  @js.native
  val Form: OrbitComponent[HTMLElement, InnerFormProps] = js.native
  
  @JSImport("@orbit-ui/react-components/dist/form/src", "FormContext")
  @js.native
  val FormContext: Context[FormContextType] = js.native
  
  inline def InnerFieldset(hasIdLabelAsChildrenForwardedRefRest: InnerFieldsetProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerFieldset")(hasIdLabelAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerForm(props: InnerFormProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerForm")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def InnerRow(props: InnerRowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerRow")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/form/src", "Row")
  @js.native
  val Row: OrbitComponent[HTMLElement, InnerRowProps] = js.native
  
  inline def useFormButton(): js.Tuple2[FormButtonProps, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormButton")().asInstanceOf[js.Tuple2[FormButtonProps, Boolean]]
  
  inline def useFormContext(): js.Tuple2[FormContextType, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormContext")().asInstanceOf[js.Tuple2[FormContextType, Boolean]]
  
  inline def useFormField(): js.Tuple2[FormFieldProps, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormField")().asInstanceOf[js.Tuple2[FormFieldProps, Boolean]]
}
