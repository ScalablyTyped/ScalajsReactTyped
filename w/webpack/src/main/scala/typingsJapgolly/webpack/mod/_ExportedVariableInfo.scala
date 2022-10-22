package typingsJapgolly.webpack.mod

import typingsJapgolly.webpack.webpackBooleans.`true`
import typingsJapgolly.webpack.webpackStrings.arrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ExportedVariableInfo extends StObject
object _ExportedVariableInfo {
  
  inline def ScopeInfo(
    definitions: StackedMap[String, typingsJapgolly.webpack.mod.ScopeInfo | VariableInfo],
    inShorthand: Boolean,
    inTry: Boolean,
    isAsmJs: Boolean,
    isStrict: Boolean,
    topLevelScope: Boolean | arrow
  ): typingsJapgolly.webpack.mod.ScopeInfo = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], inShorthand = inShorthand.asInstanceOf[js.Any], inTry = inTry.asInstanceOf[js.Any], isAsmJs = isAsmJs.asInstanceOf[js.Any], isStrict = isStrict.asInstanceOf[js.Any], topLevelScope = topLevelScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.webpack.mod.ScopeInfo]
  }
  
  inline def VariableInfo(declaredScope: ScopeInfo, freeName: String | `true`): typingsJapgolly.webpack.mod.VariableInfo = {
    val __obj = js.Dynamic.literal(declaredScope = declaredScope.asInstanceOf[js.Any], freeName = freeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.webpack.mod.VariableInfo]
  }
}
