package typingsJapgolly.antd.esMod

import typingsJapgolly.antd.Anon_ArgsChildren
import typingsJapgolly.antd.Anon_Colon
import typingsJapgolly.antd.TypeofClassFormItem
import typingsJapgolly.antd.esFormFormMod.FormComponentProps
import typingsJapgolly.antd.esFormFormMod.FormCreateOption
import typingsJapgolly.antd.esFormFormMod.FormProps
import typingsJapgolly.antd.esFormInterfaceMod.FormWrappedProps
import typingsJapgolly.antd.esFormMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es", "Form")
@js.native
class Form protected () extends default {
  def this(props: FormProps) = this()
}

/* static members */
@JSImport("antd/es", "Form")
@js.native
object Form extends js.Object {
  var Item: TypeofClassFormItem = js.native
  var createFormField: js.Any = js.native
  var defaultProps: Anon_Colon = js.native
  var propTypes: Anon_ArgsChildren = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
}

