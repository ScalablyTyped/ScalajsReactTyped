package typingsJapgolly.formik

import typingsJapgolly.formik.distTypesMod.FormikContextType
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormikContextMod {
  
  @JSImport("formik/dist/FormikContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("formik/dist/FormikContext", "FormikConsumer")
  @js.native
  val FormikConsumer: Consumer[FormikContextType[Any]] = js.native
  
  @JSImport("formik/dist/FormikContext", "FormikContext")
  @js.native
  val FormikContext: Context[FormikContextType[Any]] = js.native
  
  @JSImport("formik/dist/FormikContext", "FormikProvider")
  @js.native
  val FormikProvider: Provider[FormikContextType[Any]] = js.native
  
  inline def useFormikContext[Values](): FormikContextType[Values] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormikContext")().asInstanceOf[FormikContextType[Values]]
}
