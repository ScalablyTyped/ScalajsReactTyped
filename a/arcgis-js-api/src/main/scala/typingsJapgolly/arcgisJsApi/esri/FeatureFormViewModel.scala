package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.IHandle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`value-change`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.disabled
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ready
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFormViewModel
  extends StObject
     with Accessor
     with Evented {
  
  /**
    * The associated feature containing the editable attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#feature)
    */
  var feature: Graphic = js.native
  
  /**
    * Convenience method to find input fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#findField)
    */
  def findField(fieldName: String): InputField = js.native
  
  /**
    * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) used for the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#formTemplate)
    */
  var formTemplate: FormTemplate = js.native
  
  /**
    * Returns all of the field values, regardless of whether or not they were updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#getValues)
    */
  def getValues(): Any = js.native
  
  /**
    * The input fields and/or grouped field rendered by the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#inputFields)
    */
  val inputFields: js.Array[InputField | InputFieldGroup] = js.native
  
  /**
    * Layer containing the editable feature attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#layer)
    */
  var layer: FeatureLayer | SceneLayer = js.native
  
  @JSName("on")
  def on_submit(name: submit, eventHandler: FeatureFormViewModelSubmitEventHandler): IHandle = js.native
  @JSName("on")
  def on_valuechange(name: `value-change`, eventHandler: FeatureFormViewModelValueChangeEventHandler): IHandle = js.native
  
  def setValue(fieldName: String, value: String): scala.Unit = js.native
  def setValue(fieldName: String, value: Any): scala.Unit = js.native
  /**
    * Used to set the updated field value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#setValue)
    */
  def setValue(fieldName: String, value: Double): scala.Unit = js.native
  
  /**
    * The widget's state.
    *
    * @default disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#state)
    */
  val state: ready | disabled = js.native
  
  /**
    * Fires the [submit](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#event-submit) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#submit)
    */
  def submit(): scala.Unit = js.native
  
  /**
    * When true, this form can be submitted without _introducing_ data validation issues.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#submittable)
    */
  var submittable: Boolean = js.native
  
  /**
    * Indicates whether all input fields are valid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FeatureFormViewModel.html#valid)
    */
  var valid: Boolean = js.native
  
  def validateContingencyConstraints(values: String): js.Array[Any] = js.native
  def validateContingencyConstraints(values: String, options: FeatureFormViewModelValidateContingencyConstraintsOptions): js.Array[Any] = js.native
}
