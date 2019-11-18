package typingsJapgolly.antd.antdMod

import typingsJapgolly.antd.Anon_ArgsChildren
import typingsJapgolly.antd.Anon_Colon
import typingsJapgolly.antd.TypeofClassFormItemDefaultProps
import typingsJapgolly.antd.libFormFormMod.FormComponentProps
import typingsJapgolly.antd.libFormFormMod.FormCreateOption
import typingsJapgolly.antd.libFormFormMod.FormProps
import typingsJapgolly.antd.libFormInterfaceMod.FormWrappedProps
import typingsJapgolly.antd.libFormMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Form")
@js.native
class Form protected () extends default {
  def this(props: FormProps) = this()
}

/* static members */
@JSImport("antd", "Form")
@js.native
object Form extends js.Object {
  var Item: TypeofClassFormItemDefaultProps = js.native
  var createFormField: js.Any = js.native
  var defaultProps: Anon_Colon = js.native
  var propTypes: Anon_ArgsChildren = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](): FormWrappedProps[TOwnProps] = js.native
  def create[TOwnProps /* <: FormComponentProps[_] */](options: FormCreateOption[TOwnProps]): FormWrappedProps[TOwnProps] = js.native
}

