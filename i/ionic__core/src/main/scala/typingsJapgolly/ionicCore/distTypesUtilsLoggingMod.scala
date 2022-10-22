package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsLoggingMod {
  
  @JSImport("@ionic/core/dist/types/utils/logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printIonError(
    message: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type any is not an array type */ params: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printIonError")(message.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def printIonWarning(message: String, params: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printIonWarning")(scala.List(message.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def printRequiredElementError(el: HTMLElement, targetSelectors: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printRequiredElementError")(scala.List(el.asInstanceOf[js.Any]).`++`(targetSelectors.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
}
