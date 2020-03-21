package typingsJapgolly.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FormikErrors[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikErrors<Values[K]> * / object : string}
    */ typingsJapgolly.formik.formikStrings.FormikErrors with Values
  type FormikProps[Values] = typingsJapgolly.formik.typesMod.FormikSharedConfig[js.Object] with typingsJapgolly.formik.typesMod.FormikState[Values] with typingsJapgolly.formik.typesMod.FormikActions[Values] with typingsJapgolly.formik.typesMod.FormikHandlers with typingsJapgolly.formik.typesMod.FormikComputedProps[Values] with typingsJapgolly.formik.typesMod.FormikRegistration
  type FormikTouched[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikTouched<Values[K]> * / object : boolean}
    */ typingsJapgolly.formik.formikStrings.FormikTouched with Values
  type FormikValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GenericFieldHTMLAttributes = typingsJapgolly.react.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement] | typingsJapgolly.react.mod.SelectHTMLAttributes[org.scalajs.dom.raw.HTMLSelectElement] | typingsJapgolly.react.mod.TextareaHTMLAttributes[org.scalajs.dom.raw.HTMLTextAreaElement]
}
