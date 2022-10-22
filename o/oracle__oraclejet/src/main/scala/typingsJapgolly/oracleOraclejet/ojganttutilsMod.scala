package typingsJapgolly.oracleOraclejet

import org.scalajs.dom.Element
import typingsJapgolly.oracleOraclejet.anon.MajorAxis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojganttutilsMod {
  
  @JSImport("@oracle/oraclejet/ojganttutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeTableColumnHeaderHeight(table: Element, gantt: Element, axisInfo: MajorAxis): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeTableColumnHeaderHeight")(table.asInstanceOf[js.Any], gantt.asInstanceOf[js.Any], axisInfo.asInstanceOf[js.Any])).asInstanceOf[Double]
}
