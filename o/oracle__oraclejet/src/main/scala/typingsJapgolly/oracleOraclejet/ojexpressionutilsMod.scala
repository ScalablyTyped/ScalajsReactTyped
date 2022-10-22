package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.anon.DownstreamOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojexpressionutilsMod {
  
  @JSImport("@oracle/oraclejet/ojexpressionutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createGenericExpressionEvaluator(expressionText: String): js.Function1[/* context */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenericExpressionEvaluator")(expressionText.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* context */ Any, Any]]
  
  inline def getExpressionInfo(expression: String): DownstreamOnly = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpressionInfo")(expression.asInstanceOf[js.Any]).asInstanceOf[DownstreamOnly]
}
