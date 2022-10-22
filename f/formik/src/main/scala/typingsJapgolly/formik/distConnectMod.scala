package typingsJapgolly.formik

import typingsJapgolly.formik.anon.Formik
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConnectMod {
  
  @JSImport("formik/dist/connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect[OuterProps, Values](Comp: ComponentType[OuterProps & Formik[Values]]): ComponentType[OuterProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(Comp.asInstanceOf[js.Any]).asInstanceOf[ComponentType[OuterProps]]
}
