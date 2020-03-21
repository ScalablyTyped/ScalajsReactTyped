package typingsJapgolly.formik.withFormikMod

import typingsJapgolly.formik.typesMod.FormikProps
import typingsJapgolly.formik.typesMod.FormikValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/withFormik", "withFormik")
@js.native
object withFormik extends js.Object {
  def apply[OuterProps, Values /* <: FormikValues */, Payload](hasMapPropsToValuesConfig: WithFormikConfig[OuterProps, Values, Payload]): ComponentDecorator[OuterProps, OuterProps with FormikProps[Values]] = js.native
}

