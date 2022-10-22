package typingsJapgolly.antd

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antd.antdStrings.warn
import typingsJapgolly.antd.libModalConfirmMod.ModalStaticFunctions
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalUseModalMod {
  
  @JSImport("antd/lib/modal/useModal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[Omit[ModalStaticFunctions, warn], Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[Omit[ModalStaticFunctions, warn], Element]]
}
