package typingsJapgolly.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ParameterInformation {
  
  @JSImport("vscode-languageserver-protocol", "ParameterInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new parameter information literal.
    *
    * @param label A label string.
    * @param documentation A doc string.
    */
  inline def create(label: String): typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation]
  inline def create(label: String, documentation: String): typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation]
  inline def create(
    label: js.Tuple2[
      typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger, 
      typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger
    ]
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation]
  inline def create(
    label: js.Tuple2[
      typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger, 
      typingsJapgolly.vscodeLanguageserverTypes.mod.uinteger
    ],
    documentation: String
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(label.asInstanceOf[js.Any], documentation.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ParameterInformation]
}
