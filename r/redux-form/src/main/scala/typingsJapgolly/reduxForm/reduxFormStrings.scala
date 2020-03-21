package typingsJapgolly.reduxForm

import typingsJapgolly.reduxForm.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxFormStrings {
  @js.native
  sealed trait Field extends FieldType
  
  @js.native
  sealed trait FieldArray extends FieldType
  
  @js.native
  sealed trait blur extends js.Object
  
  @js.native
  sealed trait formValues extends js.Object
  
  @js.native
  sealed trait input extends js.Object
  
  @js.native
  sealed trait onSubmit extends js.Object
  
  @js.native
  sealed trait select extends js.Object
  
  @js.native
  sealed trait submit extends js.Object
  
  @js.native
  sealed trait textarea extends js.Object
  
  @scala.inline
  def Field: Field = "Field".asInstanceOf[Field]
  @scala.inline
  def FieldArray: FieldArray = "FieldArray".asInstanceOf[FieldArray]
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  @scala.inline
  def formValues: formValues = "formValues".asInstanceOf[formValues]
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  @scala.inline
  def onSubmit: onSubmit = "onSubmit".asInstanceOf[onSubmit]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  @scala.inline
  def textarea: textarea = "textarea".asInstanceOf[textarea]
}

